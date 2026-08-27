public class gbb extends gde<can, fmj<can>> {
   private static final ajc a = new ajc("textures/entity/bee/bee_angry.png");
   private static final ajc i = new ajc("textures/entity/bee/bee_angry_nectar.png");
   private static final ajc j = new ajc("textures/entity/bee/bee.png");
   private static final ajc k = new ajc("textures/entity/bee/bee_nectar.png");

   public gbb(gby.a $$0) {
      super($$0, new fmj<>($$0.a(fqe.k)), 0.4F);
   }

   public ajc a(can $$0) {
      if ($$0.aa_()) {
         return $$0.gv() ? i : a;
      } else {
         return $$0.gv() ? k : j;
      }
   }
}
