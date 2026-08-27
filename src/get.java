public class get extends geh<cbx, foe<cbx>> {
   private static final ajh a = new ajh("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final foe<cbx> j;
   private final foe<cbx> k;
   private final foe<cbx> l = this.a();

   public get(gdb.a $$0) {
      super($$0, new fpm<>($$0.a(fre.bb)), 0.2F);
      this.k = new fpn<>($$0.a(fre.bc));
      this.j = new fpo<>($$0.a(fre.bd));
   }

   public ajh a(cbx $$0) {
      return a;
   }

   public void a(cbx $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      int $$6 = $$0.gp();
      if ($$6 != this.i) {
         if ($$6 == 0) {
            this.f = this.j;
         } else if ($$6 == 1) {
            this.f = this.k;
         } else {
            this.f = this.l;
         }
      }

      this.i = $$6;
      this.d = 0.1F + 0.1F * (float)$$6;
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cbx $$0, eub $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, aww.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
