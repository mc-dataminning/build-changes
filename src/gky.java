public enum gky {
   a(new gky.b(gky.a.f, gky.a.e, gky.a.a), new gky.b(gky.a.f, gky.a.e, gky.a.d), new gky.b(gky.a.c, gky.a.e, gky.a.d), new gky.b(gky.a.c, gky.a.e, gky.a.a)),
   b(new gky.b(gky.a.f, gky.a.b, gky.a.d), new gky.b(gky.a.f, gky.a.b, gky.a.a), new gky.b(gky.a.c, gky.a.b, gky.a.a), new gky.b(gky.a.c, gky.a.b, gky.a.d)),
   c(new gky.b(gky.a.c, gky.a.b, gky.a.d), new gky.b(gky.a.c, gky.a.e, gky.a.d), new gky.b(gky.a.f, gky.a.e, gky.a.d), new gky.b(gky.a.f, gky.a.b, gky.a.d)),
   d(new gky.b(gky.a.f, gky.a.b, gky.a.a), new gky.b(gky.a.f, gky.a.e, gky.a.a), new gky.b(gky.a.c, gky.a.e, gky.a.a), new gky.b(gky.a.c, gky.a.b, gky.a.a)),
   e(new gky.b(gky.a.f, gky.a.b, gky.a.d), new gky.b(gky.a.f, gky.a.e, gky.a.d), new gky.b(gky.a.f, gky.a.e, gky.a.a), new gky.b(gky.a.f, gky.a.b, gky.a.a)),
   f(new gky.b(gky.a.c, gky.a.b, gky.a.a), new gky.b(gky.a.c, gky.a.e, gky.a.a), new gky.b(gky.a.c, gky.a.e, gky.a.d), new gky.b(gky.a.c, gky.a.b, gky.a.d));

   private static final gky[] g = ae.a(new gky[6], $$0 -> {
      $$0[gky.a.e] = a;
      $$0[gky.a.b] = b;
      $$0[gky.a.d] = c;
      $$0[gky.a.a] = d;
      $$0[gky.a.f] = e;
      $$0[gky.a.c] = f;
   });
   private final gky.b[] h;

   public static gky a(jm $$0) {
      return g[$$0.d()];
   }

   private gky(final gky.b... $$0) {
      this.h = $$0;
   }

   public gky.b a(int $$0) {
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
