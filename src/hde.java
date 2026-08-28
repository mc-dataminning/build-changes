import javax.annotation.Nullable;

public class hde extends hcz implements dik {
   public iv a = iv.c;
   public iv b = iv.c;
   public eao c = dmo.L.m();
   @Nullable
   public jf<dkk> d;
   public dik e = diw.a;

   @Override
   public float a(jb $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public ewk x_() {
      return this.e.x_();
   }

   @Override
   public int a(iv $$0, dis $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dxm c_(iv $$0) {
      return null;
   }

   @Override
   public eao a_(iv $$0) {
      return $$0.equals(this.b) ? this.c : dmo.a.m();
   }

   @Override
   public ewv b_(iv $$0) {
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
