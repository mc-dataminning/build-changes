public class gio extends gks<ces, fts<ces>> {
   private static final akk a = new akk("textures/entity/bee/bee_angry.png");
   private static final akk i = new akk("textures/entity/bee/bee_angry_nectar.png");
   private static final akk j = new akk("textures/entity/bee/bee.png");
   private static final akk k = new akk("textures/entity/bee/bee_nectar.png");

   public gio(gjm.a $$0) {
      super($$0, new fts<>($$0.a(fxn.k)), 0.4F);
   }

   public akk a(ces $$0) {
      if ($$0.Z_()) {
         return $$0.gy() ? i : a;
      } else {
         return $$0.gy() ? k : j;
      }
   }
}
