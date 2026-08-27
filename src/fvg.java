public class fvg extends fxi<bwx, fha<bwx>> {
   private static final agm a = new agm("textures/entity/bee/bee_angry.png");
   private static final agm i = new agm("textures/entity/bee/bee_angry_nectar.png");
   private static final agm j = new agm("textures/entity/bee/bee.png");
   private static final agm k = new agm("textures/entity/bee/bee_nectar.png");

   public fvg(fwc.a $$0) {
      super($$0, new fha<>($$0.a(fks.j)), 0.4F);
   }

   public agm a(bwx $$0) {
      if ($$0.aa_()) {
         return $$0.gp() ? i : a;
      } else {
         return $$0.gp() ? k : j;
      }
   }
}
