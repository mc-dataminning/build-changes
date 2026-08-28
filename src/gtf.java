import javax.annotation.Nullable;

public class gtf extends gpa<ggp, gvn, fze> {
   public gtf(gnz.a $$0, boolean $$1) {
      super($$0, new fze($$0.a($$1 ? gba.bO : gba.bI), $$1), 0.5F);
      this.a(new gsc<>(this, new fyl($$0.a($$1 ? gba.bP : gba.bM)), new fyl($$0.a($$1 ? gba.bQ : gba.bN)), $$0.h()));
      this.a(new gsl<>(this, $$0.b()));
      this.a(new gri<>(this, $$0));
      this.a(new grs(this, $$0.f()));
      this.a(new grm(this, $$0.f(), $$0.g()));
      this.a(new grr<>(this, $$0.f(), $$0.b()));
      this.a(new gsy<>(this, $$0.f(), $$0.h()));
      this.a(new gsj(this, $$0.f()));
      this.a(new gst(this, $$0.f()));
      this.a(new grj<>(this, $$0));
   }

   protected boolean a(gvn $$0) {
      return !$$0.h;
   }

   public ezh b(gvn $$0) {
      ezh $$1 = super.a($$0);
      return $$0.I ? $$1.b(0.0, (double)($$0.aa * -2.0F) / 16.0, 0.0) : $$1;
   }

   public static fym.a a(gvn $$0, gvn.a $$1, brx $$2) {
      if ($$1.a) {
         return fym.a.a;
      } else {
         if ($$0.H == $$2 && $$0.g > 0) {
            cvz $$3 = $$1.b;
            if ($$3 == cvz.d) {
               return fym.a.c;
            }

            if ($$3 == cvz.e) {
               return fym.a.d;
            }

            if ($$3 == cvz.f) {
               return fym.a.e;
            }

            if ($$3 == cvz.g) {
               return fym.a.f;
            }

            if ($$3 == cvz.h) {
               return fym.a.h;
            }

            if ($$3 == cvz.i) {
               return fym.a.i;
            }

            if ($$3 == cvz.j) {
               return fym.a.j;
            }
         } else if (!$$0.aA && $$1.c) {
            return fym.a.g;
         }

         return fym.a.b;
      }
   }

   public alh c(gvn $$0) {
      return $$0.a.a();
   }

   protected void a(gvn $$0, fdt $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gvn $$0, xh $$1, fdt $$2, ghw $$3, int $$4) {
      $$2.a();
      if ($$0.aD != null) {
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public gvn c() {
      return new gvn();
   }

   public void a(ggp $$0, gvn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      goq.a((buv)$$0, (gus)$$1, $$2);
      $$1.a = $$0.b();
      $$1.e = $$0.eX();
      $$1.f = $$0.eY();
      $$1.g = $$0.fE();
      $$1.aA = $$0.aF;
      $$1.h = $$0.R_();
      $$1.i = $$0.a(coi.g);
      $$1.j = $$0.a(coi.b);
      $$1.k = $$0.a(coi.e);
      $$1.l = $$0.a(coi.f);
      $$1.au = $$0.a(coi.c);
      $$1.av = $$0.a(coi.d);
      $$1.aw = $$0.a(coi.a);
      b($$0, $$1, $$2);
      this.a($$0, $$1.aB, brx.a);
      this.a($$0, $$1.aC, brx.b);
      c($$0, $$1, $$2);
      if ($$1.t < 100.0) {
         fam $$3 = $$0.gz();
         fae $$4 = $$3.a(fad.c);
         if ($$4 != null) {
            fai $$5 = $$3.d($$0, $$4);
            xh $$6 = fai.a($$5, $$4.a(za.b));
            $$1.aD = xh.i().b($$6).b(xg.v).b($$4.d());
         } else {
            $$1.aD = null;
         }
      } else {
         $$1.aD = null;
      }

      $$1.aE = a($$0, true);
      $$1.aF = a($$0, false);
      $$1.aG = $$0.ar();
      $$1.aH = $$0.gj().getName();
   }

   private static void b(ggp $$0, gvn $$1, float $$2) {
      $$1.ax = (float)$$0.fM() + $$2;
      ezh $$3 = $$0.g($$2);
      ezh $$4 = $$0.I($$2);
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

   private void a(ggp $$0, gvn.a $$1, brx $$2) {
      cvx $$3 = $$0.b($$2);
      $$1.a = $$3.f();
      $$1.b = !$$3.f() ? $$3.w() : null;
      $$1.c = $$3.a(cwb.vX) && cuo.g($$3);
   }

   private static void c(ggp $$0, gvn $$1, float $$2) {
      double $$3 = azj.d((double)$$2, $$0.cg, $$0.cj) - azj.d((double)$$2, $$0.L, $$0.dC());
      double $$4 = azj.d((double)$$2, $$0.ch, $$0.ck) - azj.d((double)$$2, $$0.M, $$0.dE());
      double $$5 = azj.d((double)$$2, $$0.ci, $$0.cl) - azj.d((double)$$2, $$0.N, $$0.dI());
      float $$6 = azj.i($$2, $$0.aV, $$0.aU);
      double $$7 = (double)azj.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azj.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azj.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = azj.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azj.a($$1.d, -20.0F, 20.0F);
      float $$9 = azj.h($$2, $$0.cd, $$0.ce);
      float $$10 = azj.h($$2, $$0.g, $$0.h);
      $$1.b = $$1.b + azj.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static chc.b a(ggp $$0, boolean $$1) {
      uj $$2 = $$1 ? $$0.gB() : $$0.gC();
      return bug.a($$2.l("id")).filter($$0x -> $$0x == bug.ax).isPresent() ? chc.b.a($$2.h("Variant")) : null;
   }

   public void a(fdt $$0, ghw $$1, int $$2, alh $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(fdt $$0, ghw $$1, int $$2, alh $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(fdt $$0, ghw $$1, int $$2, alh $$3, gbb $$4, boolean $$5) {
      fze $$6 = this.e();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gig.i($$3)), $$2, gxj.d);
   }

   protected void a(gvn $$0, fdt $$1, float $$2, float $$3) {
      float $$4 = $$0.B;
      float $$5 = $$0.V;
      if ($$0.J) {
         super.a($$0, $$1, $$2, $$3);
         float $$6 = azj.a($$0.ax * $$0.ax / 100.0F, 0.0F, 1.0F);
         if (!$$0.ag) {
            $$1.a(a.b.rotationDegrees($$6 * (-90.0F - $$5)));
         }

         if ($$0.ay) {
            $$1.a(a.d.rotation($$0.az));
         }
      } else if ($$4 > 0.0F) {
         super.a($$0, $$1, $$2, $$3);
         float $$7 = $$0.af ? -90.0F - $$5 : -90.0F;
         float $$8 = azj.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.K) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
