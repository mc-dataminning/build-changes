import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgc() implements hga {
   public static final MapCodec<hgc> a = MapCodec.unit(new hgc());

   @Override
   public boolean get(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hgc> a() {
      return a;
   }
}
