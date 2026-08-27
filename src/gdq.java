import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gdq(gdr d) {
   public static final gdq a = new gdq(gdr.b);
   public static final Codec<gdq> b = RecordCodecBuilder.create($$0 -> $$0.group(asy.a(gdr.a, "scaling", gdr.b).forGetter(gdq::a)).apply($$0, gdq::new));
   public static final aom<gdq> c = aom.a("gui", b);

   public gdr a() {
      return this.d;
   }
}
