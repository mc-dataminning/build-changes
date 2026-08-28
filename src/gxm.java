import javax.annotation.Nullable;

public class gxm extends gtg<gku, gzx, gdh> {
   public gxm(gsf.a $$0, boolean $$1) {
      super($$0, new gdh($$0.a($$1 ? gfd.ck : gfd.ce), $$1), 0.5F);
      this.a(new gwj<>(this, new gco($$0.a($$1 ? gfd.cl : gfd.ci)), new gco($$0.a($$1 ? gfd.cm : gfd.cj)), $$0.h()));
      this.a(new gwt<>(this));
      this.a(new gvp<>(this, $$0));
      this.a(new gvz(this, $$0.f()));
      this.a(new gvt(this, $$0.f(), $$0.g()));
      this.a(new gvy<>(this, $$0.f()));
      this.a(new gxf<>(this, $$0.f(), $$0.h()));
      this.a(new gwr(this, $$0.f()));
      this.a(new gxb(this, $$0.f()));
      this.a(new gvq<>(this, $$0));
   }

   protected boolean a(gzx $$0) {
      return !$$0.m;
   }

   public fbb b(gzx $$0) {
      fbb $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static gcp.a a(gku $$0, bvc $$1) {
      cwq $$2 = $$0.b(bsk.a);
      cwq $$3 = $$0.b(bsk.b);
      gcp.a $$4 = a($$0, $$2, bsk.a);
      gcp.a $$5 = a($$0, $$3, bsk.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? gcp.a.a : gcp.a.b;
      }

      return $$0.fy() == $$1 ? $$4 : $$5;
   }

   private static gcp.a a(coy $$0, cwq $$1, bsk $$2) {
      if ($$1.f()) {
         return gcp.a.a;
      } else {
         if ($$0.fA() == $$2 && $$0.fC() > 0) {
            cws $$3 = $$1.w();
            if ($$3 == cws.d) {
               return gcp.a.c;
            }

            if ($$3 == cws.e) {
               return gcp.a.d;
            }

            if ($$3 == cws.f) {
               return gcp.a.e;
            }

            if ($$3 == cws.g) {
               return gcp.a.f;
            }

            if ($$3 == cws.h) {
               return gcp.a.h;
            }

            if ($$3 == cws.i) {
               return gcp.a.i;
            }

            if ($$3 == cws.j) {
               return gcp.a.j;
            }
         } else if (!$$0.aI && $$1.a(cwu.wV) && cvh.g($$1)) {
            return gcp.a.g;
         }

         return gcp.a.b;
      }
   }

   public akv c(gzx $$0) {
      return $$0.a.a();
   }

   protected void a(gzx $$0, ffv $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gzx $$0, wp $$1, ffv $$2, glz $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public gzx b() {
      return new gzx();
   }

   public void a(gku $$0, gzx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsw.a($$0, $$1, $$2, this.i);
      $$1.h = a($$0, bvc.a);
      $$1.f = a($$0, bvc.b);
      $$1.a = $$0.d();
      $$1.j = $$0.eU();
      $$1.k = $$0.eV();
      $$1.l = $$0.fC();
      $$1.aC = $$0.aI;
      $$1.m = $$0.Z_();
      $$1.n = $$0.a(coz.g);
      $$1.o = $$0.a(coz.b);
      $$1.p = $$0.a(coz.e);
      $$1.q = $$0.a(coz.f);
      $$1.aw = $$0.a(coz.c);
      $$1.ax = $$0.a(coz.d);
      $$1.ay = $$0.a(coz.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         fcg $$3 = $$0.gy();
         fby $$4 = $$3.a(fbx.c);
         if ($$4 != null) {
            fcc $$5 = $$3.d($$0, $$4);
            wp $$6 = fcc.a($$5, $$4.a(yi.b));
            $$1.aD = wp.i().b($$6).b(wo.v).b($$4.d());
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
      $$1.aI.b();
      if ($$1.R) {
         cwq $$7 = $$0.b($$1.M);
         if ($$7.a(cwu.rU)) {
            this.i.a($$1.aI, $$7, cwo.f, false, $$0);
         }
      }
   }

   private static void b(gku $$0, gzx $$1, float $$2) {
      $$1.az = (float)$$0.fK() + $$2;
      fbb $$3 = $$0.g($$2);
      fbb $$4 = $$0.I($$2);
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

   private static void c(gku $$0, gzx $$1, float $$2) {
      double $$3 = ayz.d((double)$$2, $$0.ck, $$0.cn) - ayz.d((double)$$2, $$0.K, $$0.dA());
      double $$4 = ayz.d((double)$$2, $$0.cl, $$0.co) - ayz.d((double)$$2, $$0.L, $$0.dC());
      double $$5 = ayz.d((double)$$2, $$0.cm, $$0.cp) - ayz.d((double)$$2, $$0.M, $$0.dG());
      float $$6 = ayz.i($$2, $$0.aY, $$0.aX);
      double $$7 = (double)ayz.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-ayz.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = ayz.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.b());
      $$1.c = ayz.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = ayz.a($$1.d, -20.0F, 20.0F);
      float $$9 = ayz.h($$2, $$0.ch, $$0.ci);
      float $$10 = ayz.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + ayz.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static chp.b a(gku $$0, boolean $$1) {
      tq $$2 = $$1 ? $$0.gA() : $$0.gB();
      return but.a($$2.l("id")).filter($$0x -> $$0x == but.aO).isPresent() ? chp.b.a($$2.h("Variant")) : null;
   }

   public void a(ffv $$0, glz $$1, int $$2, akv $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(ffv $$0, glz $$1, int $$2, akv $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(ffv $$0, glz $$1, int $$2, akv $$3, gfe $$4, boolean $$5) {
      gdh $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gmj.j($$3)), $$2, hej.d);
   }

   protected void a(gzx $$0, ffv $$1, float $$2, float $$3) {
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
         float $$8 = ayz.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.P) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
