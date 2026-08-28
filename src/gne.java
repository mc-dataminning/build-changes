public class gne<T extends cig> extends gmf<T, gtm, fxi> {
   public static final ale a = ale.b("textures/entity/horse/donkey.png");
   public static final ale b = ale.b("textures/entity/horse/mule.png");
   private final ale k;

   public gne(gno.a $$0, float $$1, gao $$2, gao $$3, boolean $$4) {
      super($$0, new fxi($$0.a($$2)), new fxi($$0.a($$3)), $$1);
      this.k = $$4 ? b : a;
   }

   public ale a(gtm $$0) {
      return this.k;
   }

   public gtm a() {
      return new gtm();
   }

   public void a(T $$0, gtm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
