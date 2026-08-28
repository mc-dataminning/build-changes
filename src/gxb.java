public class gxb extends gws<haq, gca<haq>> {
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
   private final geh m;
   private final gei n;

   public gxb(gua<haq, gca<haq>> $$0, gey $$1) {
      super($$0);
      this.m = new geh($$1.a(gfb.dp));
      this.n = new gei($$1.a(gfb.dn));
   }

   public void a(fft $$0, glx $$1, int $$2, haq $$3, float $$4, float $$5) {
      chx.b $$6 = $$3.a;

      gca<haq> $$7 = (gca<haq>)(switch ($$6.a()) {
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
