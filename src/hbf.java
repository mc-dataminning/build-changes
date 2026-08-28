import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hbf(hbi.b b) {
   public static final Codec<hbf> a = RecordCodecBuilder.create($$0 -> $$0.group(hbk.a.fieldOf("model").forGetter(hbf::a)).apply($$0, hbf::new));

   public hbi.b a() {
      return this.b;
   }
}
