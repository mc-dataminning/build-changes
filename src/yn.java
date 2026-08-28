import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record yn(hl c, Optional<xe> d) implements xf {
   public static final MapCodec<yn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hl.a.fieldOf("selector").forGetter(yn::b), xg.a.optionalFieldOf("separator").forGetter(yn::c)).apply($$0, yn::new)
   );
   public static final xf.a<yn> b = new xf.a<>(a, "selector");

   @Override
   public xf.a<?> a() {
      return b;
   }

   @Override
   public xs a(@Nullable eu $$0, @Nullable btr $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xe.i();
      } else {
         Optional<? extends xe> $$3 = xh.a($$0, this.d, $$1, $$2);
         return xh.a(this.c.b().b($$0), $$3, btr::R_);
      }
   }

   @Override
   public <T> Optional<T> a(xj.b<T> $$0, yb $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xj.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hl b() {
      return this.c;
   }

   public Optional<xe> c() {
      return this.d;
   }
}
