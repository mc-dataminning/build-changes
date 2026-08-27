public class gkh extends ggs<cmg> {
   public static final akn a = new akn("textures/entity/projectiles/arrow.png");
   public static final akn f = new akn("textures/entity/projectiles/tipped_arrow.png");

   public gkh(ght.a $$0) {
      super($$0);
   }

   public akn a(cmg $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
