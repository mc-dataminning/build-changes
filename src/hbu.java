import javax.annotation.Nullable;

public class hbu extends hbp implements dhs {
   public iu a = iu.c;
   public iu b = iu.c;
   public dzo c = dlw.L.m();
   @Nullable
   public je<djs> d;
   public dhs e = die.a;

   @Override
   public float a(ja $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public evk x_() {
      return this.e.x_();
   }

   @Override
   public int a(iu $$0, dia $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dwn c_(iu $$0) {
      return null;
   }

   @Override
   public dzo a_(iu $$0) {
      return $$0.equals(this.b) ? this.c : dlw.a.m();
   }

   @Override
   public evv b_(iu $$0) {
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
