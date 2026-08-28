import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hbv(int b) implements hbu {
   public static final MapCodec<hbv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(hbv::b)).apply($$0, hbv::new));

   @Override
   public boolean a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      cyz $$4 = $$0.a(kv.p);
      return $$4 != null ? $$4.b(this.b) == Boolean.TRUE : false;
   }

   @Override
   public MapCodec<hbv> a() {
      return a;
   }
}
