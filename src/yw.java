import com.mojang.serialization.MapCodec;

public class yw implements yt {
   public static final yu<yw> a = new yu<yw>() {
      private static final MapCodec<yw> a = ya.b.a.xmap(yw::new, $$0 -> $$0.e);
      private static final zb<wo, yw> b = zb.a(ya.b.c, $$0 -> $$0.e, yw::new);

      @Override
      public MapCodec<yw> a() {
         return a;
      }

      @Override
      public zb<wo, yw> b() {
         return b;
      }
   };
   public static final yw b = new yw(ya.a);
   public static final yw c = new yw(ya.a.a(n.m));
   public static final yw d = new yw(ya.a.a(n.o));
   final ya e;

   public yw(ya $$0) {
      this.e = $$0;
   }

   @Override
   public xr a(int $$0) {
      return xd.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yu<yw> a() {
      return a;
   }
}
