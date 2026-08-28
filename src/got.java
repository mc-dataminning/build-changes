public class got extends gkp<gde, fvv<gde>> {
   public got(gjo.a $$0, boolean $$1) {
      super($$0, new fvv<>($$0.a($$1 ? fxp.aW : fxp.aS), $$1), 0.5F);
      this.a(new gnq<>(this, new fvc($$0.a($$1 ? fxp.aX : fxp.aU)), new fvc($$0.a($$1 ? fxp.aY : fxp.aV)), $$0.g()));
      this.a(new gnz<>(this, $$0.d()));
      this.a(new gmw<>($$0, this));
      this.a(new gng(this));
      this.a(new gna(this));
      this.a(new gnf<>(this, $$0.f(), $$0.d()));
      this.a(new gnj<>(this, $$0.f()));
      this.a(new gnx<>(this, $$0.f()));
      this.a(new goi<>(this, $$0.f()));
      this.a(new gmx<>(this));
   }

   public void a(gde $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ewh a(gde $$0, float $$1) {
      return $$0.cc() ? new ewh(0.0, (double)($$0.ed() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gde $$0) {
      fvv<gde> $$1 = this.a();
      if ($$0.N_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(cmm.g);
         $$1.z.k = $$0.a(cmm.b);
         $$1.x.k = $$0.a(cmm.e);
         $$1.y.k = $$0.a(cmm.f);
         $$1.b.k = $$0.a(cmm.c);
         $$1.w.k = $$0.a(cmm.d);
         $$1.t = $$0.cc();
         fvd.a $$2 = a($$0, bqg.a);
         fvd.a $$3 = a($$0, bqg.b);
         if ($$2.a()) {
            $$3 = $$0.eW().e() ? fvd.a.a : fvd.a.b;
         }

         if ($$0.fs() == bsw.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fvd.a a(gde $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$2.e()) {
         return fvd.a.a;
      } else {
         if ($$0.fu() == $$1 && $$0.fw() > 0) {
            cvy $$3 = $$2.u();
            if ($$3 == cvy.d) {
               return fvd.a.c;
            }

            if ($$3 == cvy.e) {
               return fvd.a.d;
            }

            if ($$3 == cvy.f) {
               return fvd.a.e;
            }

            if ($$3 == cvy.g && $$1 == $$0.fu()) {
               return fvd.a.f;
            }

            if ($$3 == cvy.h) {
               return fvd.a.h;
            }

            if ($$3 == cvy.i) {
               return fvd.a.i;
            }

            if ($$3 == cvy.j) {
               return fvd.a.j;
            }
         } else if (!$$0.aK && $$2.a(cug.vW) && csq.i($$2)) {
            return fvd.a.g;
         }

         return fvd.a.b;
      }
   }

   public akk a(gde $$0) {
      return $$0.b().a();
   }

   protected void a(gde $$0, fao $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gde $$0, wu $$1, fao $$2, gef $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         exl $$7 = $$0.gp();
         exd $$8 = $$7.a(exc.c);
         if ($$8 != null) {
            exh $$9 = $$7.d($$0, $$8);
            wu $$10 = exh.a($$9, $$8.a(yn.b));
            super.a($$0, wu.i().b($$10).b(wt.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(fao $$0, gef $$1, int $$2, gde $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(fao $$0, gef $$1, int $$2, gde $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(fao $$0, gef $$1, int $$2, gde $$3, fxq $$4, fxq $$5) {
      fvv<gde> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      akk $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gen.c($$7)), $$2, gph.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gen.i($$7)), $$2, gph.d);
   }

   protected void a(gde $$0, fao $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.h($$4);
      if ($$0.fC()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fD() + $$4;
         float $$9 = ayg.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fp()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         ewh $$10 = $$0.g($$4);
         ewh $$11 = $$0.F($$4);
         double $$12 = $$11.i();
         double $$13 = $$10.i();
         if ($$12 > 0.0 && $$13 > 0.0) {
            double $$14 = ($$11.c * $$10.c + $$11.e * $$10.e) / Math.sqrt($$12 * $$13);
            double $$15 = $$11.c * $$10.e - $$11.e * $$10.c;
            $$1.a(a.d.rotation((float)(Math.signum($$15) * Math.acos($$14))));
         }
      } else if ($$6 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$16 = $$0.bg() ? -90.0F - $$7 : -90.0F;
         float $$17 = ayg.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.cf()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
