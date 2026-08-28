import javax.annotation.Nullable;

public class hdr extends gzl<gqy, hgd, gji> {
   public hdr(gyk.a $$0, boolean $$1) {
      super($$0, new gji($$0.a($$1 ? glf.cy : glf.cs), $$1), 0.5F);
      this.a(new hcn<>(this, new gip($$0.a($$1 ? glf.cz : glf.cw)), new gip($$0.a($$1 ? glf.cA : glf.cx)), $$0.h()));
      this.a(new hcx<>(this));
      this.a(new hbu<>(this, $$0));
      this.a(new hce(this, $$0.f()));
      this.a(new hby(this, $$0.f(), $$0.g()));
      this.a(new hcd<>(this, $$0.f()));
      this.a(new hdk<>(this, $$0.f(), $$0.h()));
      this.a(new hcv(this, $$0.f()));
      this.a(new hdg(this, $$0.f()));
      this.a(new hbv<>(this, $$0));
   }

   protected boolean a(hgd $$0) {
      return !$$0.m;
   }

   public ffs b(hgd $$0) {
      ffs $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static giq.a a(gqy $$0, bxn $$1) {
      daa $$2 = $$0.b(bus.a);
      daa $$3 = $$0.b(bus.b);
      giq.a $$4 = a($$0, $$2, bus.a);
      giq.a $$5 = a($$0, $$3, bus.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? giq.a.a : giq.a.b;
      }

      return $$0.fy() == $$1 ? $$4 : $$5;
   }

   private static giq.a a(crz $$0, daa $$1, bus $$2) {
      if ($$1.f()) {
         return giq.a.a;
      } else if (!$$0.aI && $$1.a(dae.xg) && cyt.g($$1)) {
         return giq.a.g;
      } else {
         if ($$0.fA() == $$2 && $$0.fC() > 0) {
            dac $$3 = $$1.w();
            if ($$3 == dac.d) {
               return giq.a.c;
            }

            if ($$3 == dac.e) {
               return giq.a.d;
            }

            if ($$3 == dac.f) {
               return giq.a.e;
            }

            if ($$3 == dac.g) {
               return giq.a.f;
            }

            if ($$3 == dac.h) {
               return giq.a.h;
            }

            if ($$3 == dac.i) {
               return giq.a.i;
            }

            if ($$3 == dac.j) {
               return giq.a.j;
            }
         }

         return giq.a.b;
      }
   }

   public alk c(hgd $$0) {
      return $$0.a.a();
   }

   protected void a(hgd $$0, flq $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(hgd $$0, xc $$1, flq $$2, gsc $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public hgd b() {
      return new hgd();
   }

   public void a(gqy $$0, hgd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gzb.a($$0, $$1, $$2, this.h);
      $$1.h = a($$0, bxn.a);
      $$1.f = a($$0, bxn.b);
      $$1.a = $$0.c();
      $$1.j = $$0.eW();
      $$1.k = $$0.eX();
      $$1.l = $$0.fC();
      $$1.aC = $$0.aI;
      $$1.m = $$0.Z_();
      $$1.n = $$0.a(csb.g);
      $$1.o = $$0.a(csb.b);
      $$1.p = $$0.a(csb.e);
      $$1.q = $$0.a(csb.f);
      $$1.aw = $$0.a(csb.c);
      $$1.ax = $$0.a(csb.d);
      $$1.ay = $$0.a(csb.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         fgx $$3 = $$0.gz();
         fgp $$4 = $$3.a(fgo.c);
         if ($$4 != null) {
            fgt $$5 = $$3.d($$0, $$4);
            xc $$6 = fgt.a($$5, $$4.a(yv.b));
            $$1.aD = xc.i().b($$6).b(xb.v).b($$4.e());
         } else {
            $$1.aD = null;
         }
      } else {
         $$1.aD = null;
      }

      $$1.aE = a($$0, true);
      $$1.aF = a($$0, false);
      $$1.aG = $$0.ao();
      $$1.aH = $$0.gi().getName();
      $$1.aI.b();
      if ($$1.R) {
         daa $$7 = $$0.b($$1.M);
         if ($$7.a(dae.sf)) {
            this.h.a($$1.aI, $$7, czy.f, (bxw)$$0);
         }
      }
   }

   private static void b(gqy $$0, hgd $$1, float $$2) {
      $$1.az = (float)$$0.fK() + $$2;
      ffs $$3 = $$0.h($$2);
      ffs $$4 = $$0.I($$2);
      if ($$4.j() > 1.0E-5F && $$3.j() > 1.0E-5F) {
         $$1.aA = true;
         double $$5 = $$4.f().d().b($$3.f().d());
         double $$6 = $$4.d * $$3.f - $$4.f * $$3.d;
         $$1.aB = (float)(Math.signum($$6) * Math.acos(Math.min(1.0, Math.abs($$5))));
      } else {
         $$1.aA = false;
         $$1.aB = 0.0F;
      }
   }

   private static void c(gqy $$0, hgd $$1, float $$2) {
      double $$3 = azq.d((double)$$2, $$0.bY, $$0.cb) - azq.d((double)$$2, $$0.K, $$0.dA());
      double $$4 = azq.d((double)$$2, $$0.bZ, $$0.cc) - azq.d((double)$$2, $$0.L, $$0.dC());
      double $$5 = azq.d((double)$$2, $$0.ca, $$0.cd) - azq.d((double)$$2, $$0.M, $$0.dG());
      float $$6 = azq.i($$2, $$0.aW, $$0.aV);
      double $$7 = (double)azq.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azq.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azq.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.b());
      $$1.c = azq.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azq.a($$1.d, -20.0F, 20.0F);
      float $$9 = azq.h($$2, $$0.bV, $$0.bW);
      float $$10 = azq.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + azq.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static ckg.b a(gqy $$0, boolean $$1) {
      ua $$2 = $$1 ? $$0.gB() : $$0.gC();
      if ($$2.j()) {
         return null;
      } else {
         bxe<?> $$3 = $$2.<bxe<?>>a("id", bxe.a).orElse(null);
         return $$3 == bxe.aP ? $$2.<ckg.b>a("Variant", ckg.b.h).orElse(ckg.b.a) : null;
      }
   }

   public void a(flq $$0, gsc $$1, int $$2, alk $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.r, $$4);
   }

   public void b(flq $$0, gsc $$1, int $$2, alk $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.s, $$4);
   }

   private void a(flq $$0, gsc $$1, int $$2, alk $$3, glg $$4, boolean $$5) {
      gji $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gsn.j($$3)), $$2, hks.d);
   }

   protected void a(hgd $$0, flq $$1, float $$2, float $$3) {
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
         float $$8 = azq.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.P) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
