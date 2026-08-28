public enum gdf {
   a(new gdf.b(gdf.a.f, gdf.a.e, gdf.a.a), new gdf.b(gdf.a.f, gdf.a.e, gdf.a.d), new gdf.b(gdf.a.c, gdf.a.e, gdf.a.d), new gdf.b(gdf.a.c, gdf.a.e, gdf.a.a)),
   b(new gdf.b(gdf.a.f, gdf.a.b, gdf.a.d), new gdf.b(gdf.a.f, gdf.a.b, gdf.a.a), new gdf.b(gdf.a.c, gdf.a.b, gdf.a.a), new gdf.b(gdf.a.c, gdf.a.b, gdf.a.d)),
   c(new gdf.b(gdf.a.c, gdf.a.b, gdf.a.d), new gdf.b(gdf.a.c, gdf.a.e, gdf.a.d), new gdf.b(gdf.a.f, gdf.a.e, gdf.a.d), new gdf.b(gdf.a.f, gdf.a.b, gdf.a.d)),
   d(new gdf.b(gdf.a.f, gdf.a.b, gdf.a.a), new gdf.b(gdf.a.f, gdf.a.e, gdf.a.a), new gdf.b(gdf.a.c, gdf.a.e, gdf.a.a), new gdf.b(gdf.a.c, gdf.a.b, gdf.a.a)),
   e(new gdf.b(gdf.a.f, gdf.a.b, gdf.a.d), new gdf.b(gdf.a.f, gdf.a.e, gdf.a.d), new gdf.b(gdf.a.f, gdf.a.e, gdf.a.a), new gdf.b(gdf.a.f, gdf.a.b, gdf.a.a)),
   f(new gdf.b(gdf.a.c, gdf.a.b, gdf.a.a), new gdf.b(gdf.a.c, gdf.a.e, gdf.a.a), new gdf.b(gdf.a.c, gdf.a.e, gdf.a.d), new gdf.b(gdf.a.c, gdf.a.b, gdf.a.d));

   private static final gdf[] g = ac.a(new gdf[6], $$0 -> {
      $$0[gdf.a.e] = a;
      $$0[gdf.a.b] = b;
      $$0[gdf.a.d] = c;
      $$0[gdf.a.a] = d;
      $$0[gdf.a.f] = e;
      $$0[gdf.a.c] = f;
   });
   private final gdf.b[] h;

   public static gdf a(je $$0) {
      return g[$$0.d()];
   }

   private gdf(final gdf.b... $$0) {
      this.h = $$0;
   }

   public gdf.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = je.d.d();
      public static final int b = je.b.d();
      public static final int c = je.f.d();
      public static final int d = je.c.d();
      public static final int e = je.a.d();
      public static final int f = je.e.d();
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
