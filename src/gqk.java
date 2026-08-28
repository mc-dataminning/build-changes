public class gqk extends goh<cls, guh> {
   private static final ale a = ale.b("textures/entity/illager/vindicator.png");

   public gqk(gno.a $$0) {
      super($$0, new fyc<>($$0.a(gap.cU)), 0.5F);
      this.a(new gru<guh, fyc<guh>>(this, $$0.b()) {
         public void a(fdi $$0, ghl $$1, int $$2, guh $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public ale a(guh $$0) {
      return a;
   }

   public guh c() {
      return new guh();
   }
}
