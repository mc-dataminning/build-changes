import javax.annotation.Nullable;

public class gug extends gqb<ghq, gwo, gaf> {
   public gug(gpa.a $$0, boolean $$1) {
      super($$0, new gaf($$0.a($$1 ? gcb.bO : gcb.bI), $$1), 0.5F);
      this.a(new gtd<>(this, new fzm($$0.a($$1 ? gcb.bP : gcb.bM)), new fzm($$0.a($$1 ? gcb.bQ : gcb.bN)), $$0.h()));
      this.a(new gtm<>(this, $$0.b()));
      this.a(new gsj<>(this, $$0));
      this.a(new gst(this, $$0.f()));
      this.a(new gsn(this, $$0.f(), $$0.g()));
      this.a(new gss<>(this, $$0.f(), $$0.b()));
      this.a(new gtz<>(this, $$0.f(), $$0.h()));
      this.a(new gtk(this, $$0.f()));
      this.a(new gtu(this, $$0.f()));
      this.a(new gsk<>(this, $$0));
   }

   protected boolean a(gwo $$0) {
      return !$$0.h;
   }

   public ezr b(gwo $$0) {
      ezr $$1 = super.a($$0);
      return $$0.I ? $$1.b(0.0, (double)($$0.aa * -2.0F) / 16.0, 0.0) : $$1;
   }

   public static fzn.a a(gwo $$0, buy $$1) {
      fzn.a $$2 = a($$0, $$0.aB, bsg.a);
      fzn.a $$3 = a($$0, $$0.aC, bsg.b);
      if ($$2.a()) {
         $$3 = $$0.aC.a ? fzn.a.a : fzn.a.b;
      }

      return $$0.ap == $$1 ? $$2 : $$3;
   }

   private static fzn.a a(gwo $$0, gwo.a $$1, bsg $$2) {
      if ($$1.a) {
         return fzn.a.a;
      } else {
         if ($$0.H == $$2 && $$0.g > 0) {
            cwh $$3 = $$1.b;
            if ($$3 == cwh.d) {
               return fzn.a.c;
            }

            if ($$3 == cwh.e) {
               return fzn.a.d;
            }

            if ($$3 == cwh.f) {
               return fzn.a.e;
            }

            if ($$3 == cwh.g) {
               return fzn.a.f;
            }

            if ($$3 == cwh.h) {
               return fzn.a.h;
            }

            if ($$3 == cwh.i) {
               return fzn.a.i;
            }

            if ($$3 == cwh.j) {
               return fzn.a.j;
            }
         } else if (!$$0.aA && $$1.c) {
            return fzn.a.g;
         }

         return fzn.a.b;
      }
   }

   public all c(gwo $$0) {
      return $$0.a.a();
   }

   protected void a(gwo $$0, fek $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gwo $$0, xl $$1, fek $$2, gix $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public gwo c() {
      return new gwo();
   }

   public void a(ghq $$0, gwo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gpr.a((bve)$$0, (gvt)$$1, $$2);
      $$1.a = $$0.b();
      $$1.e = $$0.eY();
      $$1.f = $$0.eZ();
      $$1.g = $$0.fF();
      $$1.aA = $$0.aI;
      $$1.h = $$0.R_();
      $$1.i = $$0.a(cos.g);
      $$1.j = $$0.a(cos.b);
      $$1.k = $$0.a(cos.e);
      $$1.l = $$0.a(cos.f);
      $$1.au = $$0.a(cos.c);
      $$1.av = $$0.a(cos.d);
      $$1.aw = $$0.a(cos.a);
      b($$0, $$1, $$2);
      this.a($$0, $$1.aB, bsg.a);
      this.a($$0, $$1.aC, bsg.b);
      c($$0, $$1, $$2);
      if ($$1.t < 100.0) {
         faw $$3 = $$0.gB();
         fao $$4 = $$3.a(fan.c);
         if ($$4 != null) {
            fas $$5 = $$3.d($$0, $$4);
            xl $$6 = fas.a($$5, $$4.a(ze.b));
            $$1.aD = xl.i().b($$6).b(xk.v).b($$4.d());
         } else {
            $$1.aD = null;
         }
      } else {
         $$1.aD = null;
      }

      $$1.aE = a($$0, true);
      $$1.aF = a($$0, false);
      $$1.aG = $$0.as();
      $$1.aH = $$0.gk().getName();
   }

   private static void b(ghq $$0, gwo $$1, float $$2) {
      $$1.ax = (float)$$0.fN() + $$2;
      ezr $$3 = $$0.g($$2);
      ezr $$4 = $$0.I($$2);
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

   private void a(ghq $$0, gwo.a $$1, bsg $$2) {
      cwf $$3 = $$0.b($$2);
      $$1.a = $$3.f();
      $$1.b = !$$3.f() ? $$3.w() : null;
      $$1.c = $$3.a(cwj.wn) && cuw.g($$3);
   }

   private static void c(ghq $$0, gwo $$1, float $$2) {
      double $$3 = azn.d((double)$$2, $$0.cj, $$0.cm) - azn.d((double)$$2, $$0.L, $$0.dD());
      double $$4 = azn.d((double)$$2, $$0.ck, $$0.cn) - azn.d((double)$$2, $$0.M, $$0.dF());
      double $$5 = azn.d((double)$$2, $$0.cl, $$0.co) - azn.d((double)$$2, $$0.N, $$0.dJ());
      float $$6 = azn.i($$2, $$0.aY, $$0.aX);
      double $$7 = (double)azn.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azn.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azn.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.c());
      $$1.c = azn.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azn.a($$1.d, -20.0F, 20.0F);
      float $$9 = azn.h($$2, $$0.cg, $$0.ch);
      float $$10 = azn.h($$2, $$0.g, $$0.h);
      $$1.b = $$1.b + azn.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static chl.b a(ghq $$0, boolean $$1) {
      un $$2 = $$1 ? $$0.gD() : $$0.gE();
      return bup.a($$2.l("id")).filter($$0x -> $$0x == bup.ax).isPresent() ? chl.b.a($$2.h("Variant")) : null;
   }

   public void a(fek $$0, gix $$1, int $$2, all $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(fek $$0, gix $$1, int $$2, all $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(fek $$0, gix $$1, int $$2, all $$3, gcc $$4, boolean $$5) {
      gaf $$6 = this.e();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gjh.i($$3)), $$2, gyk.d);
   }

   protected void a(gwo $$0, fek $$1, float $$2, float $$3) {
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
         float $$8 = azn.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.K) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
