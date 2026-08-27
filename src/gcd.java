public class gcd extends geh<cbf, fnj<cbf>> {
   private static final ajh a = new ajh("textures/entity/bee/bee_angry.png");
   private static final ajh i = new ajh("textures/entity/bee/bee_angry_nectar.png");
   private static final ajh j = new ajh("textures/entity/bee/bee.png");
   private static final ajh k = new ajh("textures/entity/bee/bee_nectar.png");

   public gcd(gdb.a $$0) {
      super($$0, new fnj<>($$0.a(fre.k)), 0.4F);
   }

   public ajh a(cbf $$0) {
      if ($$0.Y_()) {
         return $$0.gx() ? i : a;
      } else {
         return $$0.gx() ? k : j;
      }
   }
}
