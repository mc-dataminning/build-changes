import com.mojang.serialization.MapCodec;

public class xx implements xy {
   public static final xz<xx> a = new xz<xx>() {
      private static final MapCodec<xx> a = wk.a.fieldOf("value").xmap(xx::new, $$0 -> $$0.b);
      private static final yg<vt, xx> b = yg.a(wk.d, $$0 -> $$0.b, xx::new);

      @Override
      public MapCodec<xx> a() {
         return a;
      }

      @Override
      public yg<vt, xx> b() {
         return b;
      }
   };
   final wi b;

   public xx(wi $$0) {
      this.b = $$0;
   }

   @Override
   public ww a(int $$0) {
      return this.b.f();
   }

   @Override
   public xz<xx> a() {
      return a;
   }
}
