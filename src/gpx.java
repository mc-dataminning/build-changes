public class gpx extends gmh<clp, gvl> {
   private static final ale a = ale.b("textures/entity/skeleton/stray.png");
   private static final ale b = ale.b("textures/entity/skeleton/stray_overlay.png");

   public gpx(gno.a $$0) {
      super($$0, gap.cB, gap.cC, gap.cD);
      this.a(new gse<>(this, $$0.f(), gap.cE, b));
   }

   public ale b(gvl $$0) {
      return a;
   }

   public gvl c() {
      return new gvl();
   }
}
