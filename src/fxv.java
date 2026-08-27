public class fxv extends fxl<bvx, feq<bvx>> {
   private static final aez a = new aez("textures/entity/fish/tropical_a_pattern_1.png");
   private static final aez b = new aez("textures/entity/fish/tropical_a_pattern_2.png");
   private static final aez c = new aez("textures/entity/fish/tropical_a_pattern_3.png");
   private static final aez d = new aez("textures/entity/fish/tropical_a_pattern_4.png");
   private static final aez e = new aez("textures/entity/fish/tropical_a_pattern_5.png");
   private static final aez f = new aez("textures/entity/fish/tropical_a_pattern_6.png");
   private static final aez g = new aez("textures/entity/fish/tropical_b_pattern_1.png");
   private static final aez h = new aez("textures/entity/fish/tropical_b_pattern_2.png");
   private static final aez i = new aez("textures/entity/fish/tropical_b_pattern_3.png");
   private static final aez j = new aez("textures/entity/fish/tropical_b_pattern_4.png");
   private static final aez k = new aez("textures/entity/fish/tropical_b_pattern_5.png");
   private static final aez l = new aez("textures/entity/fish/tropical_b_pattern_6.png");
   private final fhe<bvx> m;
   private final fhf<bvx> n;

   public fxv(fuy<bvx, feq<bvx>> $$0, fht $$1) {
      super($$0);
      this.m = new fhe<>($$1.a(fhw.bG));
      this.n = new fhf<>($$1.a(fhw.bE));
   }

   public void a(elj $$0, foa $$1, int $$2, bvx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bvx.b $$10 = $$3.gp();

      fey<bvx> $$11 = (fey<bvx>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      aez $$12 = switch ($$10) {
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
      float[] $$13 = $$3.go().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
