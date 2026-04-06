const cards = [
  { title: 'Candidates', description: 'Manage candidate profiles and pipelines.' },
  { title: 'Job Positions', description: 'Open roles, departments, and locations.' },
  { title: 'Applications', description: 'Link candidates to positions and track status.' },
  { title: 'Interviews', description: 'Schedule interviews and capture feedback.' },
] as const

function App() {
  return (
    <div className="min-h-screen">
      <header className="border-b border-slate-200 bg-white shadow-sm">
        <div className="mx-auto flex max-w-6xl items-center justify-between px-6 py-5">
          <h1 className="text-xl font-semibold tracking-tight text-slate-900 md:text-2xl">
            LTI - Applicant Tracking System
          </h1>
          <span className="hidden text-sm text-slate-500 sm:inline">Scaffolding</span>
        </div>
      </header>

      <main className="mx-auto max-w-6xl px-6 py-10">
        <p className="mb-8 max-w-2xl text-slate-600">
          Dashboard placeholders for the four main ATS areas. CRUD and APIs will be added in later
          exercises.
        </p>

        <div className="grid gap-6 sm:grid-cols-2 xl:grid-cols-4">
          {cards.map((card) => (
            <article
              key={card.title}
              className="rounded-xl border border-slate-200 bg-white p-6 shadow-sm transition hover:border-slate-300 hover:shadow-md"
            >
              <h2 className="text-lg font-semibold text-slate-900">{card.title}</h2>
              <p className="mt-2 text-sm leading-relaxed text-slate-600">{card.description}</p>
            </article>
          ))}
        </div>
      </main>
    </div>
  )
}

export default App
