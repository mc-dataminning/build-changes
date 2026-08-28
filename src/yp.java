import com.mojang.serialization.MapCodec;

public class yp implements ym {
   public static final yn<yp> a = new yn<yp>() {
      private static final MapCodec<yp> a = xt.b.a.xmap(yp::new, $$0 -> $$0.e);
      private static final yu<wh, yp> b = yu.a(xt.b.c, $$0 -> $$0.e, yp::new);

      @Override
      public MapCodec<yp> a() {
         return a;
      }

      @Override
      public yu<wh, yp> b() {
         return b;
      }
   };
   public static final yp b = new yp(xt.a);
   public static final yp c = new yp(xt.a.a(n.m));
   public static final yp d = new yp(xt.a.a(n.o));
   final xt e;

   public yp(xt $$0) {
      this.e = $$0;
   }

   @Override
   public xk a(int $$0) {
      return ww.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yn<yp> a() {
      return a;
   }
}
