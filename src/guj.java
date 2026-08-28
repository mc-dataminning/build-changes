public class guj extends gsr<cpg, gzz, gdt> {
   private static final alp a = alp.b("textures/entity/wandering_trader.png");

   public guj(grl.a $$0) {
      super($$0, new gdt($$0.a(gei.dw)), 0.5F);
      this.a(new gve<>(this, $$0.f(), $$0.b()));
      this.a(new gvd<>(this, $$0.b()));
   }

   public alp a(gzz $$0) {
      return a;
   }

   public gzz b() {
      return new gzz();
   }

   public void a(cpg $$0, gzz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p() > 0;
   }
}
