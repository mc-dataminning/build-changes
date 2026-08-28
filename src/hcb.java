import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcb() implements hbt {
   public static final MapCodec<hcb> a = MapCodec.unit(new hcb());

   @Override
   public boolean a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      if ($$2 instanceof gkt $$5 && $$5.gi().f() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hcb> a() {
      return a;
   }
}
