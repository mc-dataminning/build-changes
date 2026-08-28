import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgp() implements hgn {
   public static final MapCodec<hgp> a = MapCodec.unit(new hgp());

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hgp> a() {
      return a;
   }
}
