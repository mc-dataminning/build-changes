import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hbx(int b) implements hbw {
   public static final MapCodec<hbx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(hbx::b)).apply($$0, hbx::new));

   @Override
   public boolean a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      cyy $$5 = $$0.a(kv.p);
      return $$5 != null ? $$5.b(this.b) == Boolean.TRUE : false;
   }

   @Override
   public MapCodec<hbx> a() {
      return a;
   }
}
