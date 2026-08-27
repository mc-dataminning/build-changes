public enum fxh {
   a(new fxh.b(fxh.a.f, fxh.a.e, fxh.a.a), new fxh.b(fxh.a.f, fxh.a.e, fxh.a.d), new fxh.b(fxh.a.c, fxh.a.e, fxh.a.d), new fxh.b(fxh.a.c, fxh.a.e, fxh.a.a)),
   b(new fxh.b(fxh.a.f, fxh.a.b, fxh.a.d), new fxh.b(fxh.a.f, fxh.a.b, fxh.a.a), new fxh.b(fxh.a.c, fxh.a.b, fxh.a.a), new fxh.b(fxh.a.c, fxh.a.b, fxh.a.d)),
   c(new fxh.b(fxh.a.c, fxh.a.b, fxh.a.d), new fxh.b(fxh.a.c, fxh.a.e, fxh.a.d), new fxh.b(fxh.a.f, fxh.a.e, fxh.a.d), new fxh.b(fxh.a.f, fxh.a.b, fxh.a.d)),
   d(new fxh.b(fxh.a.f, fxh.a.b, fxh.a.a), new fxh.b(fxh.a.f, fxh.a.e, fxh.a.a), new fxh.b(fxh.a.c, fxh.a.e, fxh.a.a), new fxh.b(fxh.a.c, fxh.a.b, fxh.a.a)),
   e(new fxh.b(fxh.a.f, fxh.a.b, fxh.a.d), new fxh.b(fxh.a.f, fxh.a.e, fxh.a.d), new fxh.b(fxh.a.f, fxh.a.e, fxh.a.a), new fxh.b(fxh.a.f, fxh.a.b, fxh.a.a)),
   f(new fxh.b(fxh.a.c, fxh.a.b, fxh.a.a), new fxh.b(fxh.a.c, fxh.a.e, fxh.a.a), new fxh.b(fxh.a.c, fxh.a.e, fxh.a.d), new fxh.b(fxh.a.c, fxh.a.b, fxh.a.d));

   private static final fxh[] g = ac.a(new fxh[6], $$0 -> {
      $$0[fxh.a.e] = a;
      $$0[fxh.a.b] = b;
      $$0[fxh.a.d] = c;
      $$0[fxh.a.a] = d;
      $$0[fxh.a.f] = e;
      $$0[fxh.a.c] = f;
   });
   private final fxh.b[] h;

   public static fxh a(ih $$0) {
      return g[$$0.d()];
   }

   private fxh(fxh.b... $$0) {
      this.h = $$0;
   }

   public fxh.b a(int $$0) {
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
