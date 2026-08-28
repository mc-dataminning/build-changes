public class gie extends gfy<hdn> {
   private final gjc a;

   public gie(gjc $$0) {
      super($$0, gqk::g);
      this.a = $$0.b("tail");
   }

   public static gji a() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gjh.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gje.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gjh.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gje.a(0.0F, 22.0F, 0.0F));
      return gji.a($$0, 16, 16);
   }

   public void a(hdn $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * azm.a(0.3F * $$0.u);
   }
}
