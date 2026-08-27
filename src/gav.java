public enum gav {
   a(new gav.b(gav.a.f, gav.a.e, gav.a.a), new gav.b(gav.a.f, gav.a.e, gav.a.d), new gav.b(gav.a.c, gav.a.e, gav.a.d), new gav.b(gav.a.c, gav.a.e, gav.a.a)),
   b(new gav.b(gav.a.f, gav.a.b, gav.a.d), new gav.b(gav.a.f, gav.a.b, gav.a.a), new gav.b(gav.a.c, gav.a.b, gav.a.a), new gav.b(gav.a.c, gav.a.b, gav.a.d)),
   c(new gav.b(gav.a.c, gav.a.b, gav.a.d), new gav.b(gav.a.c, gav.a.e, gav.a.d), new gav.b(gav.a.f, gav.a.e, gav.a.d), new gav.b(gav.a.f, gav.a.b, gav.a.d)),
   d(new gav.b(gav.a.f, gav.a.b, gav.a.a), new gav.b(gav.a.f, gav.a.e, gav.a.a), new gav.b(gav.a.c, gav.a.e, gav.a.a), new gav.b(gav.a.c, gav.a.b, gav.a.a)),
   e(new gav.b(gav.a.f, gav.a.b, gav.a.d), new gav.b(gav.a.f, gav.a.e, gav.a.d), new gav.b(gav.a.f, gav.a.e, gav.a.a), new gav.b(gav.a.f, gav.a.b, gav.a.a)),
   f(new gav.b(gav.a.c, gav.a.b, gav.a.a), new gav.b(gav.a.c, gav.a.e, gav.a.a), new gav.b(gav.a.c, gav.a.e, gav.a.d), new gav.b(gav.a.c, gav.a.b, gav.a.d));

   private static final gav[] g = ac.a(new gav[6], $$0 -> {
      $$0[gav.a.e] = a;
      $$0[gav.a.b] = b;
      $$0[gav.a.d] = c;
      $$0[gav.a.a] = d;
      $$0[gav.a.f] = e;
      $$0[gav.a.c] = f;
   });
   private final gav.b[] h;

   public static gav a(ir $$0) {
      return g[$$0.d()];
   }

   private gav(gav.b... $$0) {
      this.h = $$0;
   }

   public gav.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ir.d.d();
      public static final int b = ir.b.d();
      public static final int c = ir.f.d();
      public static final int d = ir.c.d();
      public static final int e = ir.a.d();
      public static final int f = ir.e.d();
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
