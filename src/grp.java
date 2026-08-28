public enum grp {
   a(new grp.b(grp.a.f, grp.a.e, grp.a.a), new grp.b(grp.a.f, grp.a.e, grp.a.d), new grp.b(grp.a.c, grp.a.e, grp.a.d), new grp.b(grp.a.c, grp.a.e, grp.a.a)),
   b(new grp.b(grp.a.f, grp.a.b, grp.a.d), new grp.b(grp.a.f, grp.a.b, grp.a.a), new grp.b(grp.a.c, grp.a.b, grp.a.a), new grp.b(grp.a.c, grp.a.b, grp.a.d)),
   c(new grp.b(grp.a.c, grp.a.b, grp.a.d), new grp.b(grp.a.c, grp.a.e, grp.a.d), new grp.b(grp.a.f, grp.a.e, grp.a.d), new grp.b(grp.a.f, grp.a.b, grp.a.d)),
   d(new grp.b(grp.a.f, grp.a.b, grp.a.a), new grp.b(grp.a.f, grp.a.e, grp.a.a), new grp.b(grp.a.c, grp.a.e, grp.a.a), new grp.b(grp.a.c, grp.a.b, grp.a.a)),
   e(new grp.b(grp.a.f, grp.a.b, grp.a.d), new grp.b(grp.a.f, grp.a.e, grp.a.d), new grp.b(grp.a.f, grp.a.e, grp.a.a), new grp.b(grp.a.f, grp.a.b, grp.a.a)),
   f(new grp.b(grp.a.c, grp.a.b, grp.a.a), new grp.b(grp.a.c, grp.a.e, grp.a.a), new grp.b(grp.a.c, grp.a.e, grp.a.d), new grp.b(grp.a.c, grp.a.b, grp.a.d));

   private static final grp[] g = ag.a(new grp[6], $$0 -> {
      $$0[grp.a.e] = a;
      $$0[grp.a.b] = b;
      $$0[grp.a.d] = c;
      $$0[grp.a.a] = d;
      $$0[grp.a.f] = e;
      $$0[grp.a.c] = f;
   });
   private final grp.b[] h;

   public static grp a(jc $$0) {
      return g[$$0.d()];
   }

   private grp(final grp.b... $$0) {
      this.h = $$0;
   }

   public grp.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = jc.d.d();
      public static final int b = jc.b.d();
      public static final int c = jc.f.d();
      public static final int d = jc.c.d();
      public static final int e = jc.a.d();
      public static final int f = jc.e.d();
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
