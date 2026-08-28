public class gta extends gsa<cku, gyh> {
   private static final aku a = aku.b("textures/entity/lead_knot.png");
   private final gcp b;

   public gta(gsb.a $$0) {
      super($$0);
      this.b = new gcp($$0.a(gez.br));
   }

   @Override
   public void a(gyh $$0, ffs $$1, glv $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      ffw $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hec.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gyh d() {
      return new gyh();
   }
}
