import com.mojang.serialization.MapCodec;

public class yn implements yo {
   public static final yp<yn> a = new yp<yn>() {
      private static final MapCodec<yn> a = xa.a.fieldOf("value").xmap(yn::new, $$0 -> $$0.b);
      private static final yw<wj, yn> b = yw.a(xa.d, $$0 -> $$0.b, yn::new);

      @Override
      public MapCodec<yn> a() {
         return a;
      }

      @Override
      public yw<wj, yn> b() {
         return b;
      }
   };
   final wy b;

   public yn(wy $$0) {
      this.b = $$0;
   }

   @Override
   public xm a(int $$0) {
      return this.b.f();
   }

   @Override
   public yp<yn> a() {
      return a;
   }
}
