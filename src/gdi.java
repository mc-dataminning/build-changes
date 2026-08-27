public class gdi extends fzg<fry, fku<fry>> {
   public gdi(fyf.a $$0, boolean $$1) {
      super($$0, new fku<>($$0.a($$1 ? fmo.aT : fmo.aP), $$1), 0.5F);
      this.a(new gcg<>(this, new fkb($$0.a($$1 ? fmo.aU : fmo.aR)), new fkb($$0.a($$1 ? fmo.aV : fmo.aS)), $$0.g()));
      this.a(new gcp<>(this, $$0.d()));
      this.a(new gbm<>($$0, this));
      this.a(new gbw(this));
      this.a(new gbq(this));
      this.a(new gbv<>(this, $$0.f(), $$0.d()));
      this.a(new gbz<>(this, $$0.f()));
      this.a(new gcn<>(this, $$0.f()));
      this.a(new gcx<>(this, $$0.f()));
      this.a(new gbn<>(this));
   }

   public void a(fry $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public elm a(fry $$0, float $$1) {
      return $$0.bX() ? new elm(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fry $$0) {
      fku<fry> $$1 = this.a();
      if ($$0.P_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cfc.g);
         $$1.z.k = $$0.a(cfc.b);
         $$1.x.k = $$0.a(cfc.e);
         $$1.y.k = $$0.a(cfc.f);
         $$1.b.k = $$0.a(cfc.c);
         $$1.w.k = $$0.a(cfc.d);
         $$1.t = $$0.bX();
         fkc.a $$2 = a($$0, bju.a);
         fkc.a $$3 = a($$0, bju.b);
         if ($$2.a()) {
            $$3 = $$0.eU().b() ? fkc.a.a : fkc.a.b;
         }

         if ($$0.fm() == blz.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fkc.a a(fry $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fkc.a.a;
      } else {
         if ($$0.fo() == $$1 && $$0.fq() > 0) {
            cok $$3 = $$2.s();
            if ($$3 == cok.d) {
               return fkc.a.c;
            }

            if ($$3 == cok.e) {
               return fkc.a.d;
            }

            if ($$3 == cok.f) {
               return fkc.a.e;
            }

            if ($$3 == cok.g && $$1 == $$0.fo()) {
               return fkc.a.f;
            }

            if ($$3 == cok.h) {
               return fkc.a.h;
            }

            if ($$3 == cok.i) {
               return fkc.a.i;
            }

            if ($$3 == cok.j) {
               return fkc.a.j;
            }
         } else if (!$$0.aF && $$2.a(cmu.vM) && ckz.d($$2)) {
            return fkc.a.g;
         }

         return fkc.a.b;
      }
   }

   public ahd a(fry $$0) {
      return $$0.b().a();
   }

   protected void a(fry $$0, ept $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fry $$0, vd $$1, ept $$2, fsz $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         emq $$6 = $$0.gh();
         emi $$7 = $$6.a(emh.c);
         if ($$7 != null) {
            emm $$8 = $$6.d($$0, $$7);
            vd $$9 = emm.a($$8, $$7.a(ww.b));
            super.a($$0, vd.i().b($$9).b(vc.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(ept $$0, fsz $$1, int $$2, fry $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(ept $$0, fsz $$1, int $$2, fry $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(ept $$0, fsz $$1, int $$2, fry $$3, fmp $$4, fmp $$5) {
      fku<fry> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      ahd $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fth.c($$7)), $$2, gdw.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fth.i($$7)), $$2, gdw.d);
   }

   protected void a(fry $$0, ept $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fw()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fx() + $$4;
         float $$8 = aui.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fj()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         elm $$9 = $$0.f($$4);
         elm $$10 = $$0.C($$4);
         double $$11 = $$10.i();
         double $$12 = $$9.i();
         if ($$11 > 0.0 && $$12 > 0.0) {
            double $$13 = ($$10.c * $$9.c + $$10.e * $$9.e) / Math.sqrt($$11 * $$12);
            double $$14 = $$10.c * $$9.e - $$10.e * $$9.c;
            $$1.a(a.d.rotation((float)(Math.signum($$14) * Math.acos($$13))));
         }
      } else if ($$5 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$15 = $$0.aZ() ? -90.0F - $$6 : -90.0F;
         float $$16 = aui.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
