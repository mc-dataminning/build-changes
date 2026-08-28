public enum gqe {
   a(new gqe.b(gqe.a.f, gqe.a.e, gqe.a.a), new gqe.b(gqe.a.f, gqe.a.e, gqe.a.d), new gqe.b(gqe.a.c, gqe.a.e, gqe.a.d), new gqe.b(gqe.a.c, gqe.a.e, gqe.a.a)),
   b(new gqe.b(gqe.a.f, gqe.a.b, gqe.a.d), new gqe.b(gqe.a.f, gqe.a.b, gqe.a.a), new gqe.b(gqe.a.c, gqe.a.b, gqe.a.a), new gqe.b(gqe.a.c, gqe.a.b, gqe.a.d)),
   c(new gqe.b(gqe.a.c, gqe.a.b, gqe.a.d), new gqe.b(gqe.a.c, gqe.a.e, gqe.a.d), new gqe.b(gqe.a.f, gqe.a.e, gqe.a.d), new gqe.b(gqe.a.f, gqe.a.b, gqe.a.d)),
   d(new gqe.b(gqe.a.f, gqe.a.b, gqe.a.a), new gqe.b(gqe.a.f, gqe.a.e, gqe.a.a), new gqe.b(gqe.a.c, gqe.a.e, gqe.a.a), new gqe.b(gqe.a.c, gqe.a.b, gqe.a.a)),
   e(new gqe.b(gqe.a.f, gqe.a.b, gqe.a.d), new gqe.b(gqe.a.f, gqe.a.e, gqe.a.d), new gqe.b(gqe.a.f, gqe.a.e, gqe.a.a), new gqe.b(gqe.a.f, gqe.a.b, gqe.a.a)),
   f(new gqe.b(gqe.a.c, gqe.a.b, gqe.a.a), new gqe.b(gqe.a.c, gqe.a.e, gqe.a.a), new gqe.b(gqe.a.c, gqe.a.e, gqe.a.d), new gqe.b(gqe.a.c, gqe.a.b, gqe.a.d));

   private static final gqe[] g = ag.a(new gqe[6], $$0 -> {
      $$0[gqe.a.e] = a;
      $$0[gqe.a.b] = b;
      $$0[gqe.a.d] = c;
      $$0[gqe.a.a] = d;
      $$0[gqe.a.f] = e;
      $$0[gqe.a.c] = f;
   });
   private final gqe.b[] h;

   public static gqe a(jb $$0) {
      return g[$$0.d()];
   }

   private gqe(final gqe.b... $$0) {
      this.h = $$0;
   }

   public gqe.b a(int $$0) {
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
