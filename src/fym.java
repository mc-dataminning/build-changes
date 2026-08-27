public class fym extends gag<byi, fjz<byi>> {
   private static final ahh a = new ahh("textures/entity/fish/cod.png");

   public fym(fza.a $$0) {
      super($$0, new fjz<>($$0.a(fni.w)), 0.3F);
   }

   public ahh a(byi $$0) {
      return a;
   }

   protected void a(byi $$0, eqk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * aup.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
