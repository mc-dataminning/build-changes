public class gxd extends gwu<has, gcc<has>> {
   private static final akv a = akv.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final akv b = akv.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final akv c = akv.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final akv d = akv.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final akv e = akv.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final akv f = akv.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final akv g = akv.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final akv h = akv.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final akv i = akv.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final akv j = akv.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final akv k = akv.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final akv l = akv.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gej m;
   private final gek n;

   public gxd(guc<has, gcc<has>> $$0, gfa $$1) {
      super($$0);
      this.m = new gej($$1.a(gfd.dp));
      this.n = new gek($$1.a(gfd.dn));
   }

   public void a(ffv $$0, glz $$1, int $$2, has $$3, float $$4, float $$5) {
      chz.b $$6 = $$3.a;

      gcc<has> $$7 = (gcc<has>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      akv $$8 = switch ($$6) {
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
