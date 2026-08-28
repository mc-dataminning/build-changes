public enum grn {
   a(new grn.b(grn.a.f, grn.a.e, grn.a.a), new grn.b(grn.a.f, grn.a.e, grn.a.d), new grn.b(grn.a.c, grn.a.e, grn.a.d), new grn.b(grn.a.c, grn.a.e, grn.a.a)),
   b(new grn.b(grn.a.f, grn.a.b, grn.a.d), new grn.b(grn.a.f, grn.a.b, grn.a.a), new grn.b(grn.a.c, grn.a.b, grn.a.a), new grn.b(grn.a.c, grn.a.b, grn.a.d)),
   c(new grn.b(grn.a.c, grn.a.b, grn.a.d), new grn.b(grn.a.c, grn.a.e, grn.a.d), new grn.b(grn.a.f, grn.a.e, grn.a.d), new grn.b(grn.a.f, grn.a.b, grn.a.d)),
   d(new grn.b(grn.a.f, grn.a.b, grn.a.a), new grn.b(grn.a.f, grn.a.e, grn.a.a), new grn.b(grn.a.c, grn.a.e, grn.a.a), new grn.b(grn.a.c, grn.a.b, grn.a.a)),
   e(new grn.b(grn.a.f, grn.a.b, grn.a.d), new grn.b(grn.a.f, grn.a.e, grn.a.d), new grn.b(grn.a.f, grn.a.e, grn.a.a), new grn.b(grn.a.f, grn.a.b, grn.a.a)),
   f(new grn.b(grn.a.c, grn.a.b, grn.a.a), new grn.b(grn.a.c, grn.a.e, grn.a.a), new grn.b(grn.a.c, grn.a.e, grn.a.d), new grn.b(grn.a.c, grn.a.b, grn.a.d));

   private static final grn[] g = ag.a(new grn[6], $$0 -> {
      $$0[grn.a.e] = a;
      $$0[grn.a.b] = b;
      $$0[grn.a.d] = c;
      $$0[grn.a.a] = d;
      $$0[grn.a.f] = e;
      $$0[grn.a.c] = f;
   });
   private final grn.b[] h;

   public static grn a(jb $$0) {
      return g[$$0.d()];
   }

   private grn(final grn.b... $$0) {
      this.h = $$0;
   }

   public grn.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = jb.d.d();
      public static final int b = jb.b.d();
      public static final int c = jb.f.d();
      public static final int d = jb.c.d();
      public static final int e = jb.a.d();
      public static final int f = jb.e.d();
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
