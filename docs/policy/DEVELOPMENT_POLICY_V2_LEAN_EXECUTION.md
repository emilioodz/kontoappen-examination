# ACCOUNT ACCESS MIRROR — Development Policy v2.0.0

This is an authorized accessibility mirror of the operator's global policy. The canonical source is the private repository `varilo/varilo-autonomous-agent`, file `docs/policy/DEVELOPMENT_POLICY_V2_LEAN_EXECUTION.md`, pinned at commit `8e2d6bdfc005cfb0326fa5611dd8588214976f0f`. The linked `emilioodz` account cannot read that private repository through its connected GitHub credentials. Do not assume automatic synchronization or executor enforcement.

**Global operator directive:** Effective 2026-11-10; preserve existing stronger security controls until individually migrated.

---

# DEVELOPMENT POLICY v2.0.0 — LEAN EXECUTION

**Authority:** Explicit operator-wide development policy decision, 2026-11-10.
**Operator-directive effective date:** 2026-11-10, immediately for newly issued work and all agents receiving this directive.
**Repository publication status:** Integration on a dedicated review branch; a document on a branch does not automatically reconfigure running agents, servers, hooks or other repositories.
**Applies to:** ALL current and future developers, AI agents, repositories, projects, environments and workstreams under the operator's control, regardless of product, owner, organization, or hosting provider.
**Policy source of truth:** This version-controlled file, once published at an approved revision. Always pin to a specific revision; never infer enforcement from text alone.
**Scope:** Global defaults plus stricter project/release/tenant/security requirements.

## 1. Three-tier execution model

### Tier 1 — Inviolable security
Never bypass authentication, RBAC, tenant boundaries, authorization, secrets protection, least privilege, prompt/command/path containment, production access controls, protected data, backup/restore, release safety, auditability or incident response. Unknown authorization fails closed. Security policy must be enforced by the actual gateway/executor, not by prompt prose alone.

### Tier 2 — Lean autonomous engineering
Within an explicitly assigned and bounded task, a verified exclusive writer may inspect, reproduce, implement, add tests, run affected verification and commit locally without asking for permission at every small reversible step. The agent must use approved workspace/routing mechanisms, keep an audit trail, preserve WIP, and stop on real risk gates. Work until the authorized task is complete or genuinely blocked; do not create endless review/repair loops.

### Tier 3 — Controlled release and protected operations
Every specific protected-branch merge, production deploy, production data migration, deletion of protected/unknown resources, security/access control change, credential rotation with service interruption, restricted live agent dispatch, or newly billed resource allocation requires separate approval identifying the exact operation, target, risk and candidate SHA/configuration. A general development grant never implies these approvals.

## 2. Execution environment and GitHub

- Contabo **vmi3656079 (varilo-dev)** remains canonical for source workspace/worktrees, dependencies, builds, tests, automated QA, agent execution, model inference, runtime data and release artifacts. Client laptops/tablets/phones are thin clients, except human physical-device acceptance.
- GitHub may be used directly by authorized connected tools for read-only code review, branches, PRs, reviews, comments, issues, labels, metadata, release evidence and safe repository-management actions.
- **Controlled GitHub source-patch exception:** An authorized agent may commit a bounded, reversible change on a dedicated, unprotected GitHub branch *only* when task scope and write ownership are explicit; exact target/base are verified; the modification does not touch credentials/production state, does not overlap a current writer, and is independently tested on Contabo before it is accepted for integration. This exception does **not** allow building, testing or running agents on GitHub.
- GitHub Actions are not permitted for CI, builds, tests, deployments, security scanning, agents or any other compute. Legacy Actions remain inactive until deliberately reconciled; do not delete them blindly.
- No automatic fallback to client devices, paid providers, remote hosted runtimes or unverified execution environments.

## 3. Ownership and safe concurrency

Parallel independent agents are allowed **only** when there are no overlapping write assignments or shared-state hazards.

For each writer record: PROJECT_NAME, TASK_ID, AGENT, SESSION_ID, REPO, WORKTREE, BRANCH, full BASE_SHA, writable file/module scope, runtime/database/service scope, lease/owner and expected integration target.

One writer per writable worktree; no simultaneous edits to the same file/module or migration/runtime resource without explicit serialization. Different branches alone do not prove isolation. Stop on ambiguous ownership; never kill another agent or steal locks. Reviewer-only agents may run concurrently.

## 4. Risk-proportionate preflight

- **LOW:** verify host/environment, exact task, owner, repo, branch, SHA, worktree/WIP and affected file scope; execute and test within grant.
- **MEDIUM:** additionally inspect affected contracts/dependencies, rollback, relevant test evidence and cross-workstream conflicts.
- **HIGH:** require full impact/security, authorization, backup/restore and release check, with exact transaction approval before acting.
- Recheck ownership and HEAD immediately before any write. No needless full-portfolio audit for an isolated low-risk fix.
- Existing Prompt Gateway / approval router / executor deny rules stay authoritative until a reviewed enforcement update explicitly migrates them.

## 5. Engineering and verification

