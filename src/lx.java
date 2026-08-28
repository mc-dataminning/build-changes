import com.mojang.serialization.MapCodec;

public class lx extends ls<lx> implements lr {
   private final MapCodec<lx> a = MapCodec.unit(this::e);
   private final ym<vz, lx> b = ym.a(this);

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
   public ym<vz, lx> d() {
      return this.b;
   }
}
