import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ze(hn c, Optional<xv> d) implements xw {
   public static final MapCodec<ze> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hn.a.fieldOf("selector").forGetter(ze::b), xx.a.optionalFieldOf("separator").forGetter(ze::c)).apply($$0, ze::new)
   );
   public static final xw.a<ze> b = new xw.a<>(a, "selector");

   @Override
   public xw.a<?> a() {
      return b;
   }

   @Override
   public yj a(@Nullable ew $$0, @Nullable bvk $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xv.i();
      } else {
         Optional<? extends xv> $$3 = xy.a($$0, this.d, $$1, $$2);
         return xy.a(this.c.b().b($$0), $$3, bvk::p_);
      }
   }

   @Override
   public <T> Optional<T> a(ya.b<T> $$0, ys $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(ya.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hn b() {
      return this.c;
   }

   public Optional<xv> c() {
      return this.d;
   }
}
