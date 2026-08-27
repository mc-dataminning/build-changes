public class fxg extends fww<bvk, feg<bvk>> {
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
   private final fgu<bvk> m;
   private final fgv<bvk> n;

   public fxg(fuj<bvk, feg<bvk>> $$0, fhj $$1) {
      super($$0);
      this.m = new fgu<>($$1.a(fhm.bG));
      this.n = new fgv<>($$1.a(fhm.bE));
   }

   public void a(elg $$0, fnl $$1, int $$2, bvk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      bvk.b $$10 = $$3.gk();

      feo<bvk> $$11 = (feo<bvk>)(switch ($$10.a()) {
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
      float[] $$13 = $$3.gj().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
