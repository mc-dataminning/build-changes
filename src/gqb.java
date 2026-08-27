public class gqb extends glt<gef, fww<gef>> {
   public gqb(gkq.a $$0, boolean $$1) {
      super($$0, new fww<>($$0.a($$1 ? fyr.ba : fyr.aW), $$1), 0.5F);
      this.a(new gov<>(this, new fwc($$0.a($$1 ? fyr.bb : fyr.aY)), new fwc($$0.a($$1 ? fyr.bc : fyr.aZ)), $$0.g()));
      this.a(new gpg<>(this, $$0.d()));
      this.a(new gob<>($$0, this));
      this.a(new gol(this));
      this.a(new gof(this));
      this.a(new gok<>(this, $$0.f(), $$0.d()));
      this.a(new goo<>(this, $$0.f()));
      this.a(new gph<>(this, $$0.f()));
      this.a(new gpe<>(this, $$0.f()));
      this.a(new gpq<>(this, $$0.f()));
      this.a(new goc<>(this));
   }

   public void a(gef $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ewu a(gef $$0, float $$1) {
      return $$0.cf() ? new ewu(0.0, (double)($$0.em() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gef $$0) {
      fww<gef> $$1 = this.a();
      if ($$0.O_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(clz.g);
         $$1.z.k = $$0.a(clz.b);
         $$1.x.k = $$0.a(clz.e);
         $$1.y.k = $$0.a(clz.f);
         $$1.b.k = $$0.a(clz.c);
         $$1.w.k = $$0.a(clz.d);
         $$1.t = $$0.cf();
         fwd.a $$2 = a($$0, bpz.a);
         fwd.a $$3 = a($$0, bpz.b);
         if ($$2.a()) {
            $$3 = $$0.fh().d() ? fwd.a.a : fwd.a.b;
         }

         if ($$0.fD() == bsi.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fwd.a a(gef $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ($$2.d()) {
         return fwd.a.a;
      } else {
         if ($$0.fF() == $$1 && $$0.fH() > 0) {
            cwk $$3 = $$2.u();
            if ($$3 == cwk.d) {
               return fwd.a.c;
            }

            if ($$3 == cwk.e) {
               return fwd.a.d;
            }

            if ($$3 == cwk.f) {
               return fwd.a.e;
            }

            if ($$3 == cwk.g && $$1 == $$0.fF()) {
               return fwd.a.f;
            }

            if ($$3 == cwk.h) {
               return fwd.a.h;
            }

            if ($$3 == cwk.i) {
               return fwd.a.i;
            }

            if ($$3 == cwk.j) {
               return fwd.a.j;
            }
         } else if (!$$0.aT && $$2.a(cuk.xE) && css.j($$2)) {
            return fwd.a.g;
         }

         return fwd.a.b;
      }
   }

   public akt a(gef $$0) {
      return $$0.b().a();
   }

   protected void a(gef $$0, fbc $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gef $$0, xe $$1, fbc $$2, gfg $$3, int $$4, float $$5) {
      double $$6 = this.d.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         exy $$7 = $$0.gC();
         exq $$8 = $$7.a(exp.c);
         if ($$8 != null) {
            exu $$9 = $$7.d($$0, $$8);
            xe $$10 = exu.a($$9, $$8.a(yx.b));
            super.a($$0, xe.i().a($$10).a(xd.v).a($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(fbc $$0, gfg $$1, int $$2, gef $$3) {
      this.a($$0, $$1, $$2, $$3, this.h.n, this.h.w);
   }

   public void b(fbc $$0, gfg $$1, int $$2, gef $$3) {
      this.a($$0, $$1, $$2, $$3, this.h.o, this.h.b);
   }

   private void a(fbc $$0, gfg $$1, int $$2, gef $$3, fys $$4, fys $$5) {
      fww<gef> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      akt $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gfo.c($$7)), $$2, gqp.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gfo.i($$7)), $$2, gqp.d);
   }

   protected void a(gef $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fN()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fO() + $$4;
         float $$9 = aym.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fA()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         ewu $$10 = $$0.f($$4);
         ewu $$11 = $$0.E($$4);
         double $$12 = $$11.i();
         double $$13 = $$10.i();
         if ($$12 > 0.0 && $$13 > 0.0) {
            double $$14 = ($$11.c * $$10.c + $$11.e * $$10.e) / Math.sqrt($$12 * $$13);
            double $$15 = $$11.c * $$10.e - $$11.e * $$10.c;
            $$1.a(a.d.rotation((float)(Math.signum($$15) * Math.acos($$14))));
         }
      } else if ($$6 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$16 = $$0.bi() ? -90.0F - $$7 : -90.0F;
         float $$17 = aym.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.ci()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
