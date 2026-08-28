import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record grm(String b, String c, boolean d) {
   public static final Codec<grm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axv.y.fieldOf("region").forGetter(grm::b),
               axv.y.fieldOf("name").forGetter(grm::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(grm::d)
            )
            .apply($$0, grm::new)
   );

   public wy a() {
      return wy.b(this.c + " (" + this.b + ")");
   }
}
