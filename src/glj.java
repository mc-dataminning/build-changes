public class glj extends ghu<cnd> {
   public static final ale a = new ale("textures/entity/projectiles/arrow.png");
   public static final ale f = new ale("textures/entity/projectiles/tipped_arrow.png");

   public glj(giv.a $$0) {
      super($$0);
   }

   public ale a(cnd $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
