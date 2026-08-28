public class gkg extends gia<hfp> {
   private final gle a;

   public gkg(gle $$0) {
      super($$0, gsl::g);
      this.a = $$0.b("tail");
   }

   public static glk a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", glj.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), glg.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", glj.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), glg.a(0.0F, 22.0F, 0.0F));
      return glk.a($$0, 16, 16);
   }

   public void a(hfp $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * azo.a(0.3F * $$0.u);
   }
}
