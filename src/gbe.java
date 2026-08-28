import javax.annotation.Nullable;

public class gbe extends gau<cwa> {
   private static final alk G = alk.b("container/cartography_table/error");
   private static final alk H = alk.b("container/cartography_table/scaled_map");
   private static final alk I = alk.b("container/cartography_table/duplicated_map");
   private static final alk J = alk.b("container/cartography_table/map");
   private static final alk K = alk.b("container/cartography_table/locked");
   private static final alk L = alk.b("textures/gui/container/cartography_table.png");
   private final hkl M = new hkl();

   public gbe(cwa $$0, cry $$1, xc $$2) {
      super($$0, $$1, $$2);
      this.w -= 2;
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ftz $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gsn::H, L, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      daa $$6 = this.z.b(1).g();
      boolean $$7 = $$6.a(dae.vt);
      boolean $$8 = $$6.a(dae.rE);
      boolean $$9 = $$6.a(dae.gp);
      daa $$10 = this.z.b(0).g();
      ezj $$11 = $$10.a(kl.M);
      boolean $$12 = false;
      ezl $$13;
      if ($$11 != null) {
         $$13 = dan.a($$11, this.m.s);
         if ($$13 != null) {
            if ($$13.i) {
               $$12 = true;
               if ($$8 || $$9) {
                  $$0.a(gsn::H, G, $$4 + 35, $$5 + 31, 28, 21);
               }
            }

            if ($$8 && $$13.g >= 4) {
               $$12 = true;
               $$0.a(gsn::H, G, $$4 + 35, $$5 + 31, 28, 21);
            }
         }
      } else {
         $$13 = null;
      }

      this.a($$0, $$11, $$13, $$7, $$8, $$9, $$12);
   }

   private void a(ftz $$0, @Nullable ezj $$1, @Nullable ezl $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6) {
      int $$7 = this.C;
      int $$8 = this.D;
      if ($$4 && !$$6) {
         $$0.a(gsn::H, H, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 85, $$8 + 31, 0.226F);
      } else if ($$3) {
         $$0.a(gsn::H, I, $$7 + 67 + 16, $$8 + 13, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 86, $$8 + 16, 0.34F);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1.0F);
         $$0.a(gsn::H, I, $$7 + 67, $$8 + 13 + 16, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 70, $$8 + 32, 0.34F);
         $$0.c().b();
      } else if ($$5) {
         $$0.a(gsn::H, J, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1.0F);
         $$0.a(gsn::H, K, $$7 + 118, $$8 + 60, 10, 14);
         $$0.c().b();
      } else {
         $$0.a(gsn::H, J, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
      }
   }

   private void a(ftz $$0, @Nullable ezj $$1, @Nullable ezl $$2, int $$3, int $$4, float $$5) {
      if ($$1 != null && $$2 != null) {
         $$0.c().a();
         $$0.c().a((float)$$3, (float)$$4, 1.0F);
         $$0.c().b($$5, $$5, 1.0F);
         gsa $$6 = this.m.at();
         $$6.a($$1, $$2, this.M);
         $$0.a($$2x -> $$6.a(this.M, $$0.c(), $$2x, true, 15728880));
         $$0.c().b();
      }
   }
}
