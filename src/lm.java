import com.mojang.serialization.MapCodec;

public class lm extends lh<lm> implements lg {
   private final MapCodec<lm> a = MapCodec.unit(this::e);
   private final zm<wz, lm> b = zm.a(this);

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
   public zm<wz, lm> d() {
      return this.b;
   }
}
