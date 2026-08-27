import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gir(gis d) {
   public static final gir a = new gir(gis.b);
   public static final Codec<gir> b = RecordCodecBuilder.create($$0 -> $$0.group(avq.a(gis.a, "scaling", gis.b).forGetter(gir::a)).apply($$0, gir::new));
   public static final arc<gir> c = arc.a("gui", b);

   public gis a() {
      return this.d;
   }
}
