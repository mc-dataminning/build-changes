public class fzd extends fve<fnz, fhc<fnz>> {
   public fzd(fud.a $$0, boolean $$1) {
      super($$0, new fhc<>($$0.a($$1 ? fiv.aQ : fiv.aM), $$1), 0.5F);
      this.a(new fyb<>(this, new fgj($$0.a($$1 ? fiv.aR : fiv.aO)), new fgj($$0.a($$1 ? fiv.aS : fiv.aP)), $$0.g()));
      this.a(new fyk<>(this, $$0.d()));
      this.a(new fxj<>($$0, this));
      this.a(new fxr(this));
      this.a(new fxl(this));
      this.a(new fxq<>(this, $$0.f(), $$0.d()));
      this.a(new fxu<>(this, $$0.f()));
      this.a(new fyi<>(this, $$0.f()));
      this.a(new fys<>(this, $$0.f()));
      this.a(new fxk<>(this));
   }

   public void a(fnz $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public eif a(fnz $$0, float $$1) {
      return $$0.bW() ? new eif(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fnz $$0) {
      fhc<fnz> $$1 = this.a();
      if ($$0.N_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(ccy.g);
         $$1.z.k = $$0.a(ccy.b);
         $$1.x.k = $$0.a(ccy.e);
         $$1.y.k = $$0.a(ccy.f);
         $$1.b.k = $$0.a(ccy.c);
         $$1.w.k = $$0.a(ccy.d);
         $$1.t = $$0.bW();
         fgk.a $$2 = a($$0, bia.a);
         fgk.a $$3 = a($$0, bia.b);
         if ($$2.a()) {
            $$3 = $$0.eT().b() ? fgk.a.a : fgk.a.b;
         }

         if ($$0.fm() == bkd.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fgk.a a(fnz $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fgk.a.a;
      } else {
         if ($$0.fo() == $$1 && $$0.fq() > 0) {
            cmc $$3 = $$2.s();
            if ($$3 == cmc.d) {
               return fgk.a.c;
            }

            if ($$3 == cmc.e) {
               return fgk.a.d;
            }

            if ($$3 == cmc.f) {
               return fgk.a.e;
            }

            if ($$3 == cmc.g && $$1 == $$0.fo()) {
               return fgk.a.f;
            }

            if ($$3 == cmc.h) {
               return fgk.a.h;
            }

            if ($$3 == cmc.i) {
               return fgk.a.i;
            }

            if ($$3 == cmc.j) {
               return fgk.a.j;
            }
         } else if (!$$0.aF && $$2.a(ckm.uZ) && cir.d($$2)) {
            return fgk.a.g;
         }

         return fgk.a.b;
      }
   }

   public afw a(fnz $$0) {
      return $$0.b().a();
   }

   protected void a(fnz $$0, emh $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fnz $$0, ui $$1, emh $$2, fpb $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         eje $$6 = $$0.gh();
         ejb $$7 = $$6.a(eja.c);
         if ($$7 != null) {
            ejd $$8 = $$6.c($$0.cx(), $$7);
            super.a($$0, ui.b(Integer.toString($$8.b())).b(uh.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(emh $$0, fpb $$1, int $$2, fnz $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(emh $$0, fpb $$1, int $$2, fnz $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(emh $$0, fpb $$1, int $$2, fnz $$3, fiw $$4, fiw $$5) {
      fhc<fnz> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      afw $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fpj.c($$7)), $$2, fzr.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fpj.i($$7)), $$2, fzr.d);
   }

   protected void a(fnz $$0, emh $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fw()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fx() + $$4;
         float $$8 = asy.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fj()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         eif $$9 = $$0.f($$4);
         eif $$10 = $$0.C($$4);
         double $$11 = $$10.i();
         double $$12 = $$9.i();
         if ($$11 > 0.0 && $$12 > 0.0) {
            double $$13 = ($$10.c * $$9.c + $$10.e * $$9.e) / Math.sqrt($$11 * $$12);
            double $$14 = $$10.c * $$9.e - $$10.e * $$9.c;
            $$1.a(a.d.rotation((float)(Math.signum($$14) * Math.acos($$13))));
         }
      } else if ($$5 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$15 = $$0.aX() ? -90.0F - $$6 : -90.0F;
         float $$16 = asy.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.bZ()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
