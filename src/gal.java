import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gal(gam d) {
   public static final gal a = new gal(gam.b);
   public static final Codec<gal> b = RecordCodecBuilder.create($$0 -> $$0.group(aqy.a(gam.a, "scaling", gam.b).forGetter(gal::a)).apply($$0, gal::new));
   public static final amn<gal> c = amn.a("gui", b);

   public gam a() {
      return this.d;
   }
}
