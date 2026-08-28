import javax.annotation.Nullable;

public class gyo extends gyj implements dfj {
   public ji a = ji.c;
   public ji b = ji.c;
   public dww c = djn.L.m();
   @Nullable
   public jr<dhj> d;
   public dfj e = dfv.a;

   @Override
   public float a(jn $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public esn C_() {
      return this.e.C_();
   }

   @Override
   public int a(ji $$0, dfr $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dty c_(ji $$0) {
      return null;
   }

   @Override
   public dww a_(ji $$0) {
      return $$0.equals(this.b) ? this.c : djn.a.m();
   }

   @Override
   public esy b_(ji $$0) {
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
