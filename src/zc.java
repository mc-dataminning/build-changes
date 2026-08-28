import com.mojang.serialization.MapCodec;

public class zc implements ze {
   public static final zc a = new zc();
   public static final zf<zc> b = new zf<zc>() {
      private static final MapCodec<zc> a = MapCodec.unit(zc.a);
      private static final zm<wz, zc> b = zm.a(zc.a);

      @Override
      public MapCodec<zc> a() {
         return a;
      }

      @Override
      public zm<wz, zc> b() {
         return b;
      }
   };

   @Override
   public yc a(int $$0) {
      return xo.i();
   }

   @Override
   public zf<zc> a() {
      return b;
   }
}
