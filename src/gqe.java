public class gqe extends grf<gsj, fwl> {
   private static final alb a = alb.b("textures/entity/breeze/breeze_wind.png");
   private final fwl b;

   public gqe(gms.a $$0, goo<gsj, fwl> $$1) {
      super($$1);
      this.b = new fwl($$0.a(gaa.C));
   }

   public void a(fcu $$0, ggv $$1, int $$2, gsj $$3, float $$4, float $$5) {
      fcy $$6 = $$1.getBuffer(ghe.a(a, this.a($$3.p) % 1.0F, 0.0F));
      this.b.a($$3);
      gly.a(this.b, this.b.e()).a($$0, $$6, $$2, gwb.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
