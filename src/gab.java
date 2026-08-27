import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gab(String b, String c, boolean d) {
   public static final Codec<gab> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.u.fieldOf("region").forGetter(gab::b),
               aqy.u.fieldOf("name").forGetter(gab::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gab::d)
            )
            .apply($$0, gab::new)
   );

   public tf a() {
      return tf.b(this.c + " (" + this.b + ")");
   }
}
