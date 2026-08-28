import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhr(ku.a<?> b) implements hht {
   public static final MapCodec<hhr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ku.a("predicate").forGetter(hhr::b)).apply($$0, hhr::new));

   @Override
   public boolean get(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      return this.b.b().a($$0);
   }

   @Override
   public MapCodec<hhr> a() {
      return a;
   }
}
