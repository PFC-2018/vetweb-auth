insert into perfil (descricao) values ('recepcao');
insert into perfil (descricao) values ('cliente');	
insert into perfil (descricao) values ('veterinario');
insert into perfil (descricao) values ('ADMIN');

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
insert into perfil_permissao (perfis_descricao, permissoes_id) values ('ADMIN', 1);
insert into perfil_permissao (perfis_descricao, permissoes_id) values ('ADMIN', 2);
insert into perfil_permissao (perfis_descricao, permissoes_id) values ('ADMIN', 3);
insert into perfil_permissao (perfis_descricao, permissoes_id) values ('ADMIN', 4);
insert into perfil_permissao (perfis_descricao, permissoes_id) values ('ADMIN', 5);

insert into usuario (username, email, password) values ('vetweb', 'renan.rodrigues@metasix.com.br', '8idxMVxgdswZlsuLyr9Skw==');
insert into usuario (username, email, password) values ('recepcao', 'renanfr1047@gmail.com', 'zEjsMlsw93bJOg6XHN0k/Q==');

insert into usuario_perfil (usuarios_username, perfis_descricao) values ('vetweb', 'veterinario');
insert into usuario_perfil (usuarios_username, perfis_descricao) values ('vetweb', 'ADMIN');
insert into usuario_perfil (usuarios_username, perfis_descricao) values ('recepcao', 'recepcao');