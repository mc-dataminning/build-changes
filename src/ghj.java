public enum ghj {
   a(new ghj.b(ghj.a.f, ghj.a.e, ghj.a.a), new ghj.b(ghj.a.f, ghj.a.e, ghj.a.d), new ghj.b(ghj.a.c, ghj.a.e, ghj.a.d), new ghj.b(ghj.a.c, ghj.a.e, ghj.a.a)),
   b(new ghj.b(ghj.a.f, ghj.a.b, ghj.a.d), new ghj.b(ghj.a.f, ghj.a.b, ghj.a.a), new ghj.b(ghj.a.c, ghj.a.b, ghj.a.a), new ghj.b(ghj.a.c, ghj.a.b, ghj.a.d)),
   c(new ghj.b(ghj.a.c, ghj.a.b, ghj.a.d), new ghj.b(ghj.a.c, ghj.a.e, ghj.a.d), new ghj.b(ghj.a.f, ghj.a.e, ghj.a.d), new ghj.b(ghj.a.f, ghj.a.b, ghj.a.d)),
   d(new ghj.b(ghj.a.f, ghj.a.b, ghj.a.a), new ghj.b(ghj.a.f, ghj.a.e, ghj.a.a), new ghj.b(ghj.a.c, ghj.a.e, ghj.a.a), new ghj.b(ghj.a.c, ghj.a.b, ghj.a.a)),
   e(new ghj.b(ghj.a.f, ghj.a.b, ghj.a.d), new ghj.b(ghj.a.f, ghj.a.e, ghj.a.d), new ghj.b(ghj.a.f, ghj.a.e, ghj.a.a), new ghj.b(ghj.a.f, ghj.a.b, ghj.a.a)),
   f(new ghj.b(ghj.a.c, ghj.a.b, ghj.a.a), new ghj.b(ghj.a.c, ghj.a.e, ghj.a.a), new ghj.b(ghj.a.c, ghj.a.e, ghj.a.d), new ghj.b(ghj.a.c, ghj.a.b, ghj.a.d));

   private static final ghj[] g = ad.a(new ghj[6], $$0 -> {
      $$0[ghj.a.e] = a;
      $$0[ghj.a.b] = b;
      $$0[ghj.a.d] = c;
      $$0[ghj.a.a] = d;
      $$0[ghj.a.f] = e;
      $$0[ghj.a.c] = f;
   });
   private final ghj.b[] h;

   public static ghj a(jl $$0) {
      return g[$$0.d()];
   }

   private ghj(final ghj.b... $$0) {
      this.h = $$0;
   }

   public ghj.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = jl.d.d();
      public static final int b = jl.b.d();
      public static final int c = jl.f.d();
      public static final int d = jl.c.d();
      public static final int e = jl.a.d();
      public static final int f = jl.e.d();
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
