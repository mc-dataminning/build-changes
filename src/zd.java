import com.mojang.serialization.MapCodec;

public class zd implements ze {
   public static final zf<zd> a = new zf<zd>() {
      private static final MapCodec<zd> a = xq.a.fieldOf("value").xmap(zd::new, $$0 -> $$0.b);
      private static final zm<wz, zd> b = zm.a(xq.d, $$0 -> $$0.b, zd::new);

      @Override
      public MapCodec<zd> a() {
         return a;
      }

      @Override
      public zm<wz, zd> b() {
         return b;
      }
   };
   final xo b;

   public zd(xo $$0) {
      this.b = $$0;
   }

   @Override
   public yc a(int $$0) {
      return this.b.f();
   }

   @Override
   public zf<zd> a() {
      return a;
   }
}
