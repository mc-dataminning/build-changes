public class fzo extends fzs<bzz, fkp<bzz>> {
   private static final ahg a = new ahg("textures/entity/llama/creamy.png");
   private static final ahg i = new ahg("textures/entity/llama/white.png");
   private static final ahg j = new ahg("textures/entity/llama/brown.png");
   private static final ahg k = new ahg("textures/entity/llama/gray.png");

   public fzo(fym.a $$0, fmu $$1) {
      super($$0, new fkp<>($$0.a($$1)), 0.7F);
      this.a(new gcr(this, $$0.f()));
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
