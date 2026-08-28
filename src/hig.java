import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hig(int b) implements hif {
   public static final MapCodec<hig> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.l.optionalFieldOf("index", 0).forGetter(hig::b)).apply($$0, hig::new));

   @Override
   public boolean get(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      dcj $$5 = $$0.a(kl.p);
      return $$5 != null ? $$5.b(this.b) == Boolean.TRUE : false;
   }

   @Override
   public MapCodec<hig> a() {
      return a;
   }
}
