public class gmi<T extends btr, M extends fvh<T>> extends gnu<T, M> {
   private static final alf a = new alf("textures/entity/bee/bee_stinger.png");

   public gmi(gka<T, M> $$0) {
      super($$0);
   }

   @Override
   protected int a(T $$0) {
      return $$0.eU();
   }

   @Override
   protected void a(faa $$0, gdq $$1, int $$2, bsw $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = ayz.c($$4 * $$4 + $$6 * $$6);
      float $$9 = (float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI);
      float $$10 = (float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI);
      $$0.a(0.0F, 0.0F, 0.0F);
      $$0.a(a.d.rotationDegrees($$9 - 90.0F));
      $$0.a(a.f.rotationDegrees($$10));
      float $$11 = 0.0F;
      float $$12 = 0.125F;
      float $$13 = 0.0F;
      float $$14 = 0.0625F;
      float $$15 = 0.03125F;
      $$0.a(a.b.rotationDegrees(45.0F));
      $$0.b(0.03125F, 0.03125F, 0.03125F);
      $$0.a(2.5F, 0.0F, 0.0F);
      fae $$16 = $$1.getBuffer(gdy.e(a));

      for (int $$17 = 0; $$17 < 4; $$17++) {
         $$0.a(a.b.rotationDegrees(90.0F));
         faa.a $$18 = $$0.c();
         a($$16, $$18, -4.5F, -1, 0.0F, 0.0F, $$2);
         a($$16, $$18, 4.5F, -1, 0.125F, 0.0F, $$2);
         a($$16, $$18, 4.5F, 1, 0.125F, 0.0625F, $$2);
         a($$16, $$18, -4.5F, 1, 0.0F, 0.0625F, $$2);
      }
   }

   private static void a(fae $$0, faa.a $$1, float $$2, int $$3, float $$4, float $$5, int $$6) {
      $$0.a($$1, $$2, (float)$$3, 0.0F).a(255, 255, 255, 255).a($$4, $$5).c(gos.d).b($$6).b($$1, 0.0F, 1.0F, 0.0F).e();
   }
}
