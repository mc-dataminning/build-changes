import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgl(String c) implements hgp<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hgp.a<hgl, String> b = hgp.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hgl::c)).apply($$0, hgl::new)), a
   );

   @Nullable
   public String a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      das $$5 = $$0.a(kj.aq);
      return $$5 == null ? null : $$5.b().get(this.c);
   }

   @Override
   public hgp.a<hgl, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}
