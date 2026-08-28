public enum gkx {
   a(new gkx.b(gkx.a.f, gkx.a.e, gkx.a.a), new gkx.b(gkx.a.f, gkx.a.e, gkx.a.d), new gkx.b(gkx.a.c, gkx.a.e, gkx.a.d), new gkx.b(gkx.a.c, gkx.a.e, gkx.a.a)),
   b(new gkx.b(gkx.a.f, gkx.a.b, gkx.a.d), new gkx.b(gkx.a.f, gkx.a.b, gkx.a.a), new gkx.b(gkx.a.c, gkx.a.b, gkx.a.a), new gkx.b(gkx.a.c, gkx.a.b, gkx.a.d)),
   c(new gkx.b(gkx.a.c, gkx.a.b, gkx.a.d), new gkx.b(gkx.a.c, gkx.a.e, gkx.a.d), new gkx.b(gkx.a.f, gkx.a.e, gkx.a.d), new gkx.b(gkx.a.f, gkx.a.b, gkx.a.d)),
   d(new gkx.b(gkx.a.f, gkx.a.b, gkx.a.a), new gkx.b(gkx.a.f, gkx.a.e, gkx.a.a), new gkx.b(gkx.a.c, gkx.a.e, gkx.a.a), new gkx.b(gkx.a.c, gkx.a.b, gkx.a.a)),
   e(new gkx.b(gkx.a.f, gkx.a.b, gkx.a.d), new gkx.b(gkx.a.f, gkx.a.e, gkx.a.d), new gkx.b(gkx.a.f, gkx.a.e, gkx.a.a), new gkx.b(gkx.a.f, gkx.a.b, gkx.a.a)),
   f(new gkx.b(gkx.a.c, gkx.a.b, gkx.a.a), new gkx.b(gkx.a.c, gkx.a.e, gkx.a.a), new gkx.b(gkx.a.c, gkx.a.e, gkx.a.d), new gkx.b(gkx.a.c, gkx.a.b, gkx.a.d));

   private static final gkx[] g = ae.a(new gkx[6], $$0 -> {
      $$0[gkx.a.e] = a;
      $$0[gkx.a.b] = b;
      $$0[gkx.a.d] = c;
      $$0[gkx.a.a] = d;
      $$0[gkx.a.f] = e;
      $$0[gkx.a.c] = f;
   });
   private final gkx.b[] h;

   public static gkx a(jm $$0) {
      return g[$$0.d()];
   }

   private gkx(final gkx.b... $$0) {
      this.h = $$0;
   }

   public gkx.b a(int $$0) {
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
