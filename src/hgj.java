import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgj() implements hgn {
   public static final MapCodec<hgj> a = MapCodec.unit(new hgj());

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hgj> a() {
      return a;
   }
}
