import javax.annotation.Nullable;

public class hbn extends gxi<gou, hdz, ghe> {
   public hbn(gwh.a $$0, boolean $$1) {
      super($$0, new ghe($$0.a($$1 ? gjb.cy : gjb.cs), $$1), 0.5F);
      this.a(new hak<>(this, new ggl($$0.a($$1 ? gjb.cz : gjb.cw)), new ggl($$0.a($$1 ? gjb.cA : gjb.cx)), $$0.h()));
      this.a(new hau<>(this));
      this.a(new gzr<>(this, $$0));
      this.a(new hab(this, $$0.f()));
      this.a(new gzv(this, $$0.f(), $$0.g()));
      this.a(new haa<>(this, $$0.f()));
      this.a(new hbg<>(this, $$0.f(), $$0.h()));
      this.a(new has(this, $$0.f()));
      this.a(new hbc(this, $$0.f()));
      this.a(new gzs<>(this, $$0));
   }

   protected boolean a(hdz $$0) {
      return !$$0.m;
   }

   public feq b(hdz $$0) {
      feq $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static ggm.a a(gou $$0, bwx $$1) {
      czd $$2 = $$0.b(buc.a);
      czd $$3 = $$0.b(buc.b);
      ggm.a $$4 = a($$0, $$2, buc.a);
      ggm.a $$5 = a($$0, $$3, buc.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? ggm.a.a : ggm.a.b;
      }

      return $$0.fy() == $$1 ? $$4 : $$5;
   }

   private static ggm.a a(crc $$0, czd $$1, buc $$2) {
      if ($$1.f()) {
         return ggm.a.a;
      } else if (!$$0.aI && $$1.a(czh.xg) && cxw.g($$1)) {
         return ggm.a.g;
      } else {
         if ($$0.fA() == $$2 && $$0.fC() > 0) {
            czf $$3 = $$1.w();
            if ($$3 == czf.d) {
               return ggm.a.c;
            }

            if ($$3 == czf.e) {
               return ggm.a.d;
            }

            if ($$3 == czf.f) {
               return ggm.a.e;
            }

            if ($$3 == czf.g) {
               return ggm.a.f;
            }

            if ($$3 == czf.h) {
               return ggm.a.h;
            }

            if ($$3 == czf.i) {
               return ggm.a.i;
            }

            if ($$3 == czf.j) {
               return ggm.a.j;
            }
         }

         return ggm.a.b;
      }
   }

   public alg c(hdz $$0) {
      return $$0.a.a();
   }

   protected void a(hdz $$0, fjj $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(hdz $$0, wy $$1, fjj $$2, gqa $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public hdz b() {
      return new hdz();
   }

   public void a(gou $$0, hdz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gwy.a($$0, $$1, $$2, this.h);
      $$1.h = a($$0, bwx.a);
      $$1.f = a($$0, bwx.b);
      $$1.a = $$0.c();
      $$1.j = $$0.eW();
      $$1.k = $$0.eX();
      $$1.l = $$0.fC();
      $$1.aC = $$0.aI;
      $$1.m = $$0.V_();
      $$1.n = $$0.a(cre.g);
      $$1.o = $$0.a(cre.b);
      $$1.p = $$0.a(cre.e);
      $$1.q = $$0.a(cre.f);
      $$1.aw = $$0.a(cre.c);
      $$1.ax = $$0.a(cre.d);
      $$1.ay = $$0.a(cre.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         ffv $$3 = $$0.gz();
         ffn $$4 = $$3.a(ffm.c);
         if ($$4 != null) {
            ffr $$5 = $$3.d($$0, $$4);
            wy $$6 = ffr.a($$5, $$4.a(yr.b));
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
      $$1.aH = $$0.gi().getName();
      $$1.aI.b();
      if ($$1.R) {
         czd $$7 = $$0.b($$1.M);
         if ($$7.a(czh.sf)) {
            this.h.a($$1.aI, $$7, czb.f, false, $$0);
         }
      }
   }

   private static void b(gou $$0, hdz $$1, float $$2) {
      $$1.az = (float)$$0.fK() + $$2;
      feq $$3 = $$0.h($$2);
      feq $$4 = $$0.I($$2);
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

   private static void c(gou $$0, hdz $$1, float $$2) {
      double $$3 = azm.d((double)$$2, $$0.bY, $$0.cb) - azm.d((double)$$2, $$0.K, $$0.dA());
      double $$4 = azm.d((double)$$2, $$0.bZ, $$0.cc) - azm.d((double)$$2, $$0.L, $$0.dC());
      double $$5 = azm.d((double)$$2, $$0.ca, $$0.cd) - azm.d((double)$$2, $$0.M, $$0.dG());
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
   private static cjo.b a(gou $$0, boolean $$1) {
      tz $$2 = $$1 ? $$0.gB() : $$0.gC();
      return bwo.a($$2.l("id")).filter($$0x -> $$0x == bwo.aO).isPresent() ? cjo.b.a($$2.h("Variant")) : null;
   }

   public void a(fjj $$0, gqa $$1, int $$2, alg $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.r, $$4);
   }

   public void b(fjj $$0, gqa $$1, int $$2, alg $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.s, $$4);
   }

   private void a(fjj $$0, gqa $$1, int $$2, alg $$3, gjc $$4, boolean $$5) {
      ghe $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gqk.j($$3)), $$2, hin.d);
   }

   protected void a(hdz $$0, fjj $$1, float $$2, float $$3) {
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
