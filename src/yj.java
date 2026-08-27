import com.mojang.serialization.MapCodec;

public class yj implements yk {
   public static final yl<yj> a = new yl<yj>() {
      private static final MapCodec<yj> a = ww.a.fieldOf("value").xmap(yj::new, $$0 -> $$0.b);
      private static final ys<wf, yj> b = ys.a(ww.d, $$0 -> $$0.b, yj::new);

      @Override
      public MapCodec<yj> a() {
         return a;
      }

      @Override
      public ys<wf, yj> b() {
         return b;
      }
   };
   final wu b;

   public yj(wu $$0) {
      this.b = $$0;
   }

   @Override
   public xi a(int $$0) {
      return this.b.f();
   }

   @Override
   public yl<yj> a() {
      return a;
   }
}
