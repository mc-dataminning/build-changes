public class fwz extends fxd<byt, fii<byt>> {
   private static final agi a = new agi("textures/entity/llama/creamy.png");
   private static final agi i = new agi("textures/entity/llama/white.png");
   private static final agi j = new agi("textures/entity/llama/brown.png");
   private static final agi k = new agi("textures/entity/llama/gray.png");

   public fwz(fvx.a $$0, fkm $$1) {
      super($$0, new fii<>($$0.a($$1)), 0.7F);
      this.a(new fzz(this, $$0.f()));
   }

   public agi a(byt $$0) {
      return switch ($$0.gr()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
