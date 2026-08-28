public class gwc<T extends coj> extends gws<T, hci> {
   private static final alg a = alg.b("textures/entity/illager/evoker.png");

   public gwc(gvz.a $$0) {
      super($$0, new ggf<>($$0.a(git.aT)), 0.5F);
      this.a(new haf<hci, ggf<hci>>(this) {
         public void a(fjc $$0, gps $$1, int $$2, hci $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alg a(hci $$0) {
      return a;
   }

   public hci b() {
      return new hci();
   }

   public void a(T $$0, hci $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }
}
