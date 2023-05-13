// @ts-check
// Note: type annotations allow type checking and IDEs autocompletion

const lightCodeTheme = require("prism-react-renderer/themes/github");
const darkCodeTheme = require("prism-react-renderer/themes/dracula");

/** @type {import('@docusaurus/types').Config} */
const config = {
  title: "Um ranking customizável",
  tagline: 'das melhores linguagens de programação',
  favicon: "img/gray/api-icon1.svg",
  url: 'https://kako13.github.io', // Your website URL
  baseUrl: "/linguagens-api/",
  onBrokenLinks: "throw",
  onBrokenMarkdownLinks: "warn",

  projectName: 'linguagens-api',
  organizationName: 'kako13',
  deploymentBranch: 'documentacao-docusaurus',
  trailingSlash: false,

  presets: [
    [
      "classic",
      /** @type {import('@docusaurus/preset-classic').Options} */
      ({
        docs: {
          sidebarPath: require.resolve("./sidebars.js"),
          // Please change this to your repo.
          // Remove this to remove the "edit this page" links.
          editUrl:
            "https://github.com/facebook/docusaurus/tree/main/packages/create-docusaurus/templates/shared/",
          docLayoutComponent: "@theme/DocPage",
          docItemComponent: "@theme/ApiItem" // Derived from docusaurus-theme-openapi
        },
        blog: {
          showReadingTime: true,
          // Please change this to your repo.
          // Remove this to remove the "edit this page" links.
          editUrl:
            "https://github.com/facebook/docusaurus/tree/main/packages/create-docusaurus/templates/shared/"
        },
        theme: {
          customCss: require.resolve("./src/css/custom.css")
        }
      })
    ]
  ],

  themeConfig:
    /** @type {import('@docusaurus/preset-classic').ThemeConfig} */
    ({
      docs: {
        sidebar: {
          hideable: true
        }
      },
      navbar: {
        title: "Ranking de linguagens de programação",
        logo: {
          alt: "My Site Logo",
          src: "img/gray/ranking-icon.svg",
        },
        items: [
//          {
//            type: "doc",
//            docId: "intro",
//            position: "left",
//            label: "Tutorial"
//          },
//          { to: "/blog", label: "Blog", position: "left" },
          {
            label: "API",
            position: "left",
            to: "/docs/category/linguagens-api"
          },
          {
            href: "https://github.com/kako13/linguagens-api",
            label: "GitHub",
            position: "right"
          }
        ]
      },
      footer: {
        style: "dark",
        links: [
          {
            title: "Docs",
            items: [
//              {
//                label: "Tutorial",
//                to: "/docs/intro"
//              },
              {
                label: "API",
                to: "/docs/category/linguagens-api"
              },

            ]
          },

          {
            title: "Community",
            items: [
//              {
//                label: "Stack Overflow",
//                href: "https://stackoverflow.com/questions/tagged/docusaurus"
//              },
//              {
//                label: "Discord",
//                href: "https://discordapp.com/invite/docusaurus"
//              },
              {
                label: "Linkedin",
                href: "https://www.linkedin.com/in/kaue-oliveira-ko/"
              }
            ]
          },
          {
            title: "More",
            items: [
//              {
//                label: "Blog",
//                to: "/blog"
//              },
              {
                label: "GitHub",
                href: "https://github.com/kako13/linguagens-api"
              }
            ]
          }
        ],
        copyright: `Copyright © ${new Date().getFullYear()} Linguagens API. Built with Docusaurus.`
      },
      prism: {
        theme: lightCodeTheme,
        darkTheme: darkCodeTheme,
        additionalLanguages: ["ruby", "csharp", "php"]
      },
    }),

  plugins: [
    [
      "docusaurus-plugin-openapi-docs",
      {
        id: "openapi",
        docsPluginId: "classic",
        config: {
            linguagens: {
              specPath: "swagger/swagger.json",
              outputDir: "docs/linguagens",
              downloadUrl: "https://imersao-alura-linguagens.fly.dev/ranking/v3/api-docs",
              sidebarOptions: {
                groupPathsBy: "tag",
                categoryLinkSource: "tag"
            }
          }
        }
      }
    ]
  ],

  themes: ["docusaurus-theme-openapi-docs"]
};

module.exports = config;
