import javax.annotation.Nullable;

public class hcf extends gxz<gpl, her, ghv> {
   public hcf(gwy.a $$0, boolean $$1) {
      super($$0, new ghv($$0.a($$1 ? gjs.cy : gjs.cs), $$1), 0.5F);
      this.a(new hbb<>(this, new ghc($$0.a($$1 ? gjs.cz : gjs.cw)), new ghc($$0.a($$1 ? gjs.cA : gjs.cx)), $$0.h()));
      this.a(new hbl<>(this));
      this.a(new hai<>(this, $$0));
      this.a(new has(this, $$0.f()));
      this.a(new ham(this, $$0.f(), $$0.g()));
      this.a(new har<>(this, $$0.f()));
      this.a(new hby<>(this, $$0.f(), $$0.h()));
      this.a(new hbj(this, $$0.f()));
      this.a(new hbu(this, $$0.f()));
      this.a(new haj<>(this, $$0));
   }

   protected boolean a(her $$0) {
      return !$$0.m;
   }

   public ffc b(her $$0) {
      ffc $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static ghd.a a(gpl $$0, bxa $$1) {
      czn $$2 = $$0.b(buf.a);
      czn $$3 = $$0.b(buf.b);
      ghd.a $$4 = a($$0, $$2, buf.a);
      ghd.a $$5 = a($$0, $$3, buf.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? ghd.a.a : ghd.a.b;
      }

      return $$0.fx() == $$1 ? $$4 : $$5;
   }

   private static ghd.a a(crm $$0, czn $$1, buf $$2) {
      if ($$1.f()) {
         return ghd.a.a;
      } else if (!$$0.aI && $$1.a(czr.xg) && cyg.g($$1)) {
         return ghd.a.g;
      } else {
         if ($$0.fz() == $$2 && $$0.fB() > 0) {
            czp $$3 = $$1.w();
            if ($$3 == czp.d) {
               return ghd.a.c;
            }

            if ($$3 == czp.e) {
               return ghd.a.d;
            }

            if ($$3 == czp.f) {
               return ghd.a.e;
            }

            if ($$3 == czp.g) {
               return ghd.a.f;
            }

            if ($$3 == czp.h) {
               return ghd.a.h;
            }

            if ($$3 == czp.i) {
               return ghd.a.i;
            }

            if ($$3 == czp.j) {
               return ghd.a.j;
            }
         }

         return ghd.a.b;
      }
   }

   public alg c(her $$0) {
      return $$0.a.a();
   }

   protected void a(her $$0, fkd $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(her $$0, wy $$1, fkd $$2, gqr $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public her b() {
      return new her();
   }

   public void a(gpl $$0, her $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxp.a($$0, $$1, $$2, this.h);
      $$1.h = a($$0, bxa.a);
      $$1.f = a($$0, bxa.b);
      $$1.a = $$0.c();
      $$1.j = $$0.eV();
      $$1.k = $$0.eW();
      $$1.l = $$0.fB();
      $$1.aC = $$0.aI;
      $$1.m = $$0.V_();
      $$1.n = $$0.a(cro.g);
      $$1.o = $$0.a(cro.b);
      $$1.p = $$0.a(cro.e);
      $$1.q = $$0.a(cro.f);
      $$1.aw = $$0.a(cro.c);
      $$1.ax = $$0.a(cro.d);
      $$1.ay = $$0.a(cro.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         fgh $$3 = $$0.gy();
         ffz $$4 = $$3.a(ffy.c);
         if ($$4 != null) {
            fgd $$5 = $$3.d($$0, $$4);
            wy $$6 = fgd.a($$5, $$4.a(yr.b));
            $$1.aD = wy.i().b($$6).b(wx.v).b($$4.e());
         } else {
            $$1.aD = null;
         }
      } else {
         $$1.aD = null;
      }

      $$1.aE = a($$0, true);
      $$1.aF = a($$0, false);
      $$1.aG = $$0.ao();
      $$1.aH = $$0.gh().getName();
      $$1.aI.b();
      if ($$1.R) {
         czn $$7 = $$0.b($$1.M);
         if ($$7.a(czr.sf)) {
            this.h.a($$1.aI, $$7, czl.f, (bxj)$$0);
         }
      }
   }

   private static void b(gpl $$0, her $$1, float $$2) {
      $$1.az = (float)$$0.fJ() + $$2;
      ffc $$3 = $$0.h($$2);
      ffc $$4 = $$0.I($$2);
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

   private static void c(gpl $$0, her $$1, float $$2) {
      double $$3 = azm.d((double)$$2, $$0.bY, $$0.cb) - azm.d((double)$$2, $$0.K, $$0.dz());
      double $$4 = azm.d((double)$$2, $$0.bZ, $$0.cc) - azm.d((double)$$2, $$0.L, $$0.dB());
      double $$5 = azm.d((double)$$2, $$0.ca, $$0.cd) - azm.d((double)$$2, $$0.M, $$0.dF());
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
      float $$9 = azm.h($$2, $$0.bV, $$0.bW);
      float $$10 = azm.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + azm.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static cjt.b a(gpl $$0, boolean $$1) {
      tz $$2 = $$1 ? $$0.gA() : $$0.gB();
      return bwr.a($$2.j("id")).filter($$0x -> $$0x == bwr.aO).isPresent() ? $$2.<cjt.b>a("Variant", cjt.b.g).orElse(cjt.b.a) : null;
   }

   public void a(fkd $$0, gqr $$1, int $$2, alg $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.r, $$4);
   }

   public void b(fkd $$0, gqr $$1, int $$2, alg $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.s, $$4);
   }

   private void a(fkd $$0, gqr $$1, int $$2, alg $$3, gjt $$4, boolean $$5) {
      ghv $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(grc.j($$3)), $$2, hjg.d);
   }

   protected void a(her $$0, fkd $$1, float $$2, float $$3) {
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
