import com.mojang.serialization.MapCodec;

public class zj implements zl {
   public static final zj a = new zj();
   public static final zm<zj> b = new zm<zj>() {
      private static final MapCodec<zj> a = MapCodec.unit(zj.a);
      private static final zt<xg, zj> b = zt.a(zj.a);

      @Override
      public MapCodec<zj> a() {
         return a;
      }

      @Override
      public zt<xg, zj> b() {
         return b;
      }
   };

   @Override
   public yj a(int $$0) {
      return xv.i();
   }

   @Override
   public zm<zj> a() {
      return b;
   }
}
