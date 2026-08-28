import com.mojang.serialization.MapCodec;

public class lw extends lr<lw> implements lq {
   private final MapCodec<lw> a = MapCodec.unit(this::e);
   private final zi<wv, lw> b = zi.a(this);

   protected lw(boolean $$0) {
      super($$0);
   }

   public lw e() {
      return this;
   }

   @Override
   public MapCodec<lw> c() {
      return this.a;
   }

   @Override
   public zi<wv, lw> d() {
      return this.b;
   }
}
