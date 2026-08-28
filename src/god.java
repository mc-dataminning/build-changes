public class god extends gjz<gco, fvg<gco>> {
   public god(giy.a $$0, boolean $$1) {
      super($$0, new fvg<>($$0.a($$1 ? fxa.aW : fxa.aS), $$1), 0.5F);
      this.a(new gna<>(this, new fun($$0.a($$1 ? fxa.aX : fxa.aU)), new fun($$0.a($$1 ? fxa.aY : fxa.aV)), $$0.g()));
      this.a(new gnj<>(this, $$0.d()));
      this.a(new gmg<>($$0, this));
      this.a(new gmq(this));
      this.a(new gmk(this));
      this.a(new gmp<>(this, $$0.f(), $$0.d()));
      this.a(new gmt<>(this, $$0.f()));
      this.a(new gnh<>(this, $$0.f()));
      this.a(new gns<>(this, $$0.f()));
      this.a(new gmh<>(this));
   }

   public void a(gco $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evs a(gco $$0, float $$1) {
      return $$0.ca() ? new evs(0.0, (double)($$0.ee() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gco $$0) {
      fvg<gco> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cmz.g);
         $$1.z.k = $$0.a(cmz.b);
         $$1.x.k = $$0.a(cmz.e);
         $$1.y.k = $$0.a(cmz.f);
         $$1.b.k = $$0.a(cmz.c);
         $$1.w.k = $$0.a(cmz.d);
         $$1.t = $$0.ca();
         fuo.a $$2 = a($$0, bqu.a);
         fuo.a $$3 = a($$0, bqu.b);
         if ($$2.a()) {
            $$3 = $$0.eY().e() ? fuo.a.a : fuo.a.b;
         }

         if ($$0.fu() == btk.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fuo.a a(gco $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.e()) {
         return fuo.a.a;
      } else {
         if ($$0.fw() == $$1 && $$0.fy() > 0) {
            cwl $$3 = $$2.v();
            if ($$3 == cwl.d) {
               return fuo.a.c;
            }

            if ($$3 == cwl.e) {
               return fuo.a.d;
            }

            if ($$3 == cwl.f) {
               return fuo.a.e;
            }

            if ($$3 == cwl.g && $$1 == $$0.fw()) {
               return fuo.a.f;
            }

            if ($$3 == cwl.h) {
               return fuo.a.h;
            }

            if ($$3 == cwl.i) {
               return fuo.a.i;
            }

            if ($$3 == cwl.j) {
               return fuo.a.j;
            }
         } else if (!$$0.aJ && $$2.a(cut.vT) && ctd.j($$2)) {
            return fuo.a.g;
         }

         return fuo.a.b;
      }
   }

   public alf a(gco $$0) {
      return $$0.b().a();
   }

   protected void a(gco $$0, ezz $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gco $$0, xp $$1, ezz $$2, gdp $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         eww $$7 = $$0.gr();
         ewo $$8 = $$7.a(ewn.c);
         if ($$8 != null) {
            ews $$9 = $$7.d($$0, $$8);
            xp $$10 = ews.a($$9, $$8.a(zi.b));
            super.a($$0, xp.i().b($$10).b(xo.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(ezz $$0, gdp $$1, int $$2, gco $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(ezz $$0, gdp $$1, int $$2, gco $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(ezz $$0, gdp $$1, int $$2, gco $$3, fxb $$4, fxb $$5) {
      fvg<gco> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      alf $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gdx.c($$7)), $$2, gor.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gdx.i($$7)), $$2, gor.d);
   }

   protected void a(gco $$0, ezz $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fE()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fF() + $$4;
         float $$9 = ayz.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fr()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         evs $$10 = $$0.f($$4);
         evs $$11 = $$0.E($$4);
         double $$12 = $$11.i();
         double $$13 = $$10.i();
         if ($$12 > 0.0 && $$13 > 0.0) {
            double $$14 = ($$11.c * $$10.c + $$11.e * $$10.e) / Math.sqrt($$12 * $$13);
            double $$15 = $$11.c * $$10.e - $$11.e * $$10.c;
            $$1.a(a.d.rotation((float)(Math.signum($$15) * Math.acos($$14))));
         }
      } else if ($$6 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$16 = $$0.be() ? -90.0F - $$7 : -90.0F;
         float $$17 = ayz.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.cd()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
