import com.mojang.serialization.MapCodec;

public class yk implements yl {
   public static final ym<yk> a = new ym<yk>() {
      private static final MapCodec<yk> a = wx.a.fieldOf("value").xmap(yk::new, $$0 -> $$0.b);
      private static final yt<wg, yk> b = yt.a(wx.d, $$0 -> $$0.b, yk::new);

      @Override
      public MapCodec<yk> a() {
         return a;
      }

      @Override
      public yt<wg, yk> b() {
         return b;
      }
   };
   final wv b;

   public yk(wv $$0) {
      this.b = $$0;
   }

   @Override
   public xj a(int $$0) {
      return this.b.f();
   }

   @Override
   public ym<yk> a() {
      return a;
   }
}
