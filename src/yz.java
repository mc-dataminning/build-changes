import com.mojang.serialization.MapCodec;

public class yz implements yw {
   public static final yx<yz> a = new yx<yz>() {
      private static final MapCodec<yz> a = yd.b.a.xmap(yz::new, $$0 -> $$0.e);
      private static final ze<wp, yz> b = ze.a(yd.b.c, $$0 -> $$0.e, yz::new);

      @Override
      public MapCodec<yz> a() {
         return a;
      }

      @Override
      public ze<wp, yz> b() {
         return b;
      }
   };
   public static final yz b = new yz(yd.a);
   public static final yz c = new yz(yd.a.a(o.m));
   public static final yz d = new yz(yd.a.a(o.o));
   final yd e;

   public yz(yd $$0) {
      this.e = $$0;
   }

   @Override
   public xu a(int $$0) {
      return xg.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yx<yz> a() {
      return a;
   }
}
