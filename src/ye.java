import com.mojang.serialization.MapCodec;

public class ye implements yf {
   public static final yg<ye> a = new yg<ye>() {
      private static final MapCodec<ye> a = wr.a.fieldOf("value").xmap(ye::new, $$0 -> $$0.b);
      private static final yn<wa, ye> b = yn.a(wr.d, $$0 -> $$0.b, ye::new);

      @Override
      public MapCodec<ye> a() {
         return a;
      }

      @Override
      public yn<wa, ye> b() {
         return b;
      }
   };
   final wp b;

   public ye(wp $$0) {
      this.b = $$0;
   }

   @Override
   public xd a(int $$0) {
      return this.b.f();
   }

   @Override
   public yg<ye> a() {
      return a;
   }
}
