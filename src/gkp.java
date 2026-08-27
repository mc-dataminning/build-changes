import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gkp(gkq d) {
   public static final gkp a = new gkp(gkq.b);
   public static final Codec<gkp> b = RecordCodecBuilder.create($$0 -> $$0.group(awe.a(gkq.a, "scaling", gkq.b).forGetter(gkp::a)).apply($$0, gkp::new));
   public static final aro<gkp> c = aro.a("gui", b);

   public gkq a() {
      return this.d;
   }
}
