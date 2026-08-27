public class ggx extends gfu<cdz, fpv<cdz>> {
   private static final ajc a = new ajc("textures/entity/wither/wither_armor.png");
   private final fpv<cdz> b;

   public ggx(gdt<cdz, fpv<cdz>> $$0, fqb $$1) {
      super($$0);
      this.b = new fpv<>($$1.a(fqe.bS));
   }

   @Override
   protected float a(float $$0) {
      return awm.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ajc a() {
      return a;
   }

   @Override
   protected fne<cdz> b() {
      return this.b;
   }
}
