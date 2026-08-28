import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hca() implements hbw {
   public static final MapCodec<hca> a = MapCodec.unit(new hca());

   @Override
   public boolean a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      if ($$2 instanceof cow $$5 && $$5.cw != null) {
         bva $$6 = gsk.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hca> a() {
      return a;
   }
}
