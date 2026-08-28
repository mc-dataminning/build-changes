import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hic() implements hif {
   public static final MapCodec<hic> a = MapCodec.unit(new hic());

   @Override
   public boolean get(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return cyp.g($$0);
   }

   @Override
   public MapCodec<hic> a() {
      return a;
   }
}
