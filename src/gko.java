public class gko extends gks<cgy, fvh<cgy>> {
   private static final akk a = new akk("textures/entity/llama/creamy.png");
   private static final akk i = new akk("textures/entity/llama/white.png");
   private static final akk j = new akk("textures/entity/llama/brown.png");
   private static final akk k = new akk("textures/entity/llama/gray.png");

   public gko(gjm.a $$0, fxm $$1) {
      super($$0, new fvh<>($$0.a($$1)), 0.7F);
      this.a(new gns(this, $$0.f()));
   }

   public akk a(cgy $$0) {
      return switch ($$0.gA()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
