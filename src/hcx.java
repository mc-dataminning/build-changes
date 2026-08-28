import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcx() implements hdb<cwn> {
   public static final hdb.a<hcx, cwn> a = hdb.a.a(MapCodec.unit(new hcx()), cwn.j);

   public cwn a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwn $$4) {
      return $$4;
   }

   @Override
   public hdb.a<hcx, cwn> a() {
      return a;
   }
}
