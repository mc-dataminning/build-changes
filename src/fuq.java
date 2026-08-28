import javax.annotation.Nullable;

public class fuq extends fug<ctf> {
   private static final alz G = alz.b("container/cartography_table/error");
   private static final alz H = alz.b("container/cartography_table/scaled_map");
   private static final alz I = alz.b("container/cartography_table/duplicated_map");
   private static final alz J = alz.b("container/cartography_table/map");
   private static final alz K = alz.b("container/cartography_table/locked");
   private static final alz L = alz.b("textures/gui/container/cartography_table.png");
   private final han M = new han();

   public fuq(ctf $$0, cpr $$1, xv $$2) {
      super($$0, $$1, $$2);
      this.w -= 2;
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fnl $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(glo::B, L, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      cxk $$6 = this.z.b(1).g();
      boolean $$7 = $$6.a(cxo.uZ);
      boolean $$8 = $$6.a(cxo.rm);
      boolean $$9 = $$6.a(cxo.gg);
      cxk $$10 = this.z.b(0).g();
      evh $$11 = $$10.a(ku.L);
      boolean $$12 = false;
      evj $$13;
      if ($$11 != null) {
         $$13 = cxx.a($$11, this.m.s);
         if ($$13 != null) {
            if ($$13.h) {
               $$12 = true;
               if ($$8 || $$9) {
                  $$0.a(glo::B, G, $$4 + 35, $$5 + 31, 28, 21);
               }
            }

            if ($$8 && $$13.f >= 4) {
               $$12 = true;
               $$0.a(glo::B, G, $$4 + 35, $$5 + 31, 28, 21);
            }
         }
      } else {
         $$13 = null;
      }

      this.a($$0, $$11, $$13, $$7, $$8, $$9, $$12);
   }

   private void a(fnl $$0, @Nullable evh $$1, @Nullable evj $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6) {
      int $$7 = this.C;
      int $$8 = this.D;
      if ($$4 && !$$6) {
         $$0.a(glo::B, H, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 85, $$8 + 31, 0.226F);
      } else if ($$3) {
         $$0.a(glo::B, I, $$7 + 67 + 16, $$8 + 13, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 86, $$8 + 16, 0.34F);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1.0F);
         $$0.a(glo::B, I, $$7 + 67, $$8 + 13 + 16, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 70, $$8 + 32, 0.34F);
         $$0.c().b();
      } else if ($$5) {
         $$0.a(glo::B, J, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1.0F);
         $$0.a(glo::B, K, $$7 + 118, $$8 + 60, 10, 14);
         $$0.c().b();
      } else {
         $$0.a(glo::B, J, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
      }
   }

   private void a(fnl $$0, @Nullable evh $$1, @Nullable evj $$2, int $$3, int $$4, float $$5) {
      if ($$1 != null && $$2 != null) {
         $$0.c().a();
         $$0.c().a((float)$$3, (float)$$4, 1.0F);
         $$0.c().b($$5, $$5, 1.0F);
         gld $$6 = this.m.at();
         $$6.a($$1, $$2, this.M);
         $$0.a($$2x -> $$6.a(this.M, $$0.c(), $$2x, true, 15728880));
         $$0.c().b();
      }
   }
}
