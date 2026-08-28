public enum glm {
   a(new glm.b(glm.a.f, glm.a.e, glm.a.a), new glm.b(glm.a.f, glm.a.e, glm.a.d), new glm.b(glm.a.c, glm.a.e, glm.a.d), new glm.b(glm.a.c, glm.a.e, glm.a.a)),
   b(new glm.b(glm.a.f, glm.a.b, glm.a.d), new glm.b(glm.a.f, glm.a.b, glm.a.a), new glm.b(glm.a.c, glm.a.b, glm.a.a), new glm.b(glm.a.c, glm.a.b, glm.a.d)),
   c(new glm.b(glm.a.c, glm.a.b, glm.a.d), new glm.b(glm.a.c, glm.a.e, glm.a.d), new glm.b(glm.a.f, glm.a.e, glm.a.d), new glm.b(glm.a.f, glm.a.b, glm.a.d)),
   d(new glm.b(glm.a.f, glm.a.b, glm.a.a), new glm.b(glm.a.f, glm.a.e, glm.a.a), new glm.b(glm.a.c, glm.a.e, glm.a.a), new glm.b(glm.a.c, glm.a.b, glm.a.a)),
   e(new glm.b(glm.a.f, glm.a.b, glm.a.d), new glm.b(glm.a.f, glm.a.e, glm.a.d), new glm.b(glm.a.f, glm.a.e, glm.a.a), new glm.b(glm.a.f, glm.a.b, glm.a.a)),
   f(new glm.b(glm.a.c, glm.a.b, glm.a.a), new glm.b(glm.a.c, glm.a.e, glm.a.a), new glm.b(glm.a.c, glm.a.e, glm.a.d), new glm.b(glm.a.c, glm.a.b, glm.a.d));

   private static final glm[] g = af.a(new glm[6], $$0 -> {
      $$0[glm.a.e] = a;
      $$0[glm.a.b] = b;
      $$0[glm.a.d] = c;
      $$0[glm.a.a] = d;
      $$0[glm.a.f] = e;
      $$0[glm.a.c] = f;
   });
   private final glm.b[] h;

   public static glm a(jn $$0) {
      return g[$$0.d()];
   }

   private glm(final glm.b... $$0) {
      this.h = $$0;
   }

   public glm.b a(int $$0) {
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
