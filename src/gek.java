public class gek extends gfd<cab, flw<cab>> {
   private final fvh a;

   public gek(gcn<cab, flw<cab>> $$0, fvh $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(esa $$0, fvl $$1, int $$2, cab $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fm() == boa.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = awh.e($$3.dE()) / 60.0F;
      if ($$3.dE() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      coz $$14 = $$10 ? $$3.eT() : $$3.eU();
      this.a.a($$3, $$14, cow.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
