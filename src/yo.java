import com.mojang.serialization.MapCodec;

public class yo implements yl {
   public static final ym<yo> a = new ym<yo>() {
      private static final MapCodec<yo> a = xs.b.a.xmap(yo::new, $$0 -> $$0.e);
      private static final yt<wg, yo> b = yt.a(xs.b.c, $$0 -> $$0.e, yo::new);

      @Override
      public MapCodec<yo> a() {
         return a;
      }

      @Override
      public yt<wg, yo> b() {
         return b;
      }
   };
   public static final yo b = new yo(xs.a);
   public static final yo c = new yo(xs.a.a(n.m));
   public static final yo d = new yo(xs.a.a(n.o));
   final xs e;

   public yo(xs $$0) {
      this.e = $$0;
   }

   @Override
   public xj a(int $$0) {
      return wv.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public ym<yo> a() {
      return a;
   }
}
