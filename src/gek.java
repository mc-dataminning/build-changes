public enum gek {
   a(new gek.b(gek.a.f, gek.a.e, gek.a.a), new gek.b(gek.a.f, gek.a.e, gek.a.d), new gek.b(gek.a.c, gek.a.e, gek.a.d), new gek.b(gek.a.c, gek.a.e, gek.a.a)),
   b(new gek.b(gek.a.f, gek.a.b, gek.a.d), new gek.b(gek.a.f, gek.a.b, gek.a.a), new gek.b(gek.a.c, gek.a.b, gek.a.a), new gek.b(gek.a.c, gek.a.b, gek.a.d)),
   c(new gek.b(gek.a.c, gek.a.b, gek.a.d), new gek.b(gek.a.c, gek.a.e, gek.a.d), new gek.b(gek.a.f, gek.a.e, gek.a.d), new gek.b(gek.a.f, gek.a.b, gek.a.d)),
   d(new gek.b(gek.a.f, gek.a.b, gek.a.a), new gek.b(gek.a.f, gek.a.e, gek.a.a), new gek.b(gek.a.c, gek.a.e, gek.a.a), new gek.b(gek.a.c, gek.a.b, gek.a.a)),
   e(new gek.b(gek.a.f, gek.a.b, gek.a.d), new gek.b(gek.a.f, gek.a.e, gek.a.d), new gek.b(gek.a.f, gek.a.e, gek.a.a), new gek.b(gek.a.f, gek.a.b, gek.a.a)),
   f(new gek.b(gek.a.c, gek.a.b, gek.a.a), new gek.b(gek.a.c, gek.a.e, gek.a.a), new gek.b(gek.a.c, gek.a.e, gek.a.d), new gek.b(gek.a.c, gek.a.b, gek.a.d));

   private static final gek[] g = ad.a(new gek[6], $$0 -> {
      $$0[gek.a.e] = a;
      $$0[gek.a.b] = b;
      $$0[gek.a.d] = c;
      $$0[gek.a.a] = d;
      $$0[gek.a.f] = e;
      $$0[gek.a.c] = f;
   });
   private final gek.b[] h;

   public static gek a(ji $$0) {
      return g[$$0.d()];
   }

   private gek(final gek.b... $$0) {
      this.h = $$0;
   }

   public gek.b a(int $$0) {
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
