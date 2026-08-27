import com.mojang.serialization.MapCodec;

public class yh implements yi {
   public static final yj<yh> a = new yj<yh>() {
      private static final MapCodec<yh> a = wu.a.fieldOf("value").xmap(yh::new, $$0 -> $$0.b);
      private static final yq<wd, yh> b = yq.a(wu.d, $$0 -> $$0.b, yh::new);

      @Override
      public MapCodec<yh> a() {
         return a;
      }

      @Override
      public yq<wd, yh> b() {
         return b;
      }
   };
   final ws b;

   public yh(ws $$0) {
      this.b = $$0;
   }

   @Override
   public xg a(int $$0) {
      return this.b.f();
   }

   @Override
   public yj<yh> a() {
      return a;
   }
}
