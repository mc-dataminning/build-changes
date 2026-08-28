import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfc(int b) implements hfi<String> {
   public static final hfi.a<hfc, String> a = hfi.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.l.optionalFieldOf("index", 0).forGetter(hfc::b)).apply($$0, hfc::new)), Codec.STRING
   );

   @Nullable
   public String a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      daf $$5 = $$0.a(kx.p);
      return $$5 != null ? $$5.c(this.b) : null;
   }

   @Override
   public hfi.a<hfc, String> a() {
      return a;
   }
}
