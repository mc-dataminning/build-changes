public class gdx extends gcx<cex> {
   private static final ajh a = new ajh("textures/entity/lead_knot.png");
   private final fou<cex> f;

   public gdx(gcy.a $$0) {
      super($$0);
      this.f = new fou<>($$0.a(frc.as));
   }

   public void a(cex $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eud $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajh a(cex $$0) {
      return a;
   }
}
