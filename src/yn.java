import com.mojang.serialization.MapCodec;

public class yn implements yp {
   public static final yn a = new yn();
   public static final yq<yn> b = new yq<yn>() {
      private static final MapCodec<yn> a = MapCodec.unit(yn.a);
      private static final yx<wk, yn> b = yx.a(yn.a);

      @Override
      public MapCodec<yn> a() {
         return a;
      }

      @Override
      public yx<wk, yn> b() {
         return b;
      }
   };

   @Override
   public xn a(int $$0) {
      return wz.i();
   }

   @Override
   public yq<yn> a() {
      return b;
   }
}
