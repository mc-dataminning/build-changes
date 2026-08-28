import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hij() implements hif {
   public static final MapCodec<hij> a = MapCodec.unit(new hij());

   @Override
   public boolean get(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      if ($$2 instanceof crz $$5 && $$5.ck != null) {
         bxn $$6 = gyr.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hij> a() {
      return a;
   }
}
