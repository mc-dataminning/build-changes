public class gqv<S extends gtk, M extends fxn<S>, A extends fxn<S>> extends grf<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final gwj e;

   public gqv(goo<S, M> $$0, A $$1, A $$2, gyw $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public gqv(goo<S, M> $$0, A $$1, A $$2, A $$3, A $$4, gyw $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5.a(ghm.g);
   }

   public void a(fcu $$0, ggv $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.Q, btr.e, $$2, this.a($$3, btr.e));
      this.a($$0, $$1, $$3.R, btr.d, $$2, this.a($$3, btr.d));
      this.a($$0, $$1, $$3.S, btr.c, $$2, this.a($$3, btr.c));
      this.a($$0, $$1, $$3.ao, btr.f, $$2, this.a($$3, btr.f));
   }

   private void a(fcu $$0, ggv $$1, cvl $$2, btr $$3, int $$4, A $$5) {
      if ($$2.h() instanceof ctc $$6) {
         if ($$6.m() == $$3) {
            this.d().a($$5);
            this.a($$5, $$3);
            boolean $$8 = this.a($$3);
            ctd $$9 = $$6.h().a();
            int $$10 = $$2.a(axb.bD) ? axn.f(cyd.a($$2, -6265536)) : -1;

            for (ctd.a $$11 : $$9.e()) {
               int $$12 = $$11.a() ? $$10 : -1;
               this.a($$0, $$1, $$4, $$5, $$12, $$11.a($$8));
            }

            cxq $$13 = $$2.a(kr.M);
            if ($$13 != null) {
               this.a($$6.h(), $$0, $$1, $$4, $$13, $$5, $$8);
            }

            if ($$2.z()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, btr $$1) {
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

   private void a(fcu $$0, ggv $$1, int $$2, A $$3, int $$4, alb $$5) {
      fcy $$6 = $$1.getBuffer(ghe.a($$5));
      $$3.a($$0, $$6, $$2, gwb.d, $$4);
   }

   private void a(jn<ctd> $$0, fcu $$1, ggv $$2, int $$3, cxq $$4, A $$5, boolean $$6) {
      gwk $$7 = this.e.a($$6 ? $$4.a($$0) : $$4.b($$0));
      fcy $$8 = $$7.a($$2.getBuffer(ghm.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gwb.d);
   }

   private void a(fcu $$0, ggv $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(ghe.j()), $$2, gwb.d);
   }

   private A a(S $$0, btr $$1) {
      if (this.a($$1)) {
         return $$0.ae ? this.c : this.a;
      } else {
         return $$0.ae ? this.d : this.b;
      }
   }

   private boolean a(btr $$0) {
      return $$0 == btr.d;
   }
}
