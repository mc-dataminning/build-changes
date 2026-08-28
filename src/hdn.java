import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdn implements hdx<dtr> {
   private final gog a;
   private final cvn b;

   public hdn(cvn $$0, gog $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dtr a(cwq $$0) {
      return $$0.a(kv.ai);
   }

   public void a(@Nullable dtr $$0, cwo $$1, ffv $$2, glz $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dtr.a));
   }

   public static record a(cvn b) implements hdx.a {
      public static final MapCodec<hdn.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvn.q.fieldOf("color").forGetter(hdn.a::b)).apply($$0, hdn.a::new));

      @Override
      public MapCodec<hdn.a> a() {
         return a;
      }

      @Override
      public hdx<?> a(gfa $$0) {
         return new hdn(this.b, new gog($$0));
      }
   }
}
