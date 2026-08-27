public class fxj extends ftk<fmf, ffp<fmf>> {
   public fxj(fsj.a $$0, boolean $$1) {
      super($$0, new ffp<>($$0.a($$1 ? fhi.aQ : fhi.aM), $$1), 0.5F);
      this.a(new fwh<>(this, new few($$0.a($$1 ? fhi.aR : fhi.aO)), new few($$0.a($$1 ? fhi.aS : fhi.aP)), $$0.g()));
      this.a(new fwq<>(this, $$0.d()));
      this.a(new fvp<>($$0, this));
      this.a(new fvx(this));
      this.a(new fvr(this));
      this.a(new fvw<>(this, $$0.f(), $$0.d()));
      this.a(new fwa<>(this, $$0.f()));
      this.a(new fwo<>(this, $$0.f()));
      this.a(new fwy<>(this, $$0.f()));
      this.a(new fvq<>(this));
   }

   public void a(fmf $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehf a(fmf $$0, float $$1) {
      return $$0.bW() ? new ehf(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fmf $$0) {
      ffp<fmf> $$1 = this.a();
      if ($$0.G_()) {
         $$1.d_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.d_(true);
         $$1.l.k = $$0.a(cbm.g);
         $$1.z.k = $$0.a(cbm.b);
         $$1.x.k = $$0.a(cbm.e);
         $$1.y.k = $$0.a(cbm.f);
         $$1.b.k = $$0.a(cbm.c);
         $$1.w.k = $$0.a(cbm.d);
         $$1.t = $$0.bW();
         fex.a $$2 = a($$0, bgn.a);
         fex.a $$3 = a($$0, bgn.b);
         if ($$2.a()) {
            $$3 = $$0.eS().b() ? fex.a.a : fex.a.b;
         }

         if ($$0.fk() == biq.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fex.a a(fmf $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if ($$2.b()) {
         return fex.a.a;
      } else {
         if ($$0.fm() == $$1 && $$0.fo() > 0) {
            ckp $$3 = $$2.s();
            if ($$3 == ckp.d) {
               return fex.a.c;
            }

            if ($$3 == ckp.e) {
               return fex.a.d;
            }

            if ($$3 == ckp.f) {
               return fex.a.e;
            }

            if ($$3 == ckp.g && $$1 == $$0.fm()) {
               return fex.a.f;
            }

            if ($$3 == ckp.h) {
               return fex.a.h;
            }

            if ($$3 == ckp.i) {
               return fex.a.i;
            }

            if ($$3 == ckp.j) {
               return fex.a.j;
            }
         } else if (!$$0.aF && $$2.a(ciz.uZ) && che.d($$2)) {
            return fex.a.g;
         }

         return fex.a.b;
      }
   }

   public aep a(fmf $$0) {
      return $$0.b().a();
   }

   protected void a(fmf $$0, elh $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fmf $$0, te $$1, elh $$2, fng $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         eie $$6 = $$0.gf();
         eib $$7 = $$6.a(eia.c);
         if ($$7 != null) {
            eid $$8 = $$6.c($$0.cx(), $$7);
            super.a($$0, te.b(Integer.toString($$8.b())).b(td.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(elh $$0, fng $$1, int $$2, fmf $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(elh $$0, fng $$1, int $$2, fmf $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(elh $$0, fng $$1, int $$2, fmf $$3, fhj $$4, fhj $$5) {
      ffp<fmf> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      aep $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fno.b($$7)), $$2, fxx.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fno.h($$7)), $$2, fxx.d);
   }

   protected void a(fmf $$0, elh $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fu()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fv() + $$4;
         float $$8 = aro.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fh()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         ehf $$9 = $$0.f($$4);
         ehf $$10 = $$0.C($$4);
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
         float $$16 = aro.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.bZ()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
