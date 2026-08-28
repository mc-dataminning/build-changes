public class gwa extends gtw<cnh, hab> {
   private static final aku a = aku.b("textures/entity/illager/vindicator.png");

   public gwa(gtd.a $$0) {
      super($$0, new gdo<>($$0.a(ggb.dx)), 0.5F);
      this.a(new gxk<hab, gdo<hab>>(this) {
         public void a(fgr $$0, gmx $$1, int $$2, hab $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public aku a(hab $$0) {
      return a;
   }

   public hab b() {
      return new hab();
   }
}
