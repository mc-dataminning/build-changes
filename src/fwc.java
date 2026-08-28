import java.util.List;
import javax.annotation.Nullable;

public class fwc extends fux<cth> {
   private static final aku G = aku.b("container/slot/banner");
   private static final aku H = aku.b("container/slot/dye");
   private static final aku I = aku.b("container/slot/banner_pattern");
   private static final aku J = aku.b("container/loom/scroller");
   private static final aku K = aku.b("container/loom/scroller_disabled");
   private static final aku L = aku.b("container/loom/pattern_selected");
   private static final aku M = aku.b("container/loom/pattern_highlighted");
   private static final aku N = aku.b("container/loom/pattern");
   private static final aku O = aku.b("container/loom/error");
   private static final aku P = aku.b("textures/gui/container/loom.png");
   private static final int Q = 4;
   private static final int R = 4;
   private static final int S = 12;
   private static final int T = 15;
   private static final int U = 14;
   private static final int V = 56;
   private static final int W = 60;
   private static final int X = 13;
   private gfa Y;
   @Nullable
   private dto Z;
   private cwn aa = cwn.j;
   private cwn ab = cwn.j;
   private cwn ac = cwn.j;
   private boolean ad;
   private boolean ae;
   private float af;
   private boolean ag;
   private int ah;

   public fwc(cth $$0, cou $$1, wo $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::H);
      this.w -= 2;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.Y = this.m.aS().a(gez.r).b("flag");
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int G() {
      return ayy.e(this.z.l().size(), 4);
   }

