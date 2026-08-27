public enum fzq {
   a(new fzq.b(fzq.a.f, fzq.a.e, fzq.a.a), new fzq.b(fzq.a.f, fzq.a.e, fzq.a.d), new fzq.b(fzq.a.c, fzq.a.e, fzq.a.d), new fzq.b(fzq.a.c, fzq.a.e, fzq.a.a)),
   b(new fzq.b(fzq.a.f, fzq.a.b, fzq.a.d), new fzq.b(fzq.a.f, fzq.a.b, fzq.a.a), new fzq.b(fzq.a.c, fzq.a.b, fzq.a.a), new fzq.b(fzq.a.c, fzq.a.b, fzq.a.d)),
   c(new fzq.b(fzq.a.c, fzq.a.b, fzq.a.d), new fzq.b(fzq.a.c, fzq.a.e, fzq.a.d), new fzq.b(fzq.a.f, fzq.a.e, fzq.a.d), new fzq.b(fzq.a.f, fzq.a.b, fzq.a.d)),
   d(new fzq.b(fzq.a.f, fzq.a.b, fzq.a.a), new fzq.b(fzq.a.f, fzq.a.e, fzq.a.a), new fzq.b(fzq.a.c, fzq.a.e, fzq.a.a), new fzq.b(fzq.a.c, fzq.a.b, fzq.a.a)),
   e(new fzq.b(fzq.a.f, fzq.a.b, fzq.a.d), new fzq.b(fzq.a.f, fzq.a.e, fzq.a.d), new fzq.b(fzq.a.f, fzq.a.e, fzq.a.a), new fzq.b(fzq.a.f, fzq.a.b, fzq.a.a)),
   f(new fzq.b(fzq.a.c, fzq.a.b, fzq.a.a), new fzq.b(fzq.a.c, fzq.a.e, fzq.a.a), new fzq.b(fzq.a.c, fzq.a.e, fzq.a.d), new fzq.b(fzq.a.c, fzq.a.b, fzq.a.d));

   private static final fzq[] g = ac.a(new fzq[6], $$0 -> {
      $$0[fzq.a.e] = a;
      $$0[fzq.a.b] = b;
      $$0[fzq.a.d] = c;
      $$0[fzq.a.a] = d;
      $$0[fzq.a.f] = e;
      $$0[fzq.a.c] = f;
   });
   private final fzq.b[] h;

   public static fzq a(ih $$0) {
      return g[$$0.d()];
   }

   private fzq(fzq.b... $$0) {
      this.h = $$0;
   }

   public fzq.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ih.d.d();
      public static final int b = ih.b.d();
      public static final int c = ih.f.d();
      public static final int d = ih.c.d();
      public static final int e = ih.a.d();
      public static final int f = ih.e.d();
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
