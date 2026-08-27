public class fyh extends fui<fnd, fgi<fnd>> {
   public fyh(fth.a $$0, boolean $$1) {
      super($$0, new fgi<>($$0.a($$1 ? fib.aQ : fib.aM), $$1), 0.5F);
      this.a(new fxf<>(this, new ffp($$0.a($$1 ? fib.aR : fib.aO)), new ffp($$0.a($$1 ? fib.aS : fib.aP)), $$0.g()));
      this.a(new fxo<>(this, $$0.d()));
      this.a(new fwn<>($$0, this));
      this.a(new fwv(this));
      this.a(new fwp(this));
      this.a(new fwu<>(this, $$0.f(), $$0.d()));
      this.a(new fwy<>(this, $$0.f()));
      this.a(new fxm<>(this, $$0.f()));
      this.a(new fxw<>(this, $$0.f()));
      this.a(new fwo<>(this));
   }

   public void a(fnd $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehn a(fnd $$0, float $$1) {
      return $$0.bW() ? new ehn(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fnd $$0) {
      fgi<fnd> $$1 = this.a();
      if ($$0.M_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(cbv.g);
         $$1.z.k = $$0.a(cbv.b);
         $$1.x.k = $$0.a(cbv.e);
         $$1.y.k = $$0.a(cbv.f);
         $$1.b.k = $$0.a(cbv.c);
         $$1.w.k = $$0.a(cbv.d);
         $$1.t = $$0.bW();
         ffq.a $$2 = a($$0, bgx.a);
         ffq.a $$3 = a($$0, bgx.b);
         if ($$2.a()) {
            $$3 = $$0.eT().b() ? ffq.a.a : ffq.a.b;
         }

         if ($$0.fl() == bja.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static ffq.a a(fnd $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if ($$2.b()) {
         return ffq.a.a;
      } else {
         if ($$0.fn() == $$1 && $$0.fp() > 0) {
            cky $$3 = $$2.s();
            if ($$3 == cky.d) {
               return ffq.a.c;
            }

            if ($$3 == cky.e) {
               return ffq.a.d;
            }

            if ($$3 == cky.f) {
               return ffq.a.e;
            }

            if ($$3 == cky.g && $$1 == $$0.fn()) {
               return ffq.a.f;
            }

            if ($$3 == cky.h) {
               return ffq.a.h;
            }

            if ($$3 == cky.i) {
               return ffq.a.i;
            }

            if ($$3 == cky.j) {
               return ffq.a.j;
            }
         } else if (!$$0.aF && $$2.a(cji.uZ) && chn.d($$2)) {
            return ffq.a.g;
         }

         return ffq.a.b;
      }
   }

   public aew a(fnd $$0) {
      return $$0.b().a();
   }

   protected void a(fnd $$0, elp $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fnd $$0, tl $$1, elp $$2, foe $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         eim $$6 = $$0.gg();
         eij $$7 = $$6.a(eii.c);
         if ($$7 != null) {
            eil $$8 = $$6.c($$0.cx(), $$7);
            super.a($$0, tl.b(Integer.toString($$8.b())).b(tk.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(elp $$0, foe $$1, int $$2, fnd $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(elp $$0, foe $$1, int $$2, fnd $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(elp $$0, foe $$1, int $$2, fnd $$3, fic $$4, fic $$5) {
      fgi<fnd> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      aew $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fom.c($$7)), $$2, fyv.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fom.i($$7)), $$2, fyv.d);
   }

   protected void a(fnd $$0, elp $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fv()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fw() + $$4;
         float $$8 = arw.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fi()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         ehn $$9 = $$0.f($$4);
         ehn $$10 = $$0.C($$4);
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
         float $$16 = arw.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.bZ()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
