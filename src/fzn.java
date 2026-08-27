public class fzn extends fzr<bzz, fko<bzz>> {
   private static final ahg a = new ahg("textures/entity/llama/creamy.png");
   private static final ahg i = new ahg("textures/entity/llama/white.png");
   private static final ahg j = new ahg("textures/entity/llama/brown.png");
   private static final ahg k = new ahg("textures/entity/llama/gray.png");

   public fzn(fyl.a $$0, fmt $$1) {
      super($$0, new fko<>($$0.a($$1)), 0.7F);
      this.a(new gcq(this, $$0.f()));
   }

   public ahg a(bzz $$0) {
      return switch ($$0.gq()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
