public class gux extends gti<cml, har, gek> {
   private static final aku a = aku.b("textures/entity/illager/vex.png");
   private static final aku b = aku.b("textures/entity/illager/vex_charging.png");

   public gux(gsc.a $$0) {
      super($$0, new gek($$0.a(gfb.ds)), 0.3F);
      this.a(new gwj<>(this));
   }

   protected int a(cml $$0, ji $$1) {
      return 15;
   }

   public aku a(har $$0) {
      return $$0.a ? b : a;
   }

   public har b() {
      return new har();
   }

   public void a(cml $$0, har $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxn.a($$0, $$1, this.i);
      $$1.a = $$0.gp();
   }
}
