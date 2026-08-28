public class hfx extends hfe {
   public float a;
   public float b;
   public boolean c;
   public czi d = czi.a;
   public int e;

   public int a() {
      if (this.b()) {
         int $$0 = 25;
         int $$1 = azz.d(this.v);
         int $$2 = $$1 / 25 + this.e;
         int $$3 = czi.values().length;
         int $$4 = $$2 % $$3;
         int $$5 = ($$2 + 1) % $$3;
         float $$6 = ((float)($$1 % 25) + azz.i(this.v)) / 25.0F;
         int $$7 = cmr.a(czi.a($$4));
         int $$8 = cmr.a(czi.a($$5));
         return ayh.a($$6, $$7, $$8);
      } else {
         return cmr.a(this.d);
      }
   }

   public boolean b() {
      return this.at != null && "jeb_".equals(this.at.getString());
   }
}
