import javax.annotation.Nullable;

public class gst extends gop<gge, gvb, fyt> {
   public gst(gno.a $$0, boolean $$1) {
      super($$0, new fyt($$0.a($$1 ? gap.bO : gap.bI), $$1), 0.5F);
      this.a(new grr<>(this, new fya($$0.a($$1 ? gap.bP : gap.bM)), new fya($$0.a($$1 ? gap.bQ : gap.bN)), $$0.g()));
      this.a(new gsa<>(this, $$0.b()));
      this.a(new gqx<>(this, $$0));
      this.a(new grh(this, $$0.f()));
      this.a(new grb(this, $$0.f()));
      this.a(new grg<>(this, $$0.f(), $$0.b()));
      this.a(new grk<>(this, $$0.f()));
      this.a(new gry(this, $$0.f()));
      this.a(new gsi(this, $$0.f()));
      this.a(new gqy<>(this, $$0));
   }

   protected boolean a(gvb $$0) {
      return !$$0.h;
   }

   public eyw b(gvb $$0) {
      eyw $$1 = super.a($$0);
      return $$0.I ? $$1.b(0.0, (double)($$0.aa * -2.0F) / 16.0, 0.0) : $$1;
   }

   public static fyb.a a(gvb $$0, gvb.a $$1, brr $$2) {
      if ($$1.a) {
         return fyb.a.a;
      } else {
         if ($$0.H == $$2 && $$0.g > 0) {
            cvu $$3 = $$1.b;
            if ($$3 == cvu.d) {
               return fyb.a.c;
            }

            if ($$3 == cvu.e) {
               return fyb.a.d;
            }

            if ($$3 == cvu.f) {
               return fyb.a.e;
            }

            if ($$3 == cvu.g) {
               return fyb.a.f;
            }

            if ($$3 == cvu.h) {
               return fyb.a.h;
            }

            if ($$3 == cvu.i) {
               return fyb.a.i;
            }

            if ($$3 == cvu.j) {
               return fyb.a.j;
            }
         } else if (!$$0.aA && $$1.c) {
            return fyb.a.g;
         }

         return fyb.a.b;
      }
   }

   public ale c(gvb $$0) {
      return $$0.a.a();
   }

   protected void a(gvb $$0, fdi $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(gvb $$0, xe $$1, fdi $$2, ghl $$3, int $$4) {
      if ($$0.aD != null) {
         $$2.a();
         super.a($$0, $$0.aD, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
         $$2.b();
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public gvb c() {
      return new gvb();
   }

   public void a(gge $$0, gvb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gof.a((bun)$$0, (gug)$$1, $$2);
      $$1.a = $$0.b();
      $$1.e = $$0.eS();
      $$1.f = $$0.eT();
      $$1.g = $$0.fy();
      $$1.aA = $$0.aE;
      $$1.h = $$0.Q_();
      $$1.i = $$0.a(cny.g);
      $$1.j = $$0.a(cny.b);
      $$1.k = $$0.a(cny.e);
      $$1.l = $$0.a(cny.f);
      $$1.au = $$0.a(cny.c);
      $$1.av = $$0.a(cny.d);
      $$1.aw = $$0.a(cny.a);
      b($$0, $$1, $$2);
      this.a($$0, $$1.aB, brr.a);
      this.a($$0, $$1.aC, brr.b);
      c($$0, $$1, $$2);
      if ($$1.t < 100.0) {
         fab $$3 = $$0.gs();
         ezt $$4 = $$3.a(ezs.c);
         if ($$4 != null) {
            ezx $$5 = $$3.d($$0, $$4);
            xe $$6 = ezx.a($$5, $$4.a(yx.b));
            $$1.aD = xe.i().b($$6).b(xd.v).b($$4.d());
         } else {
            $$1.aD = null;
         }
      } else {
         $$1.aD = null;
      }

      $$1.aE = a($$0, true);
      $$1.aF = a($$0, false);
      $$1.aG = $$0.ap();
      $$1.aH = $$0.gc().getName();
   }

   private static void b(gge $$0, gvb $$1, float $$2) {
      $$1.ax = (float)$$0.fG() + $$2;
      eyw $$3 = $$0.g($$2);
      eyw $$4 = $$0.I($$2);
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

   private void a(gge $$0, gvb.a $$1, brr $$2) {
      cvs $$3 = $$0.b($$2);
      $$1.a = $$3.f();
      $$1.b = !$$3.f() ? $$3.w() : null;
      $$1.c = $$3.a(cvw.vX) && cug.g($$3);
   }

   private static void c(gge $$0, gvb $$1, float $$2) {
      double $$3 = azf.d((double)$$2, $$0.cf, $$0.ci) - azf.d((double)$$2, $$0.L, $$0.dx());
      double $$4 = azf.d((double)$$2, $$0.cg, $$0.cj) - azf.d((double)$$2, $$0.M, $$0.dz());
      double $$5 = azf.d((double)$$2, $$0.ch, $$0.ck) - azf.d((double)$$2, $$0.N, $$0.dD());
      float $$6 = azf.i($$2, $$0.aU, $$0.aT);
      double $$7 = (double)azf.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = (double)(-azf.b($$6 * (float) (Math.PI / 180.0)));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = azf.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = azf.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = azf.a($$1.d, -20.0F, 20.0F);
      float $$9 = azf.h($$2, $$0.cc, $$0.cd);
      float $$10 = azf.h($$2, $$0.g, $$0.h);
      $$1.b = $$1.b + azf.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static cgt.b a(gge $$0, boolean $$1) {
      ug $$2 = $$1 ? $$0.gu() : $$0.gv();
      return bty.a($$2.l("id")).filter($$0x -> $$0x == bty.ax).isPresent() ? cgt.b.a($$2.h("Variant")) : null;
   }

   public void a(fdi $$0, ghl $$1, int $$2, ale $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(fdi $$0, ghl $$1, int $$2, ale $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(fdi $$0, ghl $$1, int $$2, ale $$3, gaq $$4, boolean $$5) {
      fyt $$6 = this.e();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(ghv.i($$3)), $$2, gwx.d);
   }

   protected void a(gvb $$0, fdi $$1, float $$2, float $$3) {
      float $$4 = $$0.B;
      float $$5 = $$0.V;
      if ($$0.J) {
         super.a($$0, $$1, $$2, $$3);
         float $$6 = azf.a($$0.ax * $$0.ax / 100.0F, 0.0F, 1.0F);
         if (!$$0.ag) {
            $$1.a(a.b.rotationDegrees($$6 * (-90.0F - $$5)));
         }

         if ($$0.ay) {
            $$1.a(a.d.rotation($$0.az));
         }
      } else if ($$4 > 0.0F) {
         super.a($$0, $$1, $$2, $$3);
         float $$7 = $$0.af ? -90.0F - $$5 : -90.0F;
         float $$8 = azf.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.K) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
