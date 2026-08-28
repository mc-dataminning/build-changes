public class gpi extends gle<gds, fwj<gds>> {
   public gpi(gkd.a $$0, boolean $$1) {
      super($$0, new fwj<>($$0.a($$1 ? fyd.aX : fyd.aT), $$1), 0.5F);
      this.a(new gof<>(this, new fvq($$0.a($$1 ? fyd.aY : fyd.aV)), new fvq($$0.a($$1 ? fyd.aZ : fyd.aW)), $$0.g()));
      this.a(new goo<>(this, $$0.d()));
      this.a(new gnl<>($$0, this));
      this.a(new gnv(this));
      this.a(new gnp(this));
      this.a(new gnu<>(this, $$0.f(), $$0.d()));
      this.a(new gny<>(this, $$0.f()));
      this.a(new gom<>(this, $$0.f()));
      this.a(new gox<>(this, $$0.f()));
      this.a(new gnm<>(this));
   }

   public void a(gds $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      this.b($$0);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public eww a(gds $$0, float $$1) {
      return $$0.cb() ? new eww(0.0, (double)($$0.ec() * -2.0F) / 16.0, 0.0) : super.a($$0, $$1);
   }

   private void b(gds $$0) {
      fwj<gds> $$1 = this.a();
      if ($$0.N_()) {
         $$1.c_(false);
         $$1.k.k = true;
         $$1.l.k = true;
      } else {
         $$1.c_(true);
         $$1.l.k = $$0.a(cmw.g);
         $$1.z.k = $$0.a(cmw.b);
         $$1.x.k = $$0.a(cmw.e);
         $$1.y.k = $$0.a(cmw.f);
         $$1.b.k = $$0.a(cmw.c);
         $$1.w.k = $$0.a(cmw.d);
         $$1.t = $$0.cb();
         fvr.a $$2 = a($$0, bqp.a);
         fvr.a $$3 = a($$0, bqp.b);
         if ($$2.a()) {
            $$3 = $$0.eV().e() ? fvr.a.a : fvr.a.b;
         }

         if ($$0.fr() == btf.b) {
            $$1.s = $$2;
            $$1.r = $$3;
         } else {
            $$1.s = $$3;
            $$1.r = $$2;
         }
      }
   }

   private static fvr.a a(gds $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.e()) {
         return fvr.a.a;
      } else {
         if ($$0.ft() == $$1 && $$0.fv() > 0) {
            cwm $$3 = $$2.u();
            if ($$3 == cwm.d) {
               return fvr.a.c;
            }

            if ($$3 == cwm.e) {
               return fvr.a.d;
            }

            if ($$3 == cwm.f) {
               return fvr.a.e;
            }

            if ($$3 == cwm.g && $$1 == $$0.ft()) {
               return fvr.a.f;
            }

            if ($$3 == cwm.h) {
               return fvr.a.h;
            }

            if ($$3 == cwm.i) {
               return fvr.a.i;
            }

            if ($$3 == cwm.j) {
               return fvr.a.j;
            }
         } else if (!$$0.aJ && $$2.a(cur.vW) && cta.i($$2)) {
            return fvr.a.g;
         }

         return fvr.a.b;
      }
   }

   public akq a(gds $$0) {
      return $$0.b().a();
   }

   protected void a(gds $$0, fbc $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gds $$0, wy $$1, fbc $$2, get $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      $$2.a();
      if ($$6 < 100.0) {
         eya $$7 = $$0.go();
         exs $$8 = $$7.a(exr.c);
         if ($$8 != null) {
            exw $$9 = $$7.d($$0, $$8);
            wy $$10 = exw.a($$9, $$8.a(yr.b));
            super.a($$0, wy.i().b($$10).b(wx.v).b($$8.d()), $$2, $$3, $$4, $$5);
            $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$2.b();
   }

   public void a(fbc $$0, get $$1, int $$2, gds $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.n, this.f.w);
   }

   public void b(fbc $$0, get $$1, int $$2, gds $$3) {
      this.a($$0, $$1, $$2, $$3, this.f.o, this.f.b);
   }

   private void a(fbc $$0, get $$1, int $$2, gds $$3, fye $$4, fye $$5) {
      fwj<gds> $$6 = this.a();
      this.b($$3);
      $$6.c = 0.0F;
      $$6.t = false;
      $$6.u = 0.0F;
      $$6.a($$3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      $$4.e = 0.0F;
      akq $$7 = $$3.b().a();
      $$4.a($$0, $$1.getBuffer(gfb.c($$7)), $$2, gpw.d);
      $$5.e = 0.0F;
      $$5.a($$0, $$1.getBuffer(gfb.i($$7)), $$2, gpw.d);
   }

   protected void a(gds $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.a($$4);
      float $$7 = $$0.h($$4);
      if ($$0.fB()) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$8 = (float)$$0.fC() + $$4;
         float $$9 = ayn.a($$8 * $$8 / 100.0F, 0.0F, 1.0F);
         if (!$$0.fo()) {
            $$1.a(a.b.rotationDegrees($$9 * (-90.0F - $$7)));
         }

         eww $$10 = $$0.g($$4);
         eww $$11 = $$0.F($$4);
         double $$12 = $$11.i();
         double $$13 = $$10.i();
         if ($$12 > 0.0 && $$13 > 0.0) {
            double $$14 = ($$11.c * $$10.c + $$11.e * $$10.e) / Math.sqrt($$12 * $$13);
            double $$15 = $$11.c * $$10.e - $$11.e * $$10.c;
            $$1.a(a.d.rotation((float)(Math.signum($$15) * Math.acos($$14))));
         }
      } else if ($$6 > 0.0F) {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
         float $$16 = $$0.bf() ? -90.0F - $$7 : -90.0F;
         float $$17 = ayn.i($$6, 0.0F, $$16);
         $$1.a(a.b.rotationDegrees($$17));
         if ($$0.ce()) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
