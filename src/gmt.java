public class gmt extends gmh<ckn, gte> {
   private static final ale a = ale.b("textures/entity/skeleton/bogged.png");
   private static final ale b = ale.b("textures/entity/skeleton/bogged_overlay.png");

   public gmt(gno.a $$0) {
      super($$0, gap.x, gap.y, new fwx($$0.a(gap.w)));
      this.a(new gse<>(this, $$0.f(), gap.z, b));
   }

   public ale a(gte $$0) {
      return a;
   }

   public gte a() {
      return new gte();
   }

   public void a(ckn $$0, gte $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gs();
   }
}
