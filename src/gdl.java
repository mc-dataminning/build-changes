import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gdl(gdm d) {
   public static final gdl a = new gdl(gdm.b);
   public static final Codec<gdl> b = RecordCodecBuilder.create($$0 -> $$0.group(asu.a(gdm.a, "scaling", gdm.b).forGetter(gdl::a)).apply($$0, gdl::new));
   public static final aoi<gdl> c = aoi.a("gui", b);

   public gdm a() {
      return this.d;
   }
}
