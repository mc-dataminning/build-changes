public enum gkr {
   a(new gkr.b(gkr.a.f, gkr.a.e, gkr.a.a), new gkr.b(gkr.a.f, gkr.a.e, gkr.a.d), new gkr.b(gkr.a.c, gkr.a.e, gkr.a.d), new gkr.b(gkr.a.c, gkr.a.e, gkr.a.a)),
   b(new gkr.b(gkr.a.f, gkr.a.b, gkr.a.d), new gkr.b(gkr.a.f, gkr.a.b, gkr.a.a), new gkr.b(gkr.a.c, gkr.a.b, gkr.a.a), new gkr.b(gkr.a.c, gkr.a.b, gkr.a.d)),
   c(new gkr.b(gkr.a.c, gkr.a.b, gkr.a.d), new gkr.b(gkr.a.c, gkr.a.e, gkr.a.d), new gkr.b(gkr.a.f, gkr.a.e, gkr.a.d), new gkr.b(gkr.a.f, gkr.a.b, gkr.a.d)),
   d(new gkr.b(gkr.a.f, gkr.a.b, gkr.a.a), new gkr.b(gkr.a.f, gkr.a.e, gkr.a.a), new gkr.b(gkr.a.c, gkr.a.e, gkr.a.a), new gkr.b(gkr.a.c, gkr.a.b, gkr.a.a)),
   e(new gkr.b(gkr.a.f, gkr.a.b, gkr.a.d), new gkr.b(gkr.a.f, gkr.a.e, gkr.a.d), new gkr.b(gkr.a.f, gkr.a.e, gkr.a.a), new gkr.b(gkr.a.f, gkr.a.b, gkr.a.a)),
   f(new gkr.b(gkr.a.c, gkr.a.b, gkr.a.a), new gkr.b(gkr.a.c, gkr.a.e, gkr.a.a), new gkr.b(gkr.a.c, gkr.a.e, gkr.a.d), new gkr.b(gkr.a.c, gkr.a.b, gkr.a.d));

   private static final gkr[] g = ae.a(new gkr[6], $$0 -> {
      $$0[gkr.a.e] = a;
      $$0[gkr.a.b] = b;
      $$0[gkr.a.d] = c;
      $$0[gkr.a.a] = d;
      $$0[gkr.a.f] = e;
      $$0[gkr.a.c] = f;
   });
   private final gkr.b[] h;

   public static gkr a(jm $$0) {
      return g[$$0.d()];
   }

   private gkr(final gkr.b... $$0) {
      this.h = $$0;
   }

   public gkr.b a(int $$0) {
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
