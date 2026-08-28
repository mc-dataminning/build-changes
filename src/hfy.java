import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfy() implements hfs {
   public static final MapCodec<hfy> a = MapCodec.unit(new hfy());

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      if ($$2 instanceof gop $$5 && $$5.bQ.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hfy> a() {
      return a;
   }
}
