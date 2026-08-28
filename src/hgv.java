import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgv() implements hgt {
   public static final MapCodec<hgv> a = MapCodec.unit(new hgv());

   @Override
   public boolean get(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hgv> a() {
      return a;
   }
}
