public class fup extends fud<bvc, fet<bvc>> {
   private static final aer a = new aer("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fet<bvc> j;
   private final fet<bvc> k;
   private final fet<bvc> l = this.a();

   public fup(fsx.a $$0) {
      super($$0, new fga<>($$0.a(fhr.aV)), 0.2F);
      this.k = new fgb<>($$0.a(fhr.aW));
      this.j = new fgc<>($$0.a(fhr.aX));
   }

   public aer a(bvc $$0) {
      return a;
   }

   public void a(bvc $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
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

   protected void a(bvc $$0, elf $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, arp.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
