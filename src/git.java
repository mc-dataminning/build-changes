public enum git {
   a(new git.b(git.a.f, git.a.e, git.a.a), new git.b(git.a.f, git.a.e, git.a.d), new git.b(git.a.c, git.a.e, git.a.d), new git.b(git.a.c, git.a.e, git.a.a)),
   b(new git.b(git.a.f, git.a.b, git.a.d), new git.b(git.a.f, git.a.b, git.a.a), new git.b(git.a.c, git.a.b, git.a.a), new git.b(git.a.c, git.a.b, git.a.d)),
   c(new git.b(git.a.c, git.a.b, git.a.d), new git.b(git.a.c, git.a.e, git.a.d), new git.b(git.a.f, git.a.e, git.a.d), new git.b(git.a.f, git.a.b, git.a.d)),
   d(new git.b(git.a.f, git.a.b, git.a.a), new git.b(git.a.f, git.a.e, git.a.a), new git.b(git.a.c, git.a.e, git.a.a), new git.b(git.a.c, git.a.b, git.a.a)),
   e(new git.b(git.a.f, git.a.b, git.a.d), new git.b(git.a.f, git.a.e, git.a.d), new git.b(git.a.f, git.a.e, git.a.a), new git.b(git.a.f, git.a.b, git.a.a)),
   f(new git.b(git.a.c, git.a.b, git.a.a), new git.b(git.a.c, git.a.e, git.a.a), new git.b(git.a.c, git.a.e, git.a.d), new git.b(git.a.c, git.a.b, git.a.d));

   private static final git[] g = ae.a(new git[6], $$0 -> {
      $$0[git.a.e] = a;
      $$0[git.a.b] = b;
      $$0[git.a.d] = c;
      $$0[git.a.a] = d;
      $$0[git.a.f] = e;
      $$0[git.a.c] = f;
   });
   private final git.b[] h;

   public static git a(jm $$0) {
      return g[$$0.d()];
   }

   private git(final git.b... $$0) {
      this.h = $$0;
   }

   public git.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = jm.d.d();
      public static final int b = jm.b.d();
      public static final int c = jm.f.d();
      public static final int d = jm.c.d();
      public static final int e = jm.a.d();
      public static final int f = jm.e.d();
   }

   public static class b {
      public final int a;
      public final int b;
      public final int c;

      b(int $$0, int $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
