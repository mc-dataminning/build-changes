import com.mojang.serialization.MapCodec;

public class wv implements ww {
   public static final wx<wv> a = new wx<wv>() {
      private static final MapCodec<wv> a = vi.a.fieldOf("value").xmap(wv::new, $$0 -> $$0.b);

      @Override
      public MapCodec<wv> a() {
         return a;
      }

      public void a(uj $$0, wv $$1) {
         $$0.a($$1.b);
      }

      public wv a(uj $$0) {
         vg $$1 = $$0.m();
         return new wv($$1);
      }
   };
   final vg b;

   public wv(vg $$0) {
      this.b = $$0;
   }

   @Override
   public vu a(int $$0) {
      return this.b.f();
   }

   @Override
   public wx<wv> a() {
      return a;
   }
}
