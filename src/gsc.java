import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gsc(gsd d) {
   public static final gsc a = new gsc(gsd.b);
   public static final Codec<gsc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gsd.a.optionalFieldOf("scaling", gsd.b).forGetter(gsc::a)).apply($$0, gsc::new)
   );
   public static final ate<gsc> c = ate.a("gui", b);

   public gsd a() {
      return this.d;
   }
}
