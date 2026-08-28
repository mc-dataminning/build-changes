import com.mojang.serialization.MapCodec;

public class yz implements zb {
   public static final yz a = new yz();
   public static final zc<yz> b = new zc<yz>() {
      private static final MapCodec<yz> a = MapCodec.unit(yz.a);
      private static final zj<ww, yz> b = zj.a(yz.a);

      @Override
      public MapCodec<yz> a() {
         return a;
      }

      @Override
      public zj<ww, yz> b() {
         return b;
      }
   };

   @Override
   public xz a(int $$0) {
      return xl.i();
   }

   @Override
   public zc<yz> a() {
      return b;
   }
}
