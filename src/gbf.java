public class gbf extends gab<gxq> {
   private final gen e = this.c.b("left_chest");
   private final gen f = this.c.b("right_chest");

   public gbf(gen $$0) {
      super($$0);
   }

   public static get a() {
      gev $$0 = gab.a(ger.a);
      a($$0.a());
      return get.a($$0, 64, 64);
   }

   public static get b() {
      gev $$0 = gab.c(ger.a);
      a($$0.a());
      return get.a(gab.b.apply($$0), 64, 64);
   }

   private static void a(gex $$0) {
      gex $$1 = $$0.b("body");
      ges $$2 = ges.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gep.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gep.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gex $$3 = $$0.b("head_parts").b("head");
      ges $$4 = ges.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gep.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gep.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gxq $$0) {
      super.a($$0);
      this.e.k = $$0.a;
      this.f.k = $$0.a;
   }
}
