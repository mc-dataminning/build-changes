public class gjo extends gmc {
   private static final ale a = new ale("textures/entity/zombie/husk.png");

   public gjo(giw.a $$0) {
      super($$0, fwy.ar, fwy.as, fwy.at);
   }

   protected void a(ckv $$0, ezx $$1, float $$2) {
      float $$3 = 1.0625F;
      $$1.b(1.0625F, 1.0625F, 1.0625F);
      super.a($$0, $$1, $$2);
   }

   @Override
   public ale a(ckv $$0) {
      return a;
   }
}
