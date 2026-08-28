import javax.annotation.Nullable;

public class gtv extends gtq implements ddl {
   public jf a = jf.c;
   public jf b = jf.c;
   public dus c = dho.I.n();
   @Nullable
   public jo<dfk> d;
   public ddl e = ddx.a;

   @Override
   public float a(jk $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public eqi y_() {
      return this.e.y_();
   }

   @Override
   public int a(jf $$0, ddt $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public drv c_(jf $$0) {
      return null;
   }

   @Override
   public dus a_(jf $$0) {
      return $$0.equals(this.b) ? this.c : dho.a.n();
   }

   @Override
   public eqt b_(jf $$0) {
      return this.a_($$0).y();
   }

   @Override
   public int I_() {
      return 1;
   }

   @Override
   public int H_() {
      return this.b.v();
   }
}
