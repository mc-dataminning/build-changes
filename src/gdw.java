public enum gdw {
   a(new gdw.b(gdw.a.f, gdw.a.e, gdw.a.a), new gdw.b(gdw.a.f, gdw.a.e, gdw.a.d), new gdw.b(gdw.a.c, gdw.a.e, gdw.a.d), new gdw.b(gdw.a.c, gdw.a.e, gdw.a.a)),
   b(new gdw.b(gdw.a.f, gdw.a.b, gdw.a.d), new gdw.b(gdw.a.f, gdw.a.b, gdw.a.a), new gdw.b(gdw.a.c, gdw.a.b, gdw.a.a), new gdw.b(gdw.a.c, gdw.a.b, gdw.a.d)),
   c(new gdw.b(gdw.a.c, gdw.a.b, gdw.a.d), new gdw.b(gdw.a.c, gdw.a.e, gdw.a.d), new gdw.b(gdw.a.f, gdw.a.e, gdw.a.d), new gdw.b(gdw.a.f, gdw.a.b, gdw.a.d)),
   d(new gdw.b(gdw.a.f, gdw.a.b, gdw.a.a), new gdw.b(gdw.a.f, gdw.a.e, gdw.a.a), new gdw.b(gdw.a.c, gdw.a.e, gdw.a.a), new gdw.b(gdw.a.c, gdw.a.b, gdw.a.a)),
   e(new gdw.b(gdw.a.f, gdw.a.b, gdw.a.d), new gdw.b(gdw.a.f, gdw.a.e, gdw.a.d), new gdw.b(gdw.a.f, gdw.a.e, gdw.a.a), new gdw.b(gdw.a.f, gdw.a.b, gdw.a.a)),
   f(new gdw.b(gdw.a.c, gdw.a.b, gdw.a.a), new gdw.b(gdw.a.c, gdw.a.e, gdw.a.a), new gdw.b(gdw.a.c, gdw.a.e, gdw.a.d), new gdw.b(gdw.a.c, gdw.a.b, gdw.a.d));

   private static final gdw[] g = ac.a(new gdw[6], $$0 -> {
      $$0[gdw.a.e] = a;
      $$0[gdw.a.b] = b;
      $$0[gdw.a.d] = c;
      $$0[gdw.a.a] = d;
      $$0[gdw.a.f] = e;
      $$0[gdw.a.c] = f;
   });
   private final gdw.b[] h;

   public static gdw a(jf $$0) {
      return g[$$0.d()];
   }

   private gdw(final gdw.b... $$0) {
      this.h = $$0;
   }

   public gdw.b a(int $$0) {
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
