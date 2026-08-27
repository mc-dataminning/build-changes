import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gmz(gna d) {
   public static final gmz a = new gmz(gna.b);
   public static final Codec<gmz> b = RecordCodecBuilder.create($$0 -> $$0.group(aws.a(gna.a, "scaling", gna.b).forGetter(gmz::a)).apply($$0, gmz::new));
   public static final asc<gmz> c = asc.a("gui", b);

   public gna a() {
      return this.d;
   }
}
