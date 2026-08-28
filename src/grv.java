public class grv<T extends cjc> extends gqv<T, gyh, gbw> {
   public static final akv a = akv.b("textures/entity/horse/donkey.png");
   public static final akv b = akv.b("textures/entity/horse/mule.png");
   private final akv k;

   public grv(gsf.a $$0, gfc $$1, gfc $$2, boolean $$3) {
      super($$0, new gbw($$0.a($$1)), new gbw($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public akv a(gyh $$0) {
      return this.k;
   }

   public gyh a() {
      return new gyh();
   }

   public void a(T $$0, gyh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
