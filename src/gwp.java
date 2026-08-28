public class gwp extends gsx<cnv, hcf> {
   private static final ald a = ald.b("textures/entity/skeleton/stray.png");
   private static final ald j = ald.b("textures/entity/skeleton/stray_overlay.png");

   public gwp(guf.a $$0) {
      super($$0, ghc.dl, ghc.dm, ghc.dn);
      this.a(new gyw<>(this, $$0.f(), ghc.do, j));
   }

   public ald b(hcf $$0) {
      return a;
   }

   public hcf b() {
      return new hcf();
   }
}
