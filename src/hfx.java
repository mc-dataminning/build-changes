import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfx() implements hga {
   public static final MapCodec<hfx> a = MapCodec.unit(new hfx());

   @Override
   public boolean get(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return cxs.g($$0);
   }

   @Override
   public MapCodec<hfx> a() {
      return a;
   }
}
