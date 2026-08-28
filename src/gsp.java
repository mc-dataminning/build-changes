public class gsp extends grp<clv, gxv> {
   private static final alz a = alz.b("textures/entity/lead_knot.png");
   private final gcd b;

   public gsp(grq.a $$0) {
      super($$0);
      this.b = new gcd($$0.a(gen.bo));
   }

   @Override
   public void a(gxv $$0, fgs $$1, gll $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      fgw $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hbc.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gxv d() {
      return new gxv();
   }
}
