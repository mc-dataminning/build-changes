public class grr<S extends gug, M extends fyb<S>, A extends fyb<S>> extends gsb<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final gxf e;

   public grr(gpk<S, M> $$0, A $$1, A $$2, gzs $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public grr(gpk<S, M> $$0, A $$1, A $$2, A $$3, A $$4, gzs $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5.a(gig.g);
   }

   public void a(fdi $$0, ghl $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3, $$3.Q, btz.e, $$2, this.a($$3, btz.e));
      this.a($$0, $$1, $$3, $$3.R, btz.d, $$2, this.a($$3, btz.d));
      this.a($$0, $$1, $$3, $$3.S, btz.c, $$2, this.a($$3, btz.c));
      this.a($$0, $$1, $$3, $$3.ao, btz.f, $$2, this.a($$3, btz.f));
   }

   private void a(fdi $$0, ghl $$1, S $$2, cvs $$3, btz $$4, int $$5, A $$6) {
      if ($$3.h() instanceof ctl $$7) {
         if ($$7.l() == $$4) {
            $$6.a($$2);
            this.a($$6, $$4);
            boolean $$9 = this.a($$4);
            ctm $$10 = $$7.g().a();
            int $$11 = $$3.a(axe.bD) ? axq.f(cyk.a($$3, -6265536)) : -1;

            for (ctm.a $$12 : $$10.d()) {
               int $$13 = $$12.a() ? $$11 : -1;
               this.a($$0, $$1, $$5, $$6, $$13, $$12.a($$9));
            }

            cxu $$14 = $$3.a(ks.P);
            if ($$14 != null) {
               this.a($$7.g(), $$0, $$1, $$5, $$14, $$6, $$9);
            }

            if ($$3.A()) {
               this.a($$0, $$1, $$5, $$6);
            }
         }
      }
   }

   protected void a(A $$0, btz $$1) {
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

   private void a(fdi $$0, ghl $$1, int $$2, A $$3, int $$4, ale $$5) {
      fdm $$6 = $$1.getBuffer(ghv.a($$5));
      $$3.a($$0, $$6, $$2, gwx.d, $$4);
   }

   private void a(jo<ctm> $$0, fdi $$1, ghl $$2, int $$3, cxu $$4, A $$5, boolean $$6) {
      gxg $$7 = this.e.a($$6 ? $$4.a($$0) : $$4.b($$0));
      fdm $$8 = $$7.a($$2.getBuffer(gig.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gwx.d);
   }

   private void a(fdi $$0, ghl $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(ghv.j()), $$2, gwx.d);
   }

   private A a(S $$0, btz $$1) {
      if (this.a($$1)) {
         return $$0.ae ? this.c : this.a;
      } else {
         return $$0.ae ? this.d : this.b;
      }
   }

   private boolean a(btz $$0) {
      return $$0 == btz.d;
   }
}
