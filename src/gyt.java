import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gyt(gyu d) {
   public static final gyt a = new gyt(gyu.b);
   public static final Codec<gyt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gyu.a.optionalFieldOf("scaling", gyu.b).forGetter(gyt::a)).apply($$0, gyt::new)
   );
   public static final att<gyt> c = att.a("gui", b);

   public gyu a() {
      return this.d;
   }
}
