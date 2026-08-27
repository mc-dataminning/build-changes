public class ghp extends ght<cfa, fsk<cfa>> {
   private static final akf a = new akf("textures/entity/llama/creamy.png");
   private static final akf i = new akf("textures/entity/llama/white.png");
   private static final akf j = new akf("textures/entity/llama/brown.png");
   private static final akf k = new akf("textures/entity/llama/gray.png");

   public ghp(ggn.a $$0, fup $$1) {
      super($$0, new fsk<>($$0.a($$1)), 0.7F);
      this.a(new gks(this, $$0.f()));
   }

   public akf a(cfa $$0) {
      return switch ($$0.gB()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
