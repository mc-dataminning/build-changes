public class fvy extends fwr<buq, fef<buq>> {
   private final fnc a;

   public fvy(fue<buq, fef<buq>> $$0, fnc $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(elh $$0, fng $$1, int $$2, buq $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fk() == biq.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = aro.e($$3.dC()) / 60.0F;
      if ($$3.dC() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      ciw $$14 = $$10 ? $$3.eR() : $$3.eS();
      this.a.a($$3, $$14, cit.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
