public class gfv extends gfl<cax, fma<cax>> {
   private static final aiy a = new aiy("textures/entity/fish/tropical_a_pattern_1.png");
   private static final aiy b = new aiy("textures/entity/fish/tropical_a_pattern_2.png");
   private static final aiy c = new aiy("textures/entity/fish/tropical_a_pattern_3.png");
   private static final aiy d = new aiy("textures/entity/fish/tropical_a_pattern_4.png");
   private static final aiy e = new aiy("textures/entity/fish/tropical_a_pattern_5.png");
   private static final aiy f = new aiy("textures/entity/fish/tropical_a_pattern_6.png");
   private static final aiy g = new aiy("textures/entity/fish/tropical_b_pattern_1.png");
   private static final aiy h = new aiy("textures/entity/fish/tropical_b_pattern_2.png");
   private static final aiy i = new aiy("textures/entity/fish/tropical_b_pattern_3.png");
   private static final aiy j = new aiy("textures/entity/fish/tropical_b_pattern_4.png");
   private static final aiy k = new aiy("textures/entity/fish/tropical_b_pattern_5.png");
   private static final aiy l = new aiy("textures/entity/fish/tropical_b_pattern_6.png");
   private final foo<cax> m;
   private final fop<cax> n;

   public gfv(gcv<cax, fma<cax>> $$0, fpf $$1) {
      super($$0);
      this.m = new foo<>($$1.a(fpi.bI));
      this.n = new fop<>($$1.a(fpi.bG));
   }

   public void a(esh $$0, fvt $$1, int $$2, cax $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cax.b $$10 = $$3.gr();

      fmi<cax> $$11 = (fmi<cax>)(switch ($$10.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      aiy $$12 = switch ($$10) {
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
      float[] $$13 = $$3.gq().d();
      a(this.c(), $$11, $$12, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$13[0], $$13[1], $$13[2]);
   }
}
