import com.mojang.serialization.MapCodec;

public class yt implements yq {
   public static final yr<yt> a = new yr<yt>() {
      private static final MapCodec<yt> a = xx.b.a.xmap(yt::new, $$0 -> $$0.e);
      private static final yy<wl, yt> b = yy.a(xx.b.c, $$0 -> $$0.e, yt::new);

      @Override
      public MapCodec<yt> a() {
         return a;
      }

      @Override
      public yy<wl, yt> b() {
         return b;
      }
   };
   public static final yt b = new yt(xx.a);
   public static final yt c = new yt(xx.a.a(o.m));
   public static final yt d = new yt(xx.a.a(o.o));
   final xx e;

   public yt(xx $$0) {
      this.e = $$0;
   }

   @Override
   public xo a(int $$0) {
      return xa.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yr<yt> a() {
      return a;
   }
}
