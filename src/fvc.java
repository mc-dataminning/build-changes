public enum fvc {
   a(new fvc.b(fvc.a.f, fvc.a.e, fvc.a.a), new fvc.b(fvc.a.f, fvc.a.e, fvc.a.d), new fvc.b(fvc.a.c, fvc.a.e, fvc.a.d), new fvc.b(fvc.a.c, fvc.a.e, fvc.a.a)),
   b(new fvc.b(fvc.a.f, fvc.a.b, fvc.a.d), new fvc.b(fvc.a.f, fvc.a.b, fvc.a.a), new fvc.b(fvc.a.c, fvc.a.b, fvc.a.a), new fvc.b(fvc.a.c, fvc.a.b, fvc.a.d)),
   c(new fvc.b(fvc.a.c, fvc.a.b, fvc.a.d), new fvc.b(fvc.a.c, fvc.a.e, fvc.a.d), new fvc.b(fvc.a.f, fvc.a.e, fvc.a.d), new fvc.b(fvc.a.f, fvc.a.b, fvc.a.d)),
   d(new fvc.b(fvc.a.f, fvc.a.b, fvc.a.a), new fvc.b(fvc.a.f, fvc.a.e, fvc.a.a), new fvc.b(fvc.a.c, fvc.a.e, fvc.a.a), new fvc.b(fvc.a.c, fvc.a.b, fvc.a.a)),
   e(new fvc.b(fvc.a.f, fvc.a.b, fvc.a.d), new fvc.b(fvc.a.f, fvc.a.e, fvc.a.d), new fvc.b(fvc.a.f, fvc.a.e, fvc.a.a), new fvc.b(fvc.a.f, fvc.a.b, fvc.a.a)),
   f(new fvc.b(fvc.a.c, fvc.a.b, fvc.a.a), new fvc.b(fvc.a.c, fvc.a.e, fvc.a.a), new fvc.b(fvc.a.c, fvc.a.e, fvc.a.d), new fvc.b(fvc.a.c, fvc.a.b, fvc.a.d));

   private static final fvc[] g = ac.a(new fvc[6], $$0 -> {
      $$0[fvc.a.e] = a;
      $$0[fvc.a.b] = b;
      $$0[fvc.a.d] = c;
      $$0[fvc.a.a] = d;
      $$0[fvc.a.f] = e;
      $$0[fvc.a.c] = f;
   });
   private final fvc.b[] h;

   public static fvc a(ie $$0) {
      return g[$$0.d()];
   }

   private fvc(fvc.b... $$0) {
      this.h = $$0;
   }

   public fvc.b a(int $$0) {
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
