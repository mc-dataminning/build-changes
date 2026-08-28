import com.mojang.serialization.MapCodec;

public class yo implements yp {
   public static final yq<yo> a = new yq<yo>() {
      private static final MapCodec<yo> a = xb.a.fieldOf("value").xmap(yo::new, $$0 -> $$0.b);
      private static final yx<wk, yo> b = yx.a(xb.d, $$0 -> $$0.b, yo::new);

      @Override
      public MapCodec<yo> a() {
         return a;
      }

      @Override
      public yx<wk, yo> b() {
         return b;
      }
   };
   final wz b;

   public yo(wz $$0) {
      this.b = $$0;
   }

   @Override
   public xn a(int $$0) {
      return this.b.f();
   }

   @Override
   public yq<yo> a() {
      return a;
   }
}
