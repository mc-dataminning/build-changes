import com.mojang.serialization.MapCodec;

public class zc implements yz {
   public static final za<zc> a = new za<zc>() {
      private static final MapCodec<zc> a = yg.b.a.xmap(zc::new, $$0 -> $$0.e);
      private static final zh<wu, zc> b = zh.a(yg.b.c, $$0 -> $$0.e, zc::new);

      @Override
      public MapCodec<zc> a() {
         return a;
      }

      @Override
      public zh<wu, zc> b() {
         return b;
      }
   };
   public static final zc b = new zc(yg.a);
   public static final zc c = new zc(yg.a.a(n.m));
   public static final zc d = new zc(yg.a.a(n.o));
   final yg e;

   public zc(yg $$0) {
      this.e = $$0;
   }

   @Override
   public xx a(int $$0) {
      return xj.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public za<zc> a() {
      return a;
   }
}
