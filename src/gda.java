public enum gda {
   a(new gda.b(gda.a.f, gda.a.e, gda.a.a), new gda.b(gda.a.f, gda.a.e, gda.a.d), new gda.b(gda.a.c, gda.a.e, gda.a.d), new gda.b(gda.a.c, gda.a.e, gda.a.a)),
   b(new gda.b(gda.a.f, gda.a.b, gda.a.d), new gda.b(gda.a.f, gda.a.b, gda.a.a), new gda.b(gda.a.c, gda.a.b, gda.a.a), new gda.b(gda.a.c, gda.a.b, gda.a.d)),
   c(new gda.b(gda.a.c, gda.a.b, gda.a.d), new gda.b(gda.a.c, gda.a.e, gda.a.d), new gda.b(gda.a.f, gda.a.e, gda.a.d), new gda.b(gda.a.f, gda.a.b, gda.a.d)),
   d(new gda.b(gda.a.f, gda.a.b, gda.a.a), new gda.b(gda.a.f, gda.a.e, gda.a.a), new gda.b(gda.a.c, gda.a.e, gda.a.a), new gda.b(gda.a.c, gda.a.b, gda.a.a)),
   e(new gda.b(gda.a.f, gda.a.b, gda.a.d), new gda.b(gda.a.f, gda.a.e, gda.a.d), new gda.b(gda.a.f, gda.a.e, gda.a.a), new gda.b(gda.a.f, gda.a.b, gda.a.a)),
   f(new gda.b(gda.a.c, gda.a.b, gda.a.a), new gda.b(gda.a.c, gda.a.e, gda.a.a), new gda.b(gda.a.c, gda.a.e, gda.a.d), new gda.b(gda.a.c, gda.a.b, gda.a.d));

   private static final gda[] g = ac.a(new gda[6], $$0 -> {
      $$0[gda.a.e] = a;
      $$0[gda.a.b] = b;
      $$0[gda.a.d] = c;
      $$0[gda.a.a] = d;
      $$0[gda.a.f] = e;
      $$0[gda.a.c] = f;
   });
   private final gda.b[] h;

   public static gda a(je $$0) {
      return g[$$0.d()];
   }

   private gda(final gda.b... $$0) {
      this.h = $$0;
   }

   public gda.b a(int $$0) {
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
