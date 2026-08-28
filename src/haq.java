import javax.annotation.Nullable;

public class haq extends gwl<gnx, hdb, ggj> {
   public haq(gvk.a $$0, boolean $$1) {
      super($$0, new ggj($$0.a($$1 ? gif.cu : gif.co), $$1), 0.5F);
      this.a(new gzn<>(this, new gfq($$0.a($$1 ? gif.cv : gif.cs)), new gfq($$0.a($$1 ? gif.cw : gif.ct)), $$0.h()));
      this.a(new gzx<>(this));
      this.a(new gyu<>(this, $$0));
      this.a(new gze(this, $$0.f()));
      this.a(new gyy(this, $$0.f(), $$0.g()));
      this.a(new gzd<>(this, $$0.f()));
      this.a(new haj<>(this, $$0.f(), $$0.h()));
      this.a(new gzv(this, $$0.f()));
      this.a(new haf(this, $$0.f()));
      this.a(new gyv<>(this, $$0));
   }

   protected boolean a(hdb $$0) {
      return !$$0.m;
   }

   public fdw b(hdb $$0) {
      fdw $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static gfr.a a(gnx $$0, bws $$1) {
      cys $$2 = $$0.b(btx.a);
      cys $$3 = $$0.b(btx.b);
      gfr.a $$4 = a($$0, $$2, btx.a);
      gfr.a $$5 = a($$0, $$3, btx.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? gfr.a.a : gfr.a.b;
      }

      return $$0.fx() == $$1 ? $$4 : $$5;
   }

   private static gfr.a a(cqs $$0, cys $$1, btx $$2) {
      if ($$1.f()) {
         return gfr.a.a;
      } else if (!$$0.aI && $$1.a(cyw.wZ) && cxl.g($$1)) {
         return gfr.a.g;
      } else {
         if ($$0.fz() == $$2 && $$0.fB() > 0) {
            cyu $$3 = $$1.w();
            if ($$3 == cyu.d) {
               return gfr.a.c;
            }

            if ($$3 == cyu.e) {
               return gfr.a.d;
            }

            if ($$3 == cyu.f) {
               return gfr.a.e;
            }

            if ($$3 == cyu.g) {
               return gfr.a.f;
            }

            if ($$3 == cyu.h) {
               return gfr.a.h;
            }

            if ($$3 == cyu.i) {
               return gfr.a.i;
            }

            if ($$3 == cyu.j) {
               return gfr.a.j;
            }
         }

         return gfr.a.b;
      }
   }

   public ale c(hdb $$0) {
      return $$0.a.a();
   }

   protected void a(hdb $$0, fiq $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(hdb $$0, ww $$1, fiq $$2, gpd $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public hdb b() {
      return new hdb();
   }

   public void a(gnx $$0, hdb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gwb.a($$0, $$1, $$2, this.h);
      $$1.h = a($$0, bws.a);
      $$1.f = a($$0, bws.b);
      $$1.a = $$0.c();
      $$1.j = $$0.eV();
      $$1.k = $$0.eW();
      $$1.l = $$0.fB();
      $$1.aC = $$0.aI;
      $$1.m = $$0.U_();
      $$1.n = $$0.a(cqt.g);
      $$1.o = $$0.a(cqt.b);
      $$1.p = $$0.a(cqt.e);
      $$1.q = $$0.a(cqt.f);
      $$1.aw = $$0.a(cqt.c);
      $$1.ax = $$0.a(cqt.d);
      $$1.ay = $$0.a(cqt.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         ffb $$3 = $$0.gy();
         fet $$4 = $$3.a(fes.c);
         if ($$4 != null) {
            fex $$5 = $$3.d($$0, $$4);
            ww $$6 = fex.a($$5, $$4.a(yp.b));
            $$1.aD = ww.i().b($$6).b(wv.v).b($$4.d());
         } else {
            $$1.aD = null;
         }
      } else {
         $$1.aD = null;
      }

      $$1.aE = a($$0, true);
      $$1.aF = a($$0, false);
      $$1.aG = $$0.ar();
      $$1.aH = $$0.gh().getName();
      $$1.aI.b();
      if ($$1.R) {
         cys $$7 = $$0.b($$1.M);
         if ($$7.a(cyw.rY)) {
            this.h.a($$1.aI, $$7, cyq.f, false, $$0);
         }
      }
   }

   private static void b(gnx $$0, hdb $$1, float $$2) {
      $$1.az = (float)$$0.fJ() + $$2;
      fdw $$3 = $$0.h($$2);
      fdw $$4 = $$0.I($$2);
      double $$5 = $$4.j();
      double $$6 = $$3.j();
      if ($$5 > 0.0 && $$6 > 0.0) {
         $$1.aA = true;
         double $$7 = Math.min(1.0, ($$4.d * $$3.d + $$4.f * $$3.f) / Math.sqrt($$5 * $$6));
         double $$8 = $$4.d * $$3.f - $$4.f * $$3.d;
         $$1.aB = (float)(Math.signum($$8) * Math.acos($$7));
      } else {
         $$1.aA = false;
         $$1.aB = 0.0F;
      }
   }

   private static void c(gnx $$0, hdb $$1, float $$2) {
      double $$3 = azk.d((double)$$2, $$0.bX, $$0.ca) - azk.d((double)$$2, $$0.K, $$0.dA());
      double $$4 = azk.d((double)$$2, $$0.bY, $$0.cb) - azk.d((double)$$2, $$0.L, $$0.dC());
      double $$5 = azk.d((double)$$2, $$0.bZ, $$0.cc) - azk.d((double)$$2, $$0.M, $$0.dG());
      float $$6 = azk.i($$2, $$0.aW, $$0.aV);
      double $$7 = (double)azk.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azk.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azk.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.b());
      $$1.c = azk.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azk.a($$1.d, -20.0F, 20.0F);
      float $$9 = azk.h($$2, $$0.bU, $$0.bV);
      float $$10 = azk.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + azk.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static cje.b a(gnx $$0, boolean $$1) {
      tx $$2 = $$1 ? $$0.gA() : $$0.gB();
      return bwj.a($$2.l("id")).filter($$0x -> $$0x == bwj.aO).isPresent() ? cje.b.a($$2.h("Variant")) : null;
   }

   public void a(fiq $$0, gpd $$1, int $$2, ale $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.r, $$4);
   }

   public void b(fiq $$0, gpd $$1, int $$2, ale $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.s, $$4);
   }

   private void a(fiq $$0, gpd $$1, int $$2, ale $$3, gig $$4, boolean $$5) {
      ggj $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gpn.j($$3)), $$2, hhp.d);
   }

   protected void a(hdb $$0, fiq $$1, float $$2, float $$3) {
      float $$4 = $$0.G;
      float $$5 = $$0.ab;
      if ($$0.O) {
         super.a($$0, $$1, $$2, $$3);
         float $$6 = $$0.b();
         if (!$$0.al) {
            $$1.a(a.b.rotationDegrees($$6 * (-90.0F - $$5)));
         }

         if ($$0.aA) {
            $$1.a(a.d.rotation($$0.aB));
         }
      } else if ($$4 > 0.0F) {
         super.a($$0, $$1, $$2, $$3);
         float $$7 = $$0.ak ? -90.0F - $$5 : -90.0F;
         float $$8 = azk.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.P) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
