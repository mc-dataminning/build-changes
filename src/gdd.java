public enum gdd {
   a(new gdd.b(gdd.a.f, gdd.a.e, gdd.a.a), new gdd.b(gdd.a.f, gdd.a.e, gdd.a.d), new gdd.b(gdd.a.c, gdd.a.e, gdd.a.d), new gdd.b(gdd.a.c, gdd.a.e, gdd.a.a)),
   b(new gdd.b(gdd.a.f, gdd.a.b, gdd.a.d), new gdd.b(gdd.a.f, gdd.a.b, gdd.a.a), new gdd.b(gdd.a.c, gdd.a.b, gdd.a.a), new gdd.b(gdd.a.c, gdd.a.b, gdd.a.d)),
   c(new gdd.b(gdd.a.c, gdd.a.b, gdd.a.d), new gdd.b(gdd.a.c, gdd.a.e, gdd.a.d), new gdd.b(gdd.a.f, gdd.a.e, gdd.a.d), new gdd.b(gdd.a.f, gdd.a.b, gdd.a.d)),
   d(new gdd.b(gdd.a.f, gdd.a.b, gdd.a.a), new gdd.b(gdd.a.f, gdd.a.e, gdd.a.a), new gdd.b(gdd.a.c, gdd.a.e, gdd.a.a), new gdd.b(gdd.a.c, gdd.a.b, gdd.a.a)),
   e(new gdd.b(gdd.a.f, gdd.a.b, gdd.a.d), new gdd.b(gdd.a.f, gdd.a.e, gdd.a.d), new gdd.b(gdd.a.f, gdd.a.e, gdd.a.a), new gdd.b(gdd.a.f, gdd.a.b, gdd.a.a)),
   f(new gdd.b(gdd.a.c, gdd.a.b, gdd.a.a), new gdd.b(gdd.a.c, gdd.a.e, gdd.a.a), new gdd.b(gdd.a.c, gdd.a.e, gdd.a.d), new gdd.b(gdd.a.c, gdd.a.b, gdd.a.d));

   private static final gdd[] g = ac.a(new gdd[6], $$0 -> {
      $$0[gdd.a.e] = a;
      $$0[gdd.a.b] = b;
      $$0[gdd.a.d] = c;
      $$0[gdd.a.a] = d;
      $$0[gdd.a.f] = e;
      $$0[gdd.a.c] = f;
   });
   private final gdd.b[] h;

   public static gdd a(je $$0) {
      return g[$$0.d()];
   }

   private gdd(final gdd.b... $$0) {
      this.h = $$0;
   }

   public gdd.b a(int $$0) {
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
