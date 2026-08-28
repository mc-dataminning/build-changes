import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcc() implements hbt {
   public static final MapCodec<hcc> a = MapCodec.unit(new hcc());

   @Override
   public boolean a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      return $$2 == null ? false : $$2.fz() && $$2.fB() == $$0;
   }

   @Override
   public MapCodec<hcc> a() {
      return a;
   }
}
