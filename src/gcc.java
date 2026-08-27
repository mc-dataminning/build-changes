public class gcc extends gcg<ccc, fnb<ccc>> {
   private static final aiy a = new aiy("textures/entity/llama/creamy.png");
   private static final aiy i = new aiy("textures/entity/llama/white.png");
   private static final aiy j = new aiy("textures/entity/llama/brown.png");
   private static final aiy k = new aiy("textures/entity/llama/gray.png");

   public gcc(gba.a $$0, fph $$1) {
      super($$0, new fnb<>($$0.a($$1)), 0.7F);
      this.a(new gff(this, $$0.f()));
   }

   public aiy a(ccc $$0) {
      return switch ($$0.gs()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
