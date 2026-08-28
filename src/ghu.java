public enum ghu {
   a(new ghu.b(ghu.a.f, ghu.a.e, ghu.a.a), new ghu.b(ghu.a.f, ghu.a.e, ghu.a.d), new ghu.b(ghu.a.c, ghu.a.e, ghu.a.d), new ghu.b(ghu.a.c, ghu.a.e, ghu.a.a)),
   b(new ghu.b(ghu.a.f, ghu.a.b, ghu.a.d), new ghu.b(ghu.a.f, ghu.a.b, ghu.a.a), new ghu.b(ghu.a.c, ghu.a.b, ghu.a.a), new ghu.b(ghu.a.c, ghu.a.b, ghu.a.d)),
   c(new ghu.b(ghu.a.c, ghu.a.b, ghu.a.d), new ghu.b(ghu.a.c, ghu.a.e, ghu.a.d), new ghu.b(ghu.a.f, ghu.a.e, ghu.a.d), new ghu.b(ghu.a.f, ghu.a.b, ghu.a.d)),
   d(new ghu.b(ghu.a.f, ghu.a.b, ghu.a.a), new ghu.b(ghu.a.f, ghu.a.e, ghu.a.a), new ghu.b(ghu.a.c, ghu.a.e, ghu.a.a), new ghu.b(ghu.a.c, ghu.a.b, ghu.a.a)),
   e(new ghu.b(ghu.a.f, ghu.a.b, ghu.a.d), new ghu.b(ghu.a.f, ghu.a.e, ghu.a.d), new ghu.b(ghu.a.f, ghu.a.e, ghu.a.a), new ghu.b(ghu.a.f, ghu.a.b, ghu.a.a)),
   f(new ghu.b(ghu.a.c, ghu.a.b, ghu.a.a), new ghu.b(ghu.a.c, ghu.a.e, ghu.a.a), new ghu.b(ghu.a.c, ghu.a.e, ghu.a.d), new ghu.b(ghu.a.c, ghu.a.b, ghu.a.d));

   private static final ghu[] g = ae.a(new ghu[6], $$0 -> {
      $$0[ghu.a.e] = a;
      $$0[ghu.a.b] = b;
      $$0[ghu.a.d] = c;
      $$0[ghu.a.a] = d;
      $$0[ghu.a.f] = e;
      $$0[ghu.a.c] = f;
   });
   private final ghu.b[] h;

   public static ghu a(jm $$0) {
      return g[$$0.d()];
   }

   private ghu(final ghu.b... $$0) {
      this.h = $$0;
   }

   public ghu.b a(int $$0) {
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
