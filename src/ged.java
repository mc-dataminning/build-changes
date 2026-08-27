public class ged extends geh<cdj, foy<cdj>> {
   private static final ajh a = new ajh("textures/entity/llama/creamy.png");
   private static final ajh i = new ajh("textures/entity/llama/white.png");
   private static final ajh j = new ajh("textures/entity/llama/brown.png");
   private static final ajh k = new ajh("textures/entity/llama/gray.png");

   public ged(gdb.a $$0, frd $$1) {
      super($$0, new foy<>($$0.a($$1)), 0.7F);
      this.a(new ghg(this, $$0.f()));
   }

   public ajh a(cdj $$0) {
      return switch ($$0.gz()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
