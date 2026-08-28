public class fzt extends fyj<cwk> {
   private static final alg G = alg.b("textures/gui/container/shulker_box.png");

   public fzt(cwk $$0, cqx $$1, wy $$2) {
      super($$0, $$1, $$2);
      this.u++;
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fro $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gqc::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
   }
}
