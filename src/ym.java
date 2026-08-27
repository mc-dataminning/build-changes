import com.mojang.serialization.MapCodec;

public class ym implements yn {
   public static final yo<ym> a = new yo<ym>() {
      private static final MapCodec<ym> a = wz.a.fieldOf("value").xmap(ym::new, $$0 -> $$0.b);
      private static final yv<wi, ym> b = yv.a(wz.d, $$0 -> $$0.b, ym::new);

      @Override
      public MapCodec<ym> a() {
         return a;
      }

      @Override
      public yv<wi, ym> b() {
         return b;
      }
   };
   final wx b;

   public ym(wx $$0) {
      this.b = $$0;
   }

   @Override
   public xl a(int $$0) {
      return this.b.f();
   }

   @Override
   public yo<ym> a() {
      return a;
   }
}
