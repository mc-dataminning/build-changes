public class goq<T extends ciy> extends gnr<T, guz, fyu> {
   public static final all a = all.b("textures/entity/horse/donkey.png");
   public static final all b = all.b("textures/entity/horse/mule.png");
   private final all k;

   public goq(gpa.a $$0, float $$1, gca $$2, gca $$3, boolean $$4) {
      super($$0, new fyu($$0.a($$2)), new fyu($$0.a($$3)), $$1);
      this.k = $$4 ? b : a;
   }

   public all a(guz $$0) {
      return this.k;
   }

   public guz a() {
      return new guz();
   }

   public void a(T $$0, guz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
