import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfs() implements hfz {
   public static final MapCodec<hfs> a = MapCodec.unit(new hfs());

   @Override
   public float a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3) {
      return $$2 instanceof cqs $$4 ? $$4.gE().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hfs> a() {
      return a;
   }
}
