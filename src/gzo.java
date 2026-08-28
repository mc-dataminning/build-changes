import javax.annotation.Nullable;

public class gzo extends gzj implements dgc {
   public ji a = ji.c;
   public ji b = ji.c;
   public dxq c = dkg.L.m();
   @Nullable
   public jr<dic> d;
   public dgc e = dgo.a;

   @Override
   public float a(jn $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public etl x_() {
      return this.e.x_();
   }

   @Override
   public int a(ji $$0, dgk $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dus c_(ji $$0) {
      return null;
   }

   @Override
   public dxq a_(ji $$0) {
      return $$0.equals(this.b) ? this.c : dkg.a.m();
   }

   @Override
   public etw b_(ji $$0) {
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
