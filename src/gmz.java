public class gmz<T extends cid> extends gma<T, gth, fxe> {
   public static final alc a = alc.b("textures/entity/horse/donkey.png");
   public static final alc b = alc.b("textures/entity/horse/mule.png");
   private final alc k;

   public gmz(gnj.a $$0, float $$1, gaj $$2, gaj $$3, boolean $$4) {
      super($$0, new fxe($$0.a($$2)), new fxe($$0.a($$3)), $$1);
      this.k = $$4 ? b : a;
   }

   public alc a(gth $$0) {
      return this.k;
   }

   public gth a() {
      return new gth();
   }

   public void a(T $$0, gth $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
