public enum fwh {
   a(new fwh.b(fwh.a.f, fwh.a.e, fwh.a.a), new fwh.b(fwh.a.f, fwh.a.e, fwh.a.d), new fwh.b(fwh.a.c, fwh.a.e, fwh.a.d), new fwh.b(fwh.a.c, fwh.a.e, fwh.a.a)),
   b(new fwh.b(fwh.a.f, fwh.a.b, fwh.a.d), new fwh.b(fwh.a.f, fwh.a.b, fwh.a.a), new fwh.b(fwh.a.c, fwh.a.b, fwh.a.a), new fwh.b(fwh.a.c, fwh.a.b, fwh.a.d)),
   c(new fwh.b(fwh.a.c, fwh.a.b, fwh.a.d), new fwh.b(fwh.a.c, fwh.a.e, fwh.a.d), new fwh.b(fwh.a.f, fwh.a.e, fwh.a.d), new fwh.b(fwh.a.f, fwh.a.b, fwh.a.d)),
   d(new fwh.b(fwh.a.f, fwh.a.b, fwh.a.a), new fwh.b(fwh.a.f, fwh.a.e, fwh.a.a), new fwh.b(fwh.a.c, fwh.a.e, fwh.a.a), new fwh.b(fwh.a.c, fwh.a.b, fwh.a.a)),
   e(new fwh.b(fwh.a.f, fwh.a.b, fwh.a.d), new fwh.b(fwh.a.f, fwh.a.e, fwh.a.d), new fwh.b(fwh.a.f, fwh.a.e, fwh.a.a), new fwh.b(fwh.a.f, fwh.a.b, fwh.a.a)),
   f(new fwh.b(fwh.a.c, fwh.a.b, fwh.a.a), new fwh.b(fwh.a.c, fwh.a.e, fwh.a.a), new fwh.b(fwh.a.c, fwh.a.e, fwh.a.d), new fwh.b(fwh.a.c, fwh.a.b, fwh.a.d));

   private static final fwh[] g = ac.a(new fwh[6], $$0 -> {
      $$0[fwh.a.e] = a;
      $$0[fwh.a.b] = b;
      $$0[fwh.a.d] = c;
      $$0[fwh.a.a] = d;
      $$0[fwh.a.f] = e;
      $$0[fwh.a.c] = f;
   });
   private final fwh.b[] h;

   public static fwh a(ih $$0) {
      return g[$$0.d()];
   }

   private fwh(fwh.b... $$0) {
      this.h = $$0;
   }

   public fwh.b a(int $$0) {
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
