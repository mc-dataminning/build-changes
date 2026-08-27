public class gac extends gag<cah, flc<cah>> {
   private static final ahh a = new ahh("textures/entity/llama/creamy.png");
   private static final ahh i = new ahh("textures/entity/llama/white.png");
   private static final ahh j = new ahh("textures/entity/llama/brown.png");
   private static final ahh k = new ahh("textures/entity/llama/gray.png");

   public gac(fza.a $$0, fnh $$1) {
      super($$0, new flc<>($$0.a($$1)), 0.7F);
      this.a(new gdf(this, $$0.f()));
   }

   public ahh a(cah $$0) {
      return switch ($$0.gr()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
