import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgw() implements hgn {
   public static final MapCodec<hgw> a = MapCodec.unit(new hgw());

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return $$2 == null ? false : $$2.fy() && $$2.fA() == $$0;
   }

   @Override
   public MapCodec<hgw> a() {
      return a;
   }
}
