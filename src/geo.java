public enum geo {
   a(new geo.b(geo.a.f, geo.a.e, geo.a.a), new geo.b(geo.a.f, geo.a.e, geo.a.d), new geo.b(geo.a.c, geo.a.e, geo.a.d), new geo.b(geo.a.c, geo.a.e, geo.a.a)),
   b(new geo.b(geo.a.f, geo.a.b, geo.a.d), new geo.b(geo.a.f, geo.a.b, geo.a.a), new geo.b(geo.a.c, geo.a.b, geo.a.a), new geo.b(geo.a.c, geo.a.b, geo.a.d)),
   c(new geo.b(geo.a.c, geo.a.b, geo.a.d), new geo.b(geo.a.c, geo.a.e, geo.a.d), new geo.b(geo.a.f, geo.a.e, geo.a.d), new geo.b(geo.a.f, geo.a.b, geo.a.d)),
   d(new geo.b(geo.a.f, geo.a.b, geo.a.a), new geo.b(geo.a.f, geo.a.e, geo.a.a), new geo.b(geo.a.c, geo.a.e, geo.a.a), new geo.b(geo.a.c, geo.a.b, geo.a.a)),
   e(new geo.b(geo.a.f, geo.a.b, geo.a.d), new geo.b(geo.a.f, geo.a.e, geo.a.d), new geo.b(geo.a.f, geo.a.e, geo.a.a), new geo.b(geo.a.f, geo.a.b, geo.a.a)),
   f(new geo.b(geo.a.c, geo.a.b, geo.a.a), new geo.b(geo.a.c, geo.a.e, geo.a.a), new geo.b(geo.a.c, geo.a.e, geo.a.d), new geo.b(geo.a.c, geo.a.b, geo.a.d));

   private static final geo[] g = ad.a(new geo[6], $$0 -> {
      $$0[geo.a.e] = a;
      $$0[geo.a.b] = b;
      $$0[geo.a.d] = c;
      $$0[geo.a.a] = d;
      $$0[geo.a.f] = e;
      $$0[geo.a.c] = f;
   });
   private final geo.b[] h;

   public static geo a(ji $$0) {
      return g[$$0.d()];
   }

   private geo(final geo.b... $$0) {
      this.h = $$0;
   }

   public geo.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ji.d.d();
      public static final int b = ji.b.d();
      public static final int c = ji.f.d();
      public static final int d = ji.c.d();
      public static final int e = ji.a.d();
      public static final int f = ji.e.d();
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
