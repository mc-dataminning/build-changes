import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gsa(gsb d) {
   public static final gsa a = new gsa(gsb.b);
   public static final Codec<gsa> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gsb.a.optionalFieldOf("scaling", gsb.b).forGetter(gsa::a)).apply($$0, gsa::new)
   );
   public static final ate<gsa> c = ate.a("gui", b);

   public gsb a() {
      return this.d;
   }
}
