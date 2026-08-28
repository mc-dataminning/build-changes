import javax.annotation.Nullable;

public class gxj extends gtd<gks, gzu, gdf> {
   public gxj(gsc.a $$0, boolean $$1) {
      super($$0, new gdf($$0.a($$1 ? gfb.ck : gfb.ce), $$1), 0.5F);
      this.a(new gwg<>(this, new gcm($$0.a($$1 ? gfb.cl : gfb.ci)), new gcm($$0.a($$1 ? gfb.cm : gfb.cj)), $$0.h()));
      this.a(new gwq<>(this));
      this.a(new gvm<>(this, $$0));
      this.a(new gvw(this, $$0.f()));
      this.a(new gvq(this, $$0.f(), $$0.g()));
      this.a(new gvv<>(this, $$0.f()));
      this.a(new gxc<>(this, $$0.f(), $$0.h()));
      this.a(new gwo(this, $$0.f()));
      this.a(new gwy(this, $$0.f()));
      this.a(new gvn<>(this, $$0));
   }

   protected boolean a(gzu $$0) {
      return !$$0.m;
   }

   public fba b(gzu $$0) {
      fba $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static gcn.a a(gks $$0, bva $$1) {
      cwp $$2 = $$0.b(bsi.a);
      cwp $$3 = $$0.b(bsi.b);
      gcn.a $$4 = a($$0, $$2, bsi.a);
      gcn.a $$5 = a($$0, $$3, bsi.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? gcn.a.a : gcn.a.b;
      }

      return $$0.fy() == $$1 ? $$4 : $$5;
   }

   private static gcn.a a(cox $$0, cwp $$1, bsi $$2) {
      if ($$1.f()) {
         return gcn.a.a;
      } else {
         if ($$0.fA() == $$2 && $$0.fC() > 0) {
            cwr $$3 = $$1.w();
            if ($$3 == cwr.d) {
               return gcn.a.c;
            }

            if ($$3 == cwr.e) {
               return gcn.a.d;
            }

            if ($$3 == cwr.f) {
               return gcn.a.e;
            }

            if ($$3 == cwr.g) {
               return gcn.a.f;
            }

            if ($$3 == cwr.h) {
               return gcn.a.h;
            }

            if ($$3 == cwr.i) {
               return gcn.a.i;
            }

            if ($$3 == cwr.j) {
               return gcn.a.j;
            }
         } else if (!$$0.aI && $$1.a(cwt.wV) && cvg.g($$1)) {
            return gcn.a.g;
         }

         return gcn.a.b;
      }
   }

   public aku c(gzu $$0) {
      return $$0.a.a();
   }

   protected void a(gzu $$0, ffu $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gzu $$0, wo $$1, ffu $$2, glx $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public gzu b() {
      return new gzu();
   }

   public void a(gks $$0, gzu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gst.a($$0, $$1, $$2, this.i);
      $$1.h = a($$0, bva.a);
      $$1.f = a($$0, bva.b);
      $$1.a = $$0.d();
      $$1.j = $$0.eU();
      $$1.k = $$0.eV();
      $$1.l = $$0.fC();
      $$1.aC = $$0.aI;
      $$1.m = $$0.Z_();
      $$1.n = $$0.a(coy.g);
      $$1.o = $$0.a(coy.b);
      $$1.p = $$0.a(coy.e);
      $$1.q = $$0.a(coy.f);
      $$1.aw = $$0.a(coy.c);
      $$1.ax = $$0.a(coy.d);
      $$1.ay = $$0.a(coy.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         fcf $$3 = $$0.gy();
         fbx $$4 = $$3.a(fbw.c);
         if ($$4 != null) {
            fcb $$5 = $$3.d($$0, $$4);
            wo $$6 = fcb.a($$5, $$4.a(yh.b));
            $$1.aD = wo.i().b($$6).b(wn.v).b($$4.d());
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
      cwp $$7 = $$0.fB();
      if ($$7.a(cwt.rU)) {
         this.i.a($$1.aI, $$7, cwn.f, false, $$0);
      } else {
         $$1.aI.b();
      }
   }

   private static void b(gks $$0, gzu $$1, float $$2) {
      $$1.az = (float)$$0.fK() + $$2;
      fba $$3 = $$0.g($$2);
      fba $$4 = $$0.I($$2);
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

   private static void c(gks $$0, gzu $$1, float $$2) {
      double $$3 = ayz.d((double)$$2, $$0.ck, $$0.cn) - ayz.d((double)$$2, $$0.K, $$0.dB());
      double $$4 = ayz.d((double)$$2, $$0.cl, $$0.co) - ayz.d((double)$$2, $$0.L, $$0.dD());
      double $$5 = ayz.d((double)$$2, $$0.cm, $$0.cp) - ayz.d((double)$$2, $$0.M, $$0.dH());
      float $$6 = ayz.i($$2, $$0.aY, $$0.aX);
      double $$7 = (double)ayz.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-ayz.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = ayz.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.b());
      $$1.c = ayz.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = ayz.a($$1.d, -20.0F, 20.0F);
      float $$9 = ayz.h($$2, $$0.ch, $$0.ci);
      float $$10 = ayz.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + ayz.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static chn.b a(gks $$0, boolean $$1) {
      tq $$2 = $$1 ? $$0.gA() : $$0.gB();
      return bur.a($$2.l("id")).filter($$0x -> $$0x == bur.aP).isPresent() ? chn.b.a($$2.h("Variant")) : null;
   }

   public void a(ffu $$0, glx $$1, int $$2, aku $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(ffu $$0, glx $$1, int $$2, aku $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(ffu $$0, glx $$1, int $$2, aku $$3, gfc $$4, boolean $$5) {
      gdf $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gmh.j($$3)), $$2, hea.d);
   }

   protected void a(gzu $$0, ffu $$1, float $$2, float $$3) {
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
