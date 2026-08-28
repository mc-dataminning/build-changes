public enum gra {
   a(new gra.b(gra.a.f, gra.a.e, gra.a.a), new gra.b(gra.a.f, gra.a.e, gra.a.d), new gra.b(gra.a.c, gra.a.e, gra.a.d), new gra.b(gra.a.c, gra.a.e, gra.a.a)),
   b(new gra.b(gra.a.f, gra.a.b, gra.a.d), new gra.b(gra.a.f, gra.a.b, gra.a.a), new gra.b(gra.a.c, gra.a.b, gra.a.a), new gra.b(gra.a.c, gra.a.b, gra.a.d)),
   c(new gra.b(gra.a.c, gra.a.b, gra.a.d), new gra.b(gra.a.c, gra.a.e, gra.a.d), new gra.b(gra.a.f, gra.a.e, gra.a.d), new gra.b(gra.a.f, gra.a.b, gra.a.d)),
   d(new gra.b(gra.a.f, gra.a.b, gra.a.a), new gra.b(gra.a.f, gra.a.e, gra.a.a), new gra.b(gra.a.c, gra.a.e, gra.a.a), new gra.b(gra.a.c, gra.a.b, gra.a.a)),
   e(new gra.b(gra.a.f, gra.a.b, gra.a.d), new gra.b(gra.a.f, gra.a.e, gra.a.d), new gra.b(gra.a.f, gra.a.e, gra.a.a), new gra.b(gra.a.f, gra.a.b, gra.a.a)),
   f(new gra.b(gra.a.c, gra.a.b, gra.a.a), new gra.b(gra.a.c, gra.a.e, gra.a.a), new gra.b(gra.a.c, gra.a.e, gra.a.d), new gra.b(gra.a.c, gra.a.b, gra.a.d));

   private static final gra[] g = ag.a(new gra[6], $$0 -> {
      $$0[gra.a.e] = a;
      $$0[gra.a.b] = b;
      $$0[gra.a.d] = c;
      $$0[gra.a.a] = d;
      $$0[gra.a.f] = e;
      $$0[gra.a.c] = f;
   });
   private final gra.b[] h;

   public static gra a(jc $$0) {
      return g[$$0.d()];
   }

   private gra(final gra.b... $$0) {
      this.h = $$0;
   }

   public gra.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = jc.d.d();
      public static final int b = jc.b.d();
      public static final int c = jc.f.d();
      public static final int d = jc.c.d();
      public static final int e = jc.a.d();
      public static final int f = jc.e.d();
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
