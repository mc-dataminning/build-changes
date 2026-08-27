public enum fvk {
   a(new fvk.b(fvk.a.f, fvk.a.e, fvk.a.a), new fvk.b(fvk.a.f, fvk.a.e, fvk.a.d), new fvk.b(fvk.a.c, fvk.a.e, fvk.a.d), new fvk.b(fvk.a.c, fvk.a.e, fvk.a.a)),
   b(new fvk.b(fvk.a.f, fvk.a.b, fvk.a.d), new fvk.b(fvk.a.f, fvk.a.b, fvk.a.a), new fvk.b(fvk.a.c, fvk.a.b, fvk.a.a), new fvk.b(fvk.a.c, fvk.a.b, fvk.a.d)),
   c(new fvk.b(fvk.a.c, fvk.a.b, fvk.a.d), new fvk.b(fvk.a.c, fvk.a.e, fvk.a.d), new fvk.b(fvk.a.f, fvk.a.e, fvk.a.d), new fvk.b(fvk.a.f, fvk.a.b, fvk.a.d)),
   d(new fvk.b(fvk.a.f, fvk.a.b, fvk.a.a), new fvk.b(fvk.a.f, fvk.a.e, fvk.a.a), new fvk.b(fvk.a.c, fvk.a.e, fvk.a.a), new fvk.b(fvk.a.c, fvk.a.b, fvk.a.a)),
   e(new fvk.b(fvk.a.f, fvk.a.b, fvk.a.d), new fvk.b(fvk.a.f, fvk.a.e, fvk.a.d), new fvk.b(fvk.a.f, fvk.a.e, fvk.a.a), new fvk.b(fvk.a.f, fvk.a.b, fvk.a.a)),
   f(new fvk.b(fvk.a.c, fvk.a.b, fvk.a.a), new fvk.b(fvk.a.c, fvk.a.e, fvk.a.a), new fvk.b(fvk.a.c, fvk.a.e, fvk.a.d), new fvk.b(fvk.a.c, fvk.a.b, fvk.a.d));

   private static final fvk[] g = ac.a(new fvk[6], $$0 -> {
      $$0[fvk.a.e] = a;
      $$0[fvk.a.b] = b;
      $$0[fvk.a.d] = c;
      $$0[fvk.a.a] = d;
      $$0[fvk.a.f] = e;
      $$0[fvk.a.c] = f;
   });
   private final fvk.b[] h;

   public static fvk a(ie $$0) {
      return g[$$0.d()];
   }

   private fvk(fvk.b... $$0) {
      this.h = $$0;
   }

   public fvk.b a(int $$0) {
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
