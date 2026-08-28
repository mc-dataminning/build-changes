import com.mojang.serialization.MapCodec;

public class lm extends li<lm> implements lh {
   private final MapCodec<lm> a = MapCodec.unit(this::e);
   private final zj<ww, lm> b = zj.a(this);

   protected lm(boolean $$0) {
      super($$0);
   }

   public lm e() {
      return this;
   }

   @Override
   public MapCodec<lm> c() {
      return this.a;
   }

   @Override
   public zj<ww, lm> d() {
      return this.b;
   }
}
