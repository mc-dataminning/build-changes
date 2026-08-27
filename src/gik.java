public class gik extends ggx<chu, fte> {
   private static final ajv a = new ajv("textures/entity/illager/vex.png");
   private static final ajv i = new ajv("textures/entity/illager/vex_charging.png");

   public gik(gfr.a $$0) {
      super($$0, new fte($$0.a(ftu.bO)), 0.3F);
      this.a(new gjv<>(this, $$0.d()));
   }

   protected int a(chu $$0, id $$1) {
      return 15;
   }

   public ajv a(chu $$0) {
      return $$0.go() ? i : a;
   }
}
