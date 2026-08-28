public class grr<T extends ciz> extends gqr<T, gyd, gbs> {
   public static final aku a = aku.b("textures/entity/horse/donkey.png");
   public static final aku b = aku.b("textures/entity/horse/mule.png");
   private final aku k;

   public grr(gsb.a $$0, gey $$1, gey $$2, boolean $$3) {
      super($$0, new gbs($$0.a($$1)), new gbs($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public aku a(gyd $$0) {
      return this.k;
   }

   public gyd a() {
      return new gyd();
   }

   public void a(T $$0, gyd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
