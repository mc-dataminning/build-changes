import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gks(gkt d) {
   public static final gks a = new gks(gkt.b);
   public static final Codec<gks> b = RecordCodecBuilder.create($$0 -> $$0.group(awe.a(gkt.a, "scaling", gkt.b).forGetter(gks::a)).apply($$0, gks::new));
   public static final aro<gks> c = aro.a("gui", b);

   public gkt a() {
      return this.d;
   }
}
