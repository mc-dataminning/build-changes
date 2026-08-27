public class fuu extends fui<bvf, fey<bvf>> {
   private static final aeu a = new aeu("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fey<bvf> j;
   private final fey<bvf> k;
   private final fey<bvf> l = this.a();

   public fuu(ftc.a $$0) {
      super($$0, new fgf<>($$0.a(fhw.aV)), 0.2F);
      this.k = new fgg<>($$0.a(fhw.aW));
      this.j = new fgh<>($$0.a(fhw.aX));
   }

   public aeu a(bvf $$0) {
      return a;
   }

   public void a(bvf $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      int $$6 = $$0.gc();
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

   protected void a(bvf $$0, elk $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, ars.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
