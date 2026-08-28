public class gkq extends gku<cgz, fvj<cgz>> {
   private static final akk a = new akk("textures/entity/llama/creamy.png");
   private static final akk i = new akk("textures/entity/llama/white.png");
   private static final akk j = new akk("textures/entity/llama/brown.png");
   private static final akk k = new akk("textures/entity/llama/gray.png");

   public gkq(gjo.a $$0, fxo $$1) {
      super($$0, new fvj<>($$0.a($$1)), 0.7F);
      this.a(new gnu(this, $$0.f()));
   }

   public akk a(cgz $$0) {
      return switch ($$0.gz()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
