import javax.annotation.Nullable;

public class hbz extends gxu<gpg, hel, ghq> {
   public hbz(gwt.a $$0, boolean $$1) {
      super($$0, new ghq($$0.a($$1 ? gjn.cy : gjn.cs), $$1), 0.5F);
      this.a(new haw<>(this, new ggx($$0.a($$1 ? gjn.cz : gjn.cw)), new ggx($$0.a($$1 ? gjn.cA : gjn.cx)), $$0.h()));
      this.a(new hbg<>(this));
      this.a(new had<>(this, $$0));
      this.a(new han(this, $$0.f()));
      this.a(new hah(this, $$0.f(), $$0.g()));
      this.a(new ham<>(this, $$0.f()));
      this.a(new hbs<>(this, $$0.f(), $$0.h()));
      this.a(new hbe(this, $$0.f()));
      this.a(new hbo(this, $$0.f()));
      this.a(new hae<>(this, $$0));
   }

   protected boolean a(hel $$0) {
      return !$$0.m;
   }

   public fex b(hel $$0) {
      fex $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static ggy.a a(gpg $$0, bxa $$1) {
      czk $$2 = $$0.b(buf.a);
      czk $$3 = $$0.b(buf.b);
      ggy.a $$4 = a($$0, $$2, buf.a);
      ggy.a $$5 = a($$0, $$3, buf.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? ggy.a.a : ggy.a.b;
      }

      return $$0.fx() == $$1 ? $$4 : $$5;
   }

   private static ggy.a a(crj $$0, czk $$1, buf $$2) {
      if ($$1.f()) {
         return ggy.a.a;
      } else if (!$$0.aI && $$1.a(czo.xg) && cyd.g($$1)) {
         return ggy.a.g;
      } else {
         if ($$0.fz() == $$2 && $$0.fB() > 0) {
            czm $$3 = $$1.w();
            if ($$3 == czm.d) {
               return ggy.a.c;
            }

            if ($$3 == czm.e) {
               return ggy.a.d;
            }

            if ($$3 == czm.f) {
               return ggy.a.e;
            }

            if ($$3 == czm.g) {
               return ggy.a.f;
            }

            if ($$3 == czm.h) {
               return ggy.a.h;
            }

            if ($$3 == czm.i) {
               return ggy.a.i;
            }

            if ($$3 == czm.j) {
               return ggy.a.j;
            }
         }

         return ggy.a.b;
      }
   }

   public alg c(hel $$0) {
      return $$0.a.a();
   }

   protected void a(hel $$0, fjy $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(hel $$0, wy $$1, fjy $$2, gqm $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public hel b() {
      return new hel();
   }

   public void a(gpg $$0, hel $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxk.a($$0, $$1, $$2, this.h);
      $$1.h = a($$0, bxa.a);
      $$1.f = a($$0, bxa.b);
      $$1.a = $$0.c();
      $$1.j = $$0.eV();
      $$1.k = $$0.eW();
      $$1.l = $$0.fB();
      $$1.aC = $$0.aI;
      $$1.m = $$0.V_();
      $$1.n = $$0.a(crl.g);
      $$1.o = $$0.a(crl.b);
      $$1.p = $$0.a(crl.e);
      $$1.q = $$0.a(crl.f);
      $$1.aw = $$0.a(crl.c);
      $$1.ax = $$0.a(crl.d);
      $$1.ay = $$0.a(crl.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         fgc $$3 = $$0.gy();
         ffu $$4 = $$3.a(fft.c);
         if ($$4 != null) {
            ffy $$5 = $$3.d($$0, $$4);
            wy $$6 = ffy.a($$5, $$4.a(yr.b));
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
         czk $$7 = $$0.b($$1.M);
         if ($$7.a(czo.sf)) {
            this.h.a($$1.aI, $$7, czi.f, (bxj)$$0);
         }
      }
   }

   private static void b(gpg $$0, hel $$1, float $$2) {
      $$1.az = (float)$$0.fJ() + $$2;
      fex $$3 = $$0.h($$2);
      fex $$4 = $$0.I($$2);
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

   private static void c(gpg $$0, hel $$1, float $$2) {
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
   private static cjt.b a(gpg $$0, boolean $$1) {
      tz $$2 = $$1 ? $$0.gA() : $$0.gB();
      return bwr.a($$2.j("id")).filter($$0x -> $$0x == bwr.aO).isPresent() ? $$2.<cjt.b>a("Variant", cjt.b.g).orElse(cjt.b.a) : null;
   }

   public void a(fjy $$0, gqm $$1, int $$2, alg $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.r, $$4);
   }

   public void b(fjy $$0, gqm $$1, int $$2, alg $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.s, $$4);
   }

   private void a(fjy $$0, gqm $$1, int $$2, alg $$3, gjo $$4, boolean $$5) {
      ghq $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gqx.j($$3)), $$2, hja.d);
   }

   protected void a(hel $$0, fjy $$1, float $$2, float $$3) {
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
