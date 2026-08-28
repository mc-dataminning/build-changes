public class grb<T extends cjr> extends gqb<T, gxm, gbb> {
   public static final alp a = alp.b("textures/entity/horse/donkey.png");
   public static final alp b = alp.b("textures/entity/horse/mule.png");
   private final alp k;

   public grb(grl.a $$0, geh $$1, geh $$2, boolean $$3) {
      super($$0, new gbb($$0.a($$1)), new gbb($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public alp a(gxm $$0) {
      return this.k;
   }

   public gxm a() {
      return new gxm();
   }

   public void a(T $$0, gxm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
