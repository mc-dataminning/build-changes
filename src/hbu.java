import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hbu(int b) implements hbt {
   public static final MapCodec<hbu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayh.l.optionalFieldOf("index", 0).forGetter(hbu::b)).apply($$0, hbu::new));

   @Override
   public boolean a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      cyx $$5 = $$0.a(kv.p);
      return $$5 != null ? $$5.b(this.b) == Boolean.TRUE : false;
   }

   @Override
   public MapCodec<hbu> a() {
      return a;
   }
}
