import com.mojang.serialization.MapCodec;

public class yp implements yq {
   public static final yr<yp> a = new yr<yp>() {
      private static final MapCodec<yp> a = xc.a.fieldOf("value").xmap(yp::new, $$0 -> $$0.b);
      private static final yy<wl, yp> b = yy.a(xc.d, $$0 -> $$0.b, yp::new);

      @Override
      public MapCodec<yp> a() {
         return a;
      }

      @Override
      public yy<wl, yp> b() {
         return b;
      }
   };
   final xa b;

   public yp(xa $$0) {
      this.b = $$0;
   }

   @Override
   public xo a(int $$0) {
      return this.b.f();
   }

   @Override
   public yr<yp> a() {
      return a;
   }
}
