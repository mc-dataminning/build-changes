public class gfm extends gfu<ces, fmy<ces>> {
   private static final ajc a = new ajc("textures/entity/creeper/creeper_armor.png");
   private final fmy<ces> b;

   public gfm(gdt<ces, fmy<ces>> $$0, fqb $$1) {
      super($$0);
      this.b = new fmy<>($$1.a(fqe.E));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ajc a() {
      return a;
   }

   @Override
   protected fne<ces> b() {
      return this.b;
   }
}
