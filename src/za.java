import com.mojang.serialization.MapCodec;

public class za implements zb {
   public static final zc<za> a = new zc<za>() {
      private static final MapCodec<za> a = xn.a.fieldOf("value").xmap(za::new, $$0 -> $$0.b);
      private static final zj<ww, za> b = zj.a(xn.d, $$0 -> $$0.b, za::new);

      @Override
      public MapCodec<za> a() {
         return a;
      }

      @Override
      public zj<ww, za> b() {
         return b;
      }
   };
   final xl b;

   public za(xl $$0) {
      this.b = $$0;
   }

   @Override
   public xz a(int $$0) {
      return this.b.f();
   }

   @Override
   public zc<za> a() {
      return a;
   }
}
