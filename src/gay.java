public class gay extends fzv<cag, fkj<cag>> {
   private static final agm a = new agm("textures/entity/wither/wither_armor.png");
   private final fkj<cag> b;

   public gay(fxx<cag, fkj<cag>> $$0, fkp $$1) {
      super($$0);
      this.b = new fkj<>($$1.a(fks.bP));
   }

   @Override
   protected float a(float $$0) {
      return atq.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected agm a() {
      return a;
   }

   @Override
   protected fhu<cag> b() {
      return this.b;
   }
}
