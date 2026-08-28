import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgd() implements hga {
   public static final MapCodec<hgd> a = MapCodec.unit(new hgd());

   @Override
   public boolean get(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return $$4 == czb.g && fyb.t();
   }

   @Override
   public MapCodec<hgd> a() {
      return a;
   }
}
