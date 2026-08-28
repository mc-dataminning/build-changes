import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hio() implements hif {
   public static final MapCodec<hio> a = MapCodec.unit(new hio());

   @Override
   public boolean get(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return $$2 == null ? false : $$2.fz() && $$2.fB() == $$0;
   }

   @Override
   public MapCodec<hio> a() {
      return a;
   }
}
