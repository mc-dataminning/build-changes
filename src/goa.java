public class goa extends gjw<gcl, fvd<gcl>> {
   public goa(giv.a $$0, boolean $$1) {
      super($$0, new fvd<>($$0.a($$1 ? fwx.aW : fwx.aS), $$1), 0.5F);
      this.a(new gmx<>(this, new fuk($$0.a($$1 ? fwx.aX : fwx.aU)), new fuk($$0.a($$1 ? fwx.aY : fwx.aV)), $$0.g()));
      this.a(new gng<>(this, $$0.d()));
      this.a(new gmd<>($$0, this));
      this.a(new gmn(this));
      this.a(new gmh(this));
      this.a(new gmm<>(this, $$0.f(), $$0.d()));
      this.a(new gmq<>(this, $$0.f()));
      this.a(new gne<>(this, $$0.f()));
      this.a(new gnp<>(this, $$0.f()));
      this.a(new gme<>(this));
   }

   public void a(gcl $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evp a(gcl $$0, float $$1) {
      return $$0.ca() ? new evp(0.0, (double)($$0.ee() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gcl $$0) {
      fvd<gcl> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cmw.g);
         $$1.z.k = $$0.a(cmw.b);
         $$1.x.k = $$0.a(cmw.e);
         $$1.y.k = $$0.a(cmw.f);
         $$1.b.k = $$0.a(cmw.c);
         $$1.w.k = $$0.a(cmw.d);
         $$1.t = $$0.ca();
         ful.a $$2 = a($$0, bqr.a);
         ful.a $$3 = a($$0, bqr.b);
         if ($$2.a()) {
            $$3 = $$0.eY().e() ? ful.a.a : ful.a.b;
         }

         if ($$0.fu() == bth.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static ful.a a(gcl $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      if ($$2.e()) {
         return ful.a.a;
      } else {
         if ($$0.fw() == $$1 && $$0.fy() > 0) {
            cwi $$3 = $$2.v();
            if ($$3 == cwi.d) {
               return ful.a.c;
            }

            if ($$3 == cwi.e) {
               return ful.a.d;
            }

            if ($$3 == cwi.f) {
               return ful.a.e;
            }

            if ($$3 == cwi.g && $$1 == $$0.fw()) {
               return ful.a.f;
            }

            if ($$3 == cwi.h) {
               return ful.a.h;
            }

            if ($$3 == cwi.i) {
               return ful.a.i;
            }

            if ($$3 == cwi.j) {
               return ful.a.j;
            }
         } else if (!$$0.aJ && $$2.a(cuq.vT) && cta.j($$2)) {
            return ful.a.g;
         }

         return ful.a.b;
      }
   }

   public ale a(gcl $$0) {
      return $$0.b().a();
   }

   protected void a(gcl $$0, ezw $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gcl $$0, xo $$1, ezw $$2, gdm $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         ewt $$7 = $$0.gr();
         ewl $$8 = $$7.a(ewk.c);
         if ($$8 != null) {
            ewp $$9 = $$7.d($$0, $$8);
            xo $$10 = ewp.a($$9, $$8.a(zh.b));
            super.a($$0, xo.i().b($$10).b(xn.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(ezw $$0, gdm $$1, int $$2, gcl $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(ezw $$0, gdm $$1, int $$2, gcl $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(ezw $$0, gdm $$1, int $$2, gcl $$3, fwy $$4, fwy $$5) {
      fvd<gcl> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      ale $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gdu.c($$7)), $$2, goo.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gdu.i($$7)), $$2, goo.d);
   }

   protected void a(gcl $$0, ezw $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fE()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fF() + $$4;
         float $$9 = ayx.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fr()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         evp $$10 = $$0.f($$4);
         evp $$11 = $$0.E($$4);
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
         float $$17 = ayx.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.cd()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
