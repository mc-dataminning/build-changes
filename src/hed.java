import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hed(String b) implements heh<String> {
   public static final heh.a<hed, String> a = heh.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hed::b)).apply($$0, hed::new)), Codec.STRING
   );

   @Nullable
   public String a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      czh $$5 = $$0.a(kv.ao);
      return $$5 == null ? null : $$5.b().get(this.b);
   }

   @Override
   public heh.a<hed, String> a() {
      return a;
   }
}
