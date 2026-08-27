public class gad extends gcg<bzy, fln<bzy>> {
   private static final aiy a = new aiy("textures/entity/bee/bee_angry.png");
   private static final aiy i = new aiy("textures/entity/bee/bee_angry_nectar.png");
   private static final aiy j = new aiy("textures/entity/bee/bee.png");
   private static final aiy k = new aiy("textures/entity/bee/bee_nectar.png");

   public gad(gba.a $$0) {
      super($$0, new fln<>($$0.a(fpi.k)), 0.4F);
   }

   public aiy a(bzy $$0) {
      if ($$0.aa_()) {
         return $$0.gq() ? i : a;
      } else {
         return $$0.gq() ? k : j;
      }
   }
}
