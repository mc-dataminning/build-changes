public class goe extends gka<gcp, fvh<gcp>> {
   public goe(giz.a $$0, boolean $$1) {
      super($$0, new fvh<>($$0.a($$1 ? fxb.aW : fxb.aS), $$1), 0.5F);
      this.a(new gnb<>(this, new fuo($$0.a($$1 ? fxb.aX : fxb.aU)), new fuo($$0.a($$1 ? fxb.aY : fxb.aV)), $$0.g()));
      this.a(new gnk<>(this, $$0.d()));
      this.a(new gmh<>($$0, this));
      this.a(new gmr(this));
      this.a(new gml(this));
      this.a(new gmq<>(this, $$0.f(), $$0.d()));
      this.a(new gmu<>(this, $$0.f()));
      this.a(new gni<>(this, $$0.f()));
      this.a(new gnt<>(this, $$0.f()));
      this.a(new gmi<>(this));
   }

   public void a(gcp $$0, float $$1, float $$2, faa $$3, gdq $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evt a(gcp $$0, float $$1) {
      return $$0.ca() ? new evt(0.0, (double)($$0.ee() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gcp $$0) {
      fvh<gcp> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cna.g);
         $$1.z.k = $$0.a(cna.b);
         $$1.x.k = $$0.a(cna.e);
         $$1.y.k = $$0.a(cna.f);
         $$1.b.k = $$0.a(cna.c);
         $$1.w.k = $$0.a(cna.d);
         $$1.t = $$0.ca();
         fup.a $$2 = a($$0, bqv.a);
         fup.a $$3 = a($$0, bqv.b);
         if ($$2.a()) {
            $$3 = $$0.eY().e() ? fup.a.a : fup.a.b;
         }

         if ($$0.fu() == btl.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fup.a a(gcp $$0, bqv $$1) {
      cur $$2 = $$0.b($$1);
      if ($$2.e()) {
         return fup.a.a;
      } else {
         if ($$0.fw() == $$1 && $$0.fy() > 0) {
            cwm $$3 = $$2.v();
            if ($$3 == cwm.d) {
               return fup.a.c;
            }

            if ($$3 == cwm.e) {
               return fup.a.d;
            }

            if ($$3 == cwm.f) {
               return fup.a.e;
            }

            if ($$3 == cwm.g && $$1 == $$0.fw()) {
               return fup.a.f;
            }

            if ($$3 == cwm.h) {
               return fup.a.h;
            }

            if ($$3 == cwm.i) {
               return fup.a.i;
            }

            if ($$3 == cwm.j) {
               return fup.a.j;
            }
         } else if (!$$0.aJ && $$2.a(cuu.vT) && cte.j($$2)) {
            return fup.a.g;
         }

         return fup.a.b;
      }
   }

   public alf a(gcp $$0) {
      return $$0.b().a();
   }

   protected void a(gcp $$0, faa $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gcp $$0, xp $$1, faa $$2, gdq $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         ewx $$7 = $$0.gr();
         ewp $$8 = $$7.a(ewo.c);
         if ($$8 != null) {
            ewt $$9 = $$7.d($$0, $$8);
            xp $$10 = ewt.a($$9, $$8.a(zi.b));
            super.a($$0, xp.i().b($$10).b(xo.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(faa $$0, gdq $$1, int $$2, gcp $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(faa $$0, gdq $$1, int $$2, gcp $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(faa $$0, gdq $$1, int $$2, gcp $$3, fxc $$4, fxc $$5) {
      fvh<gcp> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      alf $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gdy.c($$7)), $$2, gos.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gdy.i($$7)), $$2, gos.d);
   }

   protected void a(gcp $$0, faa $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fE()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fF() + $$4;
         float $$9 = ayz.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fr()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         evt $$10 = $$0.f($$4);
         evt $$11 = $$0.E($$4);
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
