public class gid extends gkd<ckz, ftj<ckz>> {
   private static final alf a = new alf("textures/entity/breeze/breeze.png");

   public gid(gix.a $$0) {
      super($$0, new ftj<>($$0.a(fwz.s)), 0.5F);
      this.a(new gmi(this));
      this.a(new gmh(this));
   }

   public void a(ckz $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      ftj<ckz> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(ckz $$0) {
      return a;
   }

   public static ftj<ckz> a(ftj<ckz> $$0, fxa... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fxa $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
