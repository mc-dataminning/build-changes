import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqq(gqr d) {
   public static final gqq a = new gqq(gqr.b);
   public static final Codec<gqq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gqr.a.optionalFieldOf("scaling", gqr.b).forGetter(gqq::a)).apply($$0, gqq::new)
   );
   public static final atp<gqq> c = atp.a("gui", b);

   public gqr a() {
      return this.d;
   }
}
