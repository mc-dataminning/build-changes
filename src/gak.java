public class gak extends fwl<fpg, fih<fpg>> {
   public gak(fvk.a $$0, boolean $$1) {
      super($$0, new fih<>($$0.a($$1 ? fka.aQ : fka.aM), $$1), 0.5F);
      this.a(new fzi<>(this, new fho($$0.a($$1 ? fka.aR : fka.aO)), new fho($$0.a($$1 ? fka.aS : fka.aP)), $$0.g()));
      this.a(new fzr<>(this, $$0.d()));
      this.a(new fyq<>($$0, this));
      this.a(new fyy(this));
      this.a(new fys(this));
      this.a(new fyx<>(this, $$0.f(), $$0.d()));
      this.a(new fzb<>(this, $$0.f()));
      this.a(new fzp<>(this, $$0.f()));
      this.a(new fzz<>(this, $$0.f()));
      this.a(new fyr<>(this));
   }

   public void a(fpg $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public eji a(fpg $$0, float $$1) {
      return $$0.bW() ? new eji(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fpg $$0) {
      fih<fpg> $$1 = this.a();
      if ($$0.N_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(cdn.g);
         $$1.z.k = $$0.a(cdn.b);
         $$1.x.k = $$0.a(cdn.e);
         $$1.y.k = $$0.a(cdn.f);
         $$1.b.k = $$0.a(cdn.c);
         $$1.w.k = $$0.a(cdn.d);
         $$1.t = $$0.bW();
         fhp.a $$2 = a($$0, bip.a);
         fhp.a $$3 = a($$0, bip.b);
         if ($$2.a()) {
            $$3 = $$0.eT().b() ? fhp.a.a : fhp.a.b;
         }

         if ($$0.fm() == bks.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fhp.a a(fpg $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fhp.a.a;
      } else {
         if ($$0.fo() == $$1 && $$0.fq() > 0) {
            cmu $$3 = $$2.s();
            if ($$3 == cmu.d) {
               return fhp.a.c;
            }

            if ($$3 == cmu.e) {
               return fhp.a.d;
            }

            if ($$3 == cmu.f) {
               return fhp.a.e;
            }

            if ($$3 == cmu.g && $$1 == $$0.fo()) {
               return fhp.a.f;
            }

            if ($$3 == cmu.h) {
               return fhp.a.h;
            }

            if ($$3 == cmu.i) {
               return fhp.a.i;
            }

            if ($$3 == cmu.j) {
               return fhp.a.j;
            }
         } else if (!$$0.aF && $$2.a(cle.va) && cjj.d($$2)) {
            return fhp.a.g;
         }

         return fhp.a.b;
      }
   }

   public agg a(fpg $$0) {
      return $$0.b().a();
   }

   protected void a(fpg $$0, enk $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fpg $$0, ur $$1, enk $$2, fqh $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         ekh $$6 = $$0.gh();
         eke $$7 = $$6.a(ekd.c);
         if ($$7 != null) {
            ekg $$8 = $$6.c($$0.cx(), $$7);
            super.a($$0, ur.b(Integer.toString($$8.b())).b(uq.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(enk $$0, fqh $$1, int $$2, fpg $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(enk $$0, fqh $$1, int $$2, fpg $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(enk $$0, fqh $$1, int $$2, fpg $$3, fkb $$4, fkb $$5) {
      fih<fpg> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      agg $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fqp.c($$7)), $$2, gay.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fqp.i($$7)), $$2, gay.d);
   }

   protected void a(fpg $$0, enk $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fw()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fx() + $$4;
         float $$8 = ati.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fj()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         eji $$9 = $$0.f($$4);
         eji $$10 = $$0.C($$4);
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
         float $$16 = ati.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.bZ()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
