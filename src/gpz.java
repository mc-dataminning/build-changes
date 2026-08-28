public enum gpz {
   a(new gpz.b(gpz.a.f, gpz.a.e, gpz.a.a), new gpz.b(gpz.a.f, gpz.a.e, gpz.a.d), new gpz.b(gpz.a.c, gpz.a.e, gpz.a.d), new gpz.b(gpz.a.c, gpz.a.e, gpz.a.a)),
   b(new gpz.b(gpz.a.f, gpz.a.b, gpz.a.d), new gpz.b(gpz.a.f, gpz.a.b, gpz.a.a), new gpz.b(gpz.a.c, gpz.a.b, gpz.a.a), new gpz.b(gpz.a.c, gpz.a.b, gpz.a.d)),
   c(new gpz.b(gpz.a.c, gpz.a.b, gpz.a.d), new gpz.b(gpz.a.c, gpz.a.e, gpz.a.d), new gpz.b(gpz.a.f, gpz.a.e, gpz.a.d), new gpz.b(gpz.a.f, gpz.a.b, gpz.a.d)),
   d(new gpz.b(gpz.a.f, gpz.a.b, gpz.a.a), new gpz.b(gpz.a.f, gpz.a.e, gpz.a.a), new gpz.b(gpz.a.c, gpz.a.e, gpz.a.a), new gpz.b(gpz.a.c, gpz.a.b, gpz.a.a)),
   e(new gpz.b(gpz.a.f, gpz.a.b, gpz.a.d), new gpz.b(gpz.a.f, gpz.a.e, gpz.a.d), new gpz.b(gpz.a.f, gpz.a.e, gpz.a.a), new gpz.b(gpz.a.f, gpz.a.b, gpz.a.a)),
   f(new gpz.b(gpz.a.c, gpz.a.b, gpz.a.a), new gpz.b(gpz.a.c, gpz.a.e, gpz.a.a), new gpz.b(gpz.a.c, gpz.a.e, gpz.a.d), new gpz.b(gpz.a.c, gpz.a.b, gpz.a.d));

   private static final gpz[] g = ag.a(new gpz[6], $$0 -> {
      $$0[gpz.a.e] = a;
      $$0[gpz.a.b] = b;
      $$0[gpz.a.d] = c;
      $$0[gpz.a.a] = d;
      $$0[gpz.a.f] = e;
      $$0[gpz.a.c] = f;
   });
   private final gpz.b[] h;

   public static gpz a(jb $$0) {
      return g[$$0.d()];
   }

   private gpz(final gpz.b... $$0) {
      this.h = $$0;
   }

   public gpz.b a(int $$0) {
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
