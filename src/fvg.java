public class fvg extends fwq<caq, fha<caq>> {
   private static final agg a = new agg("textures/entity/enderman/enderman.png");
   private final ato i = ato.a();

   public fvg(fvk.a $$0) {
      super($$0, new fha<>($$0.a(fka.R)), 0.5F);
      this.a(new fzc<>(this));
      this.a(new fyt(this, $$0.c()));
   }

   public void a(caq $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5) {
      dgw $$6 = $$0.ge();
      fha<caq> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public eji a(caq $$0, float $$1) {
      if ($$0.gf()) {
         double $$2 = 0.02;
         return new eji(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public agg a(caq $$0) {
      return a;
   }
}
