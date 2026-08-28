public class gnp extends gnd<clb, gub> {
   private static final ali a = ali.b("textures/entity/skeleton/bogged.png");
   private static final ali b = ali.b("textures/entity/skeleton/bogged_overlay.png");

   public gnp(gok.a $$0) {
      super($$0, gbl.x, gbl.y, new fxt($$0.a(gbl.w)));
      this.a(new gta<>(this, $$0.f(), gbl.z, b));
   }

   public ali a(gub $$0) {
      return a;
   }

   public gub a() {
      return new gub();
   }

   public void a(clb $$0, gub $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
   }
}
