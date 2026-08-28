import com.mojang.serialization.MapCodec;

public class yz implements za {
   public static final zb<yz> a = new zb<yz>() {
      private static final MapCodec<yz> a = xm.a.fieldOf("value").xmap(yz::new, $$0 -> $$0.b);
      private static final zi<wv, yz> b = zi.a(xm.d, $$0 -> $$0.b, yz::new);

      @Override
      public MapCodec<yz> a() {
         return a;
      }

      @Override
      public zi<wv, yz> b() {
         return b;
      }
   };
   final xk b;

   public yz(xk $$0) {
      this.b = $$0;
   }

   @Override
   public xy a(int $$0) {
      return this.b.f();
   }

   @Override
   public zb<yz> a() {
      return a;
   }
}
