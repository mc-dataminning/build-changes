public class gwv extends gwr<haf, gdy> {
   private final gdy a;

   public gwv(gtz<haf, gdy> $$0, gey $$1) {
      super($$0);
      this.a = new gdy($$1.a(gfb.cP));
   }

   public void a(ffu $$0, glx $$1, int $$2, haf $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         ffy $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gmh.s(gug.a));
         } else {
            $$7 = $$1.getBuffer(gmh.j(gug.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gtd.a($$3, 0.0F));
      }
   }
}
