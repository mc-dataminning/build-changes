import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhw(String c) implements hia<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hia.a<hhw, String> b = hia.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hhw::c)).apply($$0, hhw::new)), a
   );

   @Nullable
   public String a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      dbk $$5 = $$0.a(kk.aq);
      return $$5 == null ? null : $$5.b().get(this.c);
   }

   @Override
   public hia.a<hhw, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}
