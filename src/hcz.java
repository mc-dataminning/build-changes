import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcz() implements hdb<bva> {
   public static final hdb.a<hcz, bva> a = hdb.a.a(MapCodec.unit(new hcz()), bva.c);

   @Nullable
   public bva a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwn $$4) {
      return $$2 == null ? null : $$2.fy();
   }

   @Override
   public hdb.a<hcz, bva> a() {
      return a;
   }
}
