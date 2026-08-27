import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gij(gik d) {
   public static final gij a = new gij(gik.b);
   public static final Codec<gij> b = RecordCodecBuilder.create($$0 -> $$0.group(avp.a(gik.a, "scaling", gik.b).forGetter(gij::a)).apply($$0, gij::new));
   public static final arb<gij> c = arb.a("gui", b);

   public gik a() {
      return this.d;
   }
}
