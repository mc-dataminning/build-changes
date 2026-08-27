public class fvb extends fxd<bws, fgv<bws>> {
   private static final agi a = new agi("textures/entity/bee/bee_angry.png");
   private static final agi i = new agi("textures/entity/bee/bee_angry_nectar.png");
   private static final agi j = new agi("textures/entity/bee/bee.png");
   private static final agi k = new agi("textures/entity/bee/bee_nectar.png");

   public fvb(fvx.a $$0) {
      super($$0, new fgv<>($$0.a(fkn.j)), 0.4F);
   }

   public agi a(bws $$0) {
      if ($$0.Z_()) {
         return $$0.gp() ? i : a;
      } else {
         return $$0.gp() ? k : j;
      }
   }
}
