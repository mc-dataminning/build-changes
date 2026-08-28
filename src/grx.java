import javax.annotation.Nullable;

public class grx extends gnt<gfp, guf, fyf> {
   public grx(gms.a $$0, boolean $$1) {
      super($$0, new fyf($$0.a($$1 ? gaa.bN : gaa.bH), $$1), 0.5F);
      this.a(new gqv<>(this, new fxm($$0.a($$1 ? gaa.bO : gaa.bL)), new fxm($$0.a($$1 ? gaa.bP : gaa.bM)), $$0.g()));
      this.a(new gre<>(this, $$0.b()));
      this.a(new gqb<>(this, $$0));
      this.a(new gql(this, $$0.f()));
      this.a(new gqf(this, $$0.f()));
      this.a(new gqk<>(this, $$0.f(), $$0.b()));
      this.a(new gqo<>(this, $$0.f()));
      this.a(new grc(this, $$0.f()));
      this.a(new grm(this, $$0.f()));
      this.a(new gqc<>(this, $$0));
   }

   protected boolean a(guf $$0) {
      return !$$0.h;
   }

   public eye b(guf $$0) {
      eye $$1 = super.b($$0);
      return $$0.I ? $$1.b(0.0, (double)($$0.aa * -2.0F) / 16.0, 0.0) : $$1;
   }

   public static fxn.a a(guf $$0, guf.a $$1, brj $$2) {
      if ($$1.a) {
         return fxn.a.a;
      } else {
         if ($$0.H == $$2 && $$0.g > 0) {
            cxh $$3 = $$1.b;
            if ($$3 == cxh.d) {
               return fxn.a.c;
            }

            if ($$3 == cxh.e) {
               return fxn.a.d;
            }

            if ($$3 == cxh.f) {
               return fxn.a.e;
            }

            if ($$3 == cxh.g) {
               return fxn.a.f;
            }

            if ($$3 == cxh.h) {
               return fxn.a.h;
            }

            if ($$3 == cxh.i) {
               return fxn.a.i;
            }

            if ($$3 == cxh.j) {
               return fxn.a.j;
            }
         } else if (!$$0.aB && $$1.c) {
            return fxn.a.g;
         }

         return fxn.a.b;
      }
   }

   public alb c(guf $$0) {
      return $$0.a.a();
   }

