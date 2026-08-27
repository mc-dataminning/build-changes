public class gkh extends ggs<cme> {
   public static final akm a = new akm("textures/entity/projectiles/arrow.png");
   public static final akm f = new akm("textures/entity/projectiles/tipped_arrow.png");

   public gkh(ght.a $$0) {
      super($$0);
   }

   public akm a(cme $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
