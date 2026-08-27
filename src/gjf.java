import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gjf(String b, String c, boolean d) {
   public static final Codec<gjf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avu.w.fieldOf("region").forGetter(gjf::b),
               avu.w.fieldOf("name").forGetter(gjf::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gjf::d)
            )
            .apply($$0, gjf::new)
   );

   public vs a() {
      return vs.b(this.c + " (" + this.b + ")");
   }
}
