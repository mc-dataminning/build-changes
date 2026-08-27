public class gfw extends gbt<fuk, fng<fuk>> {
   public gfw(gas.a $$0, boolean $$1) {
      super($$0, new fng<>($$0.a($$1 ? fpb.aS : fpb.aO), $$1), 0.5F);
      this.a(new get<>(this, new fmn($$0.a($$1 ? fpb.aT : fpb.aQ)), new fmn($$0.a($$1 ? fpb.aU : fpb.aR)), $$0.g()));
      this.a(new gfc<>(this, $$0.d()));
      this.a(new gdz<>($$0, this));
      this.a(new gej(this));
      this.a(new ged(this));
      this.a(new gei<>(this, $$0.f(), $$0.d()));
      this.a(new gem<>(this, $$0.f()));
      this.a(new gfa<>(this, $$0.f()));
      this.a(new gfk<>(this, $$0.f()));
      this.a(new gea<>(this));
   }

   public void a(fuk $$0, float $$1, float $$2, esa $$3, fvl $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ens a(fuk $$0, float $$1) {
      return $$0.bX() ? new ens(0.0, (double)($$0.ea() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(fuk $$0) {
      fng<fuk> $$1 = this.a();
      if ($$0.P_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(chi.g);
         $$1.z.k = $$0.a(chi.b);
         $$1.x.k = $$0.a(chi.e);
         $$1.y.k = $$0.a(chi.f);
         $$1.b.k = $$0.a(chi.c);
         $$1.w.k = $$0.a(chi.d);
         $$1.t = $$0.bX();
         fmo.a $$2 = a($$0, blt.a);
         fmo.a $$3 = a($$0, blt.b);
         if ($$2.a()) {
            $$3 = $$0.eU().b() ? fmo.a.a : fmo.a.b;
         }

         if ($$0.fm() == boa.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fmo.a a(fuk $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fmo.a.a;
      } else {
         if ($$0.fo() == $$1 && $$0.fq() > 0) {
            cqs $$3 = $$2.t();
            if ($$3 == cqs.d) {
               return fmo.a.c;
            }

            if ($$3 == cqs.e) {
               return fmo.a.d;
            }

            if ($$3 == cqs.f) {
               return fmo.a.e;
            }

            if ($$3 == cqs.g && $$1 == $$0.fo()) {
               return fmo.a.f;
            }

            if ($$3 == cqs.h) {
               return fmo.a.h;
            }

            if ($$3 == cqs.i) {
               return fmo.a.i;
            }

            if ($$3 == cqs.j) {
               return fmo.a.j;
            }
         } else if (!$$0.aF && $$2.a(cpc.vP) && cnh.d($$2)) {
            return fmo.a.g;
         }

         return fmo.a.b;
      }
   }

   public aiy a(fuk $$0) {
      return $$0.b().a();
   }

   protected void a(fuk $$0, esa $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fuk $$0, vq $$1, esa $$2, fvl $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         eow $$7 = $$0.gi();
         eoo $$8 = $$7.a(eon.c);
         if ($$8 != null) {
            eos $$9 = $$7.d($$0, $$8);
            vq $$10 = eos.a($$9, $$8.a(xj.b));
            super.a($$0, vq.i().b($$10).b(vp.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(esa $$0, fvl $$1, int $$2, fuk $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(esa $$0, fvl $$1, int $$2, fuk $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(esa $$0, fvl $$1, int $$2, fuk $$3, fpc $$4, fpc $$5) {
      fng<fuk> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      aiy $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fvt.c($$7)), $$2, ggk.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fvt.i($$7)), $$2, ggk.d);
   }

   protected void a(fuk $$0, esa $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fw()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fx() + $$4;
         float $$9 = awh.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fj()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         ens $$10 = $$0.f($$4);
         ens $$11 = $$0.C($$4);
         double $$12 = $$11.i();
         double $$13 = $$10.i();
         if ($$12 > 0.0 && $$13 > 0.0) {
            double $$14 = ($$11.c * $$10.c + $$11.e * $$10.e) / Math.sqrt($$12 * $$13);
            double $$15 = $$11.c * $$10.e - $$11.e * $$10.c;
            $$1.a(a.d.rotation((float)(Math.signum($$15) * Math.acos($$14))));
         }
      } else if ($$6 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$16 = $$0.aZ() ? -90.0F - $$7 : -90.0F;
         float $$17 = awh.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
