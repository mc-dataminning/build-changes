public enum gex {
   a(new gex.b(gex.a.f, gex.a.e, gex.a.a), new gex.b(gex.a.f, gex.a.e, gex.a.d), new gex.b(gex.a.c, gex.a.e, gex.a.d), new gex.b(gex.a.c, gex.a.e, gex.a.a)),
   b(new gex.b(gex.a.f, gex.a.b, gex.a.d), new gex.b(gex.a.f, gex.a.b, gex.a.a), new gex.b(gex.a.c, gex.a.b, gex.a.a), new gex.b(gex.a.c, gex.a.b, gex.a.d)),
   c(new gex.b(gex.a.c, gex.a.b, gex.a.d), new gex.b(gex.a.c, gex.a.e, gex.a.d), new gex.b(gex.a.f, gex.a.e, gex.a.d), new gex.b(gex.a.f, gex.a.b, gex.a.d)),
   d(new gex.b(gex.a.f, gex.a.b, gex.a.a), new gex.b(gex.a.f, gex.a.e, gex.a.a), new gex.b(gex.a.c, gex.a.e, gex.a.a), new gex.b(gex.a.c, gex.a.b, gex.a.a)),
   e(new gex.b(gex.a.f, gex.a.b, gex.a.d), new gex.b(gex.a.f, gex.a.e, gex.a.d), new gex.b(gex.a.f, gex.a.e, gex.a.a), new gex.b(gex.a.f, gex.a.b, gex.a.a)),
   f(new gex.b(gex.a.c, gex.a.b, gex.a.a), new gex.b(gex.a.c, gex.a.e, gex.a.a), new gex.b(gex.a.c, gex.a.e, gex.a.d), new gex.b(gex.a.c, gex.a.b, gex.a.d));

   private static final gex[] g = ad.a(new gex[6], $$0 -> {
      $$0[gex.a.e] = a;
      $$0[gex.a.b] = b;
      $$0[gex.a.d] = c;
      $$0[gex.a.a] = d;
      $$0[gex.a.f] = e;
      $$0[gex.a.c] = f;
   });
   private final gex.b[] h;

   public static gex a(iw $$0) {
      return g[$$0.d()];
   }

   private gex(gex.b... $$0) {
      this.h = $$0;
   }

   public gex.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = iw.d.d();
      public static final int b = iw.b.d();
      public static final int c = iw.f.d();
      public static final int d = iw.c.d();
      public static final int e = iw.a.d();
      public static final int f = iw.e.d();
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
