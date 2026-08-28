import javax.annotation.Nullable;

public class gxk extends gte<gks, gzv, gdf> {
   public gxk(gsd.a $$0, boolean $$1) {
      super($$0, new gdf($$0.a($$1 ? gfb.ck : gfb.ce), $$1), 0.5F);
      this.a(new gwh<>(this, new gcm($$0.a($$1 ? gfb.cl : gfb.ci)), new gcm($$0.a($$1 ? gfb.cm : gfb.cj)), $$0.h()));
      this.a(new gwr<>(this));
      this.a(new gvn<>(this, $$0));
      this.a(new gvx(this, $$0.f()));
      this.a(new gvr(this, $$0.f(), $$0.g()));
      this.a(new gvw<>(this, $$0.f()));
      this.a(new gxd<>(this, $$0.f(), $$0.h()));
      this.a(new gwp(this, $$0.f()));
      this.a(new gwz(this, $$0.f()));
      this.a(new gvo<>(this, $$0));
   }

   protected boolean a(gzv $$0) {
      return !$$0.m;
   }

   public faz b(gzv $$0) {
      faz $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static gcn.a a(gks $$0, bva $$1) {
      cwo $$2 = $$0.b(bsi.a);
      cwo $$3 = $$0.b(bsi.b);
      gcn.a $$4 = a($$0, $$2, bsi.a);
      gcn.a $$5 = a($$0, $$3, bsi.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? gcn.a.a : gcn.a.b;
      }

      return $$0.fy() == $$1 ? $$4 : $$5;
   }

   private static gcn.a a(cow $$0, cwo $$1, bsi $$2) {
      if ($$1.f()) {
         return gcn.a.a;
      } else {
         if ($$0.fA() == $$2 && $$0.fC() > 0) {
            cwq $$3 = $$1.w();
            if ($$3 == cwq.d) {
               return gcn.a.c;
            }

            if ($$3 == cwq.e) {
               return gcn.a.d;
            }

            if ($$3 == cwq.f) {
               return gcn.a.e;
            }

            if ($$3 == cwq.g) {
               return gcn.a.f;
            }

            if ($$3 == cwq.h) {
               return gcn.a.h;
            }

            if ($$3 == cwq.i) {
               return gcn.a.i;
            }

            if ($$3 == cwq.j) {
               return gcn.a.j;
            }
         } else if (!$$0.aI && $$1.a(cws.wV) && cvf.g($$1)) {
            return gcn.a.g;
         }

         return gcn.a.b;
      }
   }

   public akv c(gzv $$0) {
      return $$0.a.a();
   }

   protected void a(gzv $$0, fft $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gzv $$0, wp $$1, fft $$2, glx $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public gzv b() {
      return new gzv();
   }

   public void a(gks $$0, gzv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsu.a($$0, $$1, $$2, this.i);
      $$1.h = a($$0, bva.a);
      $$1.f = a($$0, bva.b);
      $$1.a = $$0.d();
      $$1.j = $$0.eU();
      $$1.k = $$0.eV();
      $$1.l = $$0.fC();
      $$1.aC = $$0.aI;
      $$1.m = $$0.Z_();
      $$1.n = $$0.a(cox.g);
      $$1.o = $$0.a(cox.b);
      $$1.p = $$0.a(cox.e);
      $$1.q = $$0.a(cox.f);
      $$1.aw = $$0.a(cox.c);
      $$1.ax = $$0.a(cox.d);
      $$1.ay = $$0.a(cox.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         fce $$3 = $$0.gy();
         fbw $$4 = $$3.a(fbv.c);
         if ($$4 != null) {
            fca $$5 = $$3.d($$0, $$4);
            wp $$6 = fca.a($$5, $$4.a(yi.b));
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
      $$1.aH = $$0.gh().getName();
      cwo $$7 = $$0.fB();
      if ($$7.a(cws.rU)) {
         this.i.a($$1.aI, $$7, cwm.f, false, $$0);
      } else {
         $$1.aI.b();
      }
   }

   private static void b(gks $$0, gzv $$1, float $$2) {
      $$1.az = (float)$$0.fK() + $$2;
      faz $$3 = $$0.g($$2);
      faz $$4 = $$0.I($$2);
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

   private static void c(gks $$0, gzv $$1, float $$2) {
      double $$3 = ayz.d((double)$$2, $$0.ck, $$0.cn) - ayz.d((double)$$2, $$0.K, $$0.dA());
      double $$4 = ayz.d((double)$$2, $$0.cl, $$0.co) - ayz.d((double)$$2, $$0.L, $$0.dC());
      double $$5 = ayz.d((double)$$2, $$0.cm, $$0.cp) - ayz.d((double)$$2, $$0.M, $$0.dG());
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
      return bur.a($$2.l("id")).filter($$0x -> $$0x == bur.aO).isPresent() ? chn.b.a($$2.h("Variant")) : null;
   }

   public void a(fft $$0, glx $$1, int $$2, akv $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(fft $$0, glx $$1, int $$2, akv $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(fft $$0, glx $$1, int $$2, akv $$3, gfc $$4, boolean $$5) {
      gdf $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gmh.j($$3)), $$2, heh.d);
   }

   protected void a(gzv $$0, fft $$1, float $$2, float $$3) {
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
