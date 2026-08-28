import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record yr(hn c, Optional<xi> d) implements xj {
   public static final MapCodec<yr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hn.a.fieldOf("selector").forGetter(yr::b), xk.a.optionalFieldOf("separator").forGetter(yr::c)).apply($$0, yr::new)
   );
   public static final xj.a<yr> b = new xj.a<>(a, "selector");

   @Override
   public xj.a<?> a() {
      return b;
   }

   @Override
   public xw a(@Nullable ew $$0, @Nullable bue $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xi.i();
      } else {
         Optional<? extends xi> $$3 = xl.a($$0, this.d, $$1, $$2);
         return xl.a(this.c.b().b($$0), $$3, bue::S_);
      }
   }

   @Override
   public <T> Optional<T> a(xn.b<T> $$0, yf $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xn.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hn b() {
      return this.c;
   }

   public Optional<xi> c() {
      return this.d;
   }
}
