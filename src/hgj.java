import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgj() implements hga {
   public static final MapCodec<hgj> a = MapCodec.unit(new hgj());

   @Override
   public boolean get(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return $$2 == null ? false : $$2.fz() && $$2.fB() == $$0;
   }

   @Override
   public MapCodec<hgj> a() {
      return a;
   }
}
