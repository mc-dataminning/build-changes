public enum gkt {
   a(new gkt.b(gkt.a.f, gkt.a.e, gkt.a.a), new gkt.b(gkt.a.f, gkt.a.e, gkt.a.d), new gkt.b(gkt.a.c, gkt.a.e, gkt.a.d), new gkt.b(gkt.a.c, gkt.a.e, gkt.a.a)),
   b(new gkt.b(gkt.a.f, gkt.a.b, gkt.a.d), new gkt.b(gkt.a.f, gkt.a.b, gkt.a.a), new gkt.b(gkt.a.c, gkt.a.b, gkt.a.a), new gkt.b(gkt.a.c, gkt.a.b, gkt.a.d)),
   c(new gkt.b(gkt.a.c, gkt.a.b, gkt.a.d), new gkt.b(gkt.a.c, gkt.a.e, gkt.a.d), new gkt.b(gkt.a.f, gkt.a.e, gkt.a.d), new gkt.b(gkt.a.f, gkt.a.b, gkt.a.d)),
   d(new gkt.b(gkt.a.f, gkt.a.b, gkt.a.a), new gkt.b(gkt.a.f, gkt.a.e, gkt.a.a), new gkt.b(gkt.a.c, gkt.a.e, gkt.a.a), new gkt.b(gkt.a.c, gkt.a.b, gkt.a.a)),
   e(new gkt.b(gkt.a.f, gkt.a.b, gkt.a.d), new gkt.b(gkt.a.f, gkt.a.e, gkt.a.d), new gkt.b(gkt.a.f, gkt.a.e, gkt.a.a), new gkt.b(gkt.a.f, gkt.a.b, gkt.a.a)),
   f(new gkt.b(gkt.a.c, gkt.a.b, gkt.a.a), new gkt.b(gkt.a.c, gkt.a.e, gkt.a.a), new gkt.b(gkt.a.c, gkt.a.e, gkt.a.d), new gkt.b(gkt.a.c, gkt.a.b, gkt.a.d));

   private static final gkt[] g = ae.a(new gkt[6], $$0 -> {
      $$0[gkt.a.e] = a;
      $$0[gkt.a.b] = b;
      $$0[gkt.a.d] = c;
      $$0[gkt.a.a] = d;
      $$0[gkt.a.f] = e;
      $$0[gkt.a.c] = f;
   });
   private final gkt.b[] h;

   public static gkt a(jm $$0) {
      return g[$$0.d()];
   }

   private gkt(final gkt.b... $$0) {
      this.h = $$0;
   }

   public gkt.b a(int $$0) {
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
