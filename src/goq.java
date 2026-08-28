public enum goq {
   a(new goq.b(goq.a.f, goq.a.e, goq.a.a), new goq.b(goq.a.f, goq.a.e, goq.a.d), new goq.b(goq.a.c, goq.a.e, goq.a.d), new goq.b(goq.a.c, goq.a.e, goq.a.a)),
   b(new goq.b(goq.a.f, goq.a.b, goq.a.d), new goq.b(goq.a.f, goq.a.b, goq.a.a), new goq.b(goq.a.c, goq.a.b, goq.a.a), new goq.b(goq.a.c, goq.a.b, goq.a.d)),
   c(new goq.b(goq.a.c, goq.a.b, goq.a.d), new goq.b(goq.a.c, goq.a.e, goq.a.d), new goq.b(goq.a.f, goq.a.e, goq.a.d), new goq.b(goq.a.f, goq.a.b, goq.a.d)),
   d(new goq.b(goq.a.f, goq.a.b, goq.a.a), new goq.b(goq.a.f, goq.a.e, goq.a.a), new goq.b(goq.a.c, goq.a.e, goq.a.a), new goq.b(goq.a.c, goq.a.b, goq.a.a)),
   e(new goq.b(goq.a.f, goq.a.b, goq.a.d), new goq.b(goq.a.f, goq.a.e, goq.a.d), new goq.b(goq.a.f, goq.a.e, goq.a.a), new goq.b(goq.a.f, goq.a.b, goq.a.a)),
   f(new goq.b(goq.a.c, goq.a.b, goq.a.a), new goq.b(goq.a.c, goq.a.e, goq.a.a), new goq.b(goq.a.c, goq.a.e, goq.a.d), new goq.b(goq.a.c, goq.a.b, goq.a.d));

   private static final goq[] g = af.a(new goq[6], $$0 -> {
      $$0[goq.a.e] = a;
      $$0[goq.a.b] = b;
      $$0[goq.a.d] = c;
      $$0[goq.a.a] = d;
      $$0[goq.a.f] = e;
      $$0[goq.a.c] = f;
   });
   private final goq.b[] h;

   public static goq a(ja $$0) {
      return g[$$0.d()];
   }

   private goq(final goq.b... $$0) {
      this.h = $$0;
   }

   public goq.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = ja.d.d();
      public static final int b = ja.b.d();
      public static final int c = ja.f.d();
      public static final int d = ja.c.d();
      public static final int e = ja.a.d();
      public static final int f = ja.e.d();
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
