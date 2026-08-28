public class ghw extends gfq<hdf> {
   private final giu a;

   public ghw(giu $$0) {
      super($$0, gqc::g);
      this.a = $$0.b("tail");
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", giz.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), giw.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", giz.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), giw.a(0.0F, 22.0F, 0.0F));
      return gja.a($$0, 16, 16);
   }

   public void a(hdf $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * azm.a(0.3F * $$0.u);
   }
}
