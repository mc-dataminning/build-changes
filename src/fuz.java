public class fuz extends fun<bvk, ffd<bvk>> {
   private static final aew a = new aew("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final ffd<bvk> j;
   private final ffd<bvk> k;
   private final ffd<bvk> l = this.a();

   public fuz(fth.a $$0) {
      super($$0, new fgk<>($$0.a(fib.aV)), 0.2F);
      this.k = new fgl<>($$0.a(fib.aW));
      this.j = new fgm<>($$0.a(fib.aX));
   }

   public aew a(bvk $$0) {
      return a;
   }

   public void a(bvk $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      int $$6 = $$0.gf();
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

   protected void a(bvk $$0, elp $$1, float $$2, float $$3, float $$4) {
      $$1.a(0.0F, arw.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
