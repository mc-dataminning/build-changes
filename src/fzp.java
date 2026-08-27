public class fzp extends fzt<caa, fkq<caa>> {
   private static final ahg a = new ahg("textures/entity/llama/creamy.png");
   private static final ahg i = new ahg("textures/entity/llama/white.png");
   private static final ahg j = new ahg("textures/entity/llama/brown.png");
   private static final ahg k = new ahg("textures/entity/llama/gray.png");

   public fzp(fyn.a $$0, fmv $$1) {
      super($$0, new fkq<>($$0.a($$1)), 0.7F);
      this.a(new gcs(this, $$0.f()));
   }

   public ahg a(caa $$0) {
      return switch ($$0.gq()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
