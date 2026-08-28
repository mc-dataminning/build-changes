import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqe(String b, String c, boolean d) {
   public static final Codec<gqe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayf.y.fieldOf("region").forGetter(gqe::b),
               ayf.y.fieldOf("name").forGetter(gqe::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gqe::d)
            )
            .apply($$0, gqe::new)
   );

   public xo a() {
      return xo.b(this.c + " (" + this.b + ")");
   }
}
