import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gfw(gfx d) {
   public static final gfw a = new gfw(gfx.b);
   public static final Codec<gfw> b = RecordCodecBuilder.create($$0 -> $$0.group(atq.a(gfx.a, "scaling", gfx.b).forGetter(gfw::a)).apply($$0, gfw::new));
   public static final apd<gfw> c = apd.a("gui", b);

   public gfx a() {
      return this.d;
   }
}
