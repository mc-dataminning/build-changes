public enum ggy {
   a(new ggy.b(ggy.a.f, ggy.a.e, ggy.a.a), new ggy.b(ggy.a.f, ggy.a.e, ggy.a.d), new ggy.b(ggy.a.c, ggy.a.e, ggy.a.d), new ggy.b(ggy.a.c, ggy.a.e, ggy.a.a)),
   b(new ggy.b(ggy.a.f, ggy.a.b, ggy.a.d), new ggy.b(ggy.a.f, ggy.a.b, ggy.a.a), new ggy.b(ggy.a.c, ggy.a.b, ggy.a.a), new ggy.b(ggy.a.c, ggy.a.b, ggy.a.d)),
   c(new ggy.b(ggy.a.c, ggy.a.b, ggy.a.d), new ggy.b(ggy.a.c, ggy.a.e, ggy.a.d), new ggy.b(ggy.a.f, ggy.a.e, ggy.a.d), new ggy.b(ggy.a.f, ggy.a.b, ggy.a.d)),
   d(new ggy.b(ggy.a.f, ggy.a.b, ggy.a.a), new ggy.b(ggy.a.f, ggy.a.e, ggy.a.a), new ggy.b(ggy.a.c, ggy.a.e, ggy.a.a), new ggy.b(ggy.a.c, ggy.a.b, ggy.a.a)),
   e(new ggy.b(ggy.a.f, ggy.a.b, ggy.a.d), new ggy.b(ggy.a.f, ggy.a.e, ggy.a.d), new ggy.b(ggy.a.f, ggy.a.e, ggy.a.a), new ggy.b(ggy.a.f, ggy.a.b, ggy.a.a)),
   f(new ggy.b(ggy.a.c, ggy.a.b, ggy.a.a), new ggy.b(ggy.a.c, ggy.a.e, ggy.a.a), new ggy.b(ggy.a.c, ggy.a.e, ggy.a.d), new ggy.b(ggy.a.c, ggy.a.b, ggy.a.d));

   private static final ggy[] g = ad.a(new ggy[6], $$0 -> {
      $$0[ggy.a.e] = a;
      $$0[ggy.a.b] = b;
      $$0[ggy.a.d] = c;
      $$0[ggy.a.a] = d;
      $$0[ggy.a.f] = e;
      $$0[ggy.a.c] = f;
   });
   private final ggy.b[] h;

   public static ggy a(jk $$0) {
      return g[$$0.d()];
   }

   private ggy(final ggy.b... $$0) {
      this.h = $$0;
   }

   public ggy.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = jk.d.d();
      public static final int b = jk.b.d();
      public static final int c = jk.f.d();
      public static final int d = jk.c.d();
      public static final int e = jk.a.d();
      public static final int f = jk.e.d();
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
