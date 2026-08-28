public class goc extends gjy<gcn, fvf<gcn>> {
   public goc(gix.a $$0, boolean $$1) {
      super($$0, new fvf<>($$0.a($$1 ? fwz.aW : fwz.aS), $$1), 0.5F);
      this.a(new gmz<>(this, new fum($$0.a($$1 ? fwz.aX : fwz.aU)), new fum($$0.a($$1 ? fwz.aY : fwz.aV)), $$0.g()));
      this.a(new gni<>(this, $$0.d()));
      this.a(new gmf<>($$0, this));
      this.a(new gmp(this));
      this.a(new gmj(this));
      this.a(new gmo<>(this, $$0.f(), $$0.d()));
      this.a(new gms<>(this, $$0.f()));
      this.a(new gng<>(this, $$0.f()));
      this.a(new gnr<>(this, $$0.f()));
      this.a(new gmg<>(this));
   }

   public void a(gcn $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evr a(gcn $$0, float $$1) {
      return $$0.ca() ? new evr(0.0, (double)($$0.ee() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gcn $$0) {
      fvf<gcn> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cmy.g);
         $$1.z.k = $$0.a(cmy.b);
         $$1.x.k = $$0.a(cmy.e);
         $$1.y.k = $$0.a(cmy.f);
         $$1.b.k = $$0.a(cmy.c);
         $$1.w.k = $$0.a(cmy.d);
         $$1.t = $$0.ca();
         fun.a $$2 = a($$0, bqt.a);
         fun.a $$3 = a($$0, bqt.b);
         if ($$2.a()) {
            $$3 = $$0.eY().e() ? fun.a.a : fun.a.b;
         }

         if ($$0.fu() == btj.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fun.a a(gcn $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if ($$2.e()) {
         return fun.a.a;
      } else {
         if ($$0.fw() == $$1 && $$0.fy() > 0) {
            cwk $$3 = $$2.v();
            if ($$3 == cwk.d) {
               return fun.a.c;
            }

            if ($$3 == cwk.e) {
               return fun.a.d;
            }

            if ($$3 == cwk.f) {
               return fun.a.e;
            }

            if ($$3 == cwk.g && $$1 == $$0.fw()) {
               return fun.a.f;
            }

            if ($$3 == cwk.h) {
               return fun.a.h;
            }

            if ($$3 == cwk.i) {
               return fun.a.i;
            }

            if ($$3 == cwk.j) {
               return fun.a.j;
            }
         } else if (!$$0.aJ && $$2.a(cus.vT) && ctc.j($$2)) {
            return fun.a.g;
         }

         return fun.a.b;
      }
   }

   public alf a(gcn $$0) {
      return $$0.b().a();
   }

   protected void a(gcn $$0, ezy $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gcn $$0, xp $$1, ezy $$2, gdo $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         ewv $$7 = $$0.gr();
         ewn $$8 = $$7.a(ewm.c);
         if ($$8 != null) {
            ewr $$9 = $$7.d($$0, $$8);
            xp $$10 = ewr.a($$9, $$8.a(zi.b));
            super.a($$0, xp.i().b($$10).b(xo.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(ezy $$0, gdo $$1, int $$2, gcn $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(ezy $$0, gdo $$1, int $$2, gcn $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(ezy $$0, gdo $$1, int $$2, gcn $$3, fxa $$4, fxa $$5) {
      fvf<gcn> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      alf $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gdw.c($$7)), $$2, goq.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gdw.i($$7)), $$2, goq.d);
   }

   protected void a(gcn $$0, ezy $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fE()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fF() + $$4;
         float $$9 = ayz.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fr()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         evr $$10 = $$0.f($$4);
         evr $$11 = $$0.E($$4);
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
