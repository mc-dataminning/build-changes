import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hdb(int b) implements hdh<String> {
   public static final hdh.a<hdb, String> a = hdh.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(hdb::b)).apply($$0, hdb::new)), Codec.STRING
   );

   @Nullable
   public String a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      cyy $$5 = $$0.a(kv.p);
      return $$5 != null ? $$5.c(this.b) : null;
   }

   @Override
   public hdh.a<hdb, String> a() {
      return a;
   }
}
