public enum gpf {
   a(new gpf.b(gpf.a.f, gpf.a.e, gpf.a.a), new gpf.b(gpf.a.f, gpf.a.e, gpf.a.d), new gpf.b(gpf.a.c, gpf.a.e, gpf.a.d), new gpf.b(gpf.a.c, gpf.a.e, gpf.a.a)),
   b(new gpf.b(gpf.a.f, gpf.a.b, gpf.a.d), new gpf.b(gpf.a.f, gpf.a.b, gpf.a.a), new gpf.b(gpf.a.c, gpf.a.b, gpf.a.a), new gpf.b(gpf.a.c, gpf.a.b, gpf.a.d)),
   c(new gpf.b(gpf.a.c, gpf.a.b, gpf.a.d), new gpf.b(gpf.a.c, gpf.a.e, gpf.a.d), new gpf.b(gpf.a.f, gpf.a.e, gpf.a.d), new gpf.b(gpf.a.f, gpf.a.b, gpf.a.d)),
   d(new gpf.b(gpf.a.f, gpf.a.b, gpf.a.a), new gpf.b(gpf.a.f, gpf.a.e, gpf.a.a), new gpf.b(gpf.a.c, gpf.a.e, gpf.a.a), new gpf.b(gpf.a.c, gpf.a.b, gpf.a.a)),
   e(new gpf.b(gpf.a.f, gpf.a.b, gpf.a.d), new gpf.b(gpf.a.f, gpf.a.e, gpf.a.d), new gpf.b(gpf.a.f, gpf.a.e, gpf.a.a), new gpf.b(gpf.a.f, gpf.a.b, gpf.a.a)),
   f(new gpf.b(gpf.a.c, gpf.a.b, gpf.a.a), new gpf.b(gpf.a.c, gpf.a.e, gpf.a.a), new gpf.b(gpf.a.c, gpf.a.e, gpf.a.d), new gpf.b(gpf.a.c, gpf.a.b, gpf.a.d));

   private static final gpf[] g = af.a(new gpf[6], $$0 -> {
      $$0[gpf.a.e] = a;
      $$0[gpf.a.b] = b;
      $$0[gpf.a.d] = c;
      $$0[gpf.a.a] = d;
      $$0[gpf.a.f] = e;
      $$0[gpf.a.c] = f;
   });
   private final gpf.b[] h;

   public static gpf a(ja $$0) {
      return g[$$0.d()];
   }

   private gpf(final gpf.b... $$0) {
      this.h = $$0;
   }

   public gpf.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ja.d.d();
      public static final int b = ja.b.d();
      public static final int c = ja.f.d();
      public static final int d = ja.c.d();
      public static final int e = ja.a.d();
      public static final int f = ja.e.d();
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
