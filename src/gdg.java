public class gdg extends fzt<chp> {
   public static final aiy a = new aiy("textures/entity/projectiles/arrow.png");
   public static final aiy f = new aiy("textures/entity/projectiles/tipped_arrow.png");

   public gdg(gat.a $$0) {
      super($$0);
   }

   public aiy a(chp $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
