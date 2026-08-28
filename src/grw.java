import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record grw(grx d) {
   public static final grw a = new grw(grx.b);
   public static final Codec<grw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(grx.a.optionalFieldOf("scaling", grx.b).forGetter(grw::a)).apply($$0, grw::new)
   );
   public static final atd<grw> c = atd.a("gui", b);

   public grx a() {
      return this.d;
   }
}
