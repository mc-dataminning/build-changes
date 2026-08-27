public class fwi extends fwq<bym, fen<bym>> {
   private static final aer a = new aer("textures/entity/creeper/creeper_armor.png");
   private final fen<bym> b;

   public fwi(fus<bym, fen<bym>> $$0, fho $$1) {
      super($$0);
      this.b = new fen<>($$1.a(fhr.C));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected aer a() {
      return a;
   }

   @Override
   protected fet<bym> b() {
      return this.b;
   }
}
