public class gun extends gqv<cmj, haf> {
   private static final akv a = akv.b("textures/entity/skeleton/stray.png");
   private static final akv b = akv.b("textures/entity/skeleton/stray_overlay.png");

   public gun(gsd.a $$0) {
      super($$0, gfb.cZ, gfb.da, gfb.db);
      this.a(new gwv<>(this, $$0.f(), gfb.dc, b));
   }

   public akv b(haf $$0) {
      return a;
   }

   public haf b() {
      return new haf();
   }
}
