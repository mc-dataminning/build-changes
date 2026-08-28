import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgo(int b) implements hgn {
   public static final MapCodec<hgo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(hgo::b)).apply($$0, hgo::new));

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      dbt $$5 = $$0.a(kk.p);
      return $$5 != null ? $$5.b(this.b) == Boolean.TRUE : false;
   }

   @Override
   public MapCodec<hgo> a() {
      return a;
   }
}
