public enum geq {
   a(new geq.b(geq.a.f, geq.a.e, geq.a.a), new geq.b(geq.a.f, geq.a.e, geq.a.d), new geq.b(geq.a.c, geq.a.e, geq.a.d), new geq.b(geq.a.c, geq.a.e, geq.a.a)),
   b(new geq.b(geq.a.f, geq.a.b, geq.a.d), new geq.b(geq.a.f, geq.a.b, geq.a.a), new geq.b(geq.a.c, geq.a.b, geq.a.a), new geq.b(geq.a.c, geq.a.b, geq.a.d)),
   c(new geq.b(geq.a.c, geq.a.b, geq.a.d), new geq.b(geq.a.c, geq.a.e, geq.a.d), new geq.b(geq.a.f, geq.a.e, geq.a.d), new geq.b(geq.a.f, geq.a.b, geq.a.d)),
   d(new geq.b(geq.a.f, geq.a.b, geq.a.a), new geq.b(geq.a.f, geq.a.e, geq.a.a), new geq.b(geq.a.c, geq.a.e, geq.a.a), new geq.b(geq.a.c, geq.a.b, geq.a.a)),
   e(new geq.b(geq.a.f, geq.a.b, geq.a.d), new geq.b(geq.a.f, geq.a.e, geq.a.d), new geq.b(geq.a.f, geq.a.e, geq.a.a), new geq.b(geq.a.f, geq.a.b, geq.a.a)),
   f(new geq.b(geq.a.c, geq.a.b, geq.a.a), new geq.b(geq.a.c, geq.a.e, geq.a.a), new geq.b(geq.a.c, geq.a.e, geq.a.d), new geq.b(geq.a.c, geq.a.b, geq.a.d));

   private static final geq[] g = ad.a(new geq[6], $$0 -> {
      $$0[geq.a.e] = a;
      $$0[geq.a.b] = b;
      $$0[geq.a.d] = c;
      $$0[geq.a.a] = d;
      $$0[geq.a.f] = e;
      $$0[geq.a.c] = f;
   });
   private final geq.b[] h;

   public static geq a(ji $$0) {
      return g[$$0.d()];
   }

   private geq(final geq.b... $$0) {
      this.h = $$0;
   }

   public geq.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ji.d.d();
      public static final int b = ji.b.d();
      public static final int c = ji.f.d();
      public static final int d = ji.c.d();
      public static final int e = ji.a.d();
      public static final int f = ji.e.d();
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
