public class gjv extends gir<cnj> {
   private static final alb a = new alb("textures/entity/llama/spit.png");
   private final fup<cnj> f;

   public gjv(gis.a $$0) {
      super($$0);
      this.f = new fup<>($$0.a(fwu.az));
   }

   public void a(cnj $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayu.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayu.i($$2, $$0.P, $$0.dH())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      ezx $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alb a(cnj $$0) {
      return a;
   }
}
