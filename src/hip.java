import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hip() implements hif {
   public static final MapCodec<hip> a = MapCodec.unit(new hip());

   @Override
   public boolean get(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      frf $$5 = frf.Q();
      bwv $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hip> a() {
      return a;
   }
}
