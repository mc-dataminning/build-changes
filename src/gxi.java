import javax.annotation.Nullable;

public class gxi extends gtc<gkq, gzt, gdd> {
   public gxi(gsb.a $$0, boolean $$1) {
      super($$0, new gdd($$0.a($$1 ? gez.ck : gez.ce), $$1), 0.5F);
      this.a(new gwf<>(this, new gck($$0.a($$1 ? gez.cl : gez.ci)), new gck($$0.a($$1 ? gez.cm : gez.cj)), $$0.h()));
      this.a(new gwp<>(this));
      this.a(new gvl<>(this, $$0));
      this.a(new gvv(this, $$0.f()));
      this.a(new gvp(this, $$0.f(), $$0.g()));
      this.a(new gvu<>(this, $$0.f()));
      this.a(new gxb<>(this, $$0.f(), $$0.h()));
      this.a(new gwn(this, $$0.f()));
      this.a(new gwx(this, $$0.f()));
      this.a(new gvm<>(this, $$0));
   }

   protected boolean a(gzt $$0) {
      return !$$0.m;
   }

   public fay b(gzt $$0) {
      fay $$1 = super.a($$0);
      return $$0.N ? $$1.b(0.0, (double)($$0.af * -2.0F) / 16.0, 0.0) : $$1;
   }

   private static gcl.a a(gkq $$0, buz $$1) {
      cwn $$2 = $$0.b(bsh.a);
      cwn $$3 = $$0.b(bsh.b);
      gcl.a $$4 = a($$0, $$2, bsh.a);
      gcl.a $$5 = a($$0, $$3, bsh.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? gcl.a.a : gcl.a.b;
      }

      return $$0.fy() == $$1 ? $$4 : $$5;
   }

   private static gcl.a a(cov $$0, cwn $$1, bsh $$2) {
      if ($$1.f()) {
         return gcl.a.a;
      } else {
         if ($$0.fA() == $$2 && $$0.fC() > 0) {
            cwp $$3 = $$1.w();
            if ($$3 == cwp.d) {
               return gcl.a.c;
            }

            if ($$3 == cwp.e) {
               return gcl.a.d;
            }

            if ($$3 == cwp.f) {
               return gcl.a.e;
            }

            if ($$3 == cwp.g) {
               return gcl.a.f;
            }

            if ($$3 == cwp.h) {
               return gcl.a.h;
            }

            if ($$3 == cwp.i) {
               return gcl.a.i;
            }

            if ($$3 == cwp.j) {
               return gcl.a.j;
            }
         } else if (!$$0.aI && $$1.a(cwr.wV) && cve.g($$1)) {
            return gcl.a.g;
         }

         return gcl.a.b;
      }
   }

   public aku c(gzt $$0) {
      return $$0.a.a();
   }

   protected void a(gzt $$0, ffs $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gzt $$0, wo $$1, ffs $$2, glv $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public gzt b() {
      return new gzt();
   }

   public void a(gkq $$0, gzt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gss.a($$0, $$1, $$2, this.i);
      $$1.h = a($$0, buz.a);
      $$1.f = a($$0, buz.b);
      $$1.a = $$0.d();
      $$1.j = $$0.eU();
      $$1.k = $$0.eV();
      $$1.l = $$0.fC();
      $$1.aC = $$0.aI;
      $$1.m = $$0.Z_();
      $$1.n = $$0.a(cow.g);
      $$1.o = $$0.a(cow.b);
      $$1.p = $$0.a(cow.e);
      $$1.q = $$0.a(cow.f);
      $$1.aw = $$0.a(cow.c);
      $$1.ax = $$0.a(cow.d);
      $$1.ay = $$0.a(cow.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.y < 100.0) {
         fcd $$3 = $$0.gy();
         fbv $$4 = $$3.a(fbu.c);
         if ($$4 != null) {
            fbz $$5 = $$3.d($$0, $$4);
            wo $$6 = fbz.a($$5, $$4.a(yh.b));
            $$1.aD = wo.i().b($$6).b(wn.v).b($$4.d());
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
      cwn $$7 = $$0.fB();
      if ($$7.a(cwr.rU)) {
         this.i.a($$1.aI, $$7, cwl.f, false, $$0);
      } else {
         $$1.aI.b();
      }
   }

   private static void b(gkq $$0, gzt $$1, float $$2) {
      $$1.az = (float)$$0.fK() + $$2;
      fay $$3 = $$0.g($$2);
      fay $$4 = $$0.I($$2);
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

   private static void c(gkq $$0, gzt $$1, float $$2) {
      double $$3 = ayy.d((double)$$2, $$0.ck, $$0.cn) - ayy.d((double)$$2, $$0.K, $$0.dB());
      double $$4 = ayy.d((double)$$2, $$0.cl, $$0.co) - ayy.d((double)$$2, $$0.L, $$0.dD());
      double $$5 = ayy.d((double)$$2, $$0.cm, $$0.cp) - ayy.d((double)$$2, $$0.M, $$0.dH());
      float $$6 = ayy.i($$2, $$0.aY, $$0.aX);
      double $$7 = (double)ayy.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-ayy.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = ayy.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.b());
      $$1.c = ayy.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = ayy.a($$1.d, -20.0F, 20.0F);
      float $$9 = ayy.h($$2, $$0.ch, $$0.ci);
      float $$10 = ayy.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + ayy.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static chm.b a(gkq $$0, boolean $$1) {
      tq $$2 = $$1 ? $$0.gA() : $$0.gB();
      return buq.a($$2.l("id")).filter($$0x -> $$0x == buq.aO).isPresent() ? chm.b.a($$2.h("Variant")) : null;
   }

   public void a(ffs $$0, glv $$1, int $$2, aku $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(ffs $$0, glv $$1, int $$2, aku $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(ffs $$0, glv $$1, int $$2, aku $$3, gfa $$4, boolean $$5) {
      gdd $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gmf.j($$3)), $$2, hec.d);
   }

   protected void a(gzt $$0, ffs $$1, float $$2, float $$3) {
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
         float $$8 = ayy.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.P) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
