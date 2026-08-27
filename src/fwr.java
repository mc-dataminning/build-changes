public class fwr extends fyu<bxj, fid<bxj>> {
   private static final agt a = new agt("textures/entity/bee/bee_angry.png");
   private static final agt i = new agt("textures/entity/bee/bee_angry_nectar.png");
   private static final agt j = new agt("textures/entity/bee/bee.png");
   private static final agt k = new agt("textures/entity/bee/bee_nectar.png");

   public fwr(fxo.a $$0) {
      super($$0, new fid<>($$0.a(flx.j)), 0.4F);
   }

   public agt a(bxj $$0) {
      if ($$0.aa_()) {
         return $$0.go() ? i : a;
      } else {
         return $$0.go() ? k : j;
      }
   }
}
