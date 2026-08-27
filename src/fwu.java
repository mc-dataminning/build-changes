public class fwu extends fxc<byw, fez<byw>> {
   private static final aey a = new aey("textures/entity/creeper/creeper_armor.png");
   private final fez<byw> b;

   public fwu(fve<byw, fez<byw>> $$0, fia $$1) {
      super($$0);
      this.b = new fez<>($$1.a(fid.C));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected aey a() {
      return a;
   }

   @Override
   protected fff<byw> b() {
      return this.b;
   }
}
