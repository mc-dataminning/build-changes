import javax.annotation.Nullable;

public class gsz extends gsu implements dcu {
   public je a = je.c;
   public je b = je.c;
   public dua c = dgx.I.o();
   @Nullable
   public jn<det> d;
   public dcu e = ddg.a;

   @Override
   public float a(jj $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public epq x_() {
      return this.e.x_();
   }

   @Override
   public int a(je $$0, ddc $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dre c_(je $$0) {
      return null;
   }

   @Override
   public dua a_(je $$0) {
      return $$0.equals(this.b) ? this.c : dgx.a.o();
   }

   @Override
   public eqb b_(je $$0) {
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
