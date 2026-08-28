import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ys(hn c, Optional<xj> d) implements xk {
   public static final MapCodec<ys> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hn.a.fieldOf("selector").forGetter(ys::b), xl.a.optionalFieldOf("separator").forGetter(ys::c)).apply($$0, ys::new)
   );
   public static final xk.a<ys> b = new xk.a<>(a, "selector");

   @Override
   public xk.a<?> a() {
      return b;
   }

   @Override
   public xx a(@Nullable ew $$0, @Nullable bul $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xj.i();
      } else {
         Optional<? extends xj> $$3 = xm.a($$0, this.d, $$1, $$2);
         return xm.a(this.c.b().b($$0), $$3, bul::o_);
      }
   }

   @Override
   public <T> Optional<T> a(xo.b<T> $$0, yg $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xo.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hn b() {
      return this.c;
   }

   public Optional<xj> c() {
      return this.d;
   }
}
