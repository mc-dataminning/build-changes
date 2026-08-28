import javax.annotation.Nullable;

public class hdk extends hdf implements din {
   public iv a = iv.c;
   public iv b = iv.c;
   public eat c = dmt.L.m();
   @Nullable
   public jf<dkp> d;
   public din e = djb.a;

   @Override
   public float a(jb $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public ewp x_() {
      return this.e.x_();
   }

   @Override
   public int a(iv $$0, diw $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dxr c_(iv $$0) {
      return null;
   }

   @Override
   public eat a_(iv $$0) {
      return $$0.equals(this.b) ? this.c : dmt.a.m();
   }

   @Override
   public exa b_(iv $$0) {
      return this.a_($$0).y();
   }

   @Override
   public int H_() {
      return 1;
   }

   @Override
   public int G_() {
      return this.b.v();
   }
}
