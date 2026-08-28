import javax.annotation.Nullable;

public class hap extends hak implements dgs {
   public jj a = jj.c;
   public jj b = jj.c;
   public dym c = dkw.L.m();
   @Nullable
   public js<dis> d;
   public dgs e = dhe.a;

   @Override
   public float a(jo $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public eui x_() {
      return this.e.x_();
   }

   @Override
   public int a(jj $$0, dha $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dvl c_(jj $$0) {
      return null;
   }

   @Override
   public dym a_(jj $$0) {
      return $$0.equals(this.b) ? this.c : dkw.a.m();
   }

   @Override
   public eut b_(jj $$0) {
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
