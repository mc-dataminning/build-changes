public class gjs extends glz<cef, fuu<cef>> {
   private static final akt a = new akt("textures/entity/bee/bee_angry.png");
   private static final akt b = new akt("textures/entity/bee/bee_angry_nectar.png");
   private static final akt g = new akt("textures/entity/bee/bee.png");
   private static final akt k = new akt("textures/entity/bee/bee_nectar.png");

   public gjs(gkq.a $$0) {
      super($$0, new fuu<>($$0.a(fyr.l)), 0.4F);
   }

   public akt a(cef $$0) {
      if ($$0.aa_()) {
         return $$0.gI() ? b : a;
      } else {
         return $$0.gI() ? k : g;
      }
   }
}
