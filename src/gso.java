import javax.annotation.Nullable;

public class gso extends gok<gfz, guw, fyp> {
   public gso(gnj.a $$0, boolean $$1) {
      super($$0, new fyp($$0.a($$1 ? gak.bO : gak.bI), $$1), 0.5F);
      this.a(new grm<>(this, new fxw($$0.a($$1 ? gak.bP : gak.bM)), new fxw($$0.a($$1 ? gak.bQ : gak.bN)), $$0.g()));
      this.a(new grv<>(this, $$0.b()));
      this.a(new gqs<>(this, $$0));
      this.a(new grc(this, $$0.f()));
      this.a(new gqw(this, $$0.f()));
      this.a(new grb<>(this, $$0.f(), $$0.b()));
      this.a(new grf<>(this, $$0.f()));
      this.a(new grt(this, $$0.f()));
      this.a(new gsd(this, $$0.f()));
      this.a(new gqt<>(this, $$0));
   }

   protected boolean a(guw $$0) {
      return !$$0.h;
   }

   public eys b(guw $$0) {
      eys $$1 = super.b($$0);
      return $$0.I ? $$1.b(0.0, (double)($$0.aa * -2.0F) / 16.0, 0.0) : $$1;
   }

   public static fxx.a a(guw $$0, guw.a $$1, bro $$2) {
      if ($$1.a) {
         return fxx.a.a;
      } else {
         if ($$0.H == $$2 && $$0.g > 0) {
            cvr $$3 = $$1.b;
            if ($$3 == cvr.d) {
               return fxx.a.c;
            }

            if ($$3 == cvr.e) {
               return fxx.a.d;
            }

            if ($$3 == cvr.f) {
               return fxx.a.e;
            }

            if ($$3 == cvr.g) {
               return fxx.a.f;
            }

            if ($$3 == cvr.h) {
               return fxx.a.h;
            }

            if ($$3 == cvr.i) {
               return fxx.a.i;
            }

            if ($$3 == cvr.j) {
               return fxx.a.j;
            }
         } else if (!$$0.aA && $$1.c) {
            return fxx.a.g;
         }

         return fxx.a.b;
      }
   }

   public alc c(guw $$0) {
      return $$0.a.a();
   }

   protected void a(guw $$0, fde $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(guw $$0, xd $$1, fde $$2, ghg $$3, int $$4) {
      if ($$0.aD != null) {
         $$2.a();
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         $$2.b();
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public guw c() {
      return new guw();
   }

   public void a(gfz $$0, guw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      goa.a((buk)$$0, (gub)$$1, $$2);
      $$1.a = $$0.b();
      $$1.e = $$0.eS();
      $$1.f = $$0.eT();
      $$1.g = $$0.fy();
      $$1.aA = $$0.aE;
      $$1.h = $$0.P_();
      $$1.i = $$0.a(cnv.g);
      $$1.j = $$0.a(cnv.b);
      $$1.k = $$0.a(cnv.e);
      $$1.l = $$0.a(cnv.f);
      $$1.au = $$0.a(cnv.c);
      $$1.av = $$0.a(cnv.d);
      $$1.aw = $$0.a(cnv.a);
      b($$0, $$1, $$2);
      this.a($$0, $$1.aB, bro.a);
      this.a($$0, $$1.aC, bro.b);
      c($$0, $$1, $$2);
      if ($$1.t < 100.0) {
         ezx $$3 = $$0.gr();
         ezp $$4 = $$3.a(ezo.c);
         if ($$4 != null) {
            ezt $$5 = $$3.d($$0, $$4);
            xd $$6 = ezt.a($$5, $$4.a(yw.b));
            $$1.aD = xd.i().b($$6).b(xc.v).b($$4.d());
         } else {
            $$1.aD = null;
         }
      } else {
         $$1.aD = null;
      }

      $$1.aE = a($$0, true);
      $$1.aF = a($$0, false);
      $$1.aG = $$0.ap();
      $$1.aH = $$0.gb().getName();
   }

   private static void b(gfz $$0, guw $$1, float $$2) {
      $$1.ax = (float)$$0.fG() + $$2;
      eys $$3 = $$0.g($$2);
      eys $$4 = $$0.I($$2);
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

   private void a(gfz $$0, guw.a $$1, bro $$2) {
      cvp $$3 = $$0.b($$2);
      $$1.a = $$3.f();
      $$1.b = !$$3.f() ? $$3.w() : null;
      $$1.c = $$3.a(cvt.vX) && cud.g($$3);
   }

   private static void c(gfz $$0, guw $$1, float $$2) {
      double $$3 = azd.d((double)$$2, $$0.cf, $$0.ci) - azd.d((double)$$2, $$0.L, $$0.dx());
      double $$4 = azd.d((double)$$2, $$0.cg, $$0.cj) - azd.d((double)$$2, $$0.M, $$0.dz());
      double $$5 = azd.d((double)$$2, $$0.ch, $$0.ck) - azd.d((double)$$2, $$0.N, $$0.dD());
      float $$6 = azd.i($$2, $$0.aU, $$0.aT);
      double $$7 = (double)azd.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azd.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azd.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = azd.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azd.a($$1.d, -20.0F, 20.0F);
      float $$9 = azd.h($$2, $$0.cc, $$0.cd);
      float $$10 = azd.h($$2, $$0.g, $$0.h);
      $$1.b = $$1.b + azd.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static cgq.b a(gfz $$0, boolean $$1) {
      uf $$2 = $$1 ? $$0.gt() : $$0.gu();
      return btv.a($$2.l("id")).filter($$0x -> $$0x == btv.ax).isPresent() ? cgq.b.a($$2.h("Variant")) : null;
   }

   public void a(fde $$0, ghg $$1, int $$2, alc $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(fde $$0, ghg $$1, int $$2, alc $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(fde $$0, ghg $$1, int $$2, alc $$3, gal $$4, boolean $$5) {
      fyp $$6 = this.e();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(ghq.i($$3)), $$2, gws.d);
   }

   protected void a(guw $$0, fde $$1, float $$2, float $$3) {
      float $$4 = $$0.B;
      float $$5 = $$0.V;
      if ($$0.J) {
         super.a($$0, $$1, $$2, $$3);
         float $$6 = azd.a($$0.ax * $$0.ax / 100.0F, 0.0F, 1.0F);
         if (!$$0.ag) {
            $$1.a(a.b.rotationDegrees($$6 * (-90.0F - $$5)));
         }

         if ($$0.ay) {
            $$1.a(a.d.rotation($$0.az));
         }
      } else if ($$4 > 0.0F) {
         super.a($$0, $$1, $$2, $$3);
         float $$7 = $$0.af ? -90.0F - $$5 : -90.0F;
         float $$8 = azd.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.K) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
