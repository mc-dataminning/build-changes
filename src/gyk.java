import javax.annotation.Nullable;

public class gyk extends gue<gls, hav, gef> {
   public gyk(gtd.a $$0, boolean $$1) {
      super($$0, new gef($$0.a($$1 ? ggb.cm : ggb.cg), $$1), 0.5F);
      this.a(new gxh<>(this, new gdm($$0.a($$1 ? ggb.cn : ggb.ck)), new gdm($$0.a($$1 ? ggb.co : ggb.cl)), $$0.h()));
      this.a(new gxr<>(this));
      this.a(new gwn<>(this, $$0));
      this.a(new gwx(this, $$0.f()));
      this.a(new gwr(this, $$0.f(), $$0.g()));
      this.a(new gww<>(this, $$0.f()));
      this.a(new gyd<>(this, $$0.f(), $$0.h()));
      this.a(new gxp(this, $$0.f()));
      this.a(new gxz(this, $$0.f()));
      this.a(new gwo<>(this, $$0));
   }

   protected boolean a(hav $$0) {
      return !$$0.m;
   }

   public fbx b(hav $$0) {
      fbx $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static gdn.a a(gls $$0, bvr $$1) {
      cxh $$2 = $$0.b(bsx.a);
      cxh $$3 = $$0.b(bsx.b);
      gdn.a $$4 = a($$0, $$2, bsx.a);
      gdn.a $$5 = a($$0, $$3, bsx.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? gdn.a.a : gdn.a.b;
      }

      return $$0.fA() == $$1 ? $$4 : $$5;
   }

   private static gdn.a a(cpr $$0, cxh $$1, bsx $$2) {
      if ($$1.f()) {
         return gdn.a.a;
      } else {
         if ($$0.fC() == $$2 && $$0.fE() > 0) {
            cxj $$3 = $$1.w();
            if ($$3 == cxj.d) {
               return gdn.a.c;
            }

            if ($$3 == cxj.e) {
               return gdn.a.d;
            }

            if ($$3 == cxj.f) {
               return gdn.a.e;
            }

            if ($$3 == cxj.g) {
               return gdn.a.f;
            }

            if ($$3 == cxj.h) {
               return gdn.a.h;
            }

            if ($$3 == cxj.i) {
               return gdn.a.i;
            }

            if ($$3 == cxj.j) {
               return gdn.a.j;
            }
         } else if (!$$0.aI && $$1.a(cxl.wX) && cvz.g($$1)) {
            return gdn.a.g;
         }

         return gdn.a.b;
      }
   }

   public aku c(hav $$0) {
      return $$0.a.a();
   }

   protected void a(hav $$0, fgr $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(hav $$0, wp $$1, fgr $$2, gmx $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public hav b() {
      return new hav();
   }

   public void a(gls $$0, hav $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gtu.a($$0, $$1, $$2, this.i);
      $$1.h = a($$0, bvr.a);
      $$1.f = a($$0, bvr.b);
      $$1.a = $$0.c();
      $$1.j = $$0.eU();
      $$1.k = $$0.eV();
      $$1.l = $$0.fE();
      $$1.aC = $$0.aI;
      $$1.m = $$0.U_();
      $$1.n = $$0.a(cps.g);
      $$1.o = $$0.a(cps.b);
      $$1.p = $$0.a(cps.e);
      $$1.q = $$0.a(cps.f);
      $$1.aw = $$0.a(cps.c);
      $$1.ax = $$0.a(cps.d);
      $$1.ay = $$0.a(cps.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         fdc $$3 = $$0.gB();
         fcu $$4 = $$3.a(fct.c);
         if ($$4 != null) {
            fcy $$5 = $$3.d($$0, $$4);
            wp $$6 = fcy.a($$5, $$4.a(yi.b));
            $$1.aD = wp.i().b($$6).b(wo.v).b($$4.d());
         } else {
            $$1.aD = null;
         }
      } else {
         $$1.aD = null;
      }

      $$1.aE = a($$0, true);
      $$1.aF = a($$0, false);
      $$1.aG = $$0.ar();
      $$1.aH = $$0.gk().getName();
      $$1.aI.b();
      if ($$1.R) {
         cxh $$7 = $$0.b($$1.M);
         if ($$7.a(cxl.rW)) {
            this.i.a($$1.aI, $$7, cxf.f, false, $$0);
         }
      }
   }

   private static void b(gls $$0, hav $$1, float $$2) {
      $$1.az = (float)$$0.fM() + $$2;
      fbx $$3 = $$0.h($$2);
      fbx $$4 = $$0.J($$2);
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

   private static void c(gls $$0, hav $$1, float $$2) {
      double $$3 = ayz.d((double)$$2, $$0.bX, $$0.ca) - ayz.d((double)$$2, $$0.K, $$0.dz());
      double $$4 = ayz.d((double)$$2, $$0.bY, $$0.cb) - ayz.d((double)$$2, $$0.L, $$0.dB());
      double $$5 = ayz.d((double)$$2, $$0.bZ, $$0.cc) - ayz.d((double)$$2, $$0.M, $$0.dF());
      float $$6 = ayz.i($$2, $$0.aW, $$0.aV);
      double $$7 = (double)ayz.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-ayz.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = ayz.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.b());
      $$1.c = ayz.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = ayz.a($$1.d, -20.0F, 20.0F);
      float $$9 = ayz.h($$2, $$0.bU, $$0.bV);
      float $$10 = ayz.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + ayz.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static cif.b a(gls $$0, boolean $$1) {
      tq $$2 = $$1 ? $$0.gD() : $$0.gE();
      return bvi.a($$2.l("id")).filter($$0x -> $$0x == bvi.aO).isPresent() ? cif.b.a($$2.h("Variant")) : null;
   }

   public void a(fgr $$0, gmx $$1, int $$2, aku $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(fgr $$0, gmx $$1, int $$2, aku $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(fgr $$0, gmx $$1, int $$2, aku $$3, ggc $$4, boolean $$5) {
      gef $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gnh.j($$3)), $$2, hfh.d);
   }

   protected void a(hav $$0, fgr $$1, float $$2, float $$3) {
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
         float $$8 = ayz.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.P) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
