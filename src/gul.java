public class gul extends gsh<cnl, gyk> {
   private static final alz a = alz.b("textures/entity/illager/vindicator.png");

   public gul(gro.a $$0) {
      super($$0, new gby<>($$0.a(gel.dp)), 0.5F);
      this.a(new gvv<gyk, gby<gyk>>(this, $$0.b()) {
         public void a(fgq $$0, glj $$1, int $$2, gyk $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alz a(gyk $$0) {
      return a;
   }

   public gyk b() {
      return new gyk();
   }
}
