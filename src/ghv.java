public class ghv extends geh<ckb> {
   public static final ajt a = new ajt("textures/entity/projectiles/arrow.png");
   public static final ajt f = new ajt("textures/entity/projectiles/tipped_arrow.png");

   public ghv(gfi.a $$0) {
      super($$0);
   }

   public ajt a(ckb $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
