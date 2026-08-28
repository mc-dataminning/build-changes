public enum gde {
   a(new gde.b(gde.a.f, gde.a.e, gde.a.a), new gde.b(gde.a.f, gde.a.e, gde.a.d), new gde.b(gde.a.c, gde.a.e, gde.a.d), new gde.b(gde.a.c, gde.a.e, gde.a.a)),
   b(new gde.b(gde.a.f, gde.a.b, gde.a.d), new gde.b(gde.a.f, gde.a.b, gde.a.a), new gde.b(gde.a.c, gde.a.b, gde.a.a), new gde.b(gde.a.c, gde.a.b, gde.a.d)),
   c(new gde.b(gde.a.c, gde.a.b, gde.a.d), new gde.b(gde.a.c, gde.a.e, gde.a.d), new gde.b(gde.a.f, gde.a.e, gde.a.d), new gde.b(gde.a.f, gde.a.b, gde.a.d)),
   d(new gde.b(gde.a.f, gde.a.b, gde.a.a), new gde.b(gde.a.f, gde.a.e, gde.a.a), new gde.b(gde.a.c, gde.a.e, gde.a.a), new gde.b(gde.a.c, gde.a.b, gde.a.a)),
   e(new gde.b(gde.a.f, gde.a.b, gde.a.d), new gde.b(gde.a.f, gde.a.e, gde.a.d), new gde.b(gde.a.f, gde.a.e, gde.a.a), new gde.b(gde.a.f, gde.a.b, gde.a.a)),
   f(new gde.b(gde.a.c, gde.a.b, gde.a.a), new gde.b(gde.a.c, gde.a.e, gde.a.a), new gde.b(gde.a.c, gde.a.e, gde.a.d), new gde.b(gde.a.c, gde.a.b, gde.a.d));

   private static final gde[] g = ac.a(new gde[6], $$0 -> {
      $$0[gde.a.e] = a;
      $$0[gde.a.b] = b;
      $$0[gde.a.d] = c;
      $$0[gde.a.a] = d;
      $$0[gde.a.f] = e;
      $$0[gde.a.c] = f;
   });
   private final gde.b[] h;

   public static gde a(je $$0) {
      return g[$$0.d()];
   }

   private gde(final gde.b... $$0) {
      this.h = $$0;
   }

   public gde.b a(int $$0) {
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
