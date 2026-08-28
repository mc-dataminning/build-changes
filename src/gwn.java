public class gwn extends gvy<hac, gdw> {
   private static final alz a = alz.b("textures/entity/wolf/wolf_collar.png");

   public gwn(gtg<hac, gdw> $$0) {
      super($$0);
   }

   public void a(fgl $$0, gle $$1, int $$2, hac $$3, float $$4, float $$5) {
      cwh $$6 = $$3.h;
      if ($$6 != null && !$$3.u) {
         int $$7 = $$6.d();
         fgp $$8 = $$1.getBuffer(glo.f(a));
         this.d().a($$0, $$8, $$2, hav.d, $$7);
      }
   }
}
