public class fyb extends fxr<bvt, fex<bvt>> {
   private static final aey a = new aey("textures/entity/fish/tropical_a_pattern_1.png");
   private static final aey b = new aey("textures/entity/fish/tropical_a_pattern_2.png");
   private static final aey c = new aey("textures/entity/fish/tropical_a_pattern_3.png");
   private static final aey d = new aey("textures/entity/fish/tropical_a_pattern_4.png");
   private static final aey e = new aey("textures/entity/fish/tropical_a_pattern_5.png");
   private static final aey f = new aey("textures/entity/fish/tropical_a_pattern_6.png");
   private static final aey g = new aey("textures/entity/fish/tropical_b_pattern_1.png");
   private static final aey h = new aey("textures/entity/fish/tropical_b_pattern_2.png");
   private static final aey i = new aey("textures/entity/fish/tropical_b_pattern_3.png");
   private static final aey j = new aey("textures/entity/fish/tropical_b_pattern_4.png");
   private static final aey k = new aey("textures/entity/fish/tropical_b_pattern_5.png");
   private static final aey l = new aey("textures/entity/fish/tropical_b_pattern_6.png");
   private final fhl<bvt> m;
   private final fhm<bvt> n;

   public fyb(fve<bvt, fex<bvt>> $$0, fia $$1) {
      super($$0);
      this.m = new fhl<>($$1.a(fid.bG));
      this.n = new fhm<>($$1.a(fid.bE));
   }

   public void a(elr $$0, fog $$1, int $$2, bvt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bvt.b $$10 = $$3.go();

      fff<bvt> $$11 = (fff<bvt>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      aey $$12 = switch ($$10) {
         case a -> a;
         case b -> b;
         case c -> c;
         case d -> d;
         case e -> e;
         case f -> f;
         case g -> g;
         case h -> h;
         case i -> i;
         case j -> j;
         case k -> k;
         case l -> l;
      };
      float[] $$13 = $$3.gn().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
