public class hex extends hef {
   public float a;
   public float b;
   public boolean c;
   public cyl d = cyl.a;
   public int e;

   public int a() {
      if (this.b()) {
         int $$0 = 25;
         int $$1 = azm.d(this.u);
         int $$2 = $$1 / 25 + this.e;
         int $$3 = cyl.values().length;
         int $$4 = $$2 % $$3;
         int $$5 = ($$2 + 1) % $$3;
         float $$6 = ((float)($$1 % 25) + azm.i(this.u)) / 25.0F;
         int $$7 = clv.a(cyl.a($$4));
         int $$8 = clv.a(cyl.a($$5));
         return axw.a($$6, $$7, $$8);
      } else {
         return clv.a(this.d);
      }
   }

   public boolean b() {
      return this.aq != null && "jeb_".equals(this.aq.getString());
   }
}
