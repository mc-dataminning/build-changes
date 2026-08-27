public class gfg<T extends box, M extends foj<T>> extends ggs<T, M> {
   private static final ajc a = new ajc("textures/entity/bee/bee_stinger.png");

   public gfg(gcz<T, M> $$0) {
      super($$0);
   }

   @Override
   protected int a(T $$0) {
      return $$0.eO();
   }

   @Override
   protected void a(etd $$0, fwq $$1, int $$2, bof $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = awm.c($$4 * $$4 + $$6 * $$6);
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
      eth $$16 = $$1.getBuffer(fwy.e(a));

      for (int $$17 = 0; $$17 < 4; $$17++) {
         $$0.a(a.b.rotationDegrees(90.0F));
         etd.a $$18 = $$0.c();
         a($$16, $$18, -4.5F, -1, 0.0F, 0.0F, $$2);
         a($$16, $$18, 4.5F, -1, 0.125F, 0.0F, $$2);
         a($$16, $$18, 4.5F, 1, 0.125F, 0.0625F, $$2);
         a($$16, $$18, -4.5F, 1, 0.0F, 0.0625F, $$2);
      }
   }

   private static void a(eth $$0, etd.a $$1, float $$2, int $$3, float $$4, float $$5, int $$6) {
      $$0.a($$1, $$2, (float)$$3, 0.0F).a(255, 255, 255, 255).a($$4, $$5).c(ghq.d).b($$6).b($$1, 0.0F, 1.0F, 0.0F).e();
   }
}
