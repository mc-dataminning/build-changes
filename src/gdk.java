public class gdk extends gbf<gym> {
   private final geh a;

   public gdk(geh $$0) {
      super($$0, glo::f);
      this.a = $$0.b("tail");
   }

   public static gen a() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gem.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gej.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gem.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gej.a(0.0F, 22.0F, 0.0F));
      return gen.a($$0, 16, 16);
   }

   public void a(gym $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * bae.a(0.3F * $$0.p);
   }
}
