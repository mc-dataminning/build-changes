import javax.annotation.Nullable;

public class hdp extends gzj<gqw, hgb, gjg> {
   public hdp(gyi.a $$0, boolean $$1) {
      super($$0, new gjg($$0.a($$1 ? gld.cy : gld.cs), $$1), 0.5F);
      this.a(new hcl<>(this, new gin($$0.a($$1 ? gld.cz : gld.cw)), new gin($$0.a($$1 ? gld.cA : gld.cx)), $$0.h()));
      this.a(new hcv<>(this));
      this.a(new hbs<>(this, $$0));
      this.a(new hcc(this, $$0.f()));
      this.a(new hbw(this, $$0.f(), $$0.g()));
      this.a(new hcb<>(this, $$0.f()));
      this.a(new hdi<>(this, $$0.f(), $$0.h()));
      this.a(new hct(this, $$0.f()));
      this.a(new hde(this, $$0.f()));
      this.a(new hbt<>(this, $$0));
   }

   protected boolean a(hgb $$0) {
      return !$$0.m;
   }

   public ffq b(hgb $$0) {
      ffq $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static gio.a a(gqw $$0, bxl $$1) {
      czy $$2 = $$0.b(buq.a);
      czy $$3 = $$0.b(buq.b);
      gio.a $$4 = a($$0, $$2, buq.a);
      gio.a $$5 = a($$0, $$3, buq.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? gio.a.a : gio.a.b;
      }

      return $$0.fy() == $$1 ? $$4 : $$5;
   }

   private static gio.a a(crx $$0, czy $$1, buq $$2) {
      if ($$1.f()) {
         return gio.a.a;
      } else if (!$$0.aI && $$1.a(dac.xg) && cyr.g($$1)) {
         return gio.a.g;
      } else {
         if ($$0.fA() == $$2 && $$0.fC() > 0) {
            daa $$3 = $$1.w();
            if ($$3 == daa.d) {
               return gio.a.c;
            }

            if ($$3 == daa.e) {
               return gio.a.d;
            }

            if ($$3 == daa.f) {
               return gio.a.e;
            }

            if ($$3 == daa.g) {
               return gio.a.f;
            }

            if ($$3 == daa.h) {
               return gio.a.h;
            }

            if ($$3 == daa.i) {
               return gio.a.i;
            }

            if ($$3 == daa.j) {
               return gio.a.j;
            }
         }

         return gio.a.b;
      }
   }

   public ali c(hgb $$0) {
      return $$0.a.a();
   }

   protected void a(hgb $$0, flo $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(hgb $$0, xa $$1, flo $$2, gsa $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public hgb b() {
      return new hgb();
   }

   public void a(gqw $$0, hgb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyz.a($$0, $$1, $$2, this.h);
      $$1.h = a($$0, bxl.a);
      $$1.f = a($$0, bxl.b);
      $$1.a = $$0.c();
      $$1.j = $$0.eW();
      $$1.k = $$0.eX();
      $$1.l = $$0.fC();
      $$1.aC = $$0.aI;
      $$1.m = $$0.Z_();
      $$1.n = $$0.a(crz.g);
      $$1.o = $$0.a(crz.b);
      $$1.p = $$0.a(crz.e);
      $$1.q = $$0.a(crz.f);
      $$1.aw = $$0.a(crz.c);
      $$1.ax = $$0.a(crz.d);
      $$1.ay = $$0.a(crz.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         fgv $$3 = $$0.gz();
         fgn $$4 = $$3.a(fgm.c);
         if ($$4 != null) {
            fgr $$5 = $$3.d($$0, $$4);
            xa $$6 = fgr.a($$5, $$4.a(yt.b));
            $$1.aD = xa.i().b($$6).b(wz.v).b($$4.e());
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
         czy $$7 = $$0.b($$1.M);
         if ($$7.a(dac.sf)) {
            this.h.a($$1.aI, $$7, czw.f, (bxu)$$0);
         }
      }
   }

   private static void b(gqw $$0, hgb $$1, float $$2) {
      $$1.az = (float)$$0.fK() + $$2;
      ffq $$3 = $$0.h($$2);
      ffq $$4 = $$0.I($$2);
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

   private static void c(gqw $$0, hgb $$1, float $$2) {
      double $$3 = azo.d((double)$$2, $$0.bY, $$0.cb) - azo.d((double)$$2, $$0.K, $$0.dA());
      double $$4 = azo.d((double)$$2, $$0.bZ, $$0.cc) - azo.d((double)$$2, $$0.L, $$0.dC());
      double $$5 = azo.d((double)$$2, $$0.ca, $$0.cd) - azo.d((double)$$2, $$0.M, $$0.dG());
      float $$6 = azo.i($$2, $$0.aW, $$0.aV);
      double $$7 = (double)azo.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azo.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azo.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.b());
      $$1.c = azo.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azo.a($$1.d, -20.0F, 20.0F);
      float $$9 = azo.h($$2, $$0.bV, $$0.bW);
      float $$10 = azo.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + azo.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static cke.b a(gqw $$0, boolean $$1) {
      tz $$2 = $$1 ? $$0.gB() : $$0.gC();
      if ($$2.j()) {
         return null;
      } else {
         bxc<?> $$3 = $$2.<bxc<?>>a("id", bxc.a).orElse(null);
         return $$3 == bxc.aP ? $$2.<cke.b>a("Variant", cke.b.h).orElse(cke.b.a) : null;
      }
   }

   public void a(flo $$0, gsa $$1, int $$2, ali $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.r, $$4);
   }

   public void b(flo $$0, gsa $$1, int $$2, ali $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.s, $$4);
   }

   private void a(flo $$0, gsa $$1, int $$2, ali $$3, gle $$4, boolean $$5) {
      gjg $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gsl.j($$3)), $$2, hkq.d);
   }

   protected void a(hgb $$0, flo $$1, float $$2, float $$3) {
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
         float $$8 = azo.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.P) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
