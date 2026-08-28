public class gnx extends gjt<gci, fva<gci>> {
   public gnx(gis.a $$0, boolean $$1) {
      super($$0, new fva<>($$0.a($$1 ? fwu.aW : fwu.aS), $$1), 0.5F);
      this.a(new gmu<>(this, new fuh($$0.a($$1 ? fwu.aX : fwu.aU)), new fuh($$0.a($$1 ? fwu.aY : fwu.aV)), $$0.g()));
      this.a(new gnd<>(this, $$0.d()));
      this.a(new gma<>($$0, this));
      this.a(new gmk(this));
      this.a(new gme(this));
      this.a(new gmj<>(this, $$0.f(), $$0.d()));
      this.a(new gmn<>(this, $$0.f()));
      this.a(new gnb<>(this, $$0.f()));
      this.a(new gnm<>(this, $$0.f()));
      this.a(new gmb<>(this));
   }

   public void a(gci $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evm a(gci $$0, float $$1) {
      return $$0.ca() ? new evm(0.0, (double)($$0.ee() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gci $$0) {
      fva<gci> $$1 = this.a();
      if ($$0.N_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cmt.g);
         $$1.z.k = $$0.a(cmt.b);
         $$1.x.k = $$0.a(cmt.e);
         $$1.y.k = $$0.a(cmt.f);
         $$1.b.k = $$0.a(cmt.c);
         $$1.w.k = $$0.a(cmt.d);
         $$1.t = $$0.ca();
         fui.a $$2 = a($$0, bqo.a);
         fui.a $$3 = a($$0, bqo.b);
         if ($$2.a()) {
            $$3 = $$0.eY().e() ? fui.a.a : fui.a.b;
         }

         if ($$0.fu() == bte.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fui.a a(gci $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if ($$2.e()) {
         return fui.a.a;
      } else {
         if ($$0.fw() == $$1 && $$0.fy() > 0) {
            cwf $$3 = $$2.v();
            if ($$3 == cwf.d) {
               return fui.a.c;
            }

            if ($$3 == cwf.e) {
               return fui.a.d;
            }

            if ($$3 == cwf.f) {
               return fui.a.e;
            }

            if ($$3 == cwf.g && $$1 == $$0.fw()) {
               return fui.a.f;
            }

            if ($$3 == cwf.h) {
               return fui.a.h;
            }

            if ($$3 == cwf.i) {
               return fui.a.i;
            }

            if ($$3 == cwf.j) {
               return fui.a.j;
            }
         } else if (!$$0.aJ && $$2.a(cun.vT) && csx.j($$2)) {
            return fui.a.g;
         }

         return fui.a.b;
      }
   }

   public alb a(gci $$0) {
      return $$0.b().a();
   }

   protected void a(gci $$0, ezt $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gci $$0, xl $$1, ezt $$2, gdj $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         ewq $$7 = $$0.gr();
         ewi $$8 = $$7.a(ewh.c);
         if ($$8 != null) {
            ewm $$9 = $$7.d($$0, $$8);
            xl $$10 = ewm.a($$9, $$8.a(ze.b));
            super.a($$0, xl.i().b($$10).b(xk.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(ezt $$0, gdj $$1, int $$2, gci $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(ezt $$0, gdj $$1, int $$2, gci $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(ezt $$0, gdj $$1, int $$2, gci $$3, fwv $$4, fwv $$5) {
      fva<gci> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      alb $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gdr.c($$7)), $$2, gol.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gdr.i($$7)), $$2, gol.d);
   }

   protected void a(gci $$0, ezt $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fE()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fF() + $$4;
         float $$9 = ayu.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fr()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         evm $$10 = $$0.f($$4);
         evm $$11 = $$0.E($$4);
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
         float $$17 = ayu.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.cd()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
