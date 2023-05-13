import React from 'react';
import clsx from 'clsx';
import styles from './styles.module.css';

const FeatureList = [
  {
    title: 'Cadastre uma nova linguagem no ranking',
//    Svg: require('@site/static/img/gray/insert-icon.svg').default,
    Svg: require('@site/static/img/gray/file-document-insert.svg').default,
//    description: (
//      <>
//        Docusaurus lets you focus on your docs, and we&apos;ll do the chores. Go
//        ahead and move your docs into the <code>docs</code> directory.
//      </>
//    ),
  },
  {
    title: 'Liste as linguagens cadastradas no ranking',
//    Svg: require('@site/static/img/gray/list-icon.svg').default,
    Svg: require('@site/static/img/gray/file-document-list.svg').default,
//    description: (
//      <>
//        Docusaurus was designed from the ground up to be easily installed and
//        used to get your website up and running quickly.
//      </>
//    ),
  },
  {
    title: 'Busque por uma linguagem do ranking através do id',
//    Svg: require('@site/static/img/gray/find-icon.svg').default,
    Svg: require('@site/static/img/gray/file-document-find.svg').default,
//    description: (
//      <>
//        Extend or customize your website layout by reusing React. Docusaurus can
//        be extended while reusing the same header and footer.
//      </>
//    ),
  },
  {
    title: 'Atualize uma linguagem do ranking',
//    Svg: require('@site/static/img/gray/update-icon.svg').default,
    Svg: require('@site/static/img/gray/file-document-update.svg').default,
//    description: (
//      <>
//        Extend or customize your website layout by reusing React. Docusaurus can
//        be extended while reusing the same header and footer.
//      </>
//    ),
  },
  {
    title: 'Remova uma linguagem do ranking',
//    Svg: require('@site/static/img/gray/remove-icon.svg').default,
    Svg: require('@site/static/img/gray/file-document-remove.svg').default,
//    description: (
//      <>
//        Extend or customize your website layout by reusing React. Docusaurus can
//        be extended while reusing the same header and footer.
//      </>
//    ),
  },
];

function Feature({Svg, title, description}) {
  return (
    <div className={clsx('col')}>
      <div className="text--center">
        <Svg className={styles.featureSvg} role="img" />
      </div>
      <div className="text--center padding-horiz--lg">
        <h3 className={styles.title} >{title}</h3>
        <p className={styles.description} >{description}</p>
      </div>
    </div>
  );
}

export default function HomepageFeatures() {
  return (
    <section className={styles.features}>
      <div className="container">
        <div className="row">
          {FeatureList.map((props, idx) => (
            <Feature key={idx} {...props} />
          ))}
        </div>
      </div>
    </section>
  );
}
