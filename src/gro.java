public class gro extends grf<guz, fxa<guz>> {
   private static final alb a = alb.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final alb b = alb.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final alb c = alb.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final alb d = alb.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final alb e = alb.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final alb f = alb.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final alb g = alb.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final alb h = alb.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final alb i = alb.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final alb j = alb.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final alb k = alb.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final alb l = alb.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final fzg m;
   private final fzh n;

   public gro(goo<guz, fxa<guz>> $$0, fzx $$1) {
      super($$0);
      this.m = new fzg($$1.a(gaa.cO));
      this.n = new fzh($$1.a(gaa.cM));
   }

   public void a(fcu $$0, ggv $$1, int $$2, guz $$3, float $$4, float $$5) {
      cgv.b $$6 = $$3.a;

      fxa<guz> $$7 = (fxa<guz>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      alb $$8 = switch ($$6) {
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
      a($$7, $$8, $$0, $$1, $$2, $$3, $$3.c);
   }
}
