import javax.annotation.Nullable;

public class hcs extends hcn implements did {
   public iu a = iu.c;
   public iu b = iu.c;
   public eah c = dmh.L.m();
   @Nullable
   public je<dkd> d;
   public did e = dip.a;

   @Override
   public float a(ja $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public ewd x_() {
      return this.e.x_();
   }

   @Override
   public int a(iu $$0, dil $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dxf c_(iu $$0) {
      return null;
   }

   @Override
   public eah a_(iu $$0) {
      return $$0.equals(this.b) ? this.c : dmh.a.m();
   }

   @Override
   public ewo b_(iu $$0) {
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
