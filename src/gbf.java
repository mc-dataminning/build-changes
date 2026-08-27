public enum gbf {
   a(new gbf.b(gbf.a.f, gbf.a.e, gbf.a.a), new gbf.b(gbf.a.f, gbf.a.e, gbf.a.d), new gbf.b(gbf.a.c, gbf.a.e, gbf.a.d), new gbf.b(gbf.a.c, gbf.a.e, gbf.a.a)),
   b(new gbf.b(gbf.a.f, gbf.a.b, gbf.a.d), new gbf.b(gbf.a.f, gbf.a.b, gbf.a.a), new gbf.b(gbf.a.c, gbf.a.b, gbf.a.a), new gbf.b(gbf.a.c, gbf.a.b, gbf.a.d)),
   c(new gbf.b(gbf.a.c, gbf.a.b, gbf.a.d), new gbf.b(gbf.a.c, gbf.a.e, gbf.a.d), new gbf.b(gbf.a.f, gbf.a.e, gbf.a.d), new gbf.b(gbf.a.f, gbf.a.b, gbf.a.d)),
   d(new gbf.b(gbf.a.f, gbf.a.b, gbf.a.a), new gbf.b(gbf.a.f, gbf.a.e, gbf.a.a), new gbf.b(gbf.a.c, gbf.a.e, gbf.a.a), new gbf.b(gbf.a.c, gbf.a.b, gbf.a.a)),
   e(new gbf.b(gbf.a.f, gbf.a.b, gbf.a.d), new gbf.b(gbf.a.f, gbf.a.e, gbf.a.d), new gbf.b(gbf.a.f, gbf.a.e, gbf.a.a), new gbf.b(gbf.a.f, gbf.a.b, gbf.a.a)),
   f(new gbf.b(gbf.a.c, gbf.a.b, gbf.a.a), new gbf.b(gbf.a.c, gbf.a.e, gbf.a.a), new gbf.b(gbf.a.c, gbf.a.e, gbf.a.d), new gbf.b(gbf.a.c, gbf.a.b, gbf.a.d));

   private static final gbf[] g = ac.a(new gbf[6], $$0 -> {
      $$0[gbf.a.e] = a;
      $$0[gbf.a.b] = b;
      $$0[gbf.a.d] = c;
      $$0[gbf.a.a] = d;
      $$0[gbf.a.f] = e;
      $$0[gbf.a.c] = f;
   });
   private final gbf.b[] h;

   public static gbf a(is $$0) {
      return g[$$0.d()];
   }

   private gbf(gbf.b... $$0) {
      this.h = $$0;
   }

   public gbf.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = is.d.d();
      public static final int b = is.b.d();
      public static final int c = is.f.d();
      public static final int d = is.c.d();
      public static final int e = is.a.d();
      public static final int f = is.e.d();
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
