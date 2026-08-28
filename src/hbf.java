import javax.annotation.Nullable;

public class hbf extends gxa<gom, hdr, ggw> {
   public hbf(gvz.a $$0, boolean $$1) {
      super($$0, new ggw($$0.a($$1 ? git.cw : git.cq), $$1), 0.5F);
      this.a(new hac<>(this, new ggd($$0.a($$1 ? git.cx : git.cu)), new ggd($$0.a($$1 ? git.cy : git.cv)), $$0.h()));
      this.a(new ham<>(this));
      this.a(new gzj<>(this, $$0));
      this.a(new gzt(this, $$0.f()));
      this.a(new gzn(this, $$0.f(), $$0.g()));
      this.a(new gzs<>(this, $$0.f()));
      this.a(new hay<>(this, $$0.f(), $$0.h()));
      this.a(new hak(this, $$0.f()));
      this.a(new hau(this, $$0.f()));
      this.a(new gzk<>(this, $$0));
   }

   protected boolean a(hdr $$0) {
      return !$$0.m;
   }

   public fei b(hdr $$0) {
      fei $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static gge.a a(gom $$0, bwv $$1) {
      cyy $$2 = $$0.b(bua.a);
      cyy $$3 = $$0.b(bua.b);
      gge.a $$4 = a($$0, $$2, bua.a);
      gge.a $$5 = a($$0, $$3, bua.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? gge.a.a : gge.a.b;
      }

      return $$0.fx() == $$1 ? $$4 : $$5;
   }

   private static gge.a a(cqy $$0, cyy $$1, bua $$2) {
      if ($$1.f()) {
         return gge.a.a;
      } else if (!$$0.aI && $$1.a(czc.xb) && cxr.g($$1)) {
         return gge.a.g;
      } else {
         if ($$0.fz() == $$2 && $$0.fB() > 0) {
            cza $$3 = $$1.w();
            if ($$3 == cza.d) {
               return gge.a.c;
            }

            if ($$3 == cza.e) {
               return gge.a.d;
            }

            if ($$3 == cza.f) {
               return gge.a.e;
            }

            if ($$3 == cza.g) {
               return gge.a.f;
            }

            if ($$3 == cza.h) {
               return gge.a.h;
            }

            if ($$3 == cza.i) {
               return gge.a.i;
            }

            if ($$3 == cza.j) {
               return gge.a.j;
            }
         }

         return gge.a.b;
      }
   }

   public alg c(hdr $$0) {
      return $$0.a.a();
   }

   protected void a(hdr $$0, fjc $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(hdr $$0, wy $$1, fjc $$2, gps $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public hdr b() {
      return new hdr();
   }

   public void a(gom $$0, hdr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gwq.a($$0, $$1, $$2, this.h);
      $$1.h = a($$0, bwv.a);
      $$1.f = a($$0, bwv.b);
      $$1.a = $$0.c();
      $$1.j = $$0.eV();
      $$1.k = $$0.eW();
      $$1.l = $$0.fB();
      $$1.aC = $$0.aI;
      $$1.m = $$0.U_();
      $$1.n = $$0.a(cqz.g);
      $$1.o = $$0.a(cqz.b);
      $$1.p = $$0.a(cqz.e);
      $$1.q = $$0.a(cqz.f);
      $$1.aw = $$0.a(cqz.c);
      $$1.ax = $$0.a(cqz.d);
      $$1.ay = $$0.a(cqz.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         ffn $$3 = $$0.gy();
         fff $$4 = $$3.a(ffe.c);
         if ($$4 != null) {
            ffj $$5 = $$3.d($$0, $$4);
            wy $$6 = ffj.a($$5, $$4.a(yr.b));
            $$1.aD = wy.i().b($$6).b(wx.v).b($$4.e());
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
         cyy $$7 = $$0.b($$1.M);
         if ($$7.a(czc.sa)) {
            this.h.a($$1.aI, $$7, cyw.f, false, $$0);
         }
      }
   }

   private static void b(gom $$0, hdr $$1, float $$2) {
      $$1.az = (float)$$0.fJ() + $$2;
      fei $$3 = $$0.h($$2);
      fei $$4 = $$0.I($$2);
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

   private static void c(gom $$0, hdr $$1, float $$2) {
      double $$3 = azm.d((double)$$2, $$0.bX, $$0.ca) - azm.d((double)$$2, $$0.K, $$0.dA());
      double $$4 = azm.d((double)$$2, $$0.bY, $$0.cb) - azm.d((double)$$2, $$0.L, $$0.dC());
      double $$5 = azm.d((double)$$2, $$0.bZ, $$0.cc) - azm.d((double)$$2, $$0.M, $$0.dG());
      float $$6 = azm.i($$2, $$0.aW, $$0.aV);
      double $$7 = (double)azm.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azm.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azm.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.b());
      $$1.c = azm.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azm.a($$1.d, -20.0F, 20.0F);
      float $$9 = azm.h($$2, $$0.bU, $$0.bV);
      float $$10 = azm.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + azm.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static cjk.b a(gom $$0, boolean $$1) {
      tz $$2 = $$1 ? $$0.gA() : $$0.gB();
      return bwm.a($$2.l("id")).filter($$0x -> $$0x == bwm.aO).isPresent() ? cjk.b.a($$2.h("Variant")) : null;
   }

   public void a(fjc $$0, gps $$1, int $$2, alg $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.r, $$4);
   }

   public void b(fjc $$0, gps $$1, int $$2, alg $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.s, $$4);
   }

   private void a(fjc $$0, gps $$1, int $$2, alg $$3, giu $$4, boolean $$5) {
      ggw $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gqc.j($$3)), $$2, hif.d);
   }

   protected void a(hdr $$0, fjc $$1, float $$2, float $$3) {
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
         float $$8 = azm.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.P) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
