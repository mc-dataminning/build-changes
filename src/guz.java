public class guz extends gsv<cmm, gza> {
   private static final aku a = aku.b("textures/entity/illager/vindicator.png");

   public guz(gsc.a $$0) {
      super($$0, new gco<>($$0.a(gfb.dv)), 0.5F);
      this.a(new gwj<gza, gco<gza>>(this) {
         public void a(ffu $$0, glx $$1, int $$2, gza $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public aku a(gza $$0) {
      return a;
   }

   public gza b() {
      return new gza();
   }
}
