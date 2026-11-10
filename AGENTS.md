# Repository agent instructions

Read repository-specific project and release rules before any write.


<!-- GLOBAL_DEVELOPMENT_POLICY_V2_START -->
## Global Development Policy v2.0.0 — Lean Execution (effective 2026-11-10)

The operator's **global directive applies immediately** to every current and future developer, agent, repository and project. Read the [pinned v2 policy](https://github.com/emilioodz/kontoappen-examination/blob/478ee075bda19c70f9c430a6c8aa5fc9041753a5/docs/policy/DEVELOPMENT_POLICY_V2_LEAN_EXECUTION.md) and the repository's own release/security rules before accepting any write assignment.

- Keep **Contabo vmi3656079** as the development/build/test/inference execution plane. Client devices are thin clients; safe scoped GitHub review and dedicated-branch changes are allowed only with Contabo verification before integration. No GitHub Actions compute or new paid resources.
- Within a verified **non-overlapping writable scope**, complete approved reversible low-risk fixes and relevant tests autonomously; preserve WIP and avoid needless repeated audits.
- Multiple agents may work concurrently only with exclusive per-worktree ownership and no overlapping file, service, database, migration or runtime-state writes.
- Preserve authentication, RBAC/tenant isolation, credentials, default-deny dispatch, frozen release scope, backups and customer data. An instruction change alone does **not** grant a bypass of Prompt Gateway or executor authorization.
- Require separate **exact transaction approval** for protected merges, production deploy/migration, protected-data deletion, service-disrupting key rotation, restricted agent dispatch, public exposure and newly billed compute.
- Reuse tests only with valid matching evidence; final release needs exact-candidate acceptance and operator sign-off. Stop building after the approved Definition of Done is met.
- Existing stricter safety controls remain enforced until an audited migration proves compatibility. Any stale process-only restrictions must be reconciled in a review, **not** silently bypassed.

This block is introduced on an isolated policy branch and becomes a repository-loaded instruction only after a separately approved merge and a fresh agent read. It is not proof of executor enforcement.
<!-- GLOBAL_DEVELOPMENT_POLICY_V2_END -->
