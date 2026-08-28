public enum gdo {
   a(new gdo.b(gdo.a.f, gdo.a.e, gdo.a.a), new gdo.b(gdo.a.f, gdo.a.e, gdo.a.d), new gdo.b(gdo.a.c, gdo.a.e, gdo.a.d), new gdo.b(gdo.a.c, gdo.a.e, gdo.a.a)),
   b(new gdo.b(gdo.a.f, gdo.a.b, gdo.a.d), new gdo.b(gdo.a.f, gdo.a.b, gdo.a.a), new gdo.b(gdo.a.c, gdo.a.b, gdo.a.a), new gdo.b(gdo.a.c, gdo.a.b, gdo.a.d)),
   c(new gdo.b(gdo.a.c, gdo.a.b, gdo.a.d), new gdo.b(gdo.a.c, gdo.a.e, gdo.a.d), new gdo.b(gdo.a.f, gdo.a.e, gdo.a.d), new gdo.b(gdo.a.f, gdo.a.b, gdo.a.d)),
   d(new gdo.b(gdo.a.f, gdo.a.b, gdo.a.a), new gdo.b(gdo.a.f, gdo.a.e, gdo.a.a), new gdo.b(gdo.a.c, gdo.a.e, gdo.a.a), new gdo.b(gdo.a.c, gdo.a.b, gdo.a.a)),
   e(new gdo.b(gdo.a.f, gdo.a.b, gdo.a.d), new gdo.b(gdo.a.f, gdo.a.e, gdo.a.d), new gdo.b(gdo.a.f, gdo.a.e, gdo.a.a), new gdo.b(gdo.a.f, gdo.a.b, gdo.a.a)),
   f(new gdo.b(gdo.a.c, gdo.a.b, gdo.a.a), new gdo.b(gdo.a.c, gdo.a.e, gdo.a.a), new gdo.b(gdo.a.c, gdo.a.e, gdo.a.d), new gdo.b(gdo.a.c, gdo.a.b, gdo.a.d));

   private static final gdo[] g = ac.a(new gdo[6], $$0 -> {
      $$0[gdo.a.e] = a;
      $$0[gdo.a.b] = b;
      $$0[gdo.a.d] = c;
      $$0[gdo.a.a] = d;
      $$0[gdo.a.f] = e;
      $$0[gdo.a.c] = f;
   });
   private final gdo.b[] h;

   public static gdo a(jf $$0) {
      return g[$$0.d()];
   }

   private gdo(final gdo.b... $$0) {
      this.h = $$0;
   }

   public gdo.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = jf.d.d();
      public static final int b = jf.b.d();
      public static final int c = jf.f.d();
      public static final int d = jf.c.d();
      public static final int e = jf.a.d();
      public static final int f = jf.e.d();
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
