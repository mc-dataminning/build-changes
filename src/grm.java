public class grm<S extends gub, M extends fxx<S>, A extends fxx<S>> extends grw<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final gxa e;

   public grm(gpf<S, M> $$0, A $$1, A $$2, gzn $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public grm(gpf<S, M> $$0, A $$1, A $$2, A $$3, A $$4, gzn $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5.a(gib.g);
   }

   public void a(fde $$0, ghg $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.Q, btw.e, $$2, this.a($$3, btw.e));
      this.a($$0, $$1, $$3.R, btw.d, $$2, this.a($$3, btw.d));
      this.a($$0, $$1, $$3.S, btw.c, $$2, this.a($$3, btw.c));
      this.a($$0, $$1, $$3.ao, btw.f, $$2, this.a($$3, btw.f));
   }

   private void a(fde $$0, ghg $$1, cvp $$2, btw $$3, int $$4, A $$5) {
      if ($$2.h() instanceof cti $$6) {
         if ($$6.l() == $$3) {
            this.d().a($$5);
            this.a($$5, $$3);
            boolean $$8 = this.a($$3);
            ctj $$9 = $$6.g().a();
            int $$10 = $$2.a(axc.bD) ? axo.f(cyh.a($$2, -6265536)) : -1;

            for (ctj.a $$11 : $$9.d()) {
               int $$12 = $$11.a() ? $$10 : -1;
               this.a($$0, $$1, $$4, $$5, $$12, $$11.a($$8));
            }

            cxr $$13 = $$2.a(kr.P);
            if ($$13 != null) {
               this.a($$6.g(), $$0, $$1, $$4, $$13, $$5, $$8);
            }

            if ($$2.z()) {
               this.a($$0, $$1, $$4, $$5);
            }
         }
      }
   }

   protected void a(A $$0, btw $$1) {
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

   private void a(fde $$0, ghg $$1, int $$2, A $$3, int $$4, alc $$5) {
      fdi $$6 = $$1.getBuffer(ghq.a($$5));
      $$3.a($$0, $$6, $$2, gws.d, $$4);
   }

   private void a(jn<ctj> $$0, fde $$1, ghg $$2, int $$3, cxr $$4, A $$5, boolean $$6) {
      gxb $$7 = this.e.a($$6 ? $$4.a($$0) : $$4.b($$0));
      fdi $$8 = $$7.a($$2.getBuffer(gib.a($$4.a().a().d())));
      $$5.a($$1, $$8, $$3, gws.d);
   }

   private void a(fde $$0, ghg $$1, int $$2, A $$3) {
      $$3.a($$0, $$1.getBuffer(ghq.j()), $$2, gws.d);
   }

   private A a(S $$0, btw $$1) {
      if (this.a($$1)) {
         return $$0.ae ? this.c : this.a;
      } else {
         return $$0.ae ? this.d : this.b;
      }
   }

   private boolean a(btw $$0) {
      return $$0 == btw.d;
   }
}
