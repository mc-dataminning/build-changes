import com.mojang.serialization.MapCodec;

public class zd implements za {
   public static final zb<zd> a = new zb<zd>() {
      private static final MapCodec<zd> a = yh.b.a.xmap(zd::new, $$0 -> $$0.e);
      private static final zi<wv, zd> b = zi.a(yh.b.c, $$0 -> $$0.e, zd::new);

      @Override
      public MapCodec<zd> a() {
         return a;
      }

      @Override
      public zi<wv, zd> b() {
         return b;
      }
   };
   public static final zd b = new zd(yh.a);
   public static final zd c = new zd(yh.a.a(n.m));
   public static final zd d = new zd(yh.a.a(n.o));
   final yh e;

   public zd(yh $$0) {
      this.e = $$0;
   }

   @Override
   public xy a(int $$0) {
      return xk.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public zb<zd> a() {
      return a;
   }
}
