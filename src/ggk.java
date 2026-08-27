public class ggk extends ggo<cei, frf<cei>> {
   private static final ajt a = new ajt("textures/entity/llama/creamy.png");
   private static final ajt i = new ajt("textures/entity/llama/white.png");
   private static final ajt j = new ajt("textures/entity/llama/brown.png");
   private static final ajt k = new ajt("textures/entity/llama/gray.png");

   public ggk(gfi.a $$0, ftk $$1) {
      super($$0, new frf<>($$0.a($$1)), 0.7F);
      this.a(new gjn(this, $$0.f()));
   }

   public ajt a(cei $$0) {
      return switch ($$0.gz()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
