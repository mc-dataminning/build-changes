import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgk() implements hga {
   public static final MapCodec<hgk> a = MapCodec.unit(new hgk());

   @Override
   public boolean get(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      foz $$5 = foz.Q();
      bwf $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hgk> a() {
      return a;
   }
}
