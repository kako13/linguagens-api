import React from 'react';
import ComponentCreator from '@docusaurus/ComponentCreator';

export default [
  {
    path: '/linguagens-api/markdown-page',
    component: ComponentCreator('/linguagens-api/markdown-page', 'add'),
    exact: true
  },
  {
    path: '/linguagens-api/docs',
    component: ComponentCreator('/linguagens-api/docs', '18c'),
    routes: [
      {
        path: '/linguagens-api/docs/category/linguagens-api',
        component: ComponentCreator('/linguagens-api/docs/category/linguagens-api', '367'),
        exact: true,
        sidebar: "openApiSidebar"
      },
      {
        path: '/linguagens-api/docs/linguagens/adicionar',
        component: ComponentCreator('/linguagens-api/docs/linguagens/adicionar', 'a74'),
        exact: true,
        sidebar: "openApiSidebar"
      },
      {
        path: '/linguagens-api/docs/linguagens/atualizar',
        component: ComponentCreator('/linguagens-api/docs/linguagens/atualizar', '8c4'),
        exact: true,
        sidebar: "openApiSidebar"
      },
      {
        path: '/linguagens-api/docs/linguagens/linguagens-api',
        component: ComponentCreator('/linguagens-api/docs/linguagens/linguagens-api', 'eaf'),
        exact: true,
        sidebar: "openApiSidebar"
      },
      {
        path: '/linguagens-api/docs/linguagens/listar',
        component: ComponentCreator('/linguagens-api/docs/linguagens/listar', '111'),
        exact: true,
        sidebar: "openApiSidebar"
      },
      {
        path: '/linguagens-api/docs/linguagens/obter-por-id',
        component: ComponentCreator('/linguagens-api/docs/linguagens/obter-por-id', 'ce2'),
        exact: true,
        sidebar: "openApiSidebar"
      },
      {
        path: '/linguagens-api/docs/linguagens/remover',
        component: ComponentCreator('/linguagens-api/docs/linguagens/remover', 'ef1'),
        exact: true,
        sidebar: "openApiSidebar"
      }
    ]
  },
  {
    path: '/linguagens-api/',
    component: ComponentCreator('/linguagens-api/', 'dfa'),
    exact: true
  },
  {
    path: '*',
    component: ComponentCreator('*'),
  },
];
