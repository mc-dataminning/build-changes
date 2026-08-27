public class fvc extends fup<bvn, fgq<bvn>> {
   private static final aey a = new aey("textures/entity/rabbit/brown.png");
   private static final aey i = new aey("textures/entity/rabbit/white.png");
   private static final aey j = new aey("textures/entity/rabbit/black.png");
   private static final aey k = new aey("textures/entity/rabbit/gold.png");
   private static final aey l = new aey("textures/entity/rabbit/salt.png");
   private static final aey m = new aey("textures/entity/rabbit/white_splotched.png");
   private static final aey n = new aey("textures/entity/rabbit/toast.png");
   private static final aey o = new aey("textures/entity/rabbit/caerbannog.png");

   public fvc(ftj.a $$0) {
      super($$0, new fgq<>($$0.a(fid.aY)), 0.3F);
   }

   public aey a(bvn $$0) {
      String $$1 = n.a($$0.ab().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gd()) {
            case a -> a;
            case b -> i;
            case c -> j;
            case e -> k;
            case f -> l;
            case d -> m;
            case g -> o;
         };
      }
   }
}
