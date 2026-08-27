import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fzn(String b, String c, boolean d) {
   public static final Codec<fzn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqw.u.fieldOf("region").forGetter(fzn::b),
               aqw.u.fieldOf("name").forGetter(fzn::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(fzn::d)
            )
            .apply($$0, fzn::new)
   );

   public te a() {
      return te.b(this.c + " (" + this.b + ")");
   }
}
