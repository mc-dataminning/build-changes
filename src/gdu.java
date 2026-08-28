public enum gdu {
   a(new gdu.b(gdu.a.f, gdu.a.e, gdu.a.a), new gdu.b(gdu.a.f, gdu.a.e, gdu.a.d), new gdu.b(gdu.a.c, gdu.a.e, gdu.a.d), new gdu.b(gdu.a.c, gdu.a.e, gdu.a.a)),
   b(new gdu.b(gdu.a.f, gdu.a.b, gdu.a.d), new gdu.b(gdu.a.f, gdu.a.b, gdu.a.a), new gdu.b(gdu.a.c, gdu.a.b, gdu.a.a), new gdu.b(gdu.a.c, gdu.a.b, gdu.a.d)),
   c(new gdu.b(gdu.a.c, gdu.a.b, gdu.a.d), new gdu.b(gdu.a.c, gdu.a.e, gdu.a.d), new gdu.b(gdu.a.f, gdu.a.e, gdu.a.d), new gdu.b(gdu.a.f, gdu.a.b, gdu.a.d)),
   d(new gdu.b(gdu.a.f, gdu.a.b, gdu.a.a), new gdu.b(gdu.a.f, gdu.a.e, gdu.a.a), new gdu.b(gdu.a.c, gdu.a.e, gdu.a.a), new gdu.b(gdu.a.c, gdu.a.b, gdu.a.a)),
   e(new gdu.b(gdu.a.f, gdu.a.b, gdu.a.d), new gdu.b(gdu.a.f, gdu.a.e, gdu.a.d), new gdu.b(gdu.a.f, gdu.a.e, gdu.a.a), new gdu.b(gdu.a.f, gdu.a.b, gdu.a.a)),
   f(new gdu.b(gdu.a.c, gdu.a.b, gdu.a.a), new gdu.b(gdu.a.c, gdu.a.e, gdu.a.a), new gdu.b(gdu.a.c, gdu.a.e, gdu.a.d), new gdu.b(gdu.a.c, gdu.a.b, gdu.a.d));

   private static final gdu[] g = ac.a(new gdu[6], $$0 -> {
      $$0[gdu.a.e] = a;
      $$0[gdu.a.b] = b;
      $$0[gdu.a.d] = c;
      $$0[gdu.a.a] = d;
      $$0[gdu.a.f] = e;
      $$0[gdu.a.c] = f;
   });
   private final gdu.b[] h;

   public static gdu a(jf $$0) {
      return g[$$0.d()];
   }

   private gdu(final gdu.b... $$0) {
      this.h = $$0;
   }

   public gdu.b a(int $$0) {
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
