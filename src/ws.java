import com.mojang.serialization.MapCodec;

public class ws implements wt {
   public static final wu<ws> a = new wu<ws>() {
      private static final MapCodec<ws> a = vf.a.fieldOf("value").xmap(ws::new, $$0 -> $$0.b);

      @Override
      public MapCodec<ws> a() {
         return a;
      }

      public void a(ug $$0, ws $$1) {
         $$0.a($$1.b);
      }

      public ws a(ug $$0) {
         vd $$1 = $$0.m();
         return new ws($$1);
      }
   };
   final vd b;

   public ws(vd $$0) {
      this.b = $$0;
   }

   @Override
   public vr a(int $$0) {
      return this.b.f();
   }

   @Override
   public wu<ws> a() {
      return a;
   }
}
