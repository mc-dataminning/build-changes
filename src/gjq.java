public class gjq extends gid<cjb, fuk> {
   private static final akh a = new akh("textures/entity/illager/vex.png");
   private static final akh i = new akh("textures/entity/illager/vex_charging.png");

   public gjq(ggx.a $$0) {
      super($$0, new fuk($$0.a(fva.bO)), 0.3F);
      this.a(new glb<>(this, $$0.d()));
   }

   protected int a(cjb $$0, in $$1) {
      return 15;
   }

   public akh a(cjb $$0) {
      return $$0.gq() ? i : a;
   }
}
