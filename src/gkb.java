public class gkb extends gkf<cho, fuv<cho>> {
   private static final alf a = new alf("textures/entity/llama/creamy.png");
   private static final alf i = new alf("textures/entity/llama/white.png");
   private static final alf j = new alf("textures/entity/llama/brown.png");
   private static final alf k = new alf("textures/entity/llama/gray.png");

   public gkb(giz.a $$0, fxa $$1) {
      super($$0, new fuv<>($$0.a($$1)), 0.7F);
      this.a(new gnf(this, $$0.f()));
   }

   public alf a(cho $$0) {
      return switch ($$0.gC()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
