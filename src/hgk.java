import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgk() implements hgn {
   public static final MapCodec<hgk> a = MapCodec.unit(new hgk());

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return cxz.g($$0);
   }

   @Override
   public MapCodec<hgk> a() {
      return a;
   }
}
