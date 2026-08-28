import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgu(int b) implements hgt {
   public static final MapCodec<hgu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(hgu::b)).apply($$0, hgu::new));

   @Override
   public boolean get(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      dbw $$5 = $$0.a(kk.p);
      return $$5 != null ? $$5.b(this.b) == Boolean.TRUE : false;
   }

   @Override
   public MapCodec<hgu> a() {
      return a;
   }
}
