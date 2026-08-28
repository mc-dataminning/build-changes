import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhj(String c) implements hhn<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hhn.a<hhj, String> b = hhn.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hhj::c)).apply($$0, hhj::new)), a
   );

   @Nullable
   public String a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      dbd $$5 = $$0.a(kj.aq);
      return $$5 == null ? null : $$5.b().get(this.c);
   }

   @Override
   public hhn.a<hhj, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}
