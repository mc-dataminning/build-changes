public class gjj extends gke<cjz, fuo<cjz>> {
   private static final alf a = new alf("textures/entity/zombie/zombie.png");
   private final float i;

   public gjj(giy.a $$0, float $$1) {
      super($$0, new fug($$0.a(fxa.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gnd<>(this, $$0.d()));
      this.a(new gna<>(this, new fug($$0.a(fxa.ai)), new fug($$0.a(fxa.aj)), $$0.g()));
   }

   protected void a(cjz $$0, ezz $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public alf a(cjz $$0) {
      return a;
   }
}
