"""
WSGI config for django2 project.

It exposes the WSGI callable as a module-level variable named ``application``.

For more information on this file, see
https://docs.djangoproject.com/en/4.2/howto/deployment/wsgi/
"""

import os

from django.core.wsgi import get_wsgi_application
# Comando para usar junto com o dj_static
# from dj_static import Cling, MediaCling

os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'django2.settings')

# application = Cling(MediaCling(get_wsgi_application()))

application = get_wsgi_application()
