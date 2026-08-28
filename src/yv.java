import com.mojang.serialization.MapCodec;

public class yv implements ys {
   public static final yt<yv> a = new yt<yv>() {
      private static final MapCodec<yv> a = xz.b.a.xmap(yv::new, $$0 -> $$0.e);
      private static final za<wn, yv> b = za.a(xz.b.c, $$0 -> $$0.e, yv::new);

      @Override
      public MapCodec<yv> a() {
         return a;
      }

      @Override
      public za<wn, yv> b() {
         return b;
      }
   };
   public static final yv b = new yv(xz.a);
   public static final yv c = new yv(xz.a.a(o.m));
   public static final yv d = new yv(xz.a.a(o.o));
   final xz e;

   public yv(xz $$0) {
      this.e = $$0;
   }

   @Override
   public xq a(int $$0) {
      return xc.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yt<yv> a() {
      return a;
   }
}
