public class giv extends ggp<hef> {
   private final gjt a;

   public giv(gjt $$0) {
      super($$0, grc::g);
      this.a = $$0.b("tail");
   }

   public static gjz a() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gjy.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gjv.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gjy.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gjv.a(0.0F, 22.0F, 0.0F));
      return gjz.a($$0, 16, 16);
   }

   public void a(hef $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * azm.a(0.3F * $$0.u);
   }
}
