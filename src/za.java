import com.mojang.serialization.MapCodec;

public class za implements yx {
   public static final yy<za> a = new yy<za>() {
      private static final MapCodec<za> a = ye.b.a.xmap(za::new, $$0 -> $$0.e);
      private static final zf<ws, za> b = zf.a(ye.b.c, $$0 -> $$0.e, za::new);

      @Override
      public MapCodec<za> a() {
         return a;
      }

      @Override
      public zf<ws, za> b() {
         return b;
      }
   };
   public static final za b = new za(ye.a);
   public static final za c = new za(ye.a.a(n.m));
   public static final za d = new za(ye.a.a(n.o));
   final ye e;

   public za(ye $$0) {
      this.e = $$0;
   }

   @Override
   public xv a(int $$0) {
      return xh.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yy<za> a() {
      return a;
   }
}
