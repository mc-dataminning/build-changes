import javax.annotation.Nullable;

public class gyq extends gyl implements dfl {
   public ji a = ji.c;
   public ji b = ji.c;
   public dwy c = djp.L.m();
   @Nullable
   public jr<dhl> d;
   public dfl e = dfx.a;

   @Override
   public float a(jn $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public esp C_() {
      return this.e.C_();
   }

   @Override
   public int a(ji $$0, dft $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dua c_(ji $$0) {
      return null;
   }

   @Override
   public dwy a_(ji $$0) {
      return $$0.equals(this.b) ? this.c : djp.a.m();
   }

   @Override
   public eta b_(ji $$0) {
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
