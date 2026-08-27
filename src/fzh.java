public class fzh extends fzl<bzu, fki<bzu>> {
   private static final ahd a = new ahd("textures/entity/llama/creamy.png");
   private static final ahd i = new ahd("textures/entity/llama/white.png");
   private static final ahd j = new ahd("textures/entity/llama/brown.png");
   private static final ahd k = new ahd("textures/entity/llama/gray.png");

   public fzh(fyf.a $$0, fmn $$1) {
      super($$0, new fki<>($$0.a($$1)), 0.7F);
      this.a(new gck(this, $$0.f()));
   }

   public ahd a(bzu $$0) {
      return switch ($$0.gq()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
