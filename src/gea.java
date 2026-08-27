public class gea extends gee<cdi, fow<cdi>> {
   private static final ajh a = new ajh("textures/entity/llama/creamy.png");
   private static final ajh i = new ajh("textures/entity/llama/white.png");
   private static final ajh j = new ajh("textures/entity/llama/brown.png");
   private static final ajh k = new ajh("textures/entity/llama/gray.png");

   public gea(gcy.a $$0, frb $$1) {
      super($$0, new fow<>($$0.a($$1)), 0.7F);
      this.a(new ghd(this, $$0.f()));
   }

   public ajh a(cdi $$0) {
      return switch ($$0.gz()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
