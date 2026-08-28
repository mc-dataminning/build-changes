public enum gnm {
   a(new gnm.b(gnm.a.f, gnm.a.e, gnm.a.a), new gnm.b(gnm.a.f, gnm.a.e, gnm.a.d), new gnm.b(gnm.a.c, gnm.a.e, gnm.a.d), new gnm.b(gnm.a.c, gnm.a.e, gnm.a.a)),
   b(new gnm.b(gnm.a.f, gnm.a.b, gnm.a.d), new gnm.b(gnm.a.f, gnm.a.b, gnm.a.a), new gnm.b(gnm.a.c, gnm.a.b, gnm.a.a), new gnm.b(gnm.a.c, gnm.a.b, gnm.a.d)),
   c(new gnm.b(gnm.a.c, gnm.a.b, gnm.a.d), new gnm.b(gnm.a.c, gnm.a.e, gnm.a.d), new gnm.b(gnm.a.f, gnm.a.e, gnm.a.d), new gnm.b(gnm.a.f, gnm.a.b, gnm.a.d)),
   d(new gnm.b(gnm.a.f, gnm.a.b, gnm.a.a), new gnm.b(gnm.a.f, gnm.a.e, gnm.a.a), new gnm.b(gnm.a.c, gnm.a.e, gnm.a.a), new gnm.b(gnm.a.c, gnm.a.b, gnm.a.a)),
   e(new gnm.b(gnm.a.f, gnm.a.b, gnm.a.d), new gnm.b(gnm.a.f, gnm.a.e, gnm.a.d), new gnm.b(gnm.a.f, gnm.a.e, gnm.a.a), new gnm.b(gnm.a.f, gnm.a.b, gnm.a.a)),
   f(new gnm.b(gnm.a.c, gnm.a.b, gnm.a.a), new gnm.b(gnm.a.c, gnm.a.e, gnm.a.a), new gnm.b(gnm.a.c, gnm.a.e, gnm.a.d), new gnm.b(gnm.a.c, gnm.a.b, gnm.a.d));

   private static final gnm[] g = af.a(new gnm[6], $$0 -> {
      $$0[gnm.a.e] = a;
      $$0[gnm.a.b] = b;
      $$0[gnm.a.d] = c;
      $$0[gnm.a.a] = d;
      $$0[gnm.a.f] = e;
      $$0[gnm.a.c] = f;
   });
   private final gnm.b[] h;

   public static gnm a(jo $$0) {
      return g[$$0.d()];
   }

   private gnm(final gnm.b... $$0) {
      this.h = $$0;
   }

   public gnm.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = jo.d.d();
      public static final int b = jo.b.d();
      public static final int c = jo.f.d();
      public static final int d = jo.c.d();
      public static final int e = jo.a.d();
      public static final int f = jo.e.d();
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
