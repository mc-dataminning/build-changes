public enum gln {
   a(new gln.b(gln.a.f, gln.a.e, gln.a.a), new gln.b(gln.a.f, gln.a.e, gln.a.d), new gln.b(gln.a.c, gln.a.e, gln.a.d), new gln.b(gln.a.c, gln.a.e, gln.a.a)),
   b(new gln.b(gln.a.f, gln.a.b, gln.a.d), new gln.b(gln.a.f, gln.a.b, gln.a.a), new gln.b(gln.a.c, gln.a.b, gln.a.a), new gln.b(gln.a.c, gln.a.b, gln.a.d)),
   c(new gln.b(gln.a.c, gln.a.b, gln.a.d), new gln.b(gln.a.c, gln.a.e, gln.a.d), new gln.b(gln.a.f, gln.a.e, gln.a.d), new gln.b(gln.a.f, gln.a.b, gln.a.d)),
   d(new gln.b(gln.a.f, gln.a.b, gln.a.a), new gln.b(gln.a.f, gln.a.e, gln.a.a), new gln.b(gln.a.c, gln.a.e, gln.a.a), new gln.b(gln.a.c, gln.a.b, gln.a.a)),
   e(new gln.b(gln.a.f, gln.a.b, gln.a.d), new gln.b(gln.a.f, gln.a.e, gln.a.d), new gln.b(gln.a.f, gln.a.e, gln.a.a), new gln.b(gln.a.f, gln.a.b, gln.a.a)),
   f(new gln.b(gln.a.c, gln.a.b, gln.a.a), new gln.b(gln.a.c, gln.a.e, gln.a.a), new gln.b(gln.a.c, gln.a.e, gln.a.d), new gln.b(gln.a.c, gln.a.b, gln.a.d));

   private static final gln[] g = af.a(new gln[6], $$0 -> {
      $$0[gln.a.e] = a;
      $$0[gln.a.b] = b;
      $$0[gln.a.d] = c;
      $$0[gln.a.a] = d;
      $$0[gln.a.f] = e;
      $$0[gln.a.c] = f;
   });
   private final gln.b[] h;

   public static gln a(jn $$0) {
      return g[$$0.d()];
   }

   private gln(final gln.b... $$0) {
      this.h = $$0;
   }

   public gln.b a(int $$0) {
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
