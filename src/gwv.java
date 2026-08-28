import javax.annotation.Nullable;

public class gwv extends gsp<gkc, gze, gcp> {
   public gwv(gro.a $$0, boolean $$1) {
      super($$0, new gcp($$0.a($$1 ? gel.ch : gel.cb), $$1), 0.5F);
      this.a(new gvs<>(this, new gbw($$0.a($$1 ? gel.ci : gel.cf)), new gbw($$0.a($$1 ? gel.cj : gel.cg)), $$0.h()));
      this.a(new gwc<>(this, $$0.b()));
      this.a(new guy<>(this, $$0));
      this.a(new gvi(this, $$0.f()));
      this.a(new gvc(this, $$0.f(), $$0.g()));
      this.a(new gvh<>(this, $$0.f(), $$0.b()));
      this.a(new gwo<>(this, $$0.f(), $$0.h()));
      this.a(new gwa(this, $$0.f()));
      this.a(new gwk(this, $$0.f()));
      this.a(new guz<>(this, $$0));
   }

   protected boolean a(gze $$0) {
      return !$$0.h;
   }

   public fbx b(gze $$0) {
      fbx $$1 = super.a($$0);
      return $$0.I ? $$1.b(0.0, (double)($$0.aa * -2.0F) / 16.0, 0.0) : $$1;
   }

   public static gbx.a a(gze $$0, bvz $$1) {
      gbx.a $$2 = a($$0, $$0.aB, bth.a);
      gbx.a $$3 = a($$0, $$0.aC, bth.b);
      if ($$2.a()) {
         $$3 = $$0.aC.a ? gbx.a.a : gbx.a.b;
      }

      return $$0.ap == $$1 ? $$2 : $$3;
   }

   private static gbx.a a(gze $$0, gze.a $$1, bth $$2) {
      if ($$1.a) {
         return gbx.a.a;
      } else {
         if ($$0.H == $$2 && $$0.g > 0) {
            cxq $$3 = $$1.b;
            if ($$3 == cxq.d) {
               return gbx.a.c;
            }

            if ($$3 == cxq.e) {
               return gbx.a.d;
            }

            if ($$3 == cxq.f) {
               return gbx.a.e;
            }

            if ($$3 == cxq.g) {
               return gbx.a.f;
            }

            if ($$3 == cxq.h) {
               return gbx.a.h;
            }

            if ($$3 == cxq.i) {
               return gbx.a.i;
            }

            if ($$3 == cxq.j) {
               return gbx.a.j;
            }
         } else if (!$$0.aA && $$1.c) {
            return gbx.a.g;
         }

         return gbx.a.b;
      }
   }

   public alz c(gze $$0) {
      return $$0.a.a();
   }

   protected void a(gze $$0, fgq $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gze $$0, xv $$1, fgq $$2, glj $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public gze b() {
      return new gze();
   }

   public void a(gkc $$0, gze $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsf.a((bwf)$$0, (gyj)$$1, $$2);
      $$1.a = $$0.d();
      $$1.e = $$0.eT();
      $$1.f = $$0.eU();
      $$1.g = $$0.fA();
      $$1.aA = $$0.aI;
      $$1.h = $$0.aa_();
      $$1.i = $$0.a(cpx.g);
      $$1.j = $$0.a(cpx.b);
      $$1.k = $$0.a(cpx.e);
      $$1.l = $$0.a(cpx.f);
      $$1.au = $$0.a(cpx.c);
      $$1.av = $$0.a(cpx.d);
      $$1.aw = $$0.a(cpx.a);
      b($$0, $$1, $$2);
      this.a($$0, $$1.aB, bth.a);
      this.a($$0, $$1.aC, bth.b);
      c($$0, $$1, $$2);
      if ($$1.t < 100.0) {
         fdc $$3 = $$0.gw();
         fcu $$4 = $$3.a(fct.c);
         if ($$4 != null) {
            fcy $$5 = $$3.d($$0, $$4);
            xv $$6 = fcy.a($$5, $$4.a(zo.b));
            $$1.aD = xv.i().b($$6).b(xu.v).b($$4.d());
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

   private static void b(gkc $$0, gze $$1, float $$2) {
      $$1.ax = (float)$$0.fI() + $$2;
      fbx $$3 = $$0.g($$2);
      fbx $$4 = $$0.I($$2);
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

   private void a(gkc $$0, gze.a $$1, bth $$2) {
      cxo $$3 = $$0.b($$2);
      $$1.a = $$3.f();
      $$1.b = !$$3.f() ? $$3.w() : null;
      $$1.c = $$3.a(cxs.wL) && cwf.g($$3);
   }

   private static void c(gkc $$0, gze $$1, float $$2) {
      double $$3 = bae.d((double)$$2, $$0.cj, $$0.cm) - bae.d((double)$$2, $$0.K, $$0.dA());
      double $$4 = bae.d((double)$$2, $$0.ck, $$0.cn) - bae.d((double)$$2, $$0.L, $$0.dC());
      double $$5 = bae.d((double)$$2, $$0.cl, $$0.co) - bae.d((double)$$2, $$0.M, $$0.dG());
      float $$6 = bae.i($$2, $$0.aY, $$0.aX);
      double $$7 = (double)bae.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-bae.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = bae.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.c());
      $$1.c = bae.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = bae.a($$1.d, -20.0F, 20.0F);
      float $$9 = bae.h($$2, $$0.cg, $$0.ch);
      float $$10 = bae.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + bae.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static cim.b a(gkc $$0, boolean $$1) {
      ux $$2 = $$1 ? $$0.gy() : $$0.gz();
      return bvq.a($$2.l("id")).filter($$0x -> $$0x == bvq.aP).isPresent() ? cim.b.a($$2.h("Variant")) : null;
   }

   public void a(fgq $$0, glj $$1, int $$2, alz $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(fgq $$0, glj $$1, int $$2, alz $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(fgq $$0, glj $$1, int $$2, alz $$3, gem $$4, boolean $$5) {
      gcp $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(glt.i($$3)), $$2, hba.d);
   }

   protected void a(gze $$0, fgq $$1, float $$2, float $$3) {
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
         float $$8 = bae.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.K) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
