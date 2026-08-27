public class fxo extends ftp<fmk, fft<fmk>> {
   public fxo(fso.a $$0, boolean $$1) {
      super($$0, new fft<>($$0.a($$1 ? fhm.aQ : fhm.aM), $$1), 0.5F);
      this.a(new fwm<>(this, new ffa($$0.a($$1 ? fhm.aR : fhm.aO)), new ffa($$0.a($$1 ? fhm.aS : fhm.aP)), $$0.g()));
      this.a(new fwv<>(this, $$0.d()));
      this.a(new fvu<>($$0, this));
      this.a(new fwc(this));
      this.a(new fvw(this));
      this.a(new fwb<>(this, $$0.f(), $$0.d()));
      this.a(new fwf<>(this, $$0.f()));
      this.a(new fwt<>(this, $$0.f()));
      this.a(new fxd<>(this, $$0.f()));
      this.a(new fvv<>(this));
   }

   public void a(fmk $$0, float $$1, float $$2, elg $$3, fnl $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehe a(fmk $$0, float $$1) {
      return $$0.bW() ? new ehe(0.0, -0.125, 0.0) : super.a($$0, $$1);
   }

   private void b(fmk $$0) {
      fft<fmk> $$1 = this.a();
      if ($$0.G_()) {
         $$1.d_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.d_(true);
         $$1.l.k = $$0.a(cbo.g);
         $$1.z.k = $$0.a(cbo.b);
         $$1.x.k = $$0.a(cbo.e);
         $$1.y.k = $$0.a(cbo.f);
         $$1.b.k = $$0.a(cbo.c);
         $$1.w.k = $$0.a(cbo.d);
         $$1.t = $$0.bW();
         ffb.a $$2 = a($$0, bgp.a);
         ffb.a $$3 = a($$0, bgp.b);
         if ($$2.a()) {
            $$3 = $$0.eS().b() ? ffb.a.a : ffb.a.b;
         }

         if ($$0.fk() == bis.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static ffb.a a(fmk $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if ($$2.b()) {
         return ffb.a.a;
      } else {
         if ($$0.fm() == $$1 && $$0.fo() > 0) {
            ckr $$3 = $$2.s();
            if ($$3 == ckr.d) {
               return ffb.a.c;
            }

            if ($$3 == ckr.e) {
               return ffb.a.d;
            }

            if ($$3 == ckr.f) {
               return ffb.a.e;
            }

            if ($$3 == ckr.g && $$1 == $$0.fm()) {
               return ffb.a.f;
            }

            if ($$3 == ckr.h) {
               return ffb.a.h;
            }

            if ($$3 == ckr.i) {
               return ffb.a.i;
            }

            if ($$3 == ckr.j) {
               return ffb.a.j;
            }
         } else if (!$$0.aF && $$2.a(cjb.uZ) && chg.d($$2)) {
            return ffb.a.g;
         }

         return ffb.a.b;
      }
   }

   public aer a(fmk $$0) {
      return $$0.b().a();
   }

   protected void a(fmk $$0, elg $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(fmk $$0, tf $$1, elg $$2, fnl $$3, int $$4) {
      double $$5 = this.c.b($$0);
      $$2.a();
      if ($$5 < 100.0) {
         eid $$6 = $$0.gf();
         eia $$7 = $$6.a(ehz.c);
         if ($$7 != null) {
            eic $$8 = $$6.c($$0.cx(), $$7);
            super.a($$0, tf.b(Integer.toString($$8.b())).b(te.u).b($$7.d()), $$2, $$3, $$4);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public void a(elg $$0, fnl $$1, int $$2, fmk $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(elg $$0, fnl $$1, int $$2, fmk $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(elg $$0, fnl $$1, int $$2, fmk $$3, fhn $$4, fhn $$5) {
      fft<fmk> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      aer $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(fnt.c($$7)), $$2, fyc.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(fnt.i($$7)), $$2, fyc.d);
   }

   protected void a(fmk $$0, elg $$1, float $$2, float $$3, float $$4) {
      float $$5 = $$0.a($$4);
      float $$6 = $$0.g($$4);
      if ($$0.fu()) {
         super.a($$0, $$1, $$2, $$3, $$4);
         float $$7 = (float)$$0.fv() + $$4;
         float $$8 = arp.a($$7 * $$7 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fh()) {
            $$1.a(a.b.rotationDegrees($$8 * (-90.0F - $$6)));
         }

         ehe $$9 = $$0.f($$4);
         ehe $$10 = $$0.C($$4);
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
         float $$16 = arp.i($$5, 0.0F, $$15);
         $$1.a(a.b.rotationDegrees($$16));
         if ($$0.bZ()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
