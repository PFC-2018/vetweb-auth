use authdata;

insert into perfil (descricao) values ('recepcao');
insert into perfil (descricao) values ('cliente');	
insert into perfil (descricao) values ('veterinario');

insert into permissao (id, url) values (1, '/clientes/**');
insert into permissao (id, url) values (2, '/usuarios/**');
insert into permissao (id, url) values (3, '/prontuario/**');
insert into permissao (id, url) values (4, '/animais/**');
insert into permissao (id, url) values (5, '/config/**');
insert into permissao (id, url) values (6, '/integration/mappings');

insert into perfil_permissao (perfis_descricao, permissoes_id) values ('recepcao', 1);
insert into perfil_permissao (perfis_descricao, permissoes_id) values ('recepcao', 4);
insert into perfil_permissao (perfis_descricao, permissoes_id) values ('veterinario', 1);
insert into perfil_permissao (perfis_descricao, permissoes_id) values ('veterinario', 2);
insert into perfil_permissao (perfis_descricao, permissoes_id) values ('veterinario', 3);
insert into perfil_permissao (perfis_descricao, permissoes_id) values ('veterinario', 4);
insert into perfil_permissao (perfis_descricao, permissoes_id) values ('veterinario', 5);	

insert into usuario (username, email, password) values ('renan.rodrigues', 'renan.rodrigues@metasix.com.br', 'MTIzNDU2');
insert into usuario (username, email, password) values ('recepcao', 'renanfr1047@gmail.com', 'cmVjZXBjYW8=');

insert into usuario_perfil (usuarios_username, perfis_descricao) values ('renan.rodrigues', 'veterinario');
insert into usuario_perfil (usuarios_username, perfis_descricao) values ('recepcao', 'recepcao');