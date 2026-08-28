public class hgh extends hfp {
   public float a;
   public float b;
   public boolean c;
   public cyw d = cyw.a;
   public int e;

   public int a() {
      if (this.b()) {
         int $$0 = 25;
         int $$1 = azo.d(this.u);
         int $$2 = $$1 / 25 + this.e;
         int $$3 = cyw.values().length;
         int $$4 = $$2 % $$3;
         int $$5 = ($$2 + 1) % $$3;
         float $$6 = ((float)($$1 % 25) + azo.i(this.u)) / 25.0F;
         int $$7 = cmg.a(cyw.a($$4));
         int $$8 = cmg.a(cyw.a($$5));
         return axy.a($$6, $$7, $$8);
      } else {
         return cmg.a(this.d);
      }
   }

   public boolean b() {
      return this.aq != null && "jeb_".equals(this.aq.getString());
   }
}
