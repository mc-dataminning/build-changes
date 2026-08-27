public class gda extends gde<ccr, fnx<ccr>> {
   private static final ajc a = new ajc("textures/entity/llama/creamy.png");
   private static final ajc i = new ajc("textures/entity/llama/white.png");
   private static final ajc j = new ajc("textures/entity/llama/brown.png");
   private static final ajc k = new ajc("textures/entity/llama/gray.png");

   public gda(gby.a $$0, fqd $$1) {
      super($$0, new fnx<>($$0.a($$1)), 0.7F);
      this.a(new ggd(this, $$0.f()));
   }

   public ajc a(ccr $$0) {
      return switch ($$0.gx()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
