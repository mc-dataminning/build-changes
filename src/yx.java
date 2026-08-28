import com.mojang.serialization.MapCodec;

public class yx implements yy {
   public static final yz<yx> a = new yz<yx>() {
      private static final MapCodec<yx> a = xk.a.fieldOf("value").xmap(yx::new, $$0 -> $$0.b);
      private static final zg<wt, yx> b = zg.a(xk.d, $$0 -> $$0.b, yx::new);

      @Override
      public MapCodec<yx> a() {
         return a;
      }

      @Override
      public zg<wt, yx> b() {
         return b;
      }
   };
   final xi b;

   public yx(xi $$0) {
      this.b = $$0;
   }

   @Override
   public xw a(int $$0) {
      return this.b.f();
   }

   @Override
   public yz<yx> a() {
      return a;
   }
}
