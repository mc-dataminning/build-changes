import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqr(gqs d) {
   public static final gqr a = new gqr(gqs.b);
   public static final Codec<gqr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gqs.a.optionalFieldOf("scaling", gqs.b).forGetter(gqr::a)).apply($$0, gqr::new)
   );
   public static final atp<gqr> c = atp.a("gui", b);

   public gqs a() {
      return this.d;
   }
}
