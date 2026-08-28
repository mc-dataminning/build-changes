import com.mojang.serialization.MapCodec;

public class yw implements yx {
   public static final yy<yw> a = new yy<yw>() {
      private static final MapCodec<yw> a = xj.a.fieldOf("value").xmap(yw::new, $$0 -> $$0.b);
      private static final zf<ws, yw> b = zf.a(xj.d, $$0 -> $$0.b, yw::new);

      @Override
      public MapCodec<yw> a() {
         return a;
      }

      @Override
      public zf<ws, yw> b() {
         return b;
      }
   };
   final xh b;

   public yw(xh $$0) {
      this.b = $$0;
   }

   @Override
   public xv a(int $$0) {
      return this.b.f();
   }

   @Override
   public yy<yw> a() {
      return a;
   }
}
