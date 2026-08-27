public class ghc extends gcz<fvp, foj<fvp>> {
   public ghc(gby.a $$0, boolean $$1) {
      super($$0, new foj<>($$0.a($$1 ? fqe.aS : fqe.aO), $$1), 0.5F);
      this.a(new gfz<>(this, new fnq($$0.a($$1 ? fqe.aT : fqe.aQ)), new fnq($$0.a($$1 ? fqe.aU : fqe.aR)), $$0.g()));
      this.a(new ggi<>(this, $$0.d()));
      this.a(new gff<>($$0, this));
      this.a(new gfp(this));
      this.a(new gfj(this));
      this.a(new gfo<>(this, $$0.f(), $$0.d()));
      this.a(new gfs<>(this, $$0.f()));
      this.a(new ggg<>(this, $$0.f()));
      this.a(new ggq<>(this, $$0.f()));
      this.a(new gfg<>(this));
   }

   public void a(fvp $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public eov a(fvp $$0, float $$1) {
      return $$0.bU() ? new eov(0.0, (double)($$0.dY() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(fvp $$0) {
      foj<fvp> $$1 = this.a();
      if ($$0.P_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cib.g);
         $$1.z.k = $$0.a(cib.b);
         $$1.x.k = $$0.a(cib.e);
         $$1.y.k = $$0.a(cib.f);
         $$1.b.k = $$0.a(cib.c);
         $$1.w.k = $$0.a(cib.d);
         $$1.t = $$0.bU();
         fnr.a $$2 = a($$0, bmk.a);
         fnr.a $$3 = a($$0, bmk.b);
         if ($$2.a()) {
            $$3 = $$0.eS().b() ? fnr.a.a : fnr.a.b;
         }

         if ($$0.fo() == bor.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fnr.a a(fvp $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fnr.a.a;
      } else {
         if ($$0.fq() == $$1 && $$0.fs() > 0) {
            crj $$3 = $$2.t();
            if ($$3 == crj.d) {
               return fnr.a.c;
            }

            if ($$3 == crj.e) {
               return fnr.a.d;
            }

            if ($$3 == crj.f) {
               return fnr.a.e;
            }

            if ($$3 == crj.g && $$1 == $$0.fq()) {
               return fnr.a.f;
            }

            if ($$3 == crj.h) {
               return fnr.a.h;
            }

            if ($$3 == crj.i) {
               return fnr.a.i;
            }

            if ($$3 == crj.j) {
               return fnr.a.j;
            }
         } else if (!$$0.aG && $$2.a(cpt.vP) && coa.d($$2)) {
            return fnr.a.g;
         }

         return fnr.a.b;
      }
   }

   public ajc a(fvp $$0) {
      return $$0.b().a();
   }

   protected void a(fvp $$0, etd $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fvp $$0, vs $$1, etd $$2, fwq $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         epz $$7 = $$0.gk();
         epr $$8 = $$7.a(epq.c);
         if ($$8 != null) {
            epv $$9 = $$7.d($$0, $$8);
            vs $$10 = epv.a($$9, $$8.a(xl.b));
            super.a($$0, vs.i().b($$10).b(vr.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(etd $$0, fwq $$1, int $$2, fvp $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(etd $$0, fwq $$1, int $$2, fvp $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(etd $$0, fwq $$1, int $$2, fvp $$3, fqf $$4, fqf $$5) {
      foj<fvp> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      ajc $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fwy.c($$7)), $$2, ghq.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fwy.i($$7)), $$2, ghq.d);
   }

   protected void a(fvp $$0, etd $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fy()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fz() + $$4;
         float $$9 = awm.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fl()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         eov $$10 = $$0.f($$4);
         eov $$11 = $$0.C($$4);
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
         float $$17 = awm.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.bX()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