   @Override
   protected void a(fob $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gmf::H, P, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      ctx $$6 = this.z.n();
      ctx $$7 = this.z.o();
      ctx $$8 = this.z.p();
      ctx $$9 = this.z.q();
      if (!$$6.h()) {
         $$0.a(gmf::H, G, $$4 + $$6.e, $$5 + $$6.f, 16, 16);
      }

      if (!$$7.h()) {
         $$0.a(gmf::H, H, $$4 + $$7.e, $$5 + $$7.f, 16, 16);
      }

      if (!$$8.h()) {
         $$0.a(gmf::H, I, $$4 + $$8.e, $$5 + $$8.f, 16, 16);
      }

      int $$10 = (int)(41.0F * this.af);
      aku $$11 = this.ad ? J : K;
      $$0.a(gmf::H, $$11, $$4 + 119, $$5 + 13 + $$10, 12, 15);
      $$0.d();
      feo.c();
      if (this.Z != null && !this.ae) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, 24.0F, 1.0F);
         $$0.c().a(0.5F, 0.0F, 0.5F);
         float $$12 = 0.6666667F;
         $$0.c().b(0.6666667F, 0.6666667F, -0.6666667F);
         cvk $$13 = ((cuq)$$9.g().h()).b();
         $$0.a($$2x -> goc.a($$0.c(), $$2x, 15728880, hec.d, this.Y, hgw.f, true, $$13, this.Z));
         $$0.c().b();
      } else if (this.ae) {
         $$0.a(gmf::H, O, $$4 + $$9.e - 5, $$5 + $$9.f - 5, 26, 26);
      }

      if (this.ad) {
         int $$14 = $$4 + 60;
         int $$15 = $$5 + 13;
         List<jr<dtn>> $$16 = this.z.l();

         label64:
         for (int $$17 = 0; $$17 < 4; $$17++) {
            for (int $$18 = 0; $$18 < 4; $$18++) {
               int $$19 = $$17 + this.ah;
               int $$20 = $$19 * 4 + $$18;
               if ($$20 >= $$16.size()) {
                  break label64;
               }

               int $$21 = $$14 + $$18 * 14;
               int $$22 = $$15 + $$17 * 14;
               boolean $$23 = $$2 >= $$21 && $$3 >= $$22 && $$2 < $$21 + 14 && $$3 < $$22 + 14;
               aku $$24;
               if ($$20 == this.z.m()) {
                  $$24 = L;
               } else if ($$23) {
                  $$24 = M;
               } else {
                  $$24 = N;
               }

               $$0.a(gmf::H, $$24, $$21, $$22, 14, 14);
               this.a($$0, $$16.get($$20), $$21, $$22);
            }
         }
      }

      $$0.d();
      feo.d();
   }

   private void a(fob $$0, jr<dtn> $$1, int $$2, int $$3) {
      ffs $$4 = new ffs();
      $$4.a();
      $$4.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$4.b(6.0F, -6.0F, 1.0F);
      $$4.a(0.5F, 0.0F, 0.0F);
      $$4.a(0.5F, 0.5F, 0.5F);
      float $$5 = 0.6666667F;
      $$4.b(0.6666667F, -0.6666667F, -0.6666667F);
      dto $$6 = new dto.a().a($$1, cvk.a).a();
      $$0.a($$2x -> goc.a($$4, $$2x, 15728880, hec.d, this.Y, hgw.f, true, cvk.h, $$6));
      $$4.b();
      $$0.d();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.ag = false;
      if (this.ad) {
         int $$3 = this.C + 60;
         int $$4 = this.D + 13;

         for (int $$5 = 0; $$5 < 4; $$5++) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               double $$7 = $$0 - (double)($$3 + $$6 * 14);
               double $$8 = $$1 - (double)($$4 + $$5 * 14);
               int $$9 = $$5 + this.ah;
               int $$10 = $$9 * 4 + $$6;
               if ($$7 >= 0.0 && $$8 >= 0.0 && $$7 < 14.0 && $$8 < 14.0 && this.z.a(this.m.t, $$10)) {
                  flh.Q().ak().a(hie.a(avz.Bg, 1.0F));
                  this.m.r.a(this.z.l, $$10);
                  return true;
               }
            }
         }

         $$3 = this.C + 119;
         $$4 = this.D + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 56)) {
            this.ag = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.G() - 4;
      if (this.ag && this.ad && $$5 > 0) {
         int $$6 = this.D + 13;
         int $$7 = $$6 + 56;
         this.af = ((float)$$1 - (float)$$6 - 7.5F) / ((float)($$7 - $$6) - 15.0F);
         this.af = ayy.a(this.af, 0.0F, 1.0F);
         this.ah = Math.max((int)((double)(this.af * (float)$$5) + 0.5), 0);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (super.a($$0, $$1, $$2, $$3)) {
         return true;
      } else {
         int $$4 = this.G() - 4;
         if (this.ad && $$4 > 0) {
            float $$5 = (float)$$3 / (float)$$4;
            this.af = ayy.a(this.af - $$5, 0.0F, 1.0F);
            this.ah = Math.max((int)(this.af * (float)$$4 + 0.5F), 0);
         }

         return true;
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.s) || $$1 >= (double)($$3 + this.u);
   }

   private void H() {
      cwn $$0 = this.z.q().g();
      if ($$0.f()) {
         this.Z = null;
      } else {
         this.Z = $$0.a(kv.ai, dto.a);
      }

      cwn $$1 = this.z.n().g();
      cwn $$2 = this.z.o().g();
      cwn $$3 = this.z.p().g();
      dto $$4 = $$1.a(kv.ai, dto.a);
      this.ae = $$4.b().size() >= 6;
      if (this.ae) {
         this.Z = null;
      }

      if (!cwn.a($$1, this.aa) || !cwn.a($$2, this.ab) || !cwn.a($$3, this.ac)) {
         this.ad = !$$1.f() && !$$2.f() && !this.ae && !this.z.l().isEmpty();
      }

      if (this.ah >= this.G()) {
         this.ah = 0;
         this.af = 0.0F;
      }

      this.aa = $$1.v();
      this.ab = $$2.v();
      this.ac = $$3.v();
   }
}
