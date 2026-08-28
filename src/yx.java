import com.mojang.serialization.MapCodec;

public class yx implements yu {
   public static final yv<yx> a = new yv<yx>() {
      private static final MapCodec<yx> a = yb.b.a.xmap(yx::new, $$0 -> $$0.e);
      private static final zc<wp, yx> b = zc.a(yb.b.c, $$0 -> $$0.e, yx::new);

      @Override
      public MapCodec<yx> a() {
         return a;
      }

      @Override
      public zc<wp, yx> b() {
         return b;
      }
   };
   public static final yx b = new yx(yb.a);
   public static final yx c = new yx(yb.a.a(n.m));
   public static final yx d = new yx(yb.a.a(n.o));
   final yb e;

   public yx(yb $$0) {
      this.e = $$0;
   }

   @Override
   public xs a(int $$0) {
      return xe.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yv<yx> a() {
      return a;
   }
}
