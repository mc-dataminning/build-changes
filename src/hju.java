import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hju implements hke<dxs> {
   private final gui a;
   private final cyw b;

   public hju(cyw $$0, gui $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dxs a(czy $$0) {
      return $$0.a(kk.am);
   }

   public void a(@Nullable dxs $$0, czw $$1, flo $$2, gsa $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dxs.a));
   }

   public static record a(cyw b) implements hke.a {
      public static final MapCodec<hju.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyw.q.fieldOf("color").forGetter(hju.a::b)).apply($$0, hju.a::new));

      @Override
      public MapCodec<hju.a> a() {
         return a;
      }

      @Override
      public hke<?> a(gla $$0) {
         return new hju(this.b, new gui($$0));
      }
   }
}
