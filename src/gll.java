public enum gll {
   a(new gll.b(gll.a.f, gll.a.e, gll.a.a), new gll.b(gll.a.f, gll.a.e, gll.a.d), new gll.b(gll.a.c, gll.a.e, gll.a.d), new gll.b(gll.a.c, gll.a.e, gll.a.a)),
   b(new gll.b(gll.a.f, gll.a.b, gll.a.d), new gll.b(gll.a.f, gll.a.b, gll.a.a), new gll.b(gll.a.c, gll.a.b, gll.a.a), new gll.b(gll.a.c, gll.a.b, gll.a.d)),
   c(new gll.b(gll.a.c, gll.a.b, gll.a.d), new gll.b(gll.a.c, gll.a.e, gll.a.d), new gll.b(gll.a.f, gll.a.e, gll.a.d), new gll.b(gll.a.f, gll.a.b, gll.a.d)),
   d(new gll.b(gll.a.f, gll.a.b, gll.a.a), new gll.b(gll.a.f, gll.a.e, gll.a.a), new gll.b(gll.a.c, gll.a.e, gll.a.a), new gll.b(gll.a.c, gll.a.b, gll.a.a)),
   e(new gll.b(gll.a.f, gll.a.b, gll.a.d), new gll.b(gll.a.f, gll.a.e, gll.a.d), new gll.b(gll.a.f, gll.a.e, gll.a.a), new gll.b(gll.a.f, gll.a.b, gll.a.a)),
   f(new gll.b(gll.a.c, gll.a.b, gll.a.a), new gll.b(gll.a.c, gll.a.e, gll.a.a), new gll.b(gll.a.c, gll.a.e, gll.a.d), new gll.b(gll.a.c, gll.a.b, gll.a.d));

   private static final gll[] g = af.a(new gll[6], $$0 -> {
      $$0[gll.a.e] = a;
      $$0[gll.a.b] = b;
      $$0[gll.a.d] = c;
      $$0[gll.a.a] = d;
      $$0[gll.a.f] = e;
      $$0[gll.a.c] = f;
   });
   private final gll.b[] h;

   public static gll a(jn $$0) {
      return g[$$0.d()];
   }

   private gll(final gll.b... $$0) {
      this.h = $$0;
   }

   public gll.b a(int $$0) {
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
