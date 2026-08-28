public class gns extends gni<cge, ftr<cge>> {
   private static final ale a = new ale("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ale b = new ale("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ale c = new ale("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ale d = new ale("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ale e = new ale("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ale f = new ale("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ale g = new ale("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ale h = new ale("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ale i = new ale("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ale j = new ale("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ale k = new ale("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ale l = new ale("textures/entity/fish/tropical_b_pattern_6.png");
   private final fwf<cge> m;
   private final fwg<cge> n;

   public gns(gks<cge, ftr<cge>> $$0, fwv $$1) {
      super($$0);
      this.m = new fwf<>($$1.a(fwy.bM));
      this.n = new fwg<>($$1.a(fwy.bK));
   }

   public void a(ezx $$0, gdn $$1, int $$2, cge $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cge.b $$10 = $$3.gB();

      ftz<cge> $$11 = (ftz<cge>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ale $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gA().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
