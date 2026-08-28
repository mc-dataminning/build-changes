public class gbb extends fzv<gxm> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private final gej g = this.c.b("left_chest");
   private final gej i = this.c.b("right_chest");

   public gbb(gej $$0) {
      super($$0);
   }

   public static gep a(float $$0) {
      ger $$1 = fzv.a(gen.a);
      a($$1.a());
      return gep.a($$1, 64, 64).a(ges.scaling($$0));
   }

   public static gep b(float $$0) {
      ger $$1 = fzv.c(gen.a);
      a($$1.a());
      return gep.a(fzv.b.apply($$1), 64, 64).a(ges.scaling($$0));
   }

   private static void a(get $$0) {
      get $$1 = $$0.b("body");
      geo $$2 = geo.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gel.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gel.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      get $$3 = $$0.b("head_parts").b("head");
      geo $$4 = geo.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gel.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gel.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gxm $$0) {
      super.a($$0);
      this.g.k = $$0.a;
      this.i.k = $$0.a;
   }
}
