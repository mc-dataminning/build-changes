import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gik(gil d) {
   public static final gik a = new gik(gil.b);
   public static final Codec<gik> b = RecordCodecBuilder.create($$0 -> $$0.group(avp.a(gil.a, "scaling", gil.b).forGetter(gik::a)).apply($$0, gik::new));
   public static final arb<gik> c = arb.a("gui", b);

   public gil a() {
      return this.d;
   }
}
