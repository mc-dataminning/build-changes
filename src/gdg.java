public enum gdg {
   a(new gdg.b(gdg.a.f, gdg.a.e, gdg.a.a), new gdg.b(gdg.a.f, gdg.a.e, gdg.a.d), new gdg.b(gdg.a.c, gdg.a.e, gdg.a.d), new gdg.b(gdg.a.c, gdg.a.e, gdg.a.a)),
   b(new gdg.b(gdg.a.f, gdg.a.b, gdg.a.d), new gdg.b(gdg.a.f, gdg.a.b, gdg.a.a), new gdg.b(gdg.a.c, gdg.a.b, gdg.a.a), new gdg.b(gdg.a.c, gdg.a.b, gdg.a.d)),
   c(new gdg.b(gdg.a.c, gdg.a.b, gdg.a.d), new gdg.b(gdg.a.c, gdg.a.e, gdg.a.d), new gdg.b(gdg.a.f, gdg.a.e, gdg.a.d), new gdg.b(gdg.a.f, gdg.a.b, gdg.a.d)),
   d(new gdg.b(gdg.a.f, gdg.a.b, gdg.a.a), new gdg.b(gdg.a.f, gdg.a.e, gdg.a.a), new gdg.b(gdg.a.c, gdg.a.e, gdg.a.a), new gdg.b(gdg.a.c, gdg.a.b, gdg.a.a)),
   e(new gdg.b(gdg.a.f, gdg.a.b, gdg.a.d), new gdg.b(gdg.a.f, gdg.a.e, gdg.a.d), new gdg.b(gdg.a.f, gdg.a.e, gdg.a.a), new gdg.b(gdg.a.f, gdg.a.b, gdg.a.a)),
   f(new gdg.b(gdg.a.c, gdg.a.b, gdg.a.a), new gdg.b(gdg.a.c, gdg.a.e, gdg.a.a), new gdg.b(gdg.a.c, gdg.a.e, gdg.a.d), new gdg.b(gdg.a.c, gdg.a.b, gdg.a.d));

   private static final gdg[] g = ac.a(new gdg[6], $$0 -> {
      $$0[gdg.a.e] = a;
      $$0[gdg.a.b] = b;
      $$0[gdg.a.d] = c;
      $$0[gdg.a.a] = d;
      $$0[gdg.a.f] = e;
      $$0[gdg.a.c] = f;
   });
   private final gdg.b[] h;

   public static gdg a(je $$0) {
      return g[$$0.d()];
   }

   private gdg(final gdg.b... $$0) {
      this.h = $$0;
   }

   public gdg.b a(int $$0) {
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
