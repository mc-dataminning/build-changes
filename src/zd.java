import com.mojang.serialization.MapCodec;

public class zd implements zf {
   public static final zd a = new zd();
   public static final zg<zd> b = new zg<zd>() {
      private static final MapCodec<zd> a = MapCodec.unit(zd.a);
      private static final zn<xa, zd> b = zn.a(zd.a);

      @Override
      public MapCodec<zd> a() {
         return a;
      }

      @Override
      public zn<xa, zd> b() {
         return b;
      }
   };

   @Override
   public yd a(int $$0) {
      return xp.i();
   }

   @Override
   public zg<zd> a() {
      return b;
   }
}
