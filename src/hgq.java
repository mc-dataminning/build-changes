import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgq() implements hgn {
   public static final MapCodec<hgq> a = MapCodec.unit(new hgq());

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return $$4 == czi.g && fyn.t();
   }

   @Override
   public MapCodec<hgq> a() {
      return a;
   }
}
