public enum fvd {
   a(new fvd.b(fvd.a.f, fvd.a.e, fvd.a.a), new fvd.b(fvd.a.f, fvd.a.e, fvd.a.d), new fvd.b(fvd.a.c, fvd.a.e, fvd.a.d), new fvd.b(fvd.a.c, fvd.a.e, fvd.a.a)),
   b(new fvd.b(fvd.a.f, fvd.a.b, fvd.a.d), new fvd.b(fvd.a.f, fvd.a.b, fvd.a.a), new fvd.b(fvd.a.c, fvd.a.b, fvd.a.a), new fvd.b(fvd.a.c, fvd.a.b, fvd.a.d)),
   c(new fvd.b(fvd.a.c, fvd.a.b, fvd.a.d), new fvd.b(fvd.a.c, fvd.a.e, fvd.a.d), new fvd.b(fvd.a.f, fvd.a.e, fvd.a.d), new fvd.b(fvd.a.f, fvd.a.b, fvd.a.d)),
   d(new fvd.b(fvd.a.f, fvd.a.b, fvd.a.a), new fvd.b(fvd.a.f, fvd.a.e, fvd.a.a), new fvd.b(fvd.a.c, fvd.a.e, fvd.a.a), new fvd.b(fvd.a.c, fvd.a.b, fvd.a.a)),
   e(new fvd.b(fvd.a.f, fvd.a.b, fvd.a.d), new fvd.b(fvd.a.f, fvd.a.e, fvd.a.d), new fvd.b(fvd.a.f, fvd.a.e, fvd.a.a), new fvd.b(fvd.a.f, fvd.a.b, fvd.a.a)),
   f(new fvd.b(fvd.a.c, fvd.a.b, fvd.a.a), new fvd.b(fvd.a.c, fvd.a.e, fvd.a.a), new fvd.b(fvd.a.c, fvd.a.e, fvd.a.d), new fvd.b(fvd.a.c, fvd.a.b, fvd.a.d));

   private static final fvd[] g = ac.a(new fvd[6], $$0 -> {
      $$0[fvd.a.e] = a;
      $$0[fvd.a.b] = b;
      $$0[fvd.a.d] = c;
      $$0[fvd.a.a] = d;
      $$0[fvd.a.f] = e;
      $$0[fvd.a.c] = f;
   });
   private final fvd.b[] h;

   public static fvd a(ie $$0) {
      return g[$$0.d()];
   }

   private fvd(fvd.b... $$0) {
      this.h = $$0;
   }

   public fvd.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ie.d.d();
      public static final int b = ie.b.d();
      public static final int c = ie.f.d();
      public static final int d = ie.c.d();
      public static final int e = ie.a.d();
      public static final int f = ie.e.d();
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
