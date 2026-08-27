public class ght extends ghj<ccd, fnu<ccd>> {
   private static final ajh a = new ajh("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ajh b = new ajh("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ajh c = new ajh("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ajh d = new ajh("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ajh e = new ajh("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ajh f = new ajh("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ajh g = new ajh("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ajh h = new ajh("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ajh i = new ajh("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ajh j = new ajh("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ajh k = new ajh("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ajh l = new ajh("textures/entity/fish/tropical_b_pattern_6.png");
   private final fqj<ccd> m;
   private final fqk<ccd> n;

   public ght(get<ccd, fnu<ccd>> $$0, fqz $$1) {
      super($$0);
      this.m = new fqj<>($$1.a(frc.bI));
      this.n = new fqk<>($$1.a(frc.bG));
   }

   public void a(etz $$0, fxq $$1, int $$2, ccd $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ccd.b $$10 = $$3.gy();

      foc<ccd> $$11 = (foc<ccd>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ajh $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gx().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
