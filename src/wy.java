import com.mojang.serialization.MapCodec;

public class wy implements wv {
   public static final ww<wy> a = new ww<wy>() {
      private static final MapCodec<wy> a = wc.b.a.xmap(wy::new, $$0 -> $$0.e);

      @Override
      public MapCodec<wy> a() {
         return a;
      }

      public void a(ui $$0, wy $$1) {
         $$0.a(tb.a, wc.b.b, $$1.e);
      }

      public wy a(ui $$0) {
         wc $$1 = $$0.a(tb.a, wc.b.b);
         return new wy($$1);
      }
   };
   public static final wy b = new wy(wc.a);
   public static final wy c = new wy(wc.a.a(n.m));
   public static final wy d = new wy(wc.a.a(n.o));
   final wc e;

   public wy(wc $$0) {
      this.e = $$0;
   }

   @Override
   public vt a(int $$0) {
      return vf.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public ww<wy> a() {
      return a;
   }
}
