public enum gpn {
   a(new gpn.b(gpn.a.f, gpn.a.e, gpn.a.a), new gpn.b(gpn.a.f, gpn.a.e, gpn.a.d), new gpn.b(gpn.a.c, gpn.a.e, gpn.a.d), new gpn.b(gpn.a.c, gpn.a.e, gpn.a.a)),
   b(new gpn.b(gpn.a.f, gpn.a.b, gpn.a.d), new gpn.b(gpn.a.f, gpn.a.b, gpn.a.a), new gpn.b(gpn.a.c, gpn.a.b, gpn.a.a), new gpn.b(gpn.a.c, gpn.a.b, gpn.a.d)),
   c(new gpn.b(gpn.a.c, gpn.a.b, gpn.a.d), new gpn.b(gpn.a.c, gpn.a.e, gpn.a.d), new gpn.b(gpn.a.f, gpn.a.e, gpn.a.d), new gpn.b(gpn.a.f, gpn.a.b, gpn.a.d)),
   d(new gpn.b(gpn.a.f, gpn.a.b, gpn.a.a), new gpn.b(gpn.a.f, gpn.a.e, gpn.a.a), new gpn.b(gpn.a.c, gpn.a.e, gpn.a.a), new gpn.b(gpn.a.c, gpn.a.b, gpn.a.a)),
   e(new gpn.b(gpn.a.f, gpn.a.b, gpn.a.d), new gpn.b(gpn.a.f, gpn.a.e, gpn.a.d), new gpn.b(gpn.a.f, gpn.a.e, gpn.a.a), new gpn.b(gpn.a.f, gpn.a.b, gpn.a.a)),
   f(new gpn.b(gpn.a.c, gpn.a.b, gpn.a.a), new gpn.b(gpn.a.c, gpn.a.e, gpn.a.a), new gpn.b(gpn.a.c, gpn.a.e, gpn.a.d), new gpn.b(gpn.a.c, gpn.a.b, gpn.a.d));

   private static final gpn[] g = af.a(new gpn[6], $$0 -> {
      $$0[gpn.a.e] = a;
      $$0[gpn.a.b] = b;
      $$0[gpn.a.d] = c;
      $$0[gpn.a.a] = d;
      $$0[gpn.a.f] = e;
      $$0[gpn.a.c] = f;
   });
   private final gpn.b[] h;

   public static gpn a(ja $$0) {
      return g[$$0.d()];
   }

   private gpn(final gpn.b... $$0) {
      this.h = $$0;
   }

   public gpn.b a(int $$0) {
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
