public class fxp extends fxf<bvj, fel<bvj>> {
   private static final aer a = new aer("textures/entity/fish/tropical_a_pattern_1.png");
   private static final aer b = new aer("textures/entity/fish/tropical_a_pattern_2.png");
   private static final aer c = new aer("textures/entity/fish/tropical_a_pattern_3.png");
   private static final aer d = new aer("textures/entity/fish/tropical_a_pattern_4.png");
   private static final aer e = new aer("textures/entity/fish/tropical_a_pattern_5.png");
   private static final aer f = new aer("textures/entity/fish/tropical_a_pattern_6.png");
   private static final aer g = new aer("textures/entity/fish/tropical_b_pattern_1.png");
   private static final aer h = new aer("textures/entity/fish/tropical_b_pattern_2.png");
   private static final aer i = new aer("textures/entity/fish/tropical_b_pattern_3.png");
   private static final aer j = new aer("textures/entity/fish/tropical_b_pattern_4.png");
   private static final aer k = new aer("textures/entity/fish/tropical_b_pattern_5.png");
   private static final aer l = new aer("textures/entity/fish/tropical_b_pattern_6.png");
   private final fgz<bvj> m;
   private final fha<bvj> n;

   public fxp(fus<bvj, fel<bvj>> $$0, fho $$1) {
      super($$0);
      this.m = new fgz<>($$1.a(fhr.bG));
      this.n = new fha<>($$1.a(fhr.bE));
   }

   public void a(elf $$0, fnu $$1, int $$2, bvj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bvj.b $$10 = $$3.gl();

      fet<bvj> $$11 = (fet<bvj>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      aer $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gk().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
