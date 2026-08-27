public enum fzz {
   a(new fzz.b(fzz.a.f, fzz.a.e, fzz.a.a), new fzz.b(fzz.a.f, fzz.a.e, fzz.a.d), new fzz.b(fzz.a.c, fzz.a.e, fzz.a.d), new fzz.b(fzz.a.c, fzz.a.e, fzz.a.a)),
   b(new fzz.b(fzz.a.f, fzz.a.b, fzz.a.d), new fzz.b(fzz.a.f, fzz.a.b, fzz.a.a), new fzz.b(fzz.a.c, fzz.a.b, fzz.a.a), new fzz.b(fzz.a.c, fzz.a.b, fzz.a.d)),
   c(new fzz.b(fzz.a.c, fzz.a.b, fzz.a.d), new fzz.b(fzz.a.c, fzz.a.e, fzz.a.d), new fzz.b(fzz.a.f, fzz.a.e, fzz.a.d), new fzz.b(fzz.a.f, fzz.a.b, fzz.a.d)),
   d(new fzz.b(fzz.a.f, fzz.a.b, fzz.a.a), new fzz.b(fzz.a.f, fzz.a.e, fzz.a.a), new fzz.b(fzz.a.c, fzz.a.e, fzz.a.a), new fzz.b(fzz.a.c, fzz.a.b, fzz.a.a)),
   e(new fzz.b(fzz.a.f, fzz.a.b, fzz.a.d), new fzz.b(fzz.a.f, fzz.a.e, fzz.a.d), new fzz.b(fzz.a.f, fzz.a.e, fzz.a.a), new fzz.b(fzz.a.f, fzz.a.b, fzz.a.a)),
   f(new fzz.b(fzz.a.c, fzz.a.b, fzz.a.a), new fzz.b(fzz.a.c, fzz.a.e, fzz.a.a), new fzz.b(fzz.a.c, fzz.a.e, fzz.a.d), new fzz.b(fzz.a.c, fzz.a.b, fzz.a.d));

   private static final fzz[] g = ac.a(new fzz[6], $$0 -> {
      $$0[fzz.a.e] = a;
      $$0[fzz.a.b] = b;
      $$0[fzz.a.d] = c;
      $$0[fzz.a.a] = d;
      $$0[fzz.a.f] = e;
      $$0[fzz.a.c] = f;
   });
   private final fzz.b[] h;

   public static fzz a(ij $$0) {
      return g[$$0.d()];
   }

   private fzz(fzz.b... $$0) {
      this.h = $$0;
   }

   public fzz.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ij.d.d();
      public static final int b = ij.b.d();
      public static final int c = ij.f.d();
      public static final int d = ij.c.d();
      public static final int e = ij.a.d();
      public static final int f = ij.e.d();
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