- Freeze the latest operator-approved release scope and Definition of Done. Fix verified P0/P1 blockers first; defer P2/P3 unless part of the defined release gate.
- Prefer minimal robust changes; preserve working code, tests and architecture. No unnecessary refactors, integrations or dependencies.
- Reuse prior test evidence **only** when the exact tested SHA or unchanged relevant inputs (source, dependencies/lockfile, configuration, runtime, toolchain, policy) and the applicable acceptance contract demonstrably justify reuse. Changes to an affected contract require relevant tests. Final release requires its mandated full gates on the final candidate.
- Record actual commands, timestamps, exit codes, test counts, skips, evidence paths, HEAD, regressions and residual risks. Do not invent PASS or 100%.
- An agent may locally commit complete, verified changes on its own authorized branch; controlled PR preparation is permitted. Never force push, hard-reset unknown WIP, skip hooks, or silently rewrite history.
- Stop engineering once the frozen release scope is verified. Remaining human approvals should be explicit BLOCKED/READY_FOR_OPERATOR_ACCEPTANCE, not prompts for more functionality.

## 6. Protected data and cleanup

Protected: production/customer data, credentials, backups, restore artifacts, persistent DB/runtime state, Git history, user WIP (including ignored/untracked files), active sessions, shared worktrees and all unclassified files. Destructive operations affecting any protected resource require specific approval.

An agent may clean only its own clearly identified disposable temporary files when safe and reversible, with no shared dependency or protected content. No blanket mass deletion.

## 7. Cost and provider controls

No new separately billed APIs, subscriptions, GPUs, servers, runners or cloud resources without an explicit bounded approval. Existing subscription does not authorize metered usage. Provider availability, cost and quota must be reported truthfully. Fail closed when uncertain.

## 8. Release and agent safety

- No automatic main/protected-branch merge, production deployment, live migration, publicly exposed service, security-control relaxation, restricted dispatch enablement or cross-tenant action.
- Autonomous coding agents do not inherit administrator approval merely from being selected. Keep Prompt Gateway, exact mission/approval ownership, isolation certification, audit and fail-closed stop conditions.
- Varilo AI QA/Sentinel remains advice-only for customer code (mutationCapable=false, adviseOnly=true).
- Branch/release candidate and active runtime must be separately verified by exact SHA before operator acceptance.
- Release is 100% only after full required evidence and explicit operator sign-off. A passing build, test subset or dry-run does not prove live agent execution.

## 9. Central policy references instead of repeated RULES blocks

New agent prompts should contain the pinned policy location + exact version/SHA, PROJECT/TASK_ID, release scope, exclusive write grant, intended deliverables, test requirements, approval gates and required handoff. Do not paste the complete policy into every prompt once the agent can actually read the pinned file.

Existing AGENTS.md, .cursorrules, runbooks and release rules are **not deleted or silently replaced**. A migration PR must reconcile conflicts and prove that gateway/runtime deny rules remain enforced. New policy text alone does not change a process already running under an older configuration.

## 10. Adoption protocol (all existing and future repositories)

1. Inventory each repository/project, controlling account and local Contabo canonical path, default branch, .cursorrules/AGENTS.md, active leases, release freeze and security gates.
2. Apply v2 as a non-destructive, version-pinned policy reference in a dedicated review branch/PR (or approved authoritative environment configuration); do not touch active release candidate branches.
3. Verify deny-by-default tests, write ownership, Contabo-only execution, no paid fallback, protected cleanup and gated release behavior.
4. Deploy approved enforcement updates only with required authorization; document status separately for each repo and runtime.
5. New projects/templates and future agents MUST load the current approved pinned policy before first write.
6. Track coverage: DIRECTIVE_RECEIVED / DOCUMENT_PUBLISHED / REPO_REFERENCE_ADDED / EXECUTOR_ENFORCED / VERIFIED. Never report the entire fleet enforced just because one repo contains this document.

## 11. Short standard agent header

> POLICY: DEVELOPMENT_POLICY_V2_LEAN_EXECUTION.md, version 2.0.0, pinned Git revision [actual SHA].
> Verify host, repository, branch, worktree, HEAD, writer lease and release freeze; obey all security and approval gates. Execute approved low-risk fixes autonomously, test changed contracts, reuse valid evidence, preserve WIP and stop at protected operations. No GitHub Actions, paid fallback, automatic merge/deploy or unapproved live dispatch.

## 12. Handoff

PROJECT_NAME; WORKSTREAM; TASK_ID; AGENT; SESSION_ID; REPOSITORY; WORKTREE; BRANCH; BASE_SHA; HEAD_SHA; POLICY_VERSION; POLICY_SHA; STATUS; FILES_CHANGED; TEST_EVIDENCE; SECURITY_EVIDENCE; BLOCKERS; APPROVALS_REQUIRED; NEXT_ACTION.

**Final rule:** MAXIMUM SAFE AUTONOMY. MINIMUM PROCESS OVERHEAD. REAL TEST EVIDENCE. NO SECURITY BYPASS. FINISH THE FROZEN RELEASE.
