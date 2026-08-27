import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gcy(gcz d) {
   public static final gcy a = new gcy(gcz.b);
   public static final Codec<gcy> b = RecordCodecBuilder.create($$0 -> $$0.group(asq.a(gcz.a, "scaling", gcz.b).forGetter(gcy::a)).apply($$0, gcy::new));
   public static final aoe<gcy> c = aoe.a("gui", b);

   public gcz a() {
      return this.d;
   }
}
