public class gqt extends gnd<cmd, gwi> {
   private static final ali a = ali.b("textures/entity/skeleton/stray.png");
   private static final ali b = ali.b("textures/entity/skeleton/stray_overlay.png");

   public gqt(gok.a $$0) {
      super($$0, gbl.cB, gbl.cC, gbl.cD);
      this.a(new gta<>(this, $$0.f(), gbl.cE, b));
   }

   public ali b(gwi $$0) {
      return a;
   }

   public gwi c() {
      return new gwi();
   }
}
