public class gsc<S extends gus, M extends fym<S>, A extends fym<S>> extends gsm<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final grx e;

   public gsc(gpv<S, M> $$0, A $$1, A $$2, grx $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public gsc(gpv<S, M> $$0, A $$1, A $$2, A $$3, A $$4, grx $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(cvx $$0, buh $$1) {
      ddh $$2 = $$0.a(kt.D);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(ddh $$0, buh $$1) {
      return $$0.c().isPresent() && $$0.a() == $$1;
   }

   public void a(fdt $$0, ghw $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3, $$3.Q, buh.e, $$2, this.a($$3, buh.e));
      this.a($$0, $$1, $$3, $$3.R, buh.d, $$2, this.a($$3, buh.d));
      this.a($$0, $$1, $$3, $$3.S, buh.c, $$2, this.a($$3, buh.c));
      this.a($$0, $$1, $$3, $$3.ao, buh.f, $$2, this.a($$3, buh.f));
   }

   private void a(fdt $$0, ghw $$1, S $$2, cvx $$3, buh $$4, int $$5, A $$6) {
      ddh $$7 = $$3.a(kt.D);
      if ($$7 != null && a($$7, $$4)) {
         $$6.a($$2);
         this.a($$6, $$4);
         alh $$8 = $$7.c().orElseThrow();
         ddf.d $$9 = this.a($$4) ? ddf.d.b : ddf.d.a;
         this.e.a($$9, $$8, $$6, $$3, gig::a, $$0, $$1, $$5);
      }
   }

   protected void a(A $$0, buh $$1) {
      $$0.c_(false);
      switch ($$1) {
         case f:
            $$0.o.k = true;
            $$0.p.k = true;
            break;
         case e:
            $$0.q.k = true;
            $$0.r.k = true;
            $$0.s.k = true;
            break;
         case d:
            $$0.q.k = true;
            $$0.t.k = true;
            $$0.u.k = true;
            break;
         case c:
            $$0.t.k = true;
            $$0.u.k = true;
      }
   }

   private A a(S $$0, buh $$1) {
      if (this.a($$1)) {
         return $$0.ae ? this.c : this.a;
      } else {
         return $$0.ae ? this.d : this.b;
      }
   }

   private boolean a(buh $$0) {
      return $$0 == buh.d;
   }
}
