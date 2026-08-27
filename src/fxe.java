public class fxe extends fxi<byy, fin<byy>> {
   private static final agm a = new agm("textures/entity/llama/creamy.png");
   private static final agm i = new agm("textures/entity/llama/white.png");
   private static final agm j = new agm("textures/entity/llama/brown.png");
   private static final agm k = new agm("textures/entity/llama/gray.png");

   public fxe(fwc.a $$0, fkr $$1) {
      super($$0, new fin<>($$0.a($$1)), 0.7F);
      this.a(new gae(this, $$0.f()));
   }

   public agm a(byy $$0) {
      return switch ($$0.gr()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
