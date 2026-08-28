import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgx() implements hgn {
   public static final MapCodec<hgx> a = MapCodec.unit(new hgx());

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      fpo $$5 = fpo.Q();
      bwi $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hgx> a() {
      return a;
   }
}
