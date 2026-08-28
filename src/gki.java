public class gki extends gkm<cgv, fvb<cgv>> {
   private static final akk a = new akk("textures/entity/llama/creamy.png");
   private static final akk i = new akk("textures/entity/llama/white.png");
   private static final akk j = new akk("textures/entity/llama/brown.png");
   private static final akk k = new akk("textures/entity/llama/gray.png");

   public gki(gjg.a $$0, fxg $$1) {
      super($$0, new fvb<>($$0.a($$1)), 0.7F);
      this.a(new gnm(this, $$0.f()));
   }

   public akk a(cgv $$0) {
      return switch ($$0.gz()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
