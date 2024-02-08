from django.shortcuts import render
from django.contrib import messages

from .forms import ContatoForm

def index(request):
    return render(request, 'index.html')


def contato(request):
    form = ContatoForm(request.POST or None)

    if str(request.method) == 'POST':
        if form.is_valid():

            # Não necessário após a aplicação do email no forms
            # nome = form.cleaned_data['nome']
            # email = form.cleaned_data['email']
            # assunto = form.cleaned_data['assunto']
            # mensagem = form.cleaned_data['mensagem']

            # print('Mensagem enviada')
            # print(f'Nome: {nome}')
            # print(f'Email: {email}')
            # print(f'Assunto: {assunto}')
            # print(f'Mensagem: {mensagem}')

            #Agora usa esse carinha
            form.send_email()

            messages.success(request, 'E-mail enviado com sucesso!')
            form = ContatoForm()
        else:
            messages.error(request, 'Erro ao enviar e-mail')


    context = {
        'form' : form
    }

    return render(request, 'contato.html', context)


def produto(request):
    return render(request, 'produto.html')

 