import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record yh(hb c, Optional<wy> d) implements wz {
   public static final MapCodec<yh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hb.a.fieldOf("selector").forGetter(yh::b), xa.a.optionalFieldOf("separator").forGetter(yh::c)).apply($$0, yh::new)
   );
   public static final wz.a<yh> b = new wz.a<>(a, "selector");

   @Override
   public wz.a<?> a() {
      return b;
   }

   @Override
   public xm a(@Nullable ej $$0, @Nullable bwi $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wy.i();
      } else {
         Optional<? extends wy> $$3 = xb.a($$0, this.d, $$1, $$2);
         return xb.a(this.c.b().b($$0), $$3, bwi::m_);
      }
   }

   @Override
   public <T> Optional<T> a(xd.b<T> $$0, xv $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xd.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hb b() {
      return this.c;
   }

   public Optional<wy> c() {
      return this.d;
   }
}
