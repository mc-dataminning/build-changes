import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gsf(String b, String c, boolean d) {
   public static final Codec<gsf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.x.fieldOf("region").forGetter(gsf::b),
               axu.x.fieldOf("name").forGetter(gsf::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gsf::d)
            )
            .apply($$0, gsf::new)
   );

   public xe a() {
      return xe.b(this.c + " (" + this.b + ")");
   }
}
