import javax.annotation.Nullable;

public class gym extends gyh implements dfi {
   public ji a = ji.c;
   public ji b = ji.c;
   public dwv c = djm.L.m();
   @Nullable
   public jr<dhi> d;
   public dfi e = dfu.a;

   @Override
   public float a(jn $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public esm C_() {
      return this.e.C_();
   }

   @Override
   public int a(ji $$0, dfq $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dtx c_(ji $$0) {
      return null;
   }

   @Override
   public dwv a_(ji $$0) {
      return $$0.equals(this.b) ? this.c : djm.a.m();
   }

   @Override
   public esx b_(ji $$0) {
      return this.a_($$0).y();
   }

   @Override
   public int M_() {
      return 1;
   }

   @Override
   public int L_() {
      return this.b.v();
   }
}
