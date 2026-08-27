public class fyd extends fue<fmz, fgd<fmz>> {
   public fyd(ftd.a $$0, boolean $$1) {
      super($$0, new fgd<>($$0.a($$1 ? fhw.aQ : fhw.aM), $$1), 0.5F);
      this.a(new fxb<>(this, new ffk($$0.a($$1 ? fhw.aR : fhw.aO)), new ffk($$0.a($$1 ? fhw.aS : fhw.aP)), $$0.g()));
      this.a(new fxk<>(this, $$0.d()));
      this.a(new fwj<>($$0, this));
      this.a(new fwr(this));
      this.a(new fwl(this));
      this.a(new fwq<>(this, $$0.f(), $$0.d()));
      this.a(new fwu<>(this, $$0.f()));
      this.a(new fxi<>(this, $$0.f()));
      this.a(new fxs<>(this, $$0.f()));
      this.a(new fwk<>(this));
   }

   public void a(fmz $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehh a(fmz $$0, float $$1) {
      return $$0.bW() ? new ehh(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fmz $$0) {
      fgd<fmz> $$1 = this.a();
      if ($$0.M_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(ccb.g);
         $$1.z.k = $$0.a(ccb.b);
         $$1.x.k = $$0.a(ccb.e);
         $$1.y.k = $$0.a(ccb.f);
         $$1.b.k = $$0.a(ccb.c);
         $$1.w.k = $$0.a(ccb.d);
         $$1.t = $$0.bW();
         ffl.a $$2 = a($$0, bhd.a);
         ffl.a $$3 = a($$0, bhd.b);
         if ($$2.a()) {
            $$3 = $$0.eT().b() ? ffl.a.a : ffl.a.b;
         }

         if ($$0.fm() == bjg.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static ffl.a a(fmz $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if ($$2.b()) {
         return ffl.a.a;
      } else {
         if ($$0.fo() == $$1 && $$0.fq() > 0) {
            cle $$3 = $$2.s();
            if ($$3 == cle.d) {
               return ffl.a.c;
            }

            if ($$3 == cle.e) {
               return ffl.a.d;
            }

            if ($$3 == cle.f) {
               return ffl.a.e;
            }

            if ($$3 == cle.g && $$1 == $$0.fo()) {
               return ffl.a.f;
            }

            if ($$3 == cle.h) {
               return ffl.a.h;
            }

            if ($$3 == cle.i) {
               return ffl.a.i;
            }

            if ($$3 == cle.j) {
               return ffl.a.j;
            }
         } else if (!$$0.aF && $$2.a(cjo.uZ) && cht.d($$2)) {
            return ffl.a.g;
         }

         return ffl.a.b;
      }
   }

   public aez a(fmz $$0) {
      return $$0.b().a();
   }

   protected void a(fmz $$0, elj $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fmz $$0, tl $$1, elj $$2, foa $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         eig $$6 = $$0.gh();
         eid $$7 = $$6.a(eic.c);
         if ($$7 != null) {
            eif $$8 = $$6.c($$0.cx(), $$7);
            super.a($$0, tl.b(Integer.toString($$8.b())).b(tk.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(elj $$0, foa $$1, int $$2, fmz $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(elj $$0, foa $$1, int $$2, fmz $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(elj $$0, foa $$1, int $$2, fmz $$3, fhx $$4, fhx $$5) {
      fgd<fmz> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      aez $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(foi.c($$7)), $$2, fyr.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(foi.i($$7)), $$2, fyr.d);
   }

   protected void a(fmz $$0, elj $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fw()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fx() + $$4;
         float $$8 = asb.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fj()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         ehh $$9 = $$0.f($$4);
         ehh $$10 = $$0.C($$4);
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
         float $$16 = asb.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.bZ()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
