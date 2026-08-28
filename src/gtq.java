import javax.annotation.Nullable;

public class gtq extends gpl<gha, gvy, fzp> {
   public gtq(gok.a $$0, boolean $$1) {
      super($$0, new fzp($$0.a($$1 ? gbl.bO : gbl.bI), $$1), 0.5F);
      this.a(new gsn<>(this, new fyw($$0.a($$1 ? gbl.bP : gbl.bM)), new fyw($$0.a($$1 ? gbl.bQ : gbl.bN)), $$0.h()));
      this.a(new gsw<>(this, $$0.b()));
      this.a(new grt<>(this, $$0));
      this.a(new gsd(this, $$0.f()));
      this.a(new grx(this, $$0.f(), $$0.g()));
      this.a(new gsc<>(this, $$0.f(), $$0.b()));
      this.a(new gtj<>(this, $$0.f(), $$0.h()));
      this.a(new gsu(this, $$0.f()));
      this.a(new gte(this, $$0.f()));
      this.a(new gru<>(this, $$0));
   }

   protected boolean a(gvy $$0) {
      return !$$0.h;
   }

   public ezn b(gvy $$0) {
      ezn $$1 = super.a($$0);
      return $$0.I ? $$1.b(0.0, (double)($$0.aa * -2.0F) / 16.0, 0.0) : $$1;
   }

   public static fyx.a a(gvy $$0, buu $$1) {
      fyx.a $$2 = a($$0, $$0.aB, bsc.a);
      fyx.a $$3 = a($$0, $$0.aC, bsc.b);
      if ($$2.a()) {
         $$3 = $$0.aC.a ? fyx.a.a : fyx.a.b;
      }

      return $$0.ap == $$1 ? $$2 : $$3;
   }

   private static fyx.a a(gvy $$0, gvy.a $$1, bsc $$2) {
      if ($$1.a) {
         return fyx.a.a;
      } else {
         if ($$0.H == $$2 && $$0.g > 0) {
            cwd $$3 = $$1.b;
            if ($$3 == cwd.d) {
               return fyx.a.c;
            }

            if ($$3 == cwd.e) {
               return fyx.a.d;
            }

            if ($$3 == cwd.f) {
               return fyx.a.e;
            }

            if ($$3 == cwd.g) {
               return fyx.a.f;
            }

            if ($$3 == cwd.h) {
               return fyx.a.h;
            }

            if ($$3 == cwd.i) {
               return fyx.a.i;
            }

            if ($$3 == cwd.j) {
               return fyx.a.j;
            }
         } else if (!$$0.aA && $$1.c) {
            return fyx.a.g;
         }

         return fyx.a.b;
      }
   }

   public ali c(gvy $$0) {
      return $$0.a.a();
   }

   protected void a(gvy $$0, feb $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gvy $$0, xi $$1, feb $$2, gih $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public gvy c() {
      return new gvy();
   }

   public void a(gha $$0, gvy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gpb.a((bva)$$0, (gvd)$$1, $$2);
      $$1.a = $$0.b();
      $$1.e = $$0.eX();
      $$1.f = $$0.eY();
      $$1.g = $$0.fE();
      $$1.aA = $$0.aI;
      $$1.h = $$0.R_();
      $$1.i = $$0.a(coo.g);
      $$1.j = $$0.a(coo.b);
      $$1.k = $$0.a(coo.e);
      $$1.l = $$0.a(coo.f);
      $$1.au = $$0.a(coo.c);
      $$1.av = $$0.a(coo.d);
      $$1.aw = $$0.a(coo.a);
      b($$0, $$1, $$2);
      this.a($$0, $$1.aB, bsc.a);
      this.a($$0, $$1.aC, bsc.b);
      c($$0, $$1, $$2);
      if ($$1.t < 100.0) {
         fas $$3 = $$0.gz();
         fak $$4 = $$3.a(faj.c);
         if ($$4 != null) {
            fao $$5 = $$3.d($$0, $$4);
            xi $$6 = fao.a($$5, $$4.a(zb.b));
            $$1.aD = xi.i().b($$6).b(xh.v).b($$4.d());
         } else {
            $$1.aD = null;
         }
      } else {
         $$1.aD = null;
      }

      $$1.aE = a($$0, true);
      $$1.aF = a($$0, false);
      $$1.aG = $$0.as();
      $$1.aH = $$0.gj().getName();
   }

   private static void b(gha $$0, gvy $$1, float $$2) {
      $$1.ax = (float)$$0.fM() + $$2;
      ezn $$3 = $$0.g($$2);
      ezn $$4 = $$0.I($$2);
      double $$5 = $$4.j();
      double $$6 = $$3.j();
      if ($$5 > 0.0 && $$6 > 0.0) {
         $$1.ay = true;
         double $$7 = ($$4.d * $$3.d + $$4.f * $$3.f) / Math.sqrt($$5 * $$6);
         double $$8 = $$4.d * $$3.f - $$4.f * $$3.d;
         $$1.az = (float)(Math.signum($$8) * Math.acos($$7));
      } else {
         $$1.ay = false;
         $$1.az = 0.0F;
      }
   }

   private void a(gha $$0, gvy.a $$1, bsc $$2) {
      cwb $$3 = $$0.b($$2);
      $$1.a = $$3.f();
      $$1.b = !$$3.f() ? $$3.w() : null;
      $$1.c = $$3.a(cwf.vX) && cus.g($$3);
   }

   private static void c(gha $$0, gvy $$1, float $$2) {
      double $$3 = azk.d((double)$$2, $$0.cj, $$0.cm) - azk.d((double)$$2, $$0.L, $$0.dC());
      double $$4 = azk.d((double)$$2, $$0.ck, $$0.cn) - azk.d((double)$$2, $$0.M, $$0.dE());
      double $$5 = azk.d((double)$$2, $$0.cl, $$0.co) - azk.d((double)$$2, $$0.N, $$0.dI());
      float $$6 = azk.i($$2, $$0.aY, $$0.aX);
      double $$7 = (double)azk.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azk.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azk.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.c());
      $$1.c = azk.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azk.a($$1.d, -20.0F, 20.0F);
      float $$9 = azk.h($$2, $$0.cg, $$0.ch);
      float $$10 = azk.h($$2, $$0.g, $$0.h);
      $$1.b = $$1.b + azk.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static chh.b a(gha $$0, boolean $$1) {
      uk $$2 = $$1 ? $$0.gB() : $$0.gC();
      return bul.a($$2.l("id")).filter($$0x -> $$0x == bul.ax).isPresent() ? chh.b.a($$2.h("Variant")) : null;
   }

   public void a(feb $$0, gih $$1, int $$2, ali $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(feb $$0, gih $$1, int $$2, ali $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(feb $$0, gih $$1, int $$2, ali $$3, gbm $$4, boolean $$5) {
      fzp $$6 = this.e();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gir.i($$3)), $$2, gxu.d);
   }

   protected void a(gvy $$0, feb $$1, float $$2, float $$3) {
      float $$4 = $$0.B;
      float $$5 = $$0.V;
      if ($$0.J) {
         super.a($$0, $$1, $$2, $$3);
         float $$6 = $$0.c();
         if (!$$0.ag) {
            $$1.a(a.b.rotationDegrees($$6 * (-90.0F - $$5)));
         }

         if ($$0.ay) {
            $$1.a(a.d.rotation($$0.az));
         }
      } else if ($$4 > 0.0F) {
         super.a($$0, $$1, $$2, $$3);
         float $$7 = $$0.af ? -90.0F - $$5 : -90.0F;
         float $$8 = azk.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.K) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
