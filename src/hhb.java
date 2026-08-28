import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhb(String c) implements hhf<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hhf.a<hhb, String> b = hhf.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hhb::c)).apply($$0, hhb::new)), a
   );

   @Nullable
   public String a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      day $$5 = $$0.a(kj.aq);
      return $$5 == null ? null : $$5.b().get(this.c);
   }

   @Override
   public hhf.a<hhb, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}
