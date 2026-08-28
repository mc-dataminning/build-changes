import com.mojang.serialization.MapCodec;

public class yr implements ys {
   public static final yt<yr> a = new yt<yr>() {
      private static final MapCodec<yr> a = xe.a.fieldOf("value").xmap(yr::new, $$0 -> $$0.b);
      private static final za<wn, yr> b = za.a(xe.d, $$0 -> $$0.b, yr::new);

      @Override
      public MapCodec<yr> a() {
         return a;
      }

      @Override
      public za<wn, yr> b() {
         return b;
      }
   };
   final xc b;

   public yr(xc $$0) {
      this.b = $$0;
   }

   @Override
   public xq a(int $$0) {
      return this.b.f();
   }

   @Override
   public yt<yr> a() {
      return a;
   }
}
