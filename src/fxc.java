public class fxc extends fwq<bxc, fhc<bxc>> {
   private static final agg a = new agg("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fhc<bxc> j;
   private final fhc<bxc> k;
   private final fhc<bxc> l = this.a();

   public fxc(fvk.a $$0) {
      super($$0, new fij<>($$0.a(fka.aV)), 0.2F);
      this.k = new fik<>($$0.a(fka.aW));
      this.j = new fil<>($$0.a(fka.aX));
   }

   public agg a(bxc $$0) {
      return a;
   }

   public void a(bxc $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5) {
      int $$6 = $$0.gg();
      if ($$6 != this.i) {
         if ($$6 == 0) {
            this.f = this.j;
         } else if ($$6 == 1) {
            this.f = this.k;
         } else {
            this.f = this.l;
         }
      }

      this.i = $$6;
      this.d = 0.1F + 0.1F * (float)$$6;
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bxc $$0, enk $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, ati.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
