import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfo() implements hfs {
   public static final MapCodec<hfo> a = MapCodec.unit(new hfo());

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hfo> a() {
      return a;
   }
}
