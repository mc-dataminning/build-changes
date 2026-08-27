public class fwj extends fvj<bzz> {
   private static final agg a = new agg("textures/entity/lead_knot.png");
   private final fht<bzz> f;

   public fwj(fvk.a $$0) {
      super($$0);
      this.f = new fht<>($$0.a(fka.aq));
   }

   public void a(bzz $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eno $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gay.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agg a(bzz $$0) {
      return a;
   }
}
