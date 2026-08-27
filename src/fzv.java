public class fzv extends gby<bzu, flg<bzu>> {
   private static final aiy a = new aiy("textures/entity/bee/bee_angry.png");
   private static final aiy i = new aiy("textures/entity/bee/bee_angry_nectar.png");
   private static final aiy j = new aiy("textures/entity/bee/bee.png");
   private static final aiy k = new aiy("textures/entity/bee/bee_nectar.png");

   public fzv(gas.a $$0) {
      super($$0, new flg<>($$0.a(fpb.k)), 0.4F);
   }

   public aiy a(bzu $$0) {
      if ($$0.aa_()) {
         return $$0.gq() ? i : a;
      } else {
         return $$0.gq() ? k : j;
      }
   }
}
