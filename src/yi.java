import com.mojang.serialization.MapCodec;

public class yi implements yf {
   public static final yg<yi> a = new yg<yi>() {
      private static final MapCodec<yi> a = xm.b.a.xmap(yi::new, $$0 -> $$0.e);
      private static final yn<wa, yi> b = yn.a(xm.b.c, $$0 -> $$0.e, yi::new);

      @Override
      public MapCodec<yi> a() {
         return a;
      }

      @Override
      public yn<wa, yi> b() {
         return b;
      }
   };
   public static final yi b = new yi(xm.a);
   public static final yi c = new yi(xm.a.a(n.m));
   public static final yi d = new yi(xm.a.a(n.o));
   final xm e;

   public yi(xm $$0) {
      this.e = $$0;
   }

   @Override
   public xd a(int $$0) {
      return wp.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yg<yi> a() {
      return a;
   }
}
