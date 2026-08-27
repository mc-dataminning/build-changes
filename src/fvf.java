public class fvf extends fvj<bxw, fgq<bxw>> {
   private static final afw a = new afw("textures/entity/llama/creamy.png");
   private static final afw i = new afw("textures/entity/llama/white.png");
   private static final afw j = new afw("textures/entity/llama/brown.png");
   private static final afw k = new afw("textures/entity/llama/gray.png");

   public fvf(fud.a $$0, fiu $$1) {
      super($$0, new fgq<>($$0.a($$1)), 0.7F);
      this.a(new fyf(this, $$0.f()));
   }

   public afw a(bxw $$0) {
      return switch ($$0.gq()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
