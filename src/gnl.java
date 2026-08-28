public class gnl extends gni<cof, gtn> {
   private static final alc a = alc.b("textures/entity/illager/evoker_fangs.png");
   private final fxl b;

   public gnl(gnj.a $$0) {
      super($$0);
      this.b = new fxl($$0.a(gak.ay));
   }

   public void a(gtn $$0, fde $$1, ghg $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         fdi $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, gws.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alc a(gtn $$0) {
      return a;
   }

   public gtn a() {
      return new gtn();
   }

   public void a(cof $$0, gtn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dI();
      $$1.b = $$0.a($$2);
   }
}
