public enum ggt {
   a(new ggt.b(ggt.a.f, ggt.a.e, ggt.a.a), new ggt.b(ggt.a.f, ggt.a.e, ggt.a.d), new ggt.b(ggt.a.c, ggt.a.e, ggt.a.d), new ggt.b(ggt.a.c, ggt.a.e, ggt.a.a)),
   b(new ggt.b(ggt.a.f, ggt.a.b, ggt.a.d), new ggt.b(ggt.a.f, ggt.a.b, ggt.a.a), new ggt.b(ggt.a.c, ggt.a.b, ggt.a.a), new ggt.b(ggt.a.c, ggt.a.b, ggt.a.d)),
   c(new ggt.b(ggt.a.c, ggt.a.b, ggt.a.d), new ggt.b(ggt.a.c, ggt.a.e, ggt.a.d), new ggt.b(ggt.a.f, ggt.a.e, ggt.a.d), new ggt.b(ggt.a.f, ggt.a.b, ggt.a.d)),
   d(new ggt.b(ggt.a.f, ggt.a.b, ggt.a.a), new ggt.b(ggt.a.f, ggt.a.e, ggt.a.a), new ggt.b(ggt.a.c, ggt.a.e, ggt.a.a), new ggt.b(ggt.a.c, ggt.a.b, ggt.a.a)),
   e(new ggt.b(ggt.a.f, ggt.a.b, ggt.a.d), new ggt.b(ggt.a.f, ggt.a.e, ggt.a.d), new ggt.b(ggt.a.f, ggt.a.e, ggt.a.a), new ggt.b(ggt.a.f, ggt.a.b, ggt.a.a)),
   f(new ggt.b(ggt.a.c, ggt.a.b, ggt.a.a), new ggt.b(ggt.a.c, ggt.a.e, ggt.a.a), new ggt.b(ggt.a.c, ggt.a.e, ggt.a.d), new ggt.b(ggt.a.c, ggt.a.b, ggt.a.d));

   private static final ggt[] g = ad.a(new ggt[6], $$0 -> {
      $$0[ggt.a.e] = a;
      $$0[ggt.a.b] = b;
      $$0[ggt.a.d] = c;
      $$0[ggt.a.a] = d;
      $$0[ggt.a.f] = e;
      $$0[ggt.a.c] = f;
   });
   private final ggt.b[] h;

   public static ggt a(jj $$0) {
      return g[$$0.d()];
   }

   private ggt(final ggt.b... $$0) {
      this.h = $$0;
   }

   public ggt.b a(int $$0) {
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
