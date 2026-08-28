import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqz(gra d) {
   public static final gqz a = new gqz(gra.b);
   public static final Codec<gqz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gra.a.optionalFieldOf("scaling", gra.b).forGetter(gqz::a)).apply($$0, gqz::new)
   );
   public static final asu<gqz> c = asu.a("gui", b);

   public gra a() {
      return this.d;
   }
}
