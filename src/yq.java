import com.mojang.serialization.MapCodec;

public class yq implements yn {
   public static final yo<yq> a = new yo<yq>() {
      private static final MapCodec<yq> a = xu.b.a.xmap(yq::new, $$0 -> $$0.e);
      private static final yv<wi, yq> b = yv.a(xu.b.c, $$0 -> $$0.e, yq::new);

      @Override
      public MapCodec<yq> a() {
         return a;
      }

      @Override
      public yv<wi, yq> b() {
         return b;
      }
   };
   public static final yq b = new yq(xu.a);
   public static final yq c = new yq(xu.a.a(n.m));
   public static final yq d = new yq(xu.a.a(n.o));
   final xu e;

   public yq(xu $$0) {
      this.e = $$0;
   }

   @Override
   public xl a(int $$0) {
      return wx.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yo<yq> a() {
      return a;
   }
}
