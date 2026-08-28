public enum ggi {
   a(new ggi.b(ggi.a.f, ggi.a.e, ggi.a.a), new ggi.b(ggi.a.f, ggi.a.e, ggi.a.d), new ggi.b(ggi.a.c, ggi.a.e, ggi.a.d), new ggi.b(ggi.a.c, ggi.a.e, ggi.a.a)),
   b(new ggi.b(ggi.a.f, ggi.a.b, ggi.a.d), new ggi.b(ggi.a.f, ggi.a.b, ggi.a.a), new ggi.b(ggi.a.c, ggi.a.b, ggi.a.a), new ggi.b(ggi.a.c, ggi.a.b, ggi.a.d)),
   c(new ggi.b(ggi.a.c, ggi.a.b, ggi.a.d), new ggi.b(ggi.a.c, ggi.a.e, ggi.a.d), new ggi.b(ggi.a.f, ggi.a.e, ggi.a.d), new ggi.b(ggi.a.f, ggi.a.b, ggi.a.d)),
   d(new ggi.b(ggi.a.f, ggi.a.b, ggi.a.a), new ggi.b(ggi.a.f, ggi.a.e, ggi.a.a), new ggi.b(ggi.a.c, ggi.a.e, ggi.a.a), new ggi.b(ggi.a.c, ggi.a.b, ggi.a.a)),
   e(new ggi.b(ggi.a.f, ggi.a.b, ggi.a.d), new ggi.b(ggi.a.f, ggi.a.e, ggi.a.d), new ggi.b(ggi.a.f, ggi.a.e, ggi.a.a), new ggi.b(ggi.a.f, ggi.a.b, ggi.a.a)),
   f(new ggi.b(ggi.a.c, ggi.a.b, ggi.a.a), new ggi.b(ggi.a.c, ggi.a.e, ggi.a.a), new ggi.b(ggi.a.c, ggi.a.e, ggi.a.d), new ggi.b(ggi.a.c, ggi.a.b, ggi.a.d));

   private static final ggi[] g = ad.a(new ggi[6], $$0 -> {
      $$0[ggi.a.e] = a;
      $$0[ggi.a.b] = b;
      $$0[ggi.a.d] = c;
      $$0[ggi.a.a] = d;
      $$0[ggi.a.f] = e;
      $$0[ggi.a.c] = f;
   });
   private final ggi.b[] h;

   public static ggi a(jj $$0) {
      return g[$$0.d()];
   }

   private ggi(final ggi.b... $$0) {
      this.h = $$0;
   }

   public ggi.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = jj.d.d();
      public static final int b = jj.b.d();
      public static final int c = jj.f.d();
      public static final int d = jj.c.d();
      public static final int e = jj.a.d();
      public static final int f = jj.e.d();
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
