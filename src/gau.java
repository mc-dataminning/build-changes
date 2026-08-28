public class gau extends gbf<gym> {
   private final geh a;

   public gau(geh $$0) {
      super($$0);
      this.a = $$0.b("tail_fin");
   }

   public static gen a() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", gem.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), gej.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", gem.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), gej.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", gem.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), gej.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", gem.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gej.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", gem.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gej.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", gem.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), gej.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", gem.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), gej.a(0.0F, 20.0F, 0.0F));
      return gen.a($$0, 32, 32);
   }

   public void a(gym $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * bae.a(0.6F * $$0.p);
   }
}
