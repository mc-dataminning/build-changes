import com.mojang.serialization.MapCodec;

public class yy implements yz {
   public static final za<yy> a = new za<yy>() {
      private static final MapCodec<yy> a = xl.a.fieldOf("value").xmap(yy::new, $$0 -> $$0.b);
      private static final zh<wu, yy> b = zh.a(xl.d, $$0 -> $$0.b, yy::new);

      @Override
      public MapCodec<yy> a() {
         return a;
      }

      @Override
      public zh<wu, yy> b() {
         return b;
      }
   };
   final xj b;

   public yy(xj $$0) {
      this.b = $$0;
   }

   @Override
   public xx a(int $$0) {
      return this.b.f();
   }

   @Override
   public za<yy> a() {
      return a;
   }
}
