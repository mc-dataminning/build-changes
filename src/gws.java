import javax.annotation.Nullable;

public class gws extends gsm<gjz, gzb, gcm> {
   public gws(grl.a $$0, boolean $$1) {
      super($$0, new gcm($$0.a($$1 ? gei.ck : gei.ce), $$1), 0.5F);
      this.a(new gvp<>(this, new gbt($$0.a($$1 ? gei.cl : gei.ci)), new gbt($$0.a($$1 ? gei.cm : gei.cj)), $$0.h()));
      this.a(new gvz<>(this, $$0.b()));
      this.a(new guv<>(this, $$0));
      this.a(new gvf(this, $$0.f()));
      this.a(new guz(this, $$0.f(), $$0.g()));
      this.a(new gve<>(this, $$0.f(), $$0.b()));
      this.a(new gwl<>(this, $$0.f(), $$0.h()));
      this.a(new gvx(this, $$0.f()));
      this.a(new gwh(this, $$0.f()));
      this.a(new guw<>(this, $$0));
   }

   protected boolean a(gzb $$0) {
      return !$$0.h;
   }

   public fbr b(gzb $$0) {
      fbr $$1 = super.a($$0);
      return $$0.I ? $$1.b(0.0, (double)($$0.aa * -2.0F) / 16.0, 0.0) : $$1;
   }

   public static gbu.a a(gzb $$0, bvr $$1) {
      gbu.a $$2 = a($$0, $$0.aB, bsz.a);
      gbu.a $$3 = a($$0, $$0.aC, bsz.b);
      if ($$2.a()) {
         $$3 = $$0.aC.a ? gbu.a.a : gbu.a.b;
      }

      return $$0.ap == $$1 ? $$2 : $$3;
   }

   private static gbu.a a(gzb $$0, gzb.a $$1, bsz $$2) {
      if ($$1.a) {
         return gbu.a.a;
      } else {
         if ($$0.H == $$2 && $$0.g > 0) {
            cxi $$3 = $$1.b;
            if ($$3 == cxi.d) {
               return gbu.a.c;
            }

            if ($$3 == cxi.e) {
               return gbu.a.d;
            }

            if ($$3 == cxi.f) {
               return gbu.a.e;
            }

            if ($$3 == cxi.g) {
               return gbu.a.f;
            }

            if ($$3 == cxi.h) {
               return gbu.a.h;
            }

            if ($$3 == cxi.i) {
               return gbu.a.i;
            }

            if ($$3 == cxi.j) {
               return gbu.a.j;
            }
         } else if (!$$0.aA && $$1.c) {
            return gbu.a.g;
         }

         return gbu.a.b;
      }
   }

   public alp c(gzb $$0) {
      return $$0.a.a();
   }

   protected void a(gzb $$0, fgl $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gzb $$0, xk $$1, fgl $$2, glg $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public gzb b() {
      return new gzb();
   }

   public void a(gjz $$0, gzb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsc.a((bvx)$$0, (gyg)$$1, $$2);
      $$1.a = $$0.d();
      $$1.e = $$0.eU();
      $$1.f = $$0.eV();
      $$1.g = $$0.fC();
      $$1.aA = $$0.aI;
      $$1.h = $$0.aa_();
      $$1.i = $$0.a(cpp.g);
      $$1.j = $$0.a(cpp.b);
      $$1.k = $$0.a(cpp.e);
      $$1.l = $$0.a(cpp.f);
      $$1.au = $$0.a(cpp.c);
      $$1.av = $$0.a(cpp.d);
      $$1.aw = $$0.a(cpp.a);
      b($$0, $$1, $$2);
      this.a($$0, $$1.aB, bsz.a);
      this.a($$0, $$1.aC, bsz.b);
      c($$0, $$1, $$2);
      if ($$1.t < 100.0) {
         fcw $$3 = $$0.gy();
         fco $$4 = $$3.a(fcn.c);
         if ($$4 != null) {
            fcs $$5 = $$3.d($$0, $$4);
            xk $$6 = fcs.a($$5, $$4.a(zd.b));
            $$1.aD = xk.i().b($$6).b(xj.v).b($$4.d());
         } else {
            $$1.aD = null;
         }
      } else {
         $$1.aD = null;
      }

      $$1.aE = a($$0, true);
      $$1.aF = a($$0, false);
      $$1.aG = $$0.ar();
      $$1.aH = $$0.gh().getName();
   }

   private static void b(gjz $$0, gzb $$1, float $$2) {
      $$1.ax = (float)$$0.fK() + $$2;
      fbr $$3 = $$0.g($$2);
      fbr $$4 = $$0.I($$2);
      double $$5 = $$4.j();
      double $$6 = $$3.j();
      if ($$5 > 0.0 && $$6 > 0.0) {
         $$1.ay = true;
         double $$7 = Math.min(1.0, ($$4.d * $$3.d + $$4.f * $$3.f) / Math.sqrt($$5 * $$6));
         double $$8 = $$4.d * $$3.f - $$4.f * $$3.d;
         $$1.az = (float)(Math.signum($$8) * Math.acos($$7));
      } else {
         $$1.ay = false;
         $$1.az = 0.0F;
      }
   }

   private void a(gjz $$0, gzb.a $$1, bsz $$2) {
      cxg $$3 = $$0.b($$2);
      $$1.a = $$3.f();
      $$1.b = !$$3.f() ? $$3.w() : null;
      $$1.c = $$3.a(cxk.wV) && cvx.g($$3);
   }

   private static void c(gjz $$0, gzb $$1, float $$2) {
      double $$3 = azu.d((double)$$2, $$0.cj, $$0.cm) - azu.d((double)$$2, $$0.K, $$0.dB());
      double $$4 = azu.d((double)$$2, $$0.ck, $$0.cn) - azu.d((double)$$2, $$0.L, $$0.dD());
      double $$5 = azu.d((double)$$2, $$0.cl, $$0.co) - azu.d((double)$$2, $$0.M, $$0.dH());
      float $$6 = azu.i($$2, $$0.aY, $$0.aX);
      double $$7 = (double)azu.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azu.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azu.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.c());
      $$1.c = azu.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azu.a($$1.d, -20.0F, 20.0F);
      float $$9 = azu.h($$2, $$0.cg, $$0.ch);
      float $$10 = azu.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + azu.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static cie.b a(gjz $$0, boolean $$1) {
      um $$2 = $$1 ? $$0.gA() : $$0.gB();
      return bvi.a($$2.l("id")).filter($$0x -> $$0x == bvi.aP).isPresent() ? cie.b.a($$2.h("Variant")) : null;
   }

   public void a(fgl $$0, glg $$1, int $$2, alp $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(fgl $$0, glg $$1, int $$2, alp $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(fgl $$0, glg $$1, int $$2, alp $$3, gej $$4, boolean $$5) {
      gcm $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(glq.j($$3)), $$2, hax.d);
   }

   protected void a(gzb $$0, fgl $$1, float $$2, float $$3) {
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
         float $$8 = azu.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.K) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
