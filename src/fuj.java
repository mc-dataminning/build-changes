public class fuj extends fun<bwt, ffw<bwt>> {
   private static final aex a = new aex("textures/entity/llama/creamy.png");
   private static final aex i = new aex("textures/entity/llama/white.png");
   private static final aex j = new aex("textures/entity/llama/brown.png");
   private static final aex k = new aex("textures/entity/llama/gray.png");

   public fuj(fth.a $$0, fia $$1) {
      super($$0, new ffw<>($$0.a($$1)), 0.7F);
      this.a(new fxj(this, $$0.f()));
   }

   public aex a(bwt $$0) {
      return switch ($$0.gp()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
