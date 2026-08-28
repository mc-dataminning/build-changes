import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdb() implements hdi<aku<bus<?>>> {
   public static final hdi.a<hdb, aku<bus<?>>> a = hdi.a.a(MapCodec.unit(new hdb()), aku.a(mc.z));

   @Nullable
   public aku<bus<?>> a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      return $$2 == null ? null : $$2.aq().r().h();
   }

   @Override
   public hdi.a<hdb, aku<bus<?>>> a() {
      return a;
   }
}
