public class fyd extends gag<byd, fjo<byd>> {
   private static final ahh a = new ahh("textures/entity/bee/bee_angry.png");
   private static final ahh i = new ahh("textures/entity/bee/bee_angry_nectar.png");
   private static final ahh j = new ahh("textures/entity/bee/bee.png");
   private static final ahh k = new ahh("textures/entity/bee/bee_nectar.png");

   public fyd(fza.a $$0) {
      super($$0, new fjo<>($$0.a(fni.k)), 0.4F);
   }

   public ahh a(byd $$0) {
      if ($$0.aa_()) {
         return $$0.gp() ? i : a;
      } else {
         return $$0.gp() ? k : j;
      }
   }
}
