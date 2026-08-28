import com.mojang.serialization.MapCodec;

public class ys implements yt {
   public static final yu<ys> a = new yu<ys>() {
      private static final MapCodec<ys> a = xf.a.fieldOf("value").xmap(ys::new, $$0 -> $$0.b);
      private static final zb<wo, ys> b = zb.a(xf.d, $$0 -> $$0.b, ys::new);

      @Override
      public MapCodec<ys> a() {
         return a;
      }

      @Override
      public zb<wo, ys> b() {
         return b;
      }
   };
   final xd b;

   public ys(xd $$0) {
      this.b = $$0;
   }

   @Override
   public xr a(int $$0) {
      return this.b.f();
   }

   @Override
   public yu<ys> a() {
      return a;
   }
}
