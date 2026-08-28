public class gfq extends gfy<hcg> {
   private final gjc a;
   private final gjc b;
   private final gjc c;
   private final gjc d;
   private final gjc e;
   private static final int f = 6;

   public gfq(gjc $$0) {
      super($$0);
      this.a = $$0.b("head");
      this.c = $$0.b("right_hind_leg");
      this.b = $$0.b("left_hind_leg");
      this.e = $$0.b("right_front_leg");
      this.d = $$0.b("left_front_leg");
   }

   public static gji a(gjg $$0) {
      gjk $$1 = new gjk();
      gjm $$2 = $$1.a();
      $$2.a("head", gjh.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gje.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", gjh.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), gje.a(0.0F, 6.0F, 0.0F));
      gjh $$3 = gjh.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, gje.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, gje.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, gje.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, gje.a(2.0F, 18.0F, -4.0F));
      return gji.a($$1, 64, 32);
   }

   public void a(hcg $$0) {
      super.a($$0);
      this.a.f = $$0.aa * (float) (Math.PI / 180.0);
      this.a.e = $$0.ab * (float) (Math.PI / 180.0);
      float $$1 = $$0.ae;
      float $$2 = $$0.ad;
      this.b.e = azm.b($$2 * 0.6662F) * 1.4F * $$1;
      this.c.e = azm.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.d.e = azm.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.e.e = azm.b($$2 * 0.6662F) * 1.4F * $$1;
   }
}
