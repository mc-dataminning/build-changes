public class gne extends gms<ckw, gtq> {
   private static final alh a = alh.b("textures/entity/skeleton/bogged.png");
   private static final alh b = alh.b("textures/entity/skeleton/bogged_overlay.png");

   public gne(gnz.a $$0) {
      super($$0, gba.x, gba.y, new fxi($$0.a(gba.w)));
      this.a(new gsp<>(this, $$0.f(), gba.z, b));
   }

   public alh a(gtq $$0) {
      return a;
   }

   public gtq a() {
      return new gtq();
   }

   public void a(ckw $$0, gtq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
   }
}
