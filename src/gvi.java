import javax.annotation.Nullable;

public class gvi extends gvd implements deh {
   public jh a = jh.c;
   public jh b = jh.c;
   public dvo c = dil.I.m();
   @Nullable
   public jq<dgh> d;
   public deh e = det.a;

   @Override
   public float a(jm $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public erd z_() {
      return this.e.z_();
   }

   @Override
   public int a(jh $$0, dep $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dsr c_(jh $$0) {
      return null;
   }

   @Override
   public dvo a_(jh $$0) {
      return $$0.equals(this.b) ? this.c : dil.a.m();
   }

   @Override
   public ero b_(jh $$0) {
      return this.a_($$0).y();
   }

   @Override
   public int J_() {
      return 1;
   }

   @Override
   public int I_() {
      return this.b.v();
   }
}
