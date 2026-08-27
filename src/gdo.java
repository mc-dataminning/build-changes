public class gdo extends fzm<fse, fla<fse>> {
   public gdo(fyl.a $$0, boolean $$1) {
      super($$0, new fla<>($$0.a($$1 ? fmu.aT : fmu.aP), $$1), 0.5F);
      this.a(new gcm<>(this, new fkh($$0.a($$1 ? fmu.aU : fmu.aR)), new fkh($$0.a($$1 ? fmu.aV : fmu.aS)), $$0.g()));
      this.a(new gcv<>(this, $$0.d()));
      this.a(new gbs<>($$0, this));
      this.a(new gcc(this));
      this.a(new gbw(this));
      this.a(new gcb<>(this, $$0.f(), $$0.d()));
      this.a(new gcf<>(this, $$0.f()));
      this.a(new gct<>(this, $$0.f()));
      this.a(new gdd<>(this, $$0.f()));
      this.a(new gbt<>(this));
   }

   public void a(fse $$0, float $$1, float $$2, epz $$3, ftf $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public els a(fse $$0, float $$1) {
      return $$0.bX() ? new els(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fse $$0) {
      fla<fse> $$1 = this.a();
      if ($$0.P_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cfi.g);
         $$1.z.k = $$0.a(cfi.b);
         $$1.x.k = $$0.a(cfi.e);
         $$1.y.k = $$0.a(cfi.f);
         $$1.b.k = $$0.a(cfi.c);
         $$1.w.k = $$0.a(cfi.d);
         $$1.t = $$0.bX();
         fki.a $$2 = a($$0, bjz.a);
         fki.a $$3 = a($$0, bjz.b);
         if ($$2.a()) {
            $$3 = $$0.eU().b() ? fki.a.a : fki.a.b;
         }

         if ($$0.fm() == bme.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fki.a a(fse $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fki.a.a;
      } else {
         if ($$0.fo() == $$1 && $$0.fq() > 0) {
            cor $$3 = $$2.s();
            if ($$3 == cor.d) {
               return fki.a.c;
            }

            if ($$3 == cor.e) {
               return fki.a.d;
            }

            if ($$3 == cor.f) {
               return fki.a.e;
            }

            if ($$3 == cor.g && $$1 == $$0.fo()) {
               return fki.a.f;
            }

            if ($$3 == cor.h) {
               return fki.a.h;
            }

            if ($$3 == cor.i) {
               return fki.a.i;
            }

            if ($$3 == cor.j) {
               return fki.a.j;
            }
         } else if (!$$0.aF && $$2.a(cna.vM) && clf.d($$2)) {
            return fki.a.g;
         }

         return fki.a.b;
      }
   }

   public ahg a(fse $$0) {
      return $$0.b().a();
   }

   protected void a(fse $$0, epz $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fse $$0, vf $$1, epz $$2, ftf $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         emw $$6 = $$0.gh();
         emo $$7 = $$6.a(emn.c);
         if ($$7 != null) {
            ems $$8 = $$6.d($$0, $$7);
            vf $$9 = ems.a($$8, $$7.a(wy.b));
            super.a($$0, vf.i().b($$9).b(ve.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(epz $$0, ftf $$1, int $$2, fse $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(epz $$0, ftf $$1, int $$2, fse $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(epz $$0, ftf $$1, int $$2, fse $$3, fmv $$4, fmv $$5) {
      fla<fse> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      ahg $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(ftn.c($$7)), $$2, gec.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(ftn.i($$7)), $$2, gec.d);
   }

   protected void a(fse $$0, epz $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fw()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fx() + $$4;
         float $$8 = aun.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fj()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         els $$9 = $$0.f($$4);
         els $$10 = $$0.C($$4);
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
         float $$16 = aun.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
