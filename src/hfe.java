import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfe(String b) implements hfi<String> {
   public static final hfi.a<hfe, String> a = hfi.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hfe::b)).apply($$0, hfe::new)), Codec.STRING
   );

   @Nullable
   public String a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      czx $$5 = $$0.a(kx.ao);
      return $$5 == null ? null : $$5.b().get(this.b);
   }

   @Override
   public hfi.a<hfe, String> a() {
      return a;
   }
}
