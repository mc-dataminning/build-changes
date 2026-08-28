import javax.annotation.Nullable;

public class gzl extends gvg<gmt, hbw, gfg> {
   public gzl(guf.a $$0, boolean $$1) {
      super($$0, new gfg($$0.a($$1 ? ghc.cu : ghc.co), $$1), 0.5F);
      this.a(new gyi<>(this, new gen($$0.a($$1 ? ghc.cv : ghc.cs)), new gen($$0.a($$1 ? ghc.cw : ghc.ct)), $$0.h()));
      this.a(new gys<>(this));
      this.a(new gxp<>(this, $$0));
      this.a(new gxz(this, $$0.f()));
      this.a(new gxt(this, $$0.f(), $$0.g()));
      this.a(new gxy<>(this, $$0.f()));
      this.a(new gze<>(this, $$0.f(), $$0.h()));
      this.a(new gyq(this, $$0.f()));
      this.a(new gza(this, $$0.f()));
      this.a(new gxq<>(this, $$0));
   }

   protected boolean a(hbw $$0) {
      return !$$0.m;
   }

   public fcu b(hbw $$0) {
      fcu $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static geo.a a(gmt $$0, bwk $$1) {
      cxy $$2 = $$0.b(btp.a);
      cxy $$3 = $$0.b(btp.b);
      geo.a $$4 = a($$0, $$2, btp.a);
      geo.a $$5 = a($$0, $$3, btp.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? geo.a.a : geo.a.b;
      }

      return $$0.fx() == $$1 ? $$4 : $$5;
   }

   private static geo.a a(cqi $$0, cxy $$1, btp $$2) {
      if ($$1.f()) {
         return geo.a.a;
      } else {
         if ($$0.fz() == $$2 && $$0.fB() > 0) {
            cya $$3 = $$1.w();
            if ($$3 == cya.d) {
               return geo.a.c;
            }

            if ($$3 == cya.e) {
               return geo.a.d;
            }

            if ($$3 == cya.f) {
               return geo.a.e;
            }

            if ($$3 == cya.g) {
               return geo.a.f;
            }

            if ($$3 == cya.h) {
               return geo.a.h;
            }

            if ($$3 == cya.i) {
               return geo.a.i;
            }

            if ($$3 == cya.j) {
               return geo.a.j;
            }
         } else if (!$$0.aH && $$1.a(cyc.wZ) && cwq.g($$1)) {
            return geo.a.g;
         }

         return geo.a.b;
      }
   }

   public ald c(hbw $$0) {
      return $$0.a.a();
   }

   protected void a(hbw $$0, fho $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(hbw $$0, wv $$1, fho $$2, gny $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public hbw b() {
      return new hbw();
   }

   public void a(gmt $$0, hbw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      guw.a($$0, $$1, $$2, this.h);
      $$1.h = a($$0, bwk.a);
      $$1.f = a($$0, bwk.b);
      $$1.a = $$0.c();
      $$1.j = $$0.eV();
      $$1.k = $$0.eW();
      $$1.l = $$0.fB();
      $$1.aC = $$0.aH;
      $$1.m = $$0.U_();
      $$1.n = $$0.a(cqj.g);
      $$1.o = $$0.a(cqj.b);
      $$1.p = $$0.a(cqj.e);
      $$1.q = $$0.a(cqj.f);
      $$1.aw = $$0.a(cqj.c);
      $$1.ax = $$0.a(cqj.d);
      $$1.ay = $$0.a(cqj.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         fdz $$3 = $$0.gy();
         fdr $$4 = $$3.a(fdq.c);
         if ($$4 != null) {
            fdv $$5 = $$3.d($$0, $$4);
            wv $$6 = fdv.a($$5, $$4.a(yo.b));
            $$1.aD = wv.i().b($$6).b(wu.v).b($$4.d());
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
         cxy $$7 = $$0.b($$1.M);
         if ($$7.a(cyc.rY)) {
            this.h.a($$1.aI, $$7, cxw.f, false, $$0);
         }
      }
   }

   private static void b(gmt $$0, hbw $$1, float $$2) {
      $$1.az = (float)$$0.fJ() + $$2;
      fcu $$3 = $$0.h($$2);
      fcu $$4 = $$0.J($$2);
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

   private static void c(gmt $$0, hbw $$1, float $$2) {
      double $$3 = azk.d((double)$$2, $$0.bW, $$0.bZ) - azk.d((double)$$2, $$0.K, $$0.dA());
      double $$4 = azk.d((double)$$2, $$0.bX, $$0.ca) - azk.d((double)$$2, $$0.L, $$0.dC());
      double $$5 = azk.d((double)$$2, $$0.bY, $$0.cb) - azk.d((double)$$2, $$0.M, $$0.dG());
      float $$6 = azk.i($$2, $$0.aV, $$0.aU);
      double $$7 = (double)azk.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azk.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azk.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.b());
      $$1.c = azk.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azk.a($$1.d, -20.0F, 20.0F);
      float $$9 = azk.h($$2, $$0.bT, $$0.bU);
      float $$10 = azk.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + azk.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static ciw.b a(gmt $$0, boolean $$1) {
      tw $$2 = $$1 ? $$0.gA() : $$0.gB();
      return bwb.a($$2.l("id")).filter($$0x -> $$0x == bwb.aO).isPresent() ? ciw.b.a($$2.h("Variant")) : null;
   }

   public void a(fho $$0, gny $$1, int $$2, ald $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.r, $$4);
   }

   public void b(fho $$0, gny $$1, int $$2, ald $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.g.s, $$4);
   }

   private void a(fho $$0, gny $$1, int $$2, ald $$3, ghd $$4, boolean $$5) {
      gfg $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(goi.j($$3)), $$2, hgi.d);
   }

   protected void a(hbw $$0, fho $$1, float $$2, float $$3) {
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
         float $$8 = azk.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.P) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
