public class gum extends gqv<cmj, hai, gec> {
   private static final aku a = aku.b("textures/entity/strider/strider.png");
   private static final aku b = aku.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gum(gsb.a $$0) {
      super($$0, new gec($$0.a(gez.dd)), new gec($$0.a(gez.df)), 0.5F);
      this.a(new gwr<>(this, new gec($$0.a(gez.de)), new gec($$0.a(gez.dg)), aku.b("textures/entity/strider/strider_saddle.png")));
   }

   public aku a(hai $$0) {
      return $$0.b ? b : a;
   }

   protected float b(hai $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hai b() {
      return new hai();
   }

   public void a(cmj $$0, hai $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.p();
      $$1.c = $$0.ca();
   }

   protected boolean c(hai $$0) {
      return super.a($$0) || $$0.b;
   }
}
