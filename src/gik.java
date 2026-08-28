public enum gik {
   a(new gik.b(gik.a.f, gik.a.e, gik.a.a), new gik.b(gik.a.f, gik.a.e, gik.a.d), new gik.b(gik.a.c, gik.a.e, gik.a.d), new gik.b(gik.a.c, gik.a.e, gik.a.a)),
   b(new gik.b(gik.a.f, gik.a.b, gik.a.d), new gik.b(gik.a.f, gik.a.b, gik.a.a), new gik.b(gik.a.c, gik.a.b, gik.a.a), new gik.b(gik.a.c, gik.a.b, gik.a.d)),
   c(new gik.b(gik.a.c, gik.a.b, gik.a.d), new gik.b(gik.a.c, gik.a.e, gik.a.d), new gik.b(gik.a.f, gik.a.e, gik.a.d), new gik.b(gik.a.f, gik.a.b, gik.a.d)),
   d(new gik.b(gik.a.f, gik.a.b, gik.a.a), new gik.b(gik.a.f, gik.a.e, gik.a.a), new gik.b(gik.a.c, gik.a.e, gik.a.a), new gik.b(gik.a.c, gik.a.b, gik.a.a)),
   e(new gik.b(gik.a.f, gik.a.b, gik.a.d), new gik.b(gik.a.f, gik.a.e, gik.a.d), new gik.b(gik.a.f, gik.a.e, gik.a.a), new gik.b(gik.a.f, gik.a.b, gik.a.a)),
   f(new gik.b(gik.a.c, gik.a.b, gik.a.a), new gik.b(gik.a.c, gik.a.e, gik.a.a), new gik.b(gik.a.c, gik.a.e, gik.a.d), new gik.b(gik.a.c, gik.a.b, gik.a.d));

   private static final gik[] g = ae.a(new gik[6], $$0 -> {
      $$0[gik.a.e] = a;
      $$0[gik.a.b] = b;
      $$0[gik.a.d] = c;
      $$0[gik.a.a] = d;
      $$0[gik.a.f] = e;
      $$0[gik.a.c] = f;
   });
   private final gik.b[] h;

   public static gik a(jm $$0) {
      return g[$$0.d()];
   }

   private gik(final gik.b... $$0) {
      this.h = $$0;
   }

   public gik.b a(int $$0) {
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
