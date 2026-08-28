public enum gml {
   a(new gml.b(gml.a.f, gml.a.e, gml.a.a), new gml.b(gml.a.f, gml.a.e, gml.a.d), new gml.b(gml.a.c, gml.a.e, gml.a.d), new gml.b(gml.a.c, gml.a.e, gml.a.a)),
   b(new gml.b(gml.a.f, gml.a.b, gml.a.d), new gml.b(gml.a.f, gml.a.b, gml.a.a), new gml.b(gml.a.c, gml.a.b, gml.a.a), new gml.b(gml.a.c, gml.a.b, gml.a.d)),
   c(new gml.b(gml.a.c, gml.a.b, gml.a.d), new gml.b(gml.a.c, gml.a.e, gml.a.d), new gml.b(gml.a.f, gml.a.e, gml.a.d), new gml.b(gml.a.f, gml.a.b, gml.a.d)),
   d(new gml.b(gml.a.f, gml.a.b, gml.a.a), new gml.b(gml.a.f, gml.a.e, gml.a.a), new gml.b(gml.a.c, gml.a.e, gml.a.a), new gml.b(gml.a.c, gml.a.b, gml.a.a)),
   e(new gml.b(gml.a.f, gml.a.b, gml.a.d), new gml.b(gml.a.f, gml.a.e, gml.a.d), new gml.b(gml.a.f, gml.a.e, gml.a.a), new gml.b(gml.a.f, gml.a.b, gml.a.a)),
   f(new gml.b(gml.a.c, gml.a.b, gml.a.a), new gml.b(gml.a.c, gml.a.e, gml.a.a), new gml.b(gml.a.c, gml.a.e, gml.a.d), new gml.b(gml.a.c, gml.a.b, gml.a.d));

   private static final gml[] g = af.a(new gml[6], $$0 -> {
      $$0[gml.a.e] = a;
      $$0[gml.a.b] = b;
      $$0[gml.a.d] = c;
      $$0[gml.a.a] = d;
      $$0[gml.a.f] = e;
      $$0[gml.a.c] = f;
   });
   private final gml.b[] h;

   public static gml a(jn $$0) {
      return g[$$0.d()];
   }

   private gml(final gml.b... $$0) {
      this.h = $$0;
   }

   public gml.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = jn.d.d();
      public static final int b = jn.b.d();
      public static final int c = jn.f.d();
      public static final int d = jn.c.d();
      public static final int e = jn.a.d();
      public static final int f = jn.e.d();
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
