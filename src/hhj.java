import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhj() implements hhq {
   public static final MapCodec<hhj> a = MapCodec.unit(new hhj());

   @Override
   public float a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3) {
      return $$2 instanceof crm $$4 ? $$4.gE().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hhj> a() {
      return a;
   }
}
