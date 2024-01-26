from typing import Any
from django.contrib import admin

from .models import Post


@admin.register(Post)
class PostAdmin(admin.ModelAdmin):
    list_display = ('titulo', '_autor')
    exclude = ['autor',]

    def _autor(self, instance):
        return f'{instance.autor.get_full_namme()}'
    
    def get_gueryset(self, request):
        qs = super(PostAdmin, self).get_gueryset(request)
        return qs.filter(autor=request.user)
    
    def save_model(self, request, obj, form, change):
        obj.autor = request.user
        super().save_model(request, obj, form, change)