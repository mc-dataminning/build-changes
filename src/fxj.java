public enum fxj {
   a(new fxj.b(fxj.a.f, fxj.a.e, fxj.a.a), new fxj.b(fxj.a.f, fxj.a.e, fxj.a.d), new fxj.b(fxj.a.c, fxj.a.e, fxj.a.d), new fxj.b(fxj.a.c, fxj.a.e, fxj.a.a)),
   b(new fxj.b(fxj.a.f, fxj.a.b, fxj.a.d), new fxj.b(fxj.a.f, fxj.a.b, fxj.a.a), new fxj.b(fxj.a.c, fxj.a.b, fxj.a.a), new fxj.b(fxj.a.c, fxj.a.b, fxj.a.d)),
   c(new fxj.b(fxj.a.c, fxj.a.b, fxj.a.d), new fxj.b(fxj.a.c, fxj.a.e, fxj.a.d), new fxj.b(fxj.a.f, fxj.a.e, fxj.a.d), new fxj.b(fxj.a.f, fxj.a.b, fxj.a.d)),
   d(new fxj.b(fxj.a.f, fxj.a.b, fxj.a.a), new fxj.b(fxj.a.f, fxj.a.e, fxj.a.a), new fxj.b(fxj.a.c, fxj.a.e, fxj.a.a), new fxj.b(fxj.a.c, fxj.a.b, fxj.a.a)),
   e(new fxj.b(fxj.a.f, fxj.a.b, fxj.a.d), new fxj.b(fxj.a.f, fxj.a.e, fxj.a.d), new fxj.b(fxj.a.f, fxj.a.e, fxj.a.a), new fxj.b(fxj.a.f, fxj.a.b, fxj.a.a)),
   f(new fxj.b(fxj.a.c, fxj.a.b, fxj.a.a), new fxj.b(fxj.a.c, fxj.a.e, fxj.a.a), new fxj.b(fxj.a.c, fxj.a.e, fxj.a.d), new fxj.b(fxj.a.c, fxj.a.b, fxj.a.d));

   private static final fxj[] g = ac.a(new fxj[6], $$0 -> {
      $$0[fxj.a.e] = a;
      $$0[fxj.a.b] = b;
      $$0[fxj.a.d] = c;
      $$0[fxj.a.a] = d;
      $$0[fxj.a.f] = e;
      $$0[fxj.a.c] = f;
   });
   private final fxj.b[] h;

   public static fxj a(ih $$0) {
      return g[$$0.d()];
   }

   private fxj(fxj.b... $$0) {
      this.h = $$0;
   }

   public fxj.b a(int $$0) {
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
