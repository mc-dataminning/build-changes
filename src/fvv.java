public class fvv extends fwq<cav, fhp<cav>> {
   private static final agg a = new agg("textures/entity/zombie/zombie.png");
   private final float i;

   public fvv(fvk.a $$0, float $$1) {
      super($$0, new fhh($$0.a(fka.ab)), 0.5F * $$1);
      this.i = $$1;
      this.a(new fzl<>(this, $$0.d()));
      this.a(new fzi<>(this, new fhh($$0.a(fka.ac)), new fhh($$0.a(fka.ad)), $$0.g()));
   }

   protected void a(cav $$0, enk $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public agg a(cav $$0) {
      return a;
   }
}
