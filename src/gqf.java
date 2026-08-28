import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqf(String b, String c, boolean d) {
   public static final Codec<gqf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayg.y.fieldOf("region").forGetter(gqf::b),
               ayg.y.fieldOf("name").forGetter(gqf::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gqf::d)
            )
            .apply($$0, gqf::new)
   );

   public xo a() {
      return xo.b(this.c + " (" + this.b + ")");
   }
}
