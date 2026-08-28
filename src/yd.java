import com.mojang.serialization.MapCodec;

public class yd implements ye {
   public static final yf<yd> a = new yf<yd>() {
      private static final MapCodec<yd> a = wq.a.fieldOf("value").xmap(yd::new, $$0 -> $$0.b);
      private static final ym<vz, yd> b = ym.a(wq.d, $$0 -> $$0.b, yd::new);

      @Override
      public MapCodec<yd> a() {
         return a;
      }

      @Override
      public ym<vz, yd> b() {
         return b;
      }
   };
   final wo b;

   public yd(wo $$0) {
      this.b = $$0;
   }

   @Override
   public xc a(int $$0) {
      return this.b.f();
   }

   @Override
   public yf<yd> a() {
      return a;
   }
}
