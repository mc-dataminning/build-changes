import javax.annotation.Nullable;

public class gur extends gql<ghz, gwz, gao> {
   public gur(gpk.a $$0, boolean $$1) {
      super($$0, new gao($$0.a($$1 ? gck.ce : gck.bY), $$1), 0.5F);
      this.a(new gto<>(this, new fzv($$0.a($$1 ? gck.cf : gck.cc)), new fzv($$0.a($$1 ? gck.cg : gck.cd)), $$0.h()));
      this.a(new gtx<>(this, $$0.b()));
      this.a(new gsu<>(this, $$0));
      this.a(new gte(this, $$0.f()));
      this.a(new gsy(this, $$0.f(), $$0.g()));
      this.a(new gtd<>(this, $$0.f(), $$0.b()));
      this.a(new guk<>(this, $$0.f(), $$0.h()));
      this.a(new gtv(this, $$0.f()));
      this.a(new guf(this, $$0.f()));
      this.a(new gsv<>(this, $$0));
   }

   protected boolean a(gwz $$0) {
      return !$$0.h;
   }

   public ezy b(gwz $$0) {
      ezy $$1 = super.a($$0);
      return $$0.I ? $$1.b(0.0, (double)($$0.aa * -2.0F) / 16.0, 0.0) : $$1;
   }

   public static fzw.a a(gwz $$0, bvb $$1) {
      fzw.a $$2 = a($$0, $$0.aB, bsj.a);
      fzw.a $$3 = a($$0, $$0.aC, bsj.b);
      if ($$2.a()) {
         $$3 = $$0.aC.a ? fzw.a.a : fzw.a.b;
      }

      return $$0.ap == $$1 ? $$2 : $$3;
   }

   private static fzw.a a(gwz $$0, gwz.a $$1, bsj $$2) {
      if ($$1.a) {
         return fzw.a.a;
      } else {
         if ($$0.H == $$2 && $$0.g > 0) {
            cwo $$3 = $$1.b;
            if ($$3 == cwo.d) {
               return fzw.a.c;
            }

            if ($$3 == cwo.e) {
               return fzw.a.d;
            }

            if ($$3 == cwo.f) {
               return fzw.a.e;
            }

            if ($$3 == cwo.g) {
               return fzw.a.f;
            }

            if ($$3 == cwo.h) {
               return fzw.a.h;
            }

            if ($$3 == cwo.i) {
               return fzw.a.i;
            }

            if ($$3 == cwo.j) {
               return fzw.a.j;
            }
         } else if (!$$0.aA && $$1.c) {
            return fzw.a.g;
         }

         return fzw.a.b;
      }
   }

   public alj c(gwz $$0) {
      return $$0.a.a();
   }

   protected void a(gwz $$0, fer $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gwz $$0, xj $$1, fer $$2, gjg $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public gwz b() {
      return new gwz();
   }

   public void a(ghz $$0, gwz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gqb.a((bvh)$$0, (gwe)$$1, $$2);
      $$1.a = $$0.d();
      $$1.e = $$0.eT();
      $$1.f = $$0.eU();
      $$1.g = $$0.fA();
      $$1.aA = $$0.aH;
      $$1.h = $$0.Y_();
      $$1.i = $$0.a(cov.g);
      $$1.j = $$0.a(cov.b);
      $$1.k = $$0.a(cov.e);
      $$1.l = $$0.a(cov.f);
      $$1.au = $$0.a(cov.c);
      $$1.av = $$0.a(cov.d);
      $$1.aw = $$0.a(cov.a);
      b($$0, $$1, $$2);
      this.a($$0, $$1.aB, bsj.a);
      this.a($$0, $$1.aC, bsj.b);
      c($$0, $$1, $$2);
      if ($$1.t < 100.0) {
         fbd $$3 = $$0.gw();
         fav $$4 = $$3.a(fau.c);
         if ($$4 != null) {
            faz $$5 = $$3.d($$0, $$4);
            xj $$6 = faz.a($$5, $$4.a(zc.b));
            $$1.aD = xj.i().b($$6).b(xi.v).b($$4.d());
         } else {
            $$1.aD = null;
         }
      } else {
         $$1.aD = null;
      }

      $$1.aE = a($$0, true);
      $$1.aF = a($$0, false);
      $$1.aG = $$0.ar();
      $$1.aH = $$0.gf().getName();
   }

   private static void b(ghz $$0, gwz $$1, float $$2) {
      $$1.ax = (float)$$0.fI() + $$2;
      ezy $$3 = $$0.g($$2);
      ezy $$4 = $$0.I($$2);
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

   private void a(ghz $$0, gwz.a $$1, bsj $$2) {
      cwm $$3 = $$0.b($$2);
      $$1.a = $$3.f();
      $$1.b = !$$3.f() ? $$3.w() : null;
      $$1.c = $$3.a(cwq.wn) && cvd.g($$3);
   }

   private static void c(ghz $$0, gwz $$1, float $$2) {
      double $$3 = azm.d((double)$$2, $$0.ci, $$0.cl) - azm.d((double)$$2, $$0.K, $$0.dA());
      double $$4 = azm.d((double)$$2, $$0.cj, $$0.cm) - azm.d((double)$$2, $$0.L, $$0.dC());
      double $$5 = azm.d((double)$$2, $$0.ck, $$0.cn) - azm.d((double)$$2, $$0.M, $$0.dG());
      float $$6 = azm.i($$2, $$0.aX, $$0.aW);
      double $$7 = (double)azm.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azm.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azm.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.c());
      $$1.c = azm.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azm.a($$1.d, -20.0F, 20.0F);
      float $$9 = azm.h($$2, $$0.cf, $$0.cg);
      float $$10 = azm.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + azm.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static cho.b a(ghz $$0, boolean $$1) {
      ul $$2 = $$1 ? $$0.gy() : $$0.gz();
      return bus.a($$2.l("id")).filter($$0x -> $$0x == bus.aL).isPresent() ? cho.b.a($$2.h("Variant")) : null;
   }

   public void a(fer $$0, gjg $$1, int $$2, alj $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(fer $$0, gjg $$1, int $$2, alj $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(fer $$0, gjg $$1, int $$2, alj $$3, gcl $$4, boolean $$5) {
      gao $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gjq.i($$3)), $$2, gyv.d);
   }

   protected void a(gwz $$0, fer $$1, float $$2, float $$3) {
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
         float $$8 = azm.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.K) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
