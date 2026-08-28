import com.mojang.serialization.MapCodec;

public class lx extends ls<lx> implements lr {
   private final MapCodec<lx> a = MapCodec.unit(this::e);
   private final yn<wa, lx> b = yn.a(this);

   protected lx(boolean $$0) {
      super($$0);
   }

   public lx e() {
      return this;
   }

   @Override
   public MapCodec<lx> c() {
      return this.a;
   }

   @Override
   public yn<wa, lx> d() {
      return this.b;
   }
}
