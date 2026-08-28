public class gum extends gsi<cnl, gyl> {
   private static final alz a = alz.b("textures/entity/illager/vindicator.png");

   public gum(grp.a $$0) {
      super($$0, new gbz<>($$0.a(gem.dp)), 0.5F);
      this.a(new gvw<gyl, gbz<gyl>>(this, $$0.b()) {
         public void a(fgr $$0, glk $$1, int $$2, gyl $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alz a(gyl $$0) {
      return a;
   }

   public gyl b() {
      return new gyl();
   }
}
