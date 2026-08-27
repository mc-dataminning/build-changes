public enum gcb {
   a(new gcb.b(gcb.a.f, gcb.a.e, gcb.a.a), new gcb.b(gcb.a.f, gcb.a.e, gcb.a.d), new gcb.b(gcb.a.c, gcb.a.e, gcb.a.d), new gcb.b(gcb.a.c, gcb.a.e, gcb.a.a)),
   b(new gcb.b(gcb.a.f, gcb.a.b, gcb.a.d), new gcb.b(gcb.a.f, gcb.a.b, gcb.a.a), new gcb.b(gcb.a.c, gcb.a.b, gcb.a.a), new gcb.b(gcb.a.c, gcb.a.b, gcb.a.d)),
   c(new gcb.b(gcb.a.c, gcb.a.b, gcb.a.d), new gcb.b(gcb.a.c, gcb.a.e, gcb.a.d), new gcb.b(gcb.a.f, gcb.a.e, gcb.a.d), new gcb.b(gcb.a.f, gcb.a.b, gcb.a.d)),
   d(new gcb.b(gcb.a.f, gcb.a.b, gcb.a.a), new gcb.b(gcb.a.f, gcb.a.e, gcb.a.a), new gcb.b(gcb.a.c, gcb.a.e, gcb.a.a), new gcb.b(gcb.a.c, gcb.a.b, gcb.a.a)),
   e(new gcb.b(gcb.a.f, gcb.a.b, gcb.a.d), new gcb.b(gcb.a.f, gcb.a.e, gcb.a.d), new gcb.b(gcb.a.f, gcb.a.e, gcb.a.a), new gcb.b(gcb.a.f, gcb.a.b, gcb.a.a)),
   f(new gcb.b(gcb.a.c, gcb.a.b, gcb.a.a), new gcb.b(gcb.a.c, gcb.a.e, gcb.a.a), new gcb.b(gcb.a.c, gcb.a.e, gcb.a.d), new gcb.b(gcb.a.c, gcb.a.b, gcb.a.d));

   private static final gcb[] g = ac.a(new gcb[6], $$0 -> {
      $$0[gcb.a.e] = a;
      $$0[gcb.a.b] = b;
      $$0[gcb.a.d] = c;
      $$0[gcb.a.a] = d;
      $$0[gcb.a.f] = e;
      $$0[gcb.a.c] = f;
   });
   private final gcb.b[] h;

   public static gcb a(it $$0) {
      return g[$$0.d()];
   }

   private gcb(gcb.b... $$0) {
      this.h = $$0;
   }

   public gcb.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = it.d.d();
      public static final int b = it.b.d();
      public static final int c = it.f.d();
      public static final int d = it.c.d();
      public static final int e = it.a.d();
      public static final int f = it.e.d();
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
