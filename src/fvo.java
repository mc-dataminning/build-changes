public class fvo extends fxi<bxc, fhk<bxc>> {
   private static final agm a = new agm("textures/entity/fish/cod.png");

   public fvo(fwc.a $$0) {
      super($$0, new fhk<>($$0.a(fks.u)), 0.3F);
   }

   public agm a(bxc $$0) {
      return a;
   }

   protected void a(bxc $$0, eob $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * atq.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
