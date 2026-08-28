import com.mojang.serialization.MapCodec;

public class yv implements yw {
   public static final yx<yv> a = new yx<yv>() {
      private static final MapCodec<yv> a = xi.a.fieldOf("value").xmap(yv::new, $$0 -> $$0.b);
      private static final ze<wp, yv> b = ze.a(xi.d, $$0 -> $$0.b, yv::new);

      @Override
      public MapCodec<yv> a() {
         return a;
      }

      @Override
      public ze<wp, yv> b() {
         return b;
      }
   };
   final xg b;

   public yv(xg $$0) {
      this.b = $$0;
   }

   @Override
   public xu a(int $$0) {
      return this.b.f();
   }

   @Override
   public yx<yv> a() {
      return a;
   }
}
