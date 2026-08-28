import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgq() implements hgt {
   public static final MapCodec<hgq> a = MapCodec.unit(new hgq());

   @Override
   public boolean get(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      return cyc.g($$0);
   }

   @Override
   public MapCodec<hgq> a() {
      return a;
   }
}
