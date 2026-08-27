import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gac(gad d) {
   public static final gac a = new gac(gad.b);
   public static final Codec<gac> b = RecordCodecBuilder.create($$0 -> $$0.group(aqy.a(gad.a, "scaling", gad.b).forGetter(gac::a)).apply($$0, gac::new));
   public static final amn<gac> c = amn.a("gui", b);

   public gad a() {
      return this.d;
   }
}
