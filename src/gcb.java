public class gcb extends gee<cbe, fnh<cbe>> {
   private static final ajh a = new ajh("textures/entity/bee/bee_angry.png");
   private static final ajh i = new ajh("textures/entity/bee/bee_angry_nectar.png");
   private static final ajh j = new ajh("textures/entity/bee/bee.png");
   private static final ajh k = new ajh("textures/entity/bee/bee_nectar.png");

   public gcb(gcy.a $$0) {
      super($$0, new fnh<>($$0.a(frc.k)), 0.4F);
   }

   public ajh a(cbe $$0) {
      if ($$0.Y_()) {
         return $$0.gx() ? i : a;
      } else {
         return $$0.gx() ? k : j;
      }
   }
}
