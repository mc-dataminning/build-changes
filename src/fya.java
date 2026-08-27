public class fya extends fwq<bxj, fgu<bxj>> {
   private final fgu<bxj> a = this.a();
   private final fgu<bxj> i;
   private static final agg j = new agg("textures/entity/fish/tropical_a.png");
   private static final agg k = new agg("textures/entity/fish/tropical_b.png");

   public fya(fvk.a $$0) {
      super($$0, new fji<>($$0.a(fka.bF)), 0.15F);
      this.i = new fjj<>($$0.a(fka.bD));
      this.a(new gac(this, $$0.f()));
   }

   public agg a(bxj $$0) {
      return switch ($$0.gp().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(bxj $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5) {
      fgu<bxj> $$6 = switch ($$0.gp().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gn().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(bxj $$0, enk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * ati.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