   protected void a(guf $$0, fcu $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(guf $$0, xd $$1, fcu $$2, ggv $$3, int $$4) {
      if ($$0.aE != null) {
         $$2.a();
         super.a($$0, $$0.aE, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         $$2.b();
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public guf c() {
      return new guf();
   }

   public void a(gfp $$0, guf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gnj.a((buf)$$0, (gtk)$$1, $$2);
      $$1.a = $$0.b();
      $$1.e = $$0.eS();
      $$1.f = $$0.eT();
      $$1.g = $$0.fy();
      $$1.aB = $$0.aF;
      $$1.ax = $$0.ci();
      $$1.h = $$0.P_();
      $$1.i = $$0.a(cnq.g);
      $$1.j = $$0.a(cnq.b);
      $$1.k = $$0.a(cnq.e);
      $$1.l = $$0.a(cnq.f);
      $$1.au = $$0.a(cnq.c);
      $$1.av = $$0.a(cnq.d);
      $$1.aw = $$0.a(cnq.a);
      b($$0, $$1, $$2);
      this.a($$0, $$1.aC, brj.a);
      this.a($$0, $$1.aD, brj.b);
      c($$0, $$1, $$2);
      if ($$1.t < 100.0) {
         ezi $$3 = $$0.gr();
         eza $$4 = $$3.a(eyz.c);
         if ($$4 != null) {
            eze $$5 = $$3.d($$0, $$4);
            xd $$6 = eze.a($$5, $$4.a(yw.b));
            $$1.aE = xd.i().b($$6).b(xc.v).b($$4.d());
         } else {
            $$1.aE = null;
         }
      } else {
         $$1.aE = null;
      }

      $$1.aF = a($$0, true);
      $$1.aG = a($$0, false);
      $$1.aH = $$0.ap();
      $$1.aI = $$0.gb().getName();
   }

   private static void b(gfp $$0, guf $$1, float $$2) {
      $$1.ay = (float)$$0.fF() + $$2;
      eye $$3 = $$0.g($$2);
      eye $$4 = $$0.I($$2);
      double $$5 = $$4.j();
      double $$6 = $$3.j();
      if ($$5 > 0.0 && $$6 > 0.0) {
         $$1.az = true;
         double $$7 = ($$4.d * $$3.d + $$4.f * $$3.f) / Math.sqrt($$5 * $$6);
         double $$8 = $$4.d * $$3.f - $$4.f * $$3.d;
         $$1.aA = (float)(Math.signum($$8) * Math.acos($$7));
      } else {
         $$1.az = false;
         $$1.aA = 0.0F;
      }
   }

   private void a(gfp $$0, guf.a $$1, brj $$2) {
      cvl $$3 = $$0.b($$2);
      $$1.a = $$3.f();
      $$1.b = !$$3.f() ? $$3.w() : null;
      $$1.c = $$3.a(cvo.vX) && cty.h($$3);
   }

   private static void c(gfp $$0, guf $$1, float $$2) {
      double $$3 = azc.d((double)$$2, $$0.cg, $$0.cj) - azc.d((double)$$2, $$0.L, $$0.dx());
      double $$4 = azc.d((double)$$2, $$0.ch, $$0.ck) - azc.d((double)$$2, $$0.M, $$0.dz());
      double $$5 = azc.d((double)$$2, $$0.ci, $$0.cl) - azc.d((double)$$2, $$0.N, $$0.dD());
      float $$6 = azc.i($$2, $$0.aV, $$0.aU);
      double $$7 = (double)azc.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azc.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azc.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = azc.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azc.a($$1.d, -20.0F, 20.0F);
      float $$9 = azc.h($$2, $$0.cd, $$0.ce);
      float $$10 = azc.h($$2, $$0.g, $$0.h);
      $$1.b = $$1.b + azc.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static cgl.b a(gfp $$0, boolean $$1) {
      uf $$2 = $$1 ? $$0.gt() : $$0.gu();
      return btq.a($$2.l("id")).filter($$0x -> $$0x == btq.ax).isPresent() ? cgl.b.a($$2.h("Variant")) : null;
   }

   public void a(fcu $$0, ggv $$1, int $$2, alb $$3) {
      this.a($$0, $$1, $$2, $$3, this.h.r);
   }

   public void b(fcu $$0, ggv $$1, int $$2, alb $$3) {
      this.a($$0, $$1, $$2, $$3, this.h.s);
   }

   private void a(fcu $$0, ggv $$1, int $$2, alb $$3, gab $$4) {
      fyf $$5 = this.e();
      $$5.s.c();
      $$5.r.c();
      $$5.s.g = -0.1F;
      $$5.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(ghe.j($$3)), $$2, gwb.d);
   }

   protected void a(guf $$0, fcu $$1, float $$2, float $$3) {
      float $$4 = $$0.B;
      float $$5 = $$0.V;
      if ($$0.J) {
         super.a($$0, $$1, $$2, $$3);
         float $$6 = azc.a($$0.ay * $$0.ay / 100.0F, 0.0F, 1.0F);
         if (!$$0.ag) {
            $$1.a(a.b.rotationDegrees($$6 * (-90.0F - $$5)));
         }

         if ($$0.az) {
            $$1.a(a.d.rotation($$0.aA));
         }
      } else if ($$4 > 0.0F) {
         super.a($$0, $$1, $$2, $$3);
         float $$7 = $$0.af ? -90.0F - $$5 : -90.0F;
         float $$8 = azc.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.ax) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
