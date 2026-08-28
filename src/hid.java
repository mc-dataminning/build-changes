import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hid(ku.a<?> b) implements hif {
   public static final MapCodec<hid> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ku.a("predicate").forGetter(hid::b)).apply($$0, hid::new));

   @Override
   public boolean get(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return this.b.b().a($$0);
   }

   @Override
   public MapCodec<hid> a() {
      return a;
   }
}
