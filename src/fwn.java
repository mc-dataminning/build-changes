public class fwn extends fwv<byp, fes<byp>> {
   private static final aeu a = new aeu("textures/entity/creeper/creeper_armor.png");
   private final fes<byp> b;

   public fwn(fux<byp, fes<byp>> $$0, fht $$1) {
      super($$0);
      this.b = new fes<>($$1.a(fhw.C));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected aeu a() {
      return a;
   }

   @Override
   protected fey<byp> b() {
      return this.b;
   }
}
