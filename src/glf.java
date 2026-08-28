public class glf extends gir<cnx> {
   public static final alb a = new alb("textures/entity/trident.png");
   private final fwa f;

   public glf(gis.a $$0) {
      super($$0);
      this.f = new fwa($$0.a(fwu.bI));
   }

   public void a(cnx $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ayu.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayu.i($$2, $$0.P, $$0.dH()) + 90.0F));
      ezx $$6 = gjq.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alb a(cnx $$0) {
      return a;
   }
}
