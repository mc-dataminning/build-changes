public class fuv extends fup<bvj, fgf> {
   private static final aey a = new aey("textures/entity/parrot/parrot_red_blue.png");
   private static final aey i = new aey("textures/entity/parrot/parrot_blue.png");
   private static final aey j = new aey("textures/entity/parrot/parrot_green.png");
   private static final aey k = new aey("textures/entity/parrot/parrot_yellow_blue.png");
   private static final aey l = new aey("textures/entity/parrot/parrot_grey.png");

   public fuv(ftj.a $$0) {
      super($$0, new fgf($$0.a(fid.aA)), 0.3F);
   }

   public aey a(bvj $$0) {
      return a($$0.gl());
   }

   public static aey a(bvj.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(bvj $$0, float $$1) {
      float $$2 = ary.i($$1, $$0.bZ, $$0.bW);
      float $$3 = ary.i($$1, $$0.bY, $$0.bX);
      return (ary.a($$2) + 1.0F) * $$3;
   }
}
