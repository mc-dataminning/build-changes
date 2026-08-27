public class ghz extends gid<cfw, fsu<cfw>> {
   private static final akh a = new akh("textures/entity/llama/creamy.png");
   private static final akh i = new akh("textures/entity/llama/white.png");
   private static final akh j = new akh("textures/entity/llama/brown.png");
   private static final akh k = new akh("textures/entity/llama/gray.png");

   public ghz(ggx.a $$0, fuz $$1) {
      super($$0, new fsu<>($$0.a($$1)), 0.7F);
      this.a(new glc(this, $$0.f()));
   }

   public akh a(cfw $$0) {
      return switch ($$0.gB()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
