public class fxt extends fwq<bxt, fhi<bxt>> {
   private static final aer a = new aer("textures/entity/wither/wither_armor.png");
   private final fhi<bxt> b;

   public fxt(fus<bxt, fhi<bxt>> $$0, fho $$1) {
      super($$0);
      this.b = new fhi<>($$1.a(fhr.bP));
   }

   @Override
   protected float a(float $$0) {
      return arp.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected aer a() {
      return a;
   }

   @Override
   protected fet<bxt> b() {
      return this.b;
   }
}
