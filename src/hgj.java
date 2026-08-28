public class hgj extends hfr {
   public float a;
   public float b;
   public boolean c;
   public cyy d = cyy.a;
   public int e;

   public int a() {
      if (this.b()) {
         int $$0 = 25;
         int $$1 = azq.d(this.u);
         int $$2 = $$1 / 25 + this.e;
         int $$3 = cyy.values().length;
         int $$4 = $$2 % $$3;
         int $$5 = ($$2 + 1) % $$3;
         float $$6 = ((float)($$1 % 25) + azq.i(this.u)) / 25.0F;
         int $$7 = cmi.a(cyy.a($$4));
         int $$8 = cmi.a(cyy.a($$5));
         return aya.a($$6, $$7, $$8);
      } else {
         return cmi.a(this.d);
      }
   }

   public boolean b() {
      return this.aq != null && "jeb_".equals(this.aq.getString());
   }
}
