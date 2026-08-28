import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgi() implements hgp {
   public static final MapCodec<hgi> a = MapCodec.unit(new hgi());

   @Override
   public float a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3) {
      return $$2 instanceof cqy $$4 ? $$4.gE().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hgi> a() {
      return a;
   }
}
