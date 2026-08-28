public class gaz extends fzv<gxk> {
   private final geh e = this.c.b("left_chest");
   private final geh f = this.c.b("right_chest");

   public gaz(geh $$0) {
      super($$0);
   }

   public static gen a() {
      gep $$0 = fzv.a(gel.a);
      a($$0.a());
      return gen.a($$0, 64, 64);
   }

   public static gen b() {
      gep $$0 = fzv.c(gel.a);
      a($$0.a());
      return gen.a(fzv.b.apply($$0), 64, 64);
   }

   private static void a(ger $$0) {
      ger $$1 = $$0.b("body");
      gem $$2 = gem.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gej.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gej.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      ger $$3 = $$0.b("head_parts").b("head");
      gem $$4 = gem.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gej.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gej.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gxk $$0) {
      super.a($$0);
      this.e.k = $$0.a;
      this.f.k = $$0.a;
   }
}
