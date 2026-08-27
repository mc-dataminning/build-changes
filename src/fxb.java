public class fxb extends fwr<bvi, fec<bvi>> {
   private static final aep a = new aep("textures/entity/fish/tropical_a_pattern_1.png");
   private static final aep b = new aep("textures/entity/fish/tropical_a_pattern_2.png");
   private static final aep c = new aep("textures/entity/fish/tropical_a_pattern_3.png");
   private static final aep d = new aep("textures/entity/fish/tropical_a_pattern_4.png");
   private static final aep e = new aep("textures/entity/fish/tropical_a_pattern_5.png");
   private static final aep f = new aep("textures/entity/fish/tropical_a_pattern_6.png");
   private static final aep g = new aep("textures/entity/fish/tropical_b_pattern_1.png");
   private static final aep h = new aep("textures/entity/fish/tropical_b_pattern_2.png");
   private static final aep i = new aep("textures/entity/fish/tropical_b_pattern_3.png");
   private static final aep j = new aep("textures/entity/fish/tropical_b_pattern_4.png");
   private static final aep k = new aep("textures/entity/fish/tropical_b_pattern_5.png");
   private static final aep l = new aep("textures/entity/fish/tropical_b_pattern_6.png");
   private final fgq<bvi> m;
   private final fgr<bvi> n;

   public fxb(fue<bvi, fec<bvi>> $$0, fhf $$1) {
      super($$0);
      this.m = new fgq<>($$1.a(fhi.bG));
      this.n = new fgr<>($$1.a(fhi.bE));
   }

   public void a(elh $$0, fng $$1, int $$2, bvi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bvi.b $$10 = $$3.gk();

      fek<bvi> $$11 = (fek<bvi>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      aep $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gj().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
