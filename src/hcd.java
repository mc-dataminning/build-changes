import javax.annotation.Nullable;

public class hcd extends hcf {
   public float a;
   public float b;
   public boolean c;
   @Nullable
   public fei d;
   public boolean e;
   public boolean f;
   public double g;
   public float h;
   public final clu i = new clu();

   public clu.a a(int $$0) {
      return this.i.a($$0, this.h);
   }

   public float a(int $$0, clu.a $$1, clu.a $$2) {
      double $$3;
      if (this.e) {
         $$3 = (double)$$0 / Math.max(this.g / 4.0, 1.0);
      } else if (this.f) {
         $$3 = (double)$$0;
      } else if ($$0 == 6) {
         $$3 = 0.0;
      } else {
         $$3 = $$2.a() - $$1.a();
      }

      return (float)$$3;
   }
}
