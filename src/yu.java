import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record yu(hn c, Optional<xl> d) implements xm {
   public static final MapCodec<yu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hn.a.fieldOf("selector").forGetter(yu::b), xn.a.optionalFieldOf("separator").forGetter(yu::c)).apply($$0, yu::new)
   );
   public static final xm.a<yu> b = new xm.a<>(a, "selector");

   @Override
   public xm.a<?> a() {
      return b;
   }

   @Override
   public xz a(@Nullable ew $$0, @Nullable bui $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xl.i();
      } else {
         Optional<? extends xl> $$3 = xo.a($$0, this.d, $$1, $$2);
         return xo.a(this.c.b().b($$0), $$3, bui::S_);
      }
   }

   @Override
   public <T> Optional<T> a(xq.b<T> $$0, yi $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xq.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hn b() {
      return this.c;
   }

   public Optional<xl> c() {
      return this.d;
   }
}
