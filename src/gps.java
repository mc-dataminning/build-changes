public class gps extends gpf<chf, gvp, fxz<guc>> {
   private static final alh a = alh.b("textures/entity/fish/pufferfish.png");
   private final fxz<guc> b;
   private final fxz<guc> k;
   private final fxz<guc> l = this.e();

   public gps(gnz.a $$0) {
      super($$0, new fzg($$0.a(gba.bU)), 0.2F);
      this.k = new fzh($$0.a(gba.bV));
      this.b = new fzi($$0.a(gba.bW));
   }

   public alh a(gvp $$0) {
      return a;
   }

   public gvp c() {
      return new gvp();
   }

   public void a(gvp $$0, fdt $$1, ghw $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      this.f = 0.1F + 0.1F * (float)$$0.a;
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(chf $$0, gvp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }

   protected void a(gvp $$0, fdt $$1, float $$2, float $$3) {
      $$1.a(0.0F, azj.b($$0.p * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
