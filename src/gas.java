public class gas extends fxf<cfj> {
   public static final ahd a = new ahd("textures/entity/projectiles/arrow.png");
   public static final ahd f = new ahd("textures/entity/projectiles/tipped_arrow.png");

   public gas(fyf.a $$0) {
      super($$0);
   }

   public ahd a(cfj $$0) {
      return $$0.I() > 0 ? f : a;
   }
}
