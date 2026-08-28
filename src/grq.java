import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record grq(String b, String c, boolean d) {
   public static final Codec<grq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.y.fieldOf("region").forGetter(grq::b),
               axw.y.fieldOf("name").forGetter(grq::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(grq::d)
            )
            .apply($$0, grq::new)
   );

   public wz a() {
      return wz.b(this.c + " (" + this.b + ")");
   }
}
