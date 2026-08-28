import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fzx extends fzc<cvy> {
   private static final alg[] M = new alg[]{
      alg.b("container/enchanting_table/level_1"), alg.b("container/enchanting_table/level_2"), alg.b("container/enchanting_table/level_3")
   };
   private static final alg[] N = new alg[]{
      alg.b("container/enchanting_table/level_1_disabled"),
      alg.b("container/enchanting_table/level_2_disabled"),
      alg.b("container/enchanting_table/level_3_disabled")
   };
   private static final alg O = alg.b("container/enchanting_table/enchantment_slot_disabled");
   private static final alg P = alg.b("container/enchanting_table/enchantment_slot_highlighted");
   private static final alg Q = alg.b("container/enchanting_table/enchantment_slot");
   private static final alg R = alg.b("textures/gui/container/enchanting_table.png");
   private static final alg S = alg.b("textures/entity/enchanting_table_book.png");
   private final azv T = azv.a();
   private gfp U;
   public float G;
   public float H;
   public float I;
   public float J;
   public float K;
   public float L;
   private czk V = czk.k;

   public fzx(cvy $$0, cri $$1, wy $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.U = new gfp(this.m.aS().a(gjn.J));
   }

   @Override
   public void E() {
      super.E();
      this.G();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = (this.n - this.s) / 2;
      int $$4 = (this.o - this.u) / 2;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         double $$6 = $$0 - (double)($$3 + 60);
         double $$7 = $$1 - (double)($$4 + 14 + 19 * $$5);
         if ($$6 >= 0.0 && $$7 >= 0.0 && $$6 < 108.0 && $$7 < 19.0 && this.z.a(this.m.t, $$5)) {
            this.m.r.a(this.z.l, $$5);
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fsh $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gqx::H, R, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      this.d($$0, $$4, $$5, $$1);
      fzw.a().a((long)this.z.m());
      int $$6 = this.z.l();

      for (int $$7 = 0; $$7 < 3; $$7++) {
         int $$8 = $$4 + 60;
         int $$9 = $$8 + 20;
         int $$10 = this.z.m[$$7];
         if ($$10 == 0) {
            $$0.a(gqx::H, O, $$8, $$5 + 14 + 19 * $$7, 108, 19);
         } else {
            String $$11 = $$10 + "";
            int $$12 = 86 - this.p.b($$11);
            xd $$13 = fzw.a().a(this.p, $$12);
            int $$14 = 6839882;
            if (($$6 < $$7 + 1 || this.m.t.cf < $$10) && !this.m.t.fU()) {
               $$0.a(gqx::H, O, $$8, $$5 + 14 + 19 * $$7, 108, 19);
               $$0.a(gqx::H, N[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
               $$0.a(this.p, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, ($$14 & 16711422) >> 1, false);
               $$14 = 4226832;
            } else {
               int $$15 = $$2 - ($$4 + 60);
               int $$16 = $$3 - ($$5 + 14 + 19 * $$7);
               if ($$15 >= 0 && $$16 >= 0 && $$15 < 108 && $$16 < 19) {
                  $$0.a(gqx::H, P, $$8, $$5 + 14 + 19 * $$7, 108, 19);
                  $$14 = 16777088;
               } else {
                  $$0.a(gqx::H, Q, $$8, $$5 + 14 + 19 * $$7, 108, 19);
               }

               $$0.a(gqx::H, M[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
               $$0.a(this.p, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, $$14, false);
               $$14 = 8453920;
            }

            $$0.b(this.p, $$11, $$9 + 86 - this.p.b($$11), $$5 + 16 + 19 * $$7 + 7, $$14);
         }
      }
   }

   private void d(fsh $$0, int $$1, int $$2, float $$3) {
      float $$4 = azm.h($$3, this.L, this.K);
      float $$5 = azm.h($$3, this.H, this.G);
      $$0.d();
      fiq.e();
      $$0.c().a();
      $$0.c().a((float)$$1 + 33.0F, (float)$$2 + 31.0F, 100.0F);
      float $$6 = 40.0F;
      $$0.c().b(-40.0F, 40.0F, 40.0F);
      $$0.c().a(a.b.rotationDegrees(25.0F));
      $$0.c().a((1.0F - $$4) * 0.2F, (1.0F - $$4) * 0.1F, (1.0F - $$4) * 0.25F);
      float $$7 = -(1.0F - $$4) * 90.0F - 90.0F;
      $$0.c().a(a.d.rotationDegrees($$7));
      $$0.c().a(a.b.rotationDegrees(180.0F));
      float $$8 = azm.a(azm.i($$5 + 0.25F) * 1.6F - 0.3F, 0.0F, 1.0F);
      float $$9 = azm.a(azm.i($$5 + 0.75F) * 1.6F - 0.3F, 0.0F, 1.0F);
      this.U.a(0.0F, $$8, $$9, $$4);
      $$0.a($$1x -> {
         fkc $$2x = $$1x.getBuffer(this.U.a(S));
         this.U.a($$0.c(), $$2x, 15728880, hja.d);
      });
      $$0.d();
      $$0.c().b();
      fiq.d();
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      float $$4 = this.m.av().a(false);
      super.a($$0, $$1, $$2, $$4);
      this.a($$0, $$1, $$2);
      boolean $$5 = this.m.t.fU();
      int $$6 = this.z.l();

      for (int $$7 = 0; $$7 < 3; $$7++) {
         int $$8 = this.z.m[$$7];
         Optional<jf.c<dfx>> $$9 = this.m.s.F_().f(mh.aR).c(this.z.n[$$7]);
         if (!$$9.isEmpty()) {
            int $$10 = this.z.o[$$7];
            int $$11 = $$7 + 1;
            if (this.a(60, 14 + 19 * $$7, 108, 17, (double)$$1, (double)$$2) && $$8 > 0 && $$10 >= 0 && $$9 != null) {
               List<wy> $$12 = Lists.newArrayList();
               $$12.add(wy.a("container.enchant.clue", dfx.a($$9.get(), $$10)).a(o.p));
               if (!$$5) {
                  $$12.add(wx.a);
                  if (this.m.t.cf < $$8) {
                     $$12.add(wy.a("container.enchant.level.requirement", this.z.m[$$7]).a(o.m));
                  } else {
                     xm $$13;
                     if ($$11 == 1) {
                        $$13 = wy.c("container.enchant.lapis.one");
                     } else {
                        $$13 = wy.a("container.enchant.lapis.many", $$11);
                     }

                     $$12.add($$13.a($$6 >= $$11 ? o.h : o.m));
                     xm $$15;
                     if ($$11 == 1) {
                        $$15 = wy.c("container.enchant.level.one");
                     } else {
                        $$15 = wy.a("container.enchant.level.many", $$11);
                     }

                     $$12.add($$15.a(o.h));
                  }
               }

               $$0.a(this.p, $$12, $$1, $$2);
               break;
            }
         }
      }
   }

   @Override
   public void G() {
      czk $$0 = this.z.b(0).g();
      if (!czk.a($$0, this.V)) {
         this.V = $$0;

         do {
            this.I = this.I + (float)(this.T.a(4) - this.T.a(4));
         } while (this.G <= this.I + 1.0F && this.G >= this.I - 1.0F);
      }

      this.H = this.G;
      this.L = this.K;
      boolean $$1 = false;

      for (int $$2 = 0; $$2 < 3; $$2++) {
         if (this.z.m[$$2] != 0) {
            $$1 = true;
         }
      }

      if ($$1) {
         this.K += 0.2F;
      } else {
         this.K -= 0.2F;
      }

      this.K = azm.a(this.K, 0.0F, 1.0F);
      float $$3 = (this.I - this.G) * 0.4F;
      float $$4 = 0.2F;
      $$3 = azm.a($$3, -0.2F, 0.2F);
      this.J = this.J + ($$3 - this.J) * 0.9F;
      this.G = this.G + this.J;
   }
}
