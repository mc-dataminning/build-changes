public class hbl extends hbh<hev, gij> {
   private final gij a;

   public hbl(gyq<hev, gij> $$0, gjk $$1) {
      super($$0);
      this.a = new gij($$1.a(gjn.df));
   }

   public void a(fjy $$0, gqm $$1, int $$2, hev $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         fkc $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gqx.s(gyx.a));
         } else {
            $$7 = $$1.getBuffer(gqx.j(gyx.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gxu.a($$3, 0.0F));
      }
   }
}
