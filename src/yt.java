import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record yt(hn c, Optional<xk> d) implements xl {
   public static final MapCodec<yt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hn.a.fieldOf("selector").forGetter(yt::b), xm.a.optionalFieldOf("separator").forGetter(yt::c)).apply($$0, yt::new)
   );
   public static final xl.a<yt> b = new xl.a<>(a, "selector");

   @Override
   public xl.a<?> a() {
      return b;
   }

   @Override
   public xy a(@Nullable ew $$0, @Nullable bvb $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xk.i();
      } else {
         Optional<? extends xk> $$3 = xn.a($$0, this.d, $$1, $$2);
         return xn.a(this.c.b().b($$0), $$3, bvb::p_);
      }
   }

   @Override
   public <T> Optional<T> a(xp.b<T> $$0, yh $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xp.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hn b() {
      return this.c;
   }

   public Optional<xk> c() {
      return this.d;
   }
}
