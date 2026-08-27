public class gnh extends gjo<cmg> {
   public static final akt a = new akt("textures/entity/projectiles/arrow.png");
   public static final akt b = new akt("textures/entity/projectiles/tipped_arrow.png");

   public gnh(gkq.a $$0) {
      super($$0);
   }

   public akt a(cmg $$0) {
      return $$0.G() > 0 ? b : a;
   }
}
