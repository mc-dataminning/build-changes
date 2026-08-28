public class gyf extends gwq<coh, hdx, gho> {
   private static final ale a = ale.b("textures/entity/illager/vex.png");
   private static final ale j = ale.b("textures/entity/illager/vex_charging.png");

   public gyf(gvk.a $$0) {
      super($$0, new gho($$0.a(gif.dE)), 0.3F);
      this.a(new gzq<>(this));
   }

   protected int a(coh $$0, iu $$1) {
      return 15;
   }

   public ale a(hdx $$0) {
      return $$0.a ? j : a;
   }

   public hdx b() {
      return new hdx();
   }

   public void a(coh $$0, hdx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hau.a($$0, $$1, this.h);
      $$1.a = $$0.t();
   }
}
