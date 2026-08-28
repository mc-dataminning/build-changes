import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbq() implements hbt {
   public static final MapCodec<hbq> a = MapCodec.unit(new hbq());

   @Override
   public boolean a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hbq> a() {
      return a;
   }
}
