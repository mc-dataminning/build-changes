import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfw() implements hfs {
   public static final MapCodec<hfw> a = MapCodec.unit(new hfw());

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      if ($$2 instanceof cqy $$5 && $$5.cj != null) {
         bwv $$6 = gwg.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hfw> a() {
      return a;
   }
}
