import com.mojang.serialization.MapCodec;

public class zi implements zf {
   public static final zg<zi> a = new zg<zi>() {
      private static final MapCodec<zi> a = ym.b.a.xmap(zi::new, $$0 -> $$0.e);
      private static final zn<xa, zi> b = zn.a(ym.b.c, $$0 -> $$0.e, zi::new);

      @Override
      public MapCodec<zi> a() {
         return a;
      }

      @Override
      public zn<xa, zi> b() {
         return b;
      }
   };
   public static final zi b = new zi(ym.a);
   public static final zi c = new zi(ym.a.a(n.m));
   public static final zi d = new zi(ym.a.a(n.o));
   final ym e;

   public zi(ym $$0) {
      this.e = $$0;
   }

   @Override
   public yd a(int $$0) {
      return xp.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public zg<zi> a() {
      return a;
   }
}
