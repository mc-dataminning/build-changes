public class gvy extends guj<cng, hbs, gfk> {
   private static final aku a = aku.b("textures/entity/illager/vex.png");
   private static final aku b = aku.b("textures/entity/illager/vex_charging.png");

   public gvy(gtd.a $$0) {
      super($$0, new gfk($$0.a(ggb.du)), 0.3F);
      this.a(new gxk<>(this));
   }

   protected int a(cng $$0, ji $$1) {
      return 15;
   }

   public aku a(hbs $$0) {
      return $$0.a ? b : a;
   }

   public hbs b() {
      return new hbs();
   }

   public void a(cng $$0, hbs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyo.a($$0, $$1, this.i);
      $$1.a = $$0.t();
   }
}
