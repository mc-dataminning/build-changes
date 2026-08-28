import javax.annotation.Nullable;

public class hdc extends gyw<gqj, hfq, git> {
   public hdc(gxv.a $$0, boolean $$1) {
      super($$0, new git($$0.a($$1 ? gkq.cy : gkq.cs), $$1), 0.5F);
      this.a(new hby<>(this, new gia($$0.a($$1 ? gkq.cz : gkq.cw)), new gia($$0.a($$1 ? gkq.cA : gkq.cx)), $$0.h()));
      this.a(new hci<>(this));
      this.a(new hbf<>(this, $$0));
      this.a(new hbp(this, $$0.f()));
      this.a(new hbj(this, $$0.f(), $$0.g()));
      this.a(new hbo<>(this, $$0.f()));
      this.a(new hcv<>(this, $$0.f(), $$0.h()));
      this.a(new hcg(this, $$0.f()));
      this.a(new hcr(this, $$0.f()));
      this.a(new hbg<>(this, $$0));
   }

   protected boolean a(hfq $$0) {
      return !$$0.m;
   }

   public fgc b(hfq $$0) {
      fgc $$1 = super.a($$0);
      return $$0.Q ? $$1.b(0.0, (double)($$0.ai * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static gib.a a(gqj $$0, bxw $$1) {
      dak $$2 = $$0.b(bvb.a);
      dak $$3 = $$0.b(bvb.b);
      gib.a $$4 = a($$0, $$2, bvb.a);
      gib.a $$5 = a($$0, $$3, bvb.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? gib.a.a : gib.a.b;
      }

      return $$0.fy() == $$1 ? $$4 : $$5;
   }

   private static gib.a a(csi $$0, dak $$1, bvb $$2) {
      if ($$1.f()) {
         return gib.a.a;
      } else if (!$$0.aI && $$1.a(dao.xg) && czd.g($$1)) {
         return gib.a.g;
      } else {
         if ($$0.fA() == $$2 && $$0.fC() > 0) {
            dam $$3 = $$1.w();
            if ($$3 == dam.d) {
               return gib.a.c;
            }

            if ($$3 == dam.e) {
               return gib.a.d;
            }

            if ($$3 == dam.f) {
               return gib.a.e;
            }

            if ($$3 == dam.g) {
               return gib.a.f;
            }

            if ($$3 == dam.h) {
               return gib.a.h;
            }

            if ($$3 == dam.i) {
               return gib.a.i;
            }

            if ($$3 == dam.j) {
               return gib.a.j;
            }
         }

         return gib.a.b;
      }
   }

   public alr c(hfq $$0) {
      return $$0.a.a();
   }

   protected void a(hfq $$0, fld $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(hfq $$0, xg $$1, fld $$2, grn $$3, int $$4) {
      $$2.a();
      if ($$0.aG != null) {
         super.a($$0, $$0.aG, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public hfq b() {
      return new hfq();
   }

   public void a(gqj $$0, hfq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gym.a($$0, $$1, $$2, this.h);
      $$1.h = a($$0, bxw.a);
      $$1.f = a($$0, bxw.b);
      $$1.a = $$0.c();
      $$1.j = $$0.eW();
      $$1.k = $$0.eX();
      $$1.l = $$0.fC();
      $$1.aF = $$0.aI;
      $$1.m = $$0.ak();
      $$1.n = $$0.a(csk.g);
      $$1.o = $$0.a(csk.b);
      $$1.p = $$0.a(csk.e);
      $$1.q = $$0.a(csk.f);
      $$1.az = $$0.a(csk.c);
      $$1.aA = $$0.a(csk.d);
      $$1.aB = $$0.a(csk.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.z < 100.0) {
         fhh $$3 = $$0.gA();
         fgz $$4 = $$3.a(fgy.c);
         if ($$4 != null) {
            fhd $$5 = $$3.d($$0, $$4);
            xg $$6 = fhd.a($$5, $$4.a(yz.b));
            $$1.aG = xg.i().b($$6).b(xf.v).b($$4.e());
         } else {
            $$1.aG = null;
         }
      } else {
         $$1.aG = null;
      }

      $$1.aH = a($$0, true);
      $$1.aI = a($$0, false);
      $$1.aJ = $$0.ao();
      $$1.aK = $$0.gi().getName();
      $$1.aL.b();
      if ($$1.U) {
         dak $$7 = $$0.b($$1.P);
         if ($$7.a(dao.sf)) {
            this.h.a($$1.aL, $$7, dai.f, (byf)$$0);
         }
      }
   }

   private static void b(gqj $$0, hfq $$1, float $$2) {
      $$1.aC = (float)$$0.fK() + $$2;
      fgc $$3 = $$0.h($$2);
      fgc $$4 = $$0.I($$2);
      if ($$4.j() > 1.0E-5F && $$3.j() > 1.0E-5F) {
         $$1.aD = true;
         double $$5 = $$4.f().d().b($$3.f().d());
         double $$6 = $$4.d * $$3.f - $$4.f * $$3.d;
         $$1.aE = (float)(Math.signum($$6) * Math.acos(Math.min(1.0, Math.abs($$5))));
      } else {
         $$1.aD = false;
         $$1.aE = 0.0F;
      }
   }

   private static void c(gqj $$0, hfq $$1, float $$2) {
      double $$3 = azz.d((double)$$2, $$0.bY, $$0.cb) - azz.d((double)$$2, $$0.K, $$0.dA());
      double $$4 = azz.d((double)$$2, $$0.bZ, $$0.cc) - azz.d((double)$$2, $$0.L, $$0.dC());
      double $$5 = azz.d((double)$$2, $$0.ca, $$0.cd) - azz.d((double)$$2, $$0.M, $$0.dG());
      float $$6 = azz.i($$2, $$0.aW, $$0.aV);
      double $$7 = (double)azz.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azz.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azz.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.b());
      $$1.c = azz.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azz.a($$1.d, -20.0F, 20.0F);
      float $$9 = azz.h($$2, $$0.bV, $$0.bW);
      float $$10 = azz.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + azz.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static ckp.b a(gqj $$0, boolean $$1) {
      ua $$2 = $$1 ? $$0.gC() : $$0.gD();
      if ($$2.j()) {
         return null;
      } else {
         bxn<?> $$3 = $$2.<bxn<?>>a("id", bxn.a).orElse(null);
         return $$3 == bxn.aP ? $$2.<ckp.b>a("Variant", ckp.b.h).orElse(ckp.b.a) : null;
      }
   }

   public void a(fld $$0, grn $$1, int $$2, alr $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.r, $$4);
   }

   public void b(fld $$0, grn $$1, int $$2, alr $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.s, $$4);
   }

   private void a(fld $$0, grn $$1, int $$2, alr $$3, gkr $$4, boolean $$5) {
      git $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gry.j($$3)), $$2, hkg.d);
   }

   protected void a(hfq $$0, fld $$1, float $$2, float $$3) {
      float $$4 = $$0.J;
      float $$5 = $$0.ae;
      if ($$0.R) {
         super.a($$0, $$1, $$2, $$3);
         float $$6 = $$0.b();
         if (!$$0.ao) {
            $$1.a(a.b.rotationDegrees($$6 * (-90.0F - $$5)));
         }

         if ($$0.aD) {
            $$1.a(a.d.rotation($$0.aE));
         }
      } else if ($$4 > 0.0F) {
         super.a($$0, $$1, $$2, $$3);
         float $$7 = $$0.an ? -90.0F - $$5 : -90.0F;
         float $$8 = azz.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.S) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
