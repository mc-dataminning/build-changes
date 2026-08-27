import com.mojang.serialization.MapCodec;

public class yl implements yi {
   public static final yj<yl> a = new yj<yl>() {
      private static final MapCodec<yl> a = xp.b.a.xmap(yl::new, $$0 -> $$0.e);
      private static final yq<wd, yl> b = yq.a(xp.b.c, $$0 -> $$0.e, yl::new);

      @Override
      public MapCodec<yl> a() {
         return a;
      }

      @Override
      public yq<wd, yl> b() {
         return b;
      }
   };
   public static final yl b = new yl(xp.a);
   public static final yl c = new yl(xp.a.a(n.m));
   public static final yl d = new yl(xp.a.a(n.o));
   final xp e;

   public yl(xp $$0) {
      this.e = $$0;
   }

   @Override
   public xg a(int $$0) {
      return ws.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yj<yl> a() {
      return a;
   }
}
