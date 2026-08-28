import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhu(int b) implements hht {
   public static final MapCodec<hhu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.l.optionalFieldOf("index", 0).forGetter(hhu::b)).apply($$0, hhu::new));

   @Override
   public boolean get(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      dct $$5 = $$0.a(kl.p);
      return $$5 != null ? $$5.b(this.b) == Boolean.TRUE : false;
   }

   @Override
   public MapCodec<hhu> a() {
      return a;
   }
}
