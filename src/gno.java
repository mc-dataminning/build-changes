public class gno extends gne<cga, ftn<cga>> {
   private static final alb a = new alb("textures/entity/fish/tropical_a_pattern_1.png");
   private static final alb b = new alb("textures/entity/fish/tropical_a_pattern_2.png");
   private static final alb c = new alb("textures/entity/fish/tropical_a_pattern_3.png");
   private static final alb d = new alb("textures/entity/fish/tropical_a_pattern_4.png");
   private static final alb e = new alb("textures/entity/fish/tropical_a_pattern_5.png");
   private static final alb f = new alb("textures/entity/fish/tropical_a_pattern_6.png");
   private static final alb g = new alb("textures/entity/fish/tropical_b_pattern_1.png");
   private static final alb h = new alb("textures/entity/fish/tropical_b_pattern_2.png");
   private static final alb i = new alb("textures/entity/fish/tropical_b_pattern_3.png");
   private static final alb j = new alb("textures/entity/fish/tropical_b_pattern_4.png");
   private static final alb k = new alb("textures/entity/fish/tropical_b_pattern_5.png");
   private static final alb l = new alb("textures/entity/fish/tropical_b_pattern_6.png");
   private final fwb<cga> m;
   private final fwc<cga> n;

   public gno(gko<cga, ftn<cga>> $$0, fwr $$1) {
      super($$0);
      this.m = new fwb<>($$1.a(fwu.bM));
      this.n = new fwc<>($$1.a(fwu.bK));
   }

   public void a(ezt $$0, gdj $$1, int $$2, cga $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cga.b $$10 = $$3.gB();

      ftv<cga> $$11 = (ftv<cga>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      alb $$12 = switch ($$10) {
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
