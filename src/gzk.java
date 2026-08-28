import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gzk(gzl d) {
   public static final gzk a = new gzk(gzl.b);
   public static final Codec<gzk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gzl.a.optionalFieldOf("scaling", gzl.b).forGetter(gzk::a)).apply($$0, gzk::new)
   );
   public static final atz<gzk> c = atz.a("gui", b);

   public gzl a() {
      return this.d;
   }
}
