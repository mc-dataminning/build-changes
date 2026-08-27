import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fzs(String b, String c, boolean d) {
   public static final Codec<fzs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.u.fieldOf("region").forGetter(fzs::b),
               aqy.u.fieldOf("name").forGetter(fzs::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(fzs::d)
            )
            .apply($$0, fzs::new)
   );

   public tf a() {
      return tf.b(this.c + " (" + this.b + ")");
   }
}
