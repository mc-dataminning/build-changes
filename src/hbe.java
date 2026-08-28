import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hbe(hbh.b b) {
   public static final Codec<hbe> a = RecordCodecBuilder.create($$0 -> $$0.group(hbj.a.fieldOf("model").forGetter(hbe::a)).apply($$0, hbe::new));

   public hbh.b a() {
      return this.b;
   }
}
