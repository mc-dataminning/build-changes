import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hdd(int b) implements hdj<String> {
   public static final hdj.a<hdd, String> a = hdj.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(hdd::b)).apply($$0, hdd::new)), Codec.STRING
   );

   @Nullable
   public String a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      cza $$5 = $$0.a(kv.p);
      return $$5 != null ? $$5.c(this.b) : null;
   }

   @Override
   public hdj.a<hdd, String> a() {
      return a;
   }
}
