public class fys extends fxi<bxw, fhm<bxw>> {
   private final fhm<bxw> a = this.a();
   private final fhm<bxw> i;
   private static final agm j = new agm("textures/entity/fish/tropical_a.png");
   private static final agm k = new agm("textures/entity/fish/tropical_b.png");

   public fys(fwc.a $$0) {
      super($$0, new fka<>($$0.a(fks.bF)), 0.15F);
      this.i = new fkb<>($$0.a(fks.bD));
      this.a(new gau(this, $$0.f()));
   }

   public agm a(bxw $$0) {
      return switch ($$0.gq().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(bxw $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      fhm<bxw> $$6 = switch ($$0.gq().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.go().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(bxw $$0, eob $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * atq.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
