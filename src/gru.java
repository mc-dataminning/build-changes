public class gru<T extends cjb> extends gqu<T, gyg, gbv> {
   public static final akv a = akv.b("textures/entity/horse/donkey.png");
   public static final akv b = akv.b("textures/entity/horse/mule.png");
   private final akv k;

   public gru(gse.a $$0, gfb $$1, gfb $$2, boolean $$3) {
      super($$0, new gbv($$0.a($$1)), new gbv($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public akv a(gyg $$0) {
      return this.k;
   }

   public gyg a() {
      return new gyg();
   }

   public void a(T $$0, gyg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
