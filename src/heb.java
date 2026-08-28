import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record heb(int b) implements heh<String> {
   public static final heh.a<heb, String> a = heh.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(heb::b)).apply($$0, heb::new)), Codec.STRING
   );

   @Nullable
   public String a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      czp $$5 = $$0.a(kv.p);
      return $$5 != null ? $$5.c(this.b) : null;
   }

   @Override
   public heh.a<heb, String> a() {
      return a;
   }
}
