public class gob extends gjx<gcm, fve<gcm>> {
   public gob(giw.a $$0, boolean $$1) {
      super($$0, new fve<>($$0.a($$1 ? fwy.aW : fwy.aS), $$1), 0.5F);
      this.a(new gmy<>(this, new ful($$0.a($$1 ? fwy.aX : fwy.aU)), new ful($$0.a($$1 ? fwy.aY : fwy.aV)), $$0.g()));
      this.a(new gnh<>(this, $$0.d()));
      this.a(new gme<>($$0, this));
      this.a(new gmo(this));
      this.a(new gmi(this));
      this.a(new gmn<>(this, $$0.f(), $$0.d()));
      this.a(new gmr<>(this, $$0.f()));
      this.a(new gnf<>(this, $$0.f()));
      this.a(new gnq<>(this, $$0.f()));
      this.a(new gmf<>(this));
   }

   public void a(gcm $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evq a(gcm $$0, float $$1) {
      return $$0.ca() ? new evq(0.0, (double)($$0.ee() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gcm $$0) {
      fve<gcm> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cmx.g);
         $$1.z.k = $$0.a(cmx.b);
         $$1.x.k = $$0.a(cmx.e);
         $$1.y.k = $$0.a(cmx.f);
         $$1.b.k = $$0.a(cmx.c);
         $$1.w.k = $$0.a(cmx.d);
         $$1.t = $$0.ca();
         fum.a $$2 = a($$0, bqs.a);
         fum.a $$3 = a($$0, bqs.b);
         if ($$2.a()) {
            $$3 = $$0.eY().e() ? fum.a.a : fum.a.b;
         }

         if ($$0.fu() == bti.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fum.a a(gcm $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.e()) {
         return fum.a.a;
      } else {
         if ($$0.fw() == $$1 && $$0.fy() > 0) {
            cwj $$3 = $$2.v();
            if ($$3 == cwj.d) {
               return fum.a.c;
            }

            if ($$3 == cwj.e) {
               return fum.a.d;
            }

            if ($$3 == cwj.f) {
               return fum.a.e;
            }

            if ($$3 == cwj.g && $$1 == $$0.fw()) {
               return fum.a.f;
            }

            if ($$3 == cwj.h) {
               return fum.a.h;
            }

            if ($$3 == cwj.i) {
               return fum.a.i;
            }

            if ($$3 == cwj.j) {
               return fum.a.j;
            }
         } else if (!$$0.aJ && $$2.a(cur.vT) && ctb.j($$2)) {
            return fum.a.g;
         }

         return fum.a.b;
      }
   }

   public ale a(gcm $$0) {
      return $$0.b().a();
   }

   protected void a(gcm $$0, ezx $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gcm $$0, xo $$1, ezx $$2, gdn $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         ewu $$7 = $$0.gr();
         ewm $$8 = $$7.a(ewl.c);
         if ($$8 != null) {
            ewq $$9 = $$7.d($$0, $$8);
            xo $$10 = ewq.a($$9, $$8.a(zh.b));
            super.a($$0, xo.i().b($$10).b(xn.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(ezx $$0, gdn $$1, int $$2, gcm $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(ezx $$0, gdn $$1, int $$2, gcm $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(ezx $$0, gdn $$1, int $$2, gcm $$3, fwz $$4, fwz $$5) {
      fve<gcm> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      ale $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gdv.c($$7)), $$2, gop.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gdv.i($$7)), $$2, gop.d);
   }

   protected void a(gcm $$0, ezx $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fE()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fF() + $$4;
         float $$9 = ayy.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fr()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         evq $$10 = $$0.f($$4);
         evq $$11 = $$0.E($$4);
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
         float $$17 = ayy.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.cd()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
