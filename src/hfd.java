import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfd(int b) implements hfc {
   public static final MapCodec<hfd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.l.optionalFieldOf("index", 0).forGetter(hfd::b)).apply($$0, hfd::new));

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      dbb $$5 = $$0.a(kj.p);
      return $$5 != null ? $$5.b(this.b) == Boolean.TRUE : false;
   }

   @Override
   public MapCodec<hfd> a() {
      return a;
   }
}
