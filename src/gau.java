public class gau {
   public static void a(gfe $$0, gfe $$1, gfe $$2, boolean $$3) {
      gfe $$4 = $$3 ? $$0 : $$1;
      gfe $$5 = $$3 ? $$1 : $$0;
      $$4.f = ($$3 ? -0.3F : 0.3F) + $$2.f;
      $$5.f = ($$3 ? 0.6F : -0.6F) + $$2.f;
      $$4.e = (float) (-Math.PI / 2) + $$2.e + 0.1F;
      $$5.e = -1.5F + $$2.e;
   }

   public static void a(gfe $$0, gfe $$1, float $$2, int $$3, boolean $$4) {
      gfe $$5 = $$4 ? $$0 : $$1;
      gfe $$6 = $$4 ? $$1 : $$0;
      $$5.f = $$4 ? -0.8F : 0.8F;
      $$5.e = -0.97079635F;
      $$6.e = $$5.e;
      float $$7 = ayz.a((float)$$3, 0.0F, $$2);
      float $$8 = $$7 / $$2;
      $$6.f = ayz.h($$8, 0.4F, 0.85F) * (float)($$4 ? 1 : -1);
      $$6.e = ayz.h($$8, $$6.e, (float) (-Math.PI / 2));
   }

   public static void a(gfe $$0, gfe $$1, bvc $$2, float $$3, float $$4) {
      float $$5 = ayz.a($$3 * (float) Math.PI);
      float $$6 = ayz.a((1.0F - (1.0F - $$3) * (1.0F - $$3)) * (float) Math.PI);
      $$0.g = 0.0F;
      $$1.g = 0.0F;
      $$0.f = (float) (Math.PI / 20);
      $$1.f = (float) (-Math.PI / 20);
      if ($$2 == bvc.b) {
         $$0.e = -1.8849558F + ayz.b($$4 * 0.09F) * 0.15F;
         $$1.e = -0.0F + ayz.b($$4 * 0.19F) * 0.5F;
         $$0.e += $$5 * 2.2F - $$6 * 0.4F;
         $$1.e += $$5 * 1.2F - $$6 * 0.4F;
      } else {
         $$0.e = -0.0F + ayz.b($$4 * 0.19F) * 0.5F;
         $$1.e = -1.8849558F + ayz.b($$4 * 0.09F) * 0.15F;
         $$0.e += $$5 * 1.2F - $$6 * 0.4F;
         $$1.e += $$5 * 2.2F - $$6 * 0.4F;
      }

      a($$0, $$1, $$4);
   }

   public static void a(gfe $$0, float $$1, float $$2) {
      $$0.g = $$0.g + $$2 * (ayz.b($$1 * 0.09F) * 0.05F + 0.05F);
      $$0.e = $$0.e + $$2 * ayz.a($$1 * 0.067F) * 0.05F;
   }

   public static void a(gfe $$0, gfe $$1, float $$2) {
      a($$0, $$2, 1.0F);
      a($$1, $$2, -1.0F);
   }

   public static void a(gfe $$0, gfe $$1, boolean $$2, float $$3, float $$4) {
      float $$5 = ayz.a($$3 * (float) Math.PI);
      float $$6 = ayz.a((1.0F - (1.0F - $$3) * (1.0F - $$3)) * (float) Math.PI);
      $$1.g = 0.0F;
      $$0.g = 0.0F;
      $$1.f = -(0.1F - $$5 * 0.6F);
      $$0.f = 0.1F - $$5 * 0.6F;
      float $$7 = (float) -Math.PI / ($$2 ? 1.5F : 2.25F);
      $$1.e = $$7;
      $$0.e = $$7;
      $$1.e += $$5 * 1.2F - $$6 * 0.4F;
      $$0.e += $$5 * 1.2F - $$6 * 0.4F;
      a($$1, $$0, $$4);
   }
}
