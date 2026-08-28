import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhg() implements hhf<alf<dhl>> {
   public static final Codec<alf<dhl>> a = alf.a(mg.bj);
   public static final hhf.a<hhg, alf<dhl>> b = hhf.a.a(MapCodec.unit(new hhg()), a);

   @Nullable
   public alf<dhl> a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      dhj $$5 = $$0.a(kj.W);
      return $$5 == null ? null : $$5.a().e().orElse(null);
   }

   @Override
   public hhf.a<hhg, alf<dhl>> a() {
      return b;
   }

   @Override
   public Codec<alf<dhl>> b() {
      return a;
   }
}
