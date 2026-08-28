import com.mojang.serialization.MapCodec;

public class yl implements ym {
   public static final yn<yl> a = new yn<yl>() {
      private static final MapCodec<yl> a = wy.a.fieldOf("value").xmap(yl::new, $$0 -> $$0.b);
      private static final yu<wh, yl> b = yu.a(wy.d, $$0 -> $$0.b, yl::new);

      @Override
      public MapCodec<yl> a() {
         return a;
      }

      @Override
      public yu<wh, yl> b() {
         return b;
      }
   };
   final ww b;

   public yl(ww $$0) {
      this.b = $$0;
   }

   @Override
   public xk a(int $$0) {
      return this.b.f();
   }

   @Override
   public yn<yl> a() {
      return a;
   }
}
