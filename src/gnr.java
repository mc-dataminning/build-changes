public class gnr<T extends cln> extends goh<T, gtt> {
   private static final ale a = ale.b("textures/entity/illager/evoker.png");

   public gnr(gno.a $$0) {
      super($$0, new fyc<>($$0.a(gap.ax)), 0.5F);
      this.a(new gru<gtt, fyc<gtt>>(this, $$0.b()) {
         public void a(fdi $$0, ghl $$1, int $$2, gtt $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public ale a(gtt $$0) {
      return a;
   }

   public gtt c() {
      return new gtt();
   }

   public void a(T $$0, gtt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
   }
}
