import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record yj(hb c, Optional<xa> d) implements xb {
   public static final MapCodec<yj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hb.a.fieldOf("selector").forGetter(yj::b), xc.a.optionalFieldOf("separator").forGetter(yj::c)).apply($$0, yj::new)
   );
   public static final xb.a<yj> b = new xb.a<>(a, "selector");

   @Override
   public xb.a<?> a() {
      return b;
   }

   @Override
   public xo a(@Nullable ej $$0, @Nullable bwt $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xa.i();
      } else {
         Optional<? extends xa> $$3 = xd.a($$0, this.d, $$1, $$2);
         return xd.a(this.c.b().b($$0), $$3, bwt::m_);
      }
   }

   @Override
   public <T> Optional<T> a(xf.b<T> $$0, xx $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xf.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hb b() {
      return this.c;
   }

   public Optional<xa> c() {
      return this.d;
   }
}
