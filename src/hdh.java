import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdh() implements hdj<bvc> {
   public static final hdj.a<hdh, bvc> a = hdj.a.a(MapCodec.unit(new hdh()), bvc.c);

   @Nullable
   public bvc a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      return $$2 == null ? null : $$2.fy();
   }

   @Override
   public hdj.a<hdh, bvc> a() {
      return a;
   }
}
