import java.util.List;
import javax.annotation.Nullable;

public class fwg extends fvb<ctk> {
   private static final akv G = akv.b("container/slot/banner");
   private static final akv H = akv.b("container/slot/dye");
   private static final akv I = akv.b("container/slot/banner_pattern");
   private static final akv J = akv.b("container/loom/scroller");
   private static final akv K = akv.b("container/loom/scroller_disabled");
   private static final akv L = akv.b("container/loom/pattern_selected");
   private static final akv M = akv.b("container/loom/pattern_highlighted");
   private static final akv N = akv.b("container/loom/pattern");
   private static final akv O = akv.b("container/loom/error");
   private static final akv P = akv.b("textures/gui/container/loom.png");
   private static final int Q = 4;
   private static final int R = 4;
   private static final int S = 12;
   private static final int T = 15;
   private static final int U = 14;
   private static final int V = 56;
   private static final int W = 60;
   private static final int X = 13;
   private gfe Y;
   @Nullable
   private dtr Z;
   private cwq aa = cwq.j;
   private cwq ab = cwq.j;
   private cwq ac = cwq.j;
   private boolean ad;
   private boolean ae;
   private float af;
   private boolean ag;
   private int ah;

   public fwg(ctk $$0, cox $$1, wp $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::H);
      this.w -= 2;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.Y = this.m.aS().a(gfd.r).b("flag");
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int G() {
      return ayz.e(this.z.l().size(), 4);
   }

   @Override
   protected void a(fof $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gmj::H, P, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      cua $$6 = this.z.n();
      cua $$7 = this.z.o();
      cua $$8 = this.z.p();
      cua $$9 = this.z.q();
      if (!$$6.h()) {
         $$0.a(gmj::H, G, $$4 + $$6.e, $$5 + $$6.f, 16, 16);
      }

      if (!$$7.h()) {
         $$0.a(gmj::H, H, $$4 + $$7.e, $$5 + $$7.f, 16, 16);
      }

      if (!$$8.h()) {
         $$0.a(gmj::H, I, $$4 + $$8.e, $$5 + $$8.f, 16, 16);
      }

      int $$10 = (int)(41.0F * this.af);
      akv $$11 = this.ad ? J : K;
      $$0.a(gmj::H, $$11, $$4 + 119, $$5 + 13 + $$10, 12, 15);
      $$0.d();
      fer.c();
      if (this.Z != null && !this.ae) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, 24.0F, 1.0F);
         $$0.c().a(0.5F, 0.0F, 0.5F);
         float $$12 = 0.6666667F;
         $$0.c().b(0.6666667F, 0.6666667F, -0.6666667F);
         cvn $$13 = ((cut)$$9.g().h()).b();
         $$0.a($$2x -> gog.a($$0.c(), $$2x, 15728880, hej.d, this.Y, hhd.f, true, $$13, this.Z));
         $$0.c().b();
      } else if (this.ae) {
         $$0.a(gmj::H, O, $$4 + $$9.e - 5, $$5 + $$9.f - 5, 26, 26);
      }

      if (this.ad) {
         int $$14 = $$4 + 60;
         int $$15 = $$5 + 13;
         List<jr<dtq>> $$16 = this.z.l();

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
               akv $$24;
               if ($$20 == this.z.m()) {
                  $$24 = L;
               } else if ($$23) {
                  $$24 = M;
               } else {
                  $$24 = N;
               }

               $$0.a(gmj::H, $$24, $$21, $$22, 14, 14);
               this.a($$0, $$16.get($$20), $$21, $$22);
            }
         }
      }

      $$0.d();
      fer.d();
   }

   private void a(fof $$0, jr<dtq> $$1, int $$2, int $$3) {
      ffv $$4 = new ffv();
      $$4.a();
      $$4.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$4.b(6.0F, -6.0F, 1.0F);
      $$4.a(0.5F, 0.0F, 0.0F);
      $$4.a(0.5F, 0.5F, 0.5F);
      float $$5 = 0.6666667F;
      $$4.b(0.6666667F, -0.6666667F, -0.6666667F);
      dtr $$6 = new dtr.a().a($$1, cvn.a).a();
      $$0.a($$2x -> gog.a($$4, $$2x, 15728880, hej.d, this.Y, hhd.f, true, cvn.h, $$6));
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
                  flk.Q().ak().a(hil.a(awa.Bg, 1.0F));
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
         this.af = ayz.a(this.af, 0.0F, 1.0F);
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
            this.af = ayz.a(this.af - $$5, 0.0F, 1.0F);
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
      cwq $$0 = this.z.q().g();
      if ($$0.f()) {
         this.Z = null;
      } else {
         this.Z = $$0.a(kv.ai, dtr.a);
      }

      cwq $$1 = this.z.n().g();
      cwq $$2 = this.z.o().g();
      cwq $$3 = this.z.p().g();
      dtr $$4 = $$1.a(kv.ai, dtr.a);
      this.ae = $$4.b().size() >= 6;
      if (this.ae) {
         this.Z = null;
      }

      if (!cwq.a($$1, this.aa) || !cwq.a($$2, this.ab) || !cwq.a($$3, this.ac)) {
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
