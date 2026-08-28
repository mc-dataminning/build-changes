import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hgt implements hhd<dwd> {
   private final grk a;
   private final cxq b;

   public hgt(cxq $$0, grk $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dwd a(cys $$0) {
      return $$0.a(kj.am);
   }

   public void a(@Nullable dwd $$0, cyq $$1, fiq $$2, gpd $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dwd.a));
   }

   public static record a(cxq b) implements hhd.a {
      public static final MapCodec<hgt.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxq.q.fieldOf("color").forGetter(hgt.a::b)).apply($$0, hgt.a::new));

      @Override
      public MapCodec<hgt.a> a() {
         return a;
      }

      @Override
      public hhd<?> a(gic $$0) {
         return new hgt(this.b, new grk($$0));
      }
   }
}
