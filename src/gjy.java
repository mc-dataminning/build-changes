public class gjy extends gkc<chl, fus<chl>> {
   private static final ale a = new ale("textures/entity/llama/creamy.png");
   private static final ale i = new ale("textures/entity/llama/white.png");
   private static final ale j = new ale("textures/entity/llama/brown.png");
   private static final ale k = new ale("textures/entity/llama/gray.png");

   public gjy(giw.a $$0, fwx $$1) {
      super($$0, new fus<>($$0.a($$1)), 0.7F);
      this.a(new gnc(this, $$0.f()));
   }

   public ale a(chl $$0) {
      return switch ($$0.gC()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
