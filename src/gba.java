public class gba extends fxn<cfq> {
   public static final ahg a = new ahg("textures/entity/projectiles/arrow.png");
   public static final ahg f = new ahg("textures/entity/projectiles/tipped_arrow.png");

   public gba(fyn.a $$0) {
      super($$0);
   }

   public ahg a(cfq $$0) {
      return $$0.I() > 0 ? f : a;
   }
}
