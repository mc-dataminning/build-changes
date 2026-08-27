import com.mojang.serialization.MapCodec;

public class yt implements yu {
   public static final yv<yt> a = new yv<yt>() {
      private static final MapCodec<yt> a = xg.a.fieldOf("value").xmap(yt::new, $$0 -> $$0.b);
      private static final zc<wp, yt> b = zc.a(xg.d, $$0 -> $$0.b, yt::new);

      @Override
      public MapCodec<yt> a() {
         return a;
      }

      @Override
      public zc<wp, yt> b() {
         return b;
      }
   };
   final xe b;

   public yt(xe $$0) {
      this.b = $$0;
   }

   @Override
   public xs a(int $$0) {
      return this.b.f();
   }

   @Override
   public yv<yt> a() {
      return a;
   }
}
