public class gor extends gkn<gdc, fvt<gdc>> {
   public gor(gjm.a $$0, boolean $$1) {
      super($$0, new fvt<>($$0.a($$1 ? fxn.aW : fxn.aS), $$1), 0.5F);
      this.a(new gno<>(this, new fva($$0.a($$1 ? fxn.aX : fxn.aU)), new fva($$0.a($$1 ? fxn.aY : fxn.aV)), $$0.g()));
      this.a(new gnx<>(this, $$0.d()));
      this.a(new gmu<>($$0, this));
      this.a(new gne(this));
      this.a(new gmy(this));
      this.a(new gnd<>(this, $$0.f(), $$0.d()));
      this.a(new gnh<>(this, $$0.f()));
      this.a(new gnv<>(this, $$0.f()));
      this.a(new gog<>(this, $$0.f()));
      this.a(new gmv<>(this));
   }

   public void a(gdc $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ewf a(gdc $$0, float $$1) {
      return $$0.cb() ? new ewf(0.0, (double)($$0.ec() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gdc $$0) {
      fvt<gdc> $$1 = this.a();
      if ($$0.N_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(cml.g);
         $$1.z.k = $$0.a(cml.b);
         $$1.x.k = $$0.a(cml.e);
         $$1.y.k = $$0.a(cml.f);
         $$1.b.k = $$0.a(cml.c);
         $$1.w.k = $$0.a(cml.d);
         $$1.t = $$0.cb();
         fvb.a $$2 = a($$0, bqf.a);
         fvb.a $$3 = a($$0, bqf.b);
         if ($$2.a()) {
            $$3 = $$0.eV().e() ? fvb.a.a : fvb.a.b;
         }

         if ($$0.fr() == bsv.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fvb.a a(gdc $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$2.e()) {
         return fvb.a.a;
      } else {
         if ($$0.ft() == $$1 && $$0.fv() > 0) {
            cvx $$3 = $$2.u();
            if ($$3 == cvx.d) {
               return fvb.a.c;
            }

            if ($$3 == cvx.e) {
               return fvb.a.d;
            }

            if ($$3 == cvx.f) {
               return fvb.a.e;
            }

            if ($$3 == cvx.g && $$1 == $$0.ft()) {
               return fvb.a.f;
            }

            if ($$3 == cvx.h) {
               return fvb.a.h;
            }

            if ($$3 == cvx.i) {
               return fvb.a.i;
            }

            if ($$3 == cvx.j) {
               return fvb.a.j;
            }
         } else if (!$$0.aJ && $$2.a(cuf.vW) && csp.i($$2)) {
            return fvb.a.g;
         }

         return fvb.a.b;
      }
   }

   public akk a(gdc $$0) {
      return $$0.b().a();
   }

   protected void a(gdc $$0, fam $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gdc $$0, wu $$1, fam $$2, ged $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         exj $$7 = $$0.go();
         exb $$8 = $$7.a(exa.c);
         if ($$8 != null) {
            exf $$9 = $$7.d($$0, $$8);
            wu $$10 = exf.a($$9, $$8.a(yn.b));
            super.a($$0, wu.i().b($$10).b(wt.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(fam $$0, ged $$1, int $$2, gdc $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(fam $$0, ged $$1, int $$2, gdc $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(fam $$0, ged $$1, int $$2, gdc $$3, fxo $$4, fxo $$5) {
      fvt<gdc> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      akk $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gel.c($$7)), $$2, gpf.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gel.i($$7)), $$2, gpf.d);
   }

   protected void a(gdc $$0, fam $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.h($$4);
      if ($$0.fB()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fC() + $$4;
         float $$9 = ayg.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fo()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         ewf $$10 = $$0.g($$4);
         ewf $$11 = $$0.F($$4);
         double $$12 = $$11.i();
         double $$13 = $$10.i();
         if ($$12 > 0.0 && $$13 > 0.0) {
            double $$14 = ($$11.c * $$10.c + $$11.e * $$10.e) / Math.sqrt($$12 * $$13);
            double $$15 = $$11.c * $$10.e - $$11.e * $$10.c;
            $$1.a(a.d.rotation((float)(Math.signum($$15) * Math.acos($$14))));
         }
      } else if ($$6 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$16 = $$0.bf() ? -90.0F - $$7 : -90.0F;
         float $$17 = ayg.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.ce()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
