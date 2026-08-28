public enum gdh {
   a(new gdh.b(gdh.a.f, gdh.a.e, gdh.a.a), new gdh.b(gdh.a.f, gdh.a.e, gdh.a.d), new gdh.b(gdh.a.c, gdh.a.e, gdh.a.d), new gdh.b(gdh.a.c, gdh.a.e, gdh.a.a)),
   b(new gdh.b(gdh.a.f, gdh.a.b, gdh.a.d), new gdh.b(gdh.a.f, gdh.a.b, gdh.a.a), new gdh.b(gdh.a.c, gdh.a.b, gdh.a.a), new gdh.b(gdh.a.c, gdh.a.b, gdh.a.d)),
   c(new gdh.b(gdh.a.c, gdh.a.b, gdh.a.d), new gdh.b(gdh.a.c, gdh.a.e, gdh.a.d), new gdh.b(gdh.a.f, gdh.a.e, gdh.a.d), new gdh.b(gdh.a.f, gdh.a.b, gdh.a.d)),
   d(new gdh.b(gdh.a.f, gdh.a.b, gdh.a.a), new gdh.b(gdh.a.f, gdh.a.e, gdh.a.a), new gdh.b(gdh.a.c, gdh.a.e, gdh.a.a), new gdh.b(gdh.a.c, gdh.a.b, gdh.a.a)),
   e(new gdh.b(gdh.a.f, gdh.a.b, gdh.a.d), new gdh.b(gdh.a.f, gdh.a.e, gdh.a.d), new gdh.b(gdh.a.f, gdh.a.e, gdh.a.a), new gdh.b(gdh.a.f, gdh.a.b, gdh.a.a)),
   f(new gdh.b(gdh.a.c, gdh.a.b, gdh.a.a), new gdh.b(gdh.a.c, gdh.a.e, gdh.a.a), new gdh.b(gdh.a.c, gdh.a.e, gdh.a.d), new gdh.b(gdh.a.c, gdh.a.b, gdh.a.d));

   private static final gdh[] g = ac.a(new gdh[6], $$0 -> {
      $$0[gdh.a.e] = a;
      $$0[gdh.a.b] = b;
      $$0[gdh.a.d] = c;
      $$0[gdh.a.a] = d;
      $$0[gdh.a.f] = e;
      $$0[gdh.a.c] = f;
   });
   private final gdh.b[] h;

   public static gdh a(je $$0) {
      return g[$$0.d()];
   }

   private gdh(final gdh.b... $$0) {
      this.h = $$0;
   }

   public gdh.b a(int $$0) {
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
