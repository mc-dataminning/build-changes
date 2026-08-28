import javax.annotation.Nullable;

public class fvj extends fuz<csj> {
   private static final akv G = akv.b("container/cartography_table/error");
   private static final akv H = akv.b("container/cartography_table/scaled_map");
   private static final akv I = akv.b("container/cartography_table/duplicated_map");
   private static final akv J = akv.b("container/cartography_table/map");
   private static final akv K = akv.b("container/cartography_table/locked");
   private static final akv L = akv.b("textures/gui/container/cartography_table.png");
   private final hea M = new hea();

   public fvj(csj $$0, cov $$1, wp $$2) {
      super($$0, $$1, $$2);
      this.w -= 2;
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fod $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gmh::H, L, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      cwo $$6 = this.z.b(1).g();
      boolean $$7 = $$6.a(cws.vi);
      boolean $$8 = $$6.a(cws.rv);
      boolean $$9 = $$6.a(cws.gi);
      cwo $$10 = this.z.b(0).g();
      euq $$11 = $$10.a(kv.L);
      boolean $$12 = false;
      eus $$13;
      if ($$11 != null) {
         $$13 = cxb.a($$11, this.m.s);
         if ($$13 != null) {
            if ($$13.h) {
               $$12 = true;
               if ($$8 || $$9) {
                  $$0.a(gmh::H, G, $$4 + 35, $$5 + 31, 28, 21);
               }
            }

            if ($$8 && $$13.f >= 4) {
               $$12 = true;
               $$0.a(gmh::H, G, $$4 + 35, $$5 + 31, 28, 21);
            }
         }
      } else {
         $$13 = null;
      }

      this.a($$0, $$11, $$13, $$7, $$8, $$9, $$12);
   }

   private void a(fod $$0, @Nullable euq $$1, @Nullable eus $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6) {
      int $$7 = this.C;
      int $$8 = this.D;
      if ($$4 && !$$6) {
         $$0.a(gmh::H, H, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 85, $$8 + 31, 0.226F);
      } else if ($$3) {
         $$0.a(gmh::H, I, $$7 + 67 + 16, $$8 + 13, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 86, $$8 + 16, 0.34F);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1.0F);
         $$0.a(gmh::H, I, $$7 + 67, $$8 + 13 + 16, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 70, $$8 + 32, 0.34F);
         $$0.c().b();
      } else if ($$5) {
         $$0.a(gmh::H, J, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1.0F);
         $$0.a(gmh::H, K, $$7 + 118, $$8 + 60, 10, 14);
         $$0.c().b();
      } else {
         $$0.a(gmh::H, J, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
      }
   }

   private void a(fod $$0, @Nullable euq $$1, @Nullable eus $$2, int $$3, int $$4, float $$5) {
      if ($$1 != null && $$2 != null) {
         $$0.c().a();
         $$0.c().a((float)$$3, (float)$$4, 1.0F);
         $$0.c().b($$5, $$5, 1.0F);
         glw $$6 = this.m.at();
         $$6.a($$1, $$2, this.M);
         $$0.a($$2x -> $$6.a(this.M, $$0.c(), $$2x, true, 15728880));
         $$0.c().b();
      }
   }
}
