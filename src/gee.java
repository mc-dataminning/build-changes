public class gee extends gab<fss, flo<fss>> {
   public gee(fza.a $$0, boolean $$1) {
      super($$0, new flo<>($$0.a($$1 ? fni.aS : fni.aO), $$1), 0.5F);
      this.a(new gdb<>(this, new fkv($$0.a($$1 ? fni.aT : fni.aQ)), new fkv($$0.a($$1 ? fni.aU : fni.aR)), $$0.g()));
      this.a(new gdk<>(this, $$0.d()));
      this.a(new gch<>($$0, this));
      this.a(new gcr(this));
      this.a(new gcl(this));
      this.a(new gcq<>(this, $$0.f(), $$0.d()));
      this.a(new gcu<>(this, $$0.f()));
      this.a(new gdi<>(this, $$0.f()));
      this.a(new gds<>(this, $$0.f()));
      this.a(new gci<>(this));
   }

   public void a(fss $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public emc a(fss $$0, float $$1) {
      return $$0.bX() ? new emc(0.0, (double)($$0.dZ() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(fss $$0) {
      flo<fss> $$1 = this.a();
      if ($$0.P_()) {
         $$1.b_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.b_(true);
         $$1.l.k = $$0.a(cfr.g);
         $$1.z.k = $$0.a(cfr.b);
         $$1.x.k = $$0.a(cfr.e);
         $$1.y.k = $$0.a(cfr.f);
         $$1.b.k = $$0.a(cfr.c);
         $$1.w.k = $$0.a(cfr.d);
         $$1.t = $$0.bX();
         fkw.a $$2 = a($$0, bkb.a);
         fkw.a $$3 = a($$0, bkb.b);
         if ($$2.a()) {
            $$3 = $$0.eU().b() ? fkw.a.a : fkw.a.b;
         }

         if ($$0.fm() == bmi.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fkw.a a(fss $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fkw.a.a;
      } else {
         if ($$0.fo() == $$1 && $$0.fq() > 0) {
            cpa $$3 = $$2.s();
            if ($$3 == cpa.d) {
               return fkw.a.c;
            }

            if ($$3 == cpa.e) {
               return fkw.a.d;
            }

            if ($$3 == cpa.f) {
               return fkw.a.e;
            }

            if ($$3 == cpa.g && $$1 == $$0.fo()) {
               return fkw.a.f;
            }

            if ($$3 == cpa.h) {
               return fkw.a.h;
            }

            if ($$3 == cpa.i) {
               return fkw.a.i;
            }

            if ($$3 == cpa.j) {
               return fkw.a.j;
            }
         } else if (!$$0.aF && $$2.a(cnj.vP) && clp.d($$2)) {
            return fkw.a.g;
         }

         return fkw.a.b;
      }
   }

   public ahh a(fss $$0) {
      return $$0.b().a();
   }

   protected void a(fss $$0, eqk $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fss $$0, vg $$1, eqk $$2, ftt $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         eng $$7 = $$0.gh();
         emy $$8 = $$7.a(emx.c);
         if ($$8 != null) {
            enc $$9 = $$7.d($$0, $$8);
            vg $$10 = enc.a($$9, $$8.a(wz.b));
            super.a($$0, vg.i().b($$10).b(vf.u).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(eqk $$0, ftt $$1, int $$2, fss $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(eqk $$0, ftt $$1, int $$2, fss $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(eqk $$0, ftt $$1, int $$2, fss $$3, fnj $$4, fnj $$5) {
      flo<fss> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      ahh $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fub.c($$7)), $$2, ges.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fub.i($$7)), $$2, ges.d);
   }

   protected void a(fss $$0, eqk $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fw()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fx() + $$4;
         float $$8 = aup.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fj()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         emc $$9 = $$0.f($$4);
         emc $$10 = $$0.B($$4);
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
         float $$16 = aup.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.ca()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
