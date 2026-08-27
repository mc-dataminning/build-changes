public class gdz extends gcp<cep, fpa<cep>> {
   private static final ajc a = new ajc("textures/entity/skeleton/skeleton.png");

   public gdz(gby.a $$0) {
      this($$0, fqe.bj, fqe.bl, fqe.bm);
   }

   public gdz(gby.a $$0, fqd $$1, fqd $$2, fqd $$3) {
      super($$0, new fpa<>($$0.a($$1)), 0.5F);
      this.a(new gfz<>(this, new fpa($$0.a($$2)), new fpa($$0.a($$3)), $$0.g()));
   }

   public ajc a(cep $$0) {
      return a;
   }

   protected boolean b(cep $$0) {
      return $$0.gl();
   }
}
