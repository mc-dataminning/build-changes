public class gge extends gcb<fus, fnn<fus>> {
   public gge(gba.a $$0, boolean $$1) {
      super($$0, new fnn<>($$0.a($$1 ? fpi.aS : fpi.aO), $$1), 0.5F);
      this.a(new gfb<>(this, new fmu($$0.a($$1 ? fpi.aT : fpi.aQ)), new fmu($$0.a($$1 ? fpi.aU : fpi.aR)), $$0.g()));
      this.a(new gfk<>(this, $$0.d()));
      this.a(new geh<>($$0, this));
      this.a(new ger(this));
      this.a(new gel(this));
      this.a(new geq<>(this, $$0.f(), $$0.d()));
      this.a(new geu<>(this, $$0.f()));
      this.a(new gfi<>(this, $$0.f()));
      this.a(new gfs<>(this, $$0.f()));
      this.a(new gei<>(this));
   }

   public void a(fus $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public enz a(fus $$0, float $$1) {
      return $$0.bX() ? new enz(0.0, (double)($$0.ea() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(fus $$0) {
      fnn<fus> $$1 = this.a();
      if ($$0.P_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(chm.g);
         $$1.z.k = $$0.a(chm.b);
         $$1.x.k = $$0.a(chm.e);
         $$1.y.k = $$0.a(chm.f);
         $$1.b.k = $$0.a(chm.c);
         $$1.w.k = $$0.a(chm.d);
         $$1.t = $$0.bX();
         fmv.a $$2 = a($$0, blv.a);
         fmv.a $$3 = a($$0, blv.b);
         if ($$2.a()) {
            $$3 = $$0.eU().b() ? fmv.a.a : fmv.a.b;
         }

         if ($$0.fm() == boc.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fmv.a a(fus $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fmv.a.a;
      } else {
         if ($$0.fo() == $$1 && $$0.fq() > 0) {
            cqw $$3 = $$2.t();
            if ($$3 == cqw.d) {
               return fmv.a.c;
            }

            if ($$3 == cqw.e) {
               return fmv.a.d;
            }

            if ($$3 == cqw.f) {
               return fmv.a.e;
            }

            if ($$3 == cqw.g && $$1 == $$0.fo()) {
               return fmv.a.f;
            }

            if ($$3 == cqw.h) {
               return fmv.a.h;
            }

            if ($$3 == cqw.i) {
               return fmv.a.i;
            }

            if ($$3 == cqw.j) {
               return fmv.a.j;
            }
         } else if (!$$0.aF && $$2.a(cpg.vP) && cnl.d($$2)) {
            return fmv.a.g;
         }

         return fmv.a.b;
      }
   }

   public aiy a(fus $$0) {
      return $$0.b().a();
   }

   protected void a(fus $$0, esh $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fus $$0, vq $$1, esh $$2, fvt $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         epd $$7 = $$0.gi();
         eov $$8 = $$7.a(eou.c);
         if ($$8 != null) {
            eoz $$9 = $$7.d($$0, $$8);
            vq $$10 = eoz.a($$9, $$8.a(xj.b));
            super.a($$0, vq.i().b($$10).b(vp.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(esh $$0, fvt $$1, int $$2, fus $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(esh $$0, fvt $$1, int $$2, fus $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(esh $$0, fvt $$1, int $$2, fus $$3, fpj $$4, fpj $$5) {
      fnn<fus> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      aiy $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fwb.c($$7)), $$2, ggs.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fwb.i($$7)), $$2, ggs.d);
   }

   protected void a(fus $$0, esh $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.g($$4);
      if ($$0.fw()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fx() + $$4;
         float $$9 = awi.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fj()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         enz $$10 = $$0.f($$4);
         enz $$11 = $$0.C($$4);
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
         float $$17 = awi.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
