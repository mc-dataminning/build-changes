public class gjn extends gmb {
   private static final ale a = new ale("textures/entity/zombie/husk.png");

   public gjn(giv.a $$0) {
      super($$0, fwx.ar, fwx.as, fwx.at);
   }

   protected void a(cku $$0, ezw $$1, float $$2) {
      float $$3 = 1.0625F;
      $$1.b(1.0625F, 1.0625F, 1.0625F);
      super.a($$0, $$1, $$2);
   }

   @Override
   public ale a(cku $$0) {
      return a;
   }
}
