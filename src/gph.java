public class gph extends gou<cgw, gvd, fxo<gtq>> {
   private static final ale a = ale.b("textures/entity/fish/pufferfish.png");
   private final fxo<gtq> b;
   private final fxo<gtq> k;
   private final fxo<gtq> l = this.e();

   public gph(gno.a $$0) {
      super($$0, new fyv($$0.a(gap.bU)), 0.2F);
      this.k = new fyw($$0.a(gap.bV));
      this.b = new fyx($$0.a(gap.bW));
   }

   public ale a(gvd $$0) {
      return a;
   }

   public gvd c() {
      return new gvd();
   }

   public void a(gvd $$0, fdi $$1, ghl $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      this.f = 0.1F + 0.1F * (float)$$0.a;
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cgw $$0, gvd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gq();
   }

   protected void a(gvd $$0, fdi $$1, float $$2, float $$3) {
      $$1.a(0.0F, azf.b($$0.p * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
