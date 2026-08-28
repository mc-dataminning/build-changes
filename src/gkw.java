public enum gkw {
   a(new gkw.b(gkw.a.f, gkw.a.e, gkw.a.a), new gkw.b(gkw.a.f, gkw.a.e, gkw.a.d), new gkw.b(gkw.a.c, gkw.a.e, gkw.a.d), new gkw.b(gkw.a.c, gkw.a.e, gkw.a.a)),
   b(new gkw.b(gkw.a.f, gkw.a.b, gkw.a.d), new gkw.b(gkw.a.f, gkw.a.b, gkw.a.a), new gkw.b(gkw.a.c, gkw.a.b, gkw.a.a), new gkw.b(gkw.a.c, gkw.a.b, gkw.a.d)),
   c(new gkw.b(gkw.a.c, gkw.a.b, gkw.a.d), new gkw.b(gkw.a.c, gkw.a.e, gkw.a.d), new gkw.b(gkw.a.f, gkw.a.e, gkw.a.d), new gkw.b(gkw.a.f, gkw.a.b, gkw.a.d)),
   d(new gkw.b(gkw.a.f, gkw.a.b, gkw.a.a), new gkw.b(gkw.a.f, gkw.a.e, gkw.a.a), new gkw.b(gkw.a.c, gkw.a.e, gkw.a.a), new gkw.b(gkw.a.c, gkw.a.b, gkw.a.a)),
   e(new gkw.b(gkw.a.f, gkw.a.b, gkw.a.d), new gkw.b(gkw.a.f, gkw.a.e, gkw.a.d), new gkw.b(gkw.a.f, gkw.a.e, gkw.a.a), new gkw.b(gkw.a.f, gkw.a.b, gkw.a.a)),
   f(new gkw.b(gkw.a.c, gkw.a.b, gkw.a.a), new gkw.b(gkw.a.c, gkw.a.e, gkw.a.a), new gkw.b(gkw.a.c, gkw.a.e, gkw.a.d), new gkw.b(gkw.a.c, gkw.a.b, gkw.a.d));

   private static final gkw[] g = ae.a(new gkw[6], $$0 -> {
      $$0[gkw.a.e] = a;
      $$0[gkw.a.b] = b;
      $$0[gkw.a.d] = c;
      $$0[gkw.a.a] = d;
      $$0[gkw.a.f] = e;
      $$0[gkw.a.c] = f;
   });
   private final gkw.b[] h;

   public static gkw a(jm $$0) {
      return g[$$0.d()];
   }

   private gkw(final gkw.b... $$0) {
      this.h = $$0;
   }

   public gkw.b a(int $$0) {
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
