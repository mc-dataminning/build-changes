public class gic extends gdz<fwp, fpi<fwp>> {
   public gic(gcy.a $$0, boolean $$1) {
      super($$0, new fpi<>($$0.a($$1 ? frc.aS : frc.aO), $$1), 0.5F);
      this.a(new ggz<>(this, new foo($$0.a($$1 ? frc.aT : frc.aQ)), new foo($$0.a($$1 ? frc.aU : frc.aR)), $$0.g()));
      this.a(new ghi<>(this, $$0.d()));
      this.a(new ggf<>($$0, this));
      this.a(new ggp(this));
      this.a(new ggj(this));
      this.a(new ggo<>(this, $$0.f(), $$0.d()));
      this.a(new ggs<>(this, $$0.f()));
      this.a(new ghg<>(this, $$0.f()));
      this.a(new ghq<>(this, $$0.f()));
      this.a(new ggg<>(this));
   }

   public void a(fwp $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public epr a(fwp $$0, float $$1) {
      return $$0.bX() ? new epr(0.0, (double)($$0.eb() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(fwp $$0) {
      fpi<fwp> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cit.g);
         $$1.z.k = $$0.a(cit.b);
         $$1.x.k = $$0.a(cit.e);
         $$1.y.k = $$0.a(cit.f);
         $$1.b.k = $$0.a(cit.c);
         $$1.w.k = $$0.a(cit.d);
         $$1.t = $$0.bX();
         fop.a $$2 = a($$0, bnb.a);
         fop.a $$3 = a($$0, bnb.b);
         if ($$2.a()) {
            $$3 = $$0.eV().b() ? fop.a.a : fop.a.b;
         }

         if ($$0.fr() == bpi.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fop.a a(fwp $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fop.a.a;
      } else {
         if ($$0.ft() == $$1 && $$0.fv() > 0) {
            csd $$3 = $$2.t();
            if ($$3 == csd.d) {
               return fop.a.c;
            }

            if ($$3 == csd.e) {
               return fop.a.d;
            }

            if ($$3 == csd.f) {
               return fop.a.e;
            }

            if ($$3 == csd.g && $$1 == $$0.ft()) {
               return fop.a.f;
            }

            if ($$3 == csd.h) {
               return fop.a.h;
            }

            if ($$3 == csd.i) {
               return fop.a.i;
            }

            if ($$3 == csd.j) {
               return fop.a.j;
            }
         } else if (!$$0.aI && $$2.a(cqn.vQ) && cov.d($$2)) {
            return fop.a.g;
         }

         return fop.a.b;
      }
   }

   public ajh a(fwp $$0) {
      return $$0.b().a();
   }

   protected void a(fwp $$0, etz $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fwp $$0, vu $$1, etz $$2, fxq $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         eqv $$7 = $$0.go();
         eqn $$8 = $$7.a(eqm.c);
         if ($$8 != null) {
            eqr $$9 = $$7.d($$0, $$8);
            vu $$10 = eqr.a($$9, $$8.a(xn.b));
            super.a($$0, vu.i().b($$10).b(vt.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(etz $$0, fxq $$1, int $$2, fwp $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(etz $$0, fxq $$1, int $$2, fwp $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(etz $$0, fxq $$1, int $$2, fwp $$3, frd $$4, frd $$5) {
      fpi<fwp> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      ajh $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fxy.c($$7)), $$2, giq.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fxy.i($$7)), $$2, giq.d);
   }

   protected void a(fwp $$0, etz $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fB()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fC() + $$4;
         float $$9 = aww.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fo()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         epr $$10 = $$0.f($$4);
         epr $$11 = $$0.E($$4);
         double $$12 = $$11.i();
         double $$13 = $$10.i();
         if ($$12 > 0.0 && $$13 > 0.0) {
            double $$14 = ($$11.c * $$10.c + $$11.e * $$10.e) / Math.sqrt($$12 * $$13);
            double $$15 = $$11.c * $$10.e - $$11.e * $$10.c;
            $$1.a(a.d.rotation((float)(Math.signum($$15) * Math.acos($$14))));
         }
      } else if ($$6 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$16 = $$0.bc() ? -90.0F - $$7 : -90.0F;
         float $$17 = aww.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
