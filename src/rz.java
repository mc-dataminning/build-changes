public class rz {
   private static final float a = -0.51F;
   private static final float b = -0.4F;
   private static final float c = 0.1F;
   private static final float d = -0.15F;
   private static final bbh<Float> e = bbh.a;
   private static final bbh<Float> f = bbh.a($$0 -> $$0 < 0.0F ? $$0 : $$0 * 2.0F);
   private static final bbh<Float> g = bbh.a($$0 -> 1.25F - 6.25F / ($$0 + 5.0F));
   private static final bbh<Float> h = bbh.a($$0 -> $$0 * 2.0F);

   public static <C, I extends bbh<C>> azg<C, I> a(I $$0, I $$1, I $$2, boolean $$3) {
      bbh<Float> $$4 = $$3 ? f : e;
      azg<C, I> $$5 = a($$1, $$2, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, $$4);
      azg<C, I> $$6 = a($$1, $$2, -0.1F, 0.03F, 0.1F, 0.1F, 0.01F, -0.03F, false, false, $$4);
      azg<C, I> $$7 = a($$1, $$2, -0.1F, 0.03F, 0.1F, 0.7F, 0.01F, -0.03F, true, true, $$4);
      azg<C, I> $$8 = a($$1, $$2, -0.05F, 0.03F, 0.1F, 1.0F, 0.01F, 0.01F, true, true, $$4);
      return azg.<C, I>a($$0, $$4)
         .a(-1.1F, 0.044F)
         .a(-1.02F, -0.2222F)
         .a(-0.51F, -0.2222F)
         .a(-0.44F, -0.12F)
         .a(-0.18F, -0.12F)
         .a(-0.16F, $$5)
         .a(-0.15F, $$5)
         .a(-0.1F, $$6)
         .a(0.25F, $$7)
         .a(1.0F, $$8)
         .a();
   }

   public static <C, I extends bbh<C>> azg<C, I> a(I $$0, I $$1, I $$2, I $$3, boolean $$4) {
      bbh<Float> $$5 = $$4 ? g : e;
      return azg.<C, I>a($$0, e)
         .a(-0.19F, 3.95F)
         .a(-0.15F, a($$1, $$2, $$3, 6.25F, true, e))
         .a(-0.1F, a($$1, $$2, $$3, 5.47F, true, $$5))
         .a(0.03F, a($$1, $$2, $$3, 5.08F, true, $$5))
         .a(0.06F, a($$1, $$2, $$3, 4.69F, false, $$5))
         .a();
   }

   public static <C, I extends bbh<C>> azg<C, I> b(I $$0, I $$1, I $$2, I $$3, boolean $$4) {
      bbh<Float> $$5 = $$4 ? h : e;
      float $$6 = 0.65F;
      return azg.<C, I>a($$0, $$5)
         .a(-0.11F, 0.0F)
         .a(0.03F, a($$1, $$2, $$3, 1.0F, 0.5F, 0.0F, 0.0F, $$5))
         .a(0.65F, a($$1, $$2, $$3, 1.0F, 1.0F, 1.0F, 0.0F, $$5))
         .a();
   }

   private static <C, I extends bbh<C>> azg<C, I> a(I $$0, I $$1, I $$2, float $$3, float $$4, float $$5, float $$6, bbh<Float> $$7) {
      float $$8 = -0.5775F;
      azg<C, I> $$9 = a($$1, $$2, $$3, $$5, $$7);
      azg<C, I> $$10 = a($$1, $$2, $$4, $$6, $$7);
      return azg.<C, I>a($$0, $$7).a(-1.0F, $$9).a(-0.78F, $$10).a(-0.5775F, $$10).a(-0.375F, 0.0F).a();
   }

   private static <C, I extends bbh<C>> azg<C, I> a(I $$0, I $$1, float $$2, float $$3, bbh<Float> $$4) {
      float $$5 = edx.a(0.4F);
      float $$6 = edx.a(0.56666666F);
      float $$7 = ($$5 + $$6) / 2.0F;
      azg.b<C, I> $$8 = azg.a($$1, $$4);
      $$8.a($$5, 0.0F);
      if ($$3 > 0.0F) {
         $$8.a($$7, a($$0, $$3, $$4));
      } else {
         $$8.a($$7, 0.0F);
      }

      if ($$2 > 0.0F) {
         $$8.a(1.0F, a($$0, $$2, $$4));
      } else {
         $$8.a(1.0F, 0.0F);
      }

      return $$8.a();
   }

   private static <C, I extends bbh<C>> azg<C, I> a(I $$0, float $$1, bbh<Float> $$2) {
      float $$3 = 0.63F * $$1;
      float $$4 = 0.3F * $$1;
      return azg.<C, I>a($$0, $$2).a(-0.01F, $$3).a(0.01F, $$4).a();
   }

   private static <C, I extends bbh<C>> azg<C, I> a(I $$0, I $$1, I $$2, float $$3, boolean $$4, bbh<Float> $$5) {
      azg<C, I> $$6 = azg.<C, I>a($$1, $$5).a(-0.2F, 6.3F).a(0.2F, $$3).a();
      azg.b<C, I> $$7 = azg.<C, I>a($$0, $$5)
         .a(-0.6F, $$6)
         .a(-0.5F, azg.<C, I>a($$1, $$5).a(-0.05F, 6.3F).a(0.05F, 2.67F).a())
         .a(-0.35F, $$6)
         .a(-0.25F, $$6)
         .a(-0.1F, azg.<C, I>a($$1, $$5).a(-0.05F, 2.67F).a(0.05F, 6.3F).a())
         .a(0.03F, $$6);
      if ($$4) {
         azg<C, I> $$8 = azg.<C, I>a($$1, $$5).a(0.0F, $$3).a(0.1F, 0.625F).a();
         azg<C, I> $$9 = azg.<C, I>a($$2, $$5).a(-0.9F, $$3).a(-0.69F, $$8).a();
         $$7.a(0.35F, $$3).a(0.45F, $$9).a(0.55F, $$9).a(0.62F, $$3);
      } else {
         azg<C, I> $$10 = azg.<C, I>a($$2, $$5).a(-0.7F, $$6).a(-0.15F, 1.37F).a();
         azg<C, I> $$11 = azg.<C, I>a($$2, $$5).a(0.45F, $$6).a(0.7F, 1.56F).a();
         $$7.a(0.05F, $$11).a(0.4F, $$11).a(0.45F, $$10).a(0.55F, $$10).a(0.58F, $$3);
      }

      return $$7.a();
   }

   private static float a(float $$0, float $$1, float $$2, float $$3) {
      return ($$1 - $$0) / ($$3 - $$2);
   }

   private static <C, I extends bbh<C>> azg<C, I> a(I $$0, float $$1, boolean $$2, bbh<Float> $$3) {
      azg.b<C, I> $$4 = azg.a($$0, $$3);
      float $$5 = -0.7F;
      float $$6 = -1.0F;
      float $$7 = a(-1.0F, $$1, -0.7F);
      float $$8 = 1.0F;
      float $$9 = a(1.0F, $$1, -0.7F);
      float $$10 = a($$1);
      float $$11 = -0.65F;
      if (-0.65F < $$10 && $$10 < 1.0F) {
         float $$12 = a(-0.65F, $$1, -0.7F);
         float $$13 = -0.75F;
         float $$14 = a(-0.75F, $$1, -0.7F);
         float $$15 = a($$7, $$14, -1.0F, -0.75F);
         $$4.a(-1.0F, $$7, $$15);
         $$4.a(-0.75F, $$14);
         $$4.a(-0.65F, $$12);
         float $$16 = a($$10, $$1, -0.7F);
         float $$17 = a($$16, $$9, $$10, 1.0F);
         float $$18 = 0.01F;
         $$4.a($$10 - 0.01F, $$16);
         $$4.a($$10, $$16, $$17);
         $$4.a(1.0F, $$9, $$17);
      } else {
         float $$19 = a($$7, $$9, -1.0F, 1.0F);
         if ($$2) {
            $$4.a(-1.0F, Math.max(0.2F, $$7));
            $$4.a(0.0F, bae.h(0.5F, $$7, $$9), $$19);
         } else {
            $$4.a(-1.0F, $$7, $$19);
         }

         $$4.a(1.0F, $$9, $$19);
      }

      return $$4.a();
   }

   private static float a(float $$0, float $$1, float $$2) {
      float $$3 = 1.17F;
      float $$4 = 0.46082947F;
      float $$5 = 1.0F - (1.0F - $$1) * 0.5F;
      float $$6 = 0.5F * (1.0F - $$1);
      float $$7 = ($$0 + 1.17F) * 0.46082947F;
      float $$8 = $$7 * $$5 - $$6;
      return $$0 < $$2 ? Math.max($$8, -0.2222F) : Math.max($$8, 0.0F);
   }

   private static float a(float $$0) {
      float $$1 = 1.17F;
      float $$2 = 0.46082947F;
      float $$3 = 1.0F - (1.0F - $$0) * 0.5F;
      float $$4 = 0.5F * (1.0F - $$0);
      return $$4 / (0.46082947F * $$3) - 1.17F;
   }

   public static <C, I extends bbh<C>> azg<C, I> a(
      I $$0, I $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8, boolean $$9, bbh<Float> $$10
   ) {
      float $$11 = 0.6F;
      float $$12 = 0.5F;
      float $$13 = 0.5F;
      azg<C, I> $$14 = a($$1, bae.h($$5, 0.6F, 1.5F), $$9, $$10);
      azg<C, I> $$15 = a($$1, bae.h($$5, 0.6F, 1.0F), $$9, $$10);
      azg<C, I> $$16 = a($$1, $$5, $$9, $$10);
      azg<C, I> $$17 = a($$1, $$2 - 0.15F, 0.5F * $$5, bae.h(0.5F, 0.5F, 0.5F) * $$5, 0.5F * $$5, 0.6F * $$5, 0.5F, $$10);
      azg<C, I> $$18 = a($$1, $$2, $$6 * $$5, $$3 * $$5, 0.5F * $$5, 0.6F * $$5, 0.5F, $$10);
      azg<C, I> $$19 = a($$1, $$2, $$6, $$6, $$3, $$4, 0.5F, $$10);
      azg<C, I> $$20 = a($$1, $$2, $$6, $$6, $$3, $$4, 0.5F, $$10);
      azg<C, I> $$21 = azg.<C, I>a($$1, $$10).a(-1.0F, $$2).a(-0.4F, $$19).a(0.0F, $$4 + 0.07F).a();
      azg<C, I> $$22 = a($$1, -0.02F, $$7, $$7, $$3, $$4, 0.0F, $$10);
      azg.b<C, I> $$23 = azg.<C, I>a($$0, $$10).a(-0.85F, $$14).a(-0.7F, $$15).a(-0.4F, $$16).a(-0.35F, $$17).a(-0.1F, $$18).a(0.2F, $$19);
      if ($$8) {
         $$23.a(0.4F, $$20).a(0.45F, $$21).a(0.55F, $$21).a(0.58F, $$20);
      }

      $$23.a(0.7F, $$22);
      return $$23.a();
   }

   private static <C, I extends bbh<C>> azg<C, I> a(I $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, bbh<Float> $$7) {
      float $$8 = Math.max(0.5F * ($$2 - $$1), $$6);
      float $$9 = 5.0F * ($$3 - $$2);
      return azg.<C, I>a($$0, $$7)
         .a(-1.0F, $$1, $$8)
         .a(-0.4F, $$2, Math.min($$8, $$9))
         .a(0.0F, $$3, $$9)
         .a(0.4F, $$4, 2.0F * ($$4 - $$3))
         .a(1.0F, $$5, 0.7F * ($$5 - $$4))
         .a();
   }
}
