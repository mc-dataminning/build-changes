public class fwo extends fua<cae, fhx<cae>> {
   private static final aey a = new aey("textures/entity/zombie_villager/zombie_villager.png");

   public fwo(ftj.a $$0) {
      super($$0, new fhx<>($$0.a(fid.cc)), 0.5F);
      this.a(new fxh<>(this, new fhx($$0.a(fid.cd)), new fhx($$0.a(fid.ce)), $$0.g()));
      this.a(new fyc<>(this, $$0.e(), "zombie_villager"));
   }

   public aey a(cae $$0) {
      return a;
   }

   protected boolean b(cae $$0) {
      return super.a($$0) || $$0.gn();
   }
}
