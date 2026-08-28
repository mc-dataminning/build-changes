public enum glj {
   a(new glj.b(glj.a.f, glj.a.e, glj.a.a), new glj.b(glj.a.f, glj.a.e, glj.a.d), new glj.b(glj.a.c, glj.a.e, glj.a.d), new glj.b(glj.a.c, glj.a.e, glj.a.a)),
   b(new glj.b(glj.a.f, glj.a.b, glj.a.d), new glj.b(glj.a.f, glj.a.b, glj.a.a), new glj.b(glj.a.c, glj.a.b, glj.a.a), new glj.b(glj.a.c, glj.a.b, glj.a.d)),
   c(new glj.b(glj.a.c, glj.a.b, glj.a.d), new glj.b(glj.a.c, glj.a.e, glj.a.d), new glj.b(glj.a.f, glj.a.e, glj.a.d), new glj.b(glj.a.f, glj.a.b, glj.a.d)),
   d(new glj.b(glj.a.f, glj.a.b, glj.a.a), new glj.b(glj.a.f, glj.a.e, glj.a.a), new glj.b(glj.a.c, glj.a.e, glj.a.a), new glj.b(glj.a.c, glj.a.b, glj.a.a)),
   e(new glj.b(glj.a.f, glj.a.b, glj.a.d), new glj.b(glj.a.f, glj.a.e, glj.a.d), new glj.b(glj.a.f, glj.a.e, glj.a.a), new glj.b(glj.a.f, glj.a.b, glj.a.a)),
   f(new glj.b(glj.a.c, glj.a.b, glj.a.a), new glj.b(glj.a.c, glj.a.e, glj.a.a), new glj.b(glj.a.c, glj.a.e, glj.a.d), new glj.b(glj.a.c, glj.a.b, glj.a.d));

   private static final glj[] g = af.a(new glj[6], $$0 -> {
      $$0[glj.a.e] = a;
      $$0[glj.a.b] = b;
      $$0[glj.a.d] = c;
      $$0[glj.a.a] = d;
      $$0[glj.a.f] = e;
      $$0[glj.a.c] = f;
   });
   private final glj.b[] h;

   public static glj a(jn $$0) {
      return g[$$0.d()];
   }

   private glj(final glj.b... $$0) {
      this.h = $$0;
   }

   public glj.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = jn.d.d();
      public static final int b = jn.b.d();
      public static final int c = jn.f.d();
      public static final int d = jn.c.d();
      public static final int e = jn.a.d();
      public static final int f = jn.e.d();
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
