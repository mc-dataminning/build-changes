public class gju extends gjy<chh, fuo<chh>> {
   private static final alb a = new alb("textures/entity/llama/creamy.png");
   private static final alb i = new alb("textures/entity/llama/white.png");
   private static final alb j = new alb("textures/entity/llama/brown.png");
   private static final alb k = new alb("textures/entity/llama/gray.png");

   public gju(gis.a $$0, fwt $$1) {
      super($$0, new fuo<>($$0.a($$1)), 0.7F);
      this.a(new gmy(this, $$0.f()));
   }

   public alb a(chh $$0) {
      return switch ($$0.gC()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
