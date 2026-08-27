import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gbr(gbs d) {
   public static final gbr a = new gbr(gbs.b);
   public static final Codec<gbr> b = RecordCodecBuilder.create($$0 -> $$0.group(asg.a(gbs.a, "scaling", gbs.b).forGetter(gbr::a)).apply($$0, gbr::new));
   public static final anu<gbr> c = anu.a("gui", b);

   public gbs a() {
      return this.d;
   }
}
