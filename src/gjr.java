public class gjr extends gir<ciw> {
   private static final alb a = new alb("textures/entity/lead_knot.png");
   private final fum<ciw> f;

   public gjr(gis.a $$0) {
      super($$0);
      this.f = new fum<>($$0.a(fwu.aw));
   }

   public void a(ciw $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      ezx $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alb a(ciw $$0) {
      return a;
   }
}
