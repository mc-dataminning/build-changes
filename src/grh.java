import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record grh(gri d) {
   public static final grh a = new grh(gri.b);
   public static final Codec<grh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gri.a.optionalFieldOf("scaling", gri.b).forGetter(grh::a)).apply($$0, grh::new)
   );
   public static final asw<grh> c = asw.a("gui", b);

   public gri a() {
      return this.d;
   }
}
