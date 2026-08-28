public class gsb extends gsw<cms, hak, gbz<hak>> {
   private static final alz a = alz.b("textures/entity/zombie/zombie.png");

   public gsb(grq.a $$0, float $$1) {
      super($$0, new gbs($$0.a(gen.aP)), 0.5F * $$1);
      this.a(new gvx<>(this, $$0.b()));
      this.a(new gvu<>(this, new gbs($$0.a(gen.aQ)), new gbs($$0.a(gen.aR)), $$0.h()));
   }

   public alz a(hak $$0) {
      return a;
   }

   public hak b() {
      return new hak();
   }

   public void a(cms $$0, hak $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsh.a($$0, $$1, $$2);
   }
}
