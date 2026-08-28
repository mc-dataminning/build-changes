import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record yp(hc c, Optional<xg> d) implements xh {
   public static final MapCodec<yp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hc.a.fieldOf("selector").forGetter(yp::b), xi.a.optionalFieldOf("separator").forGetter(yp::c)).apply($$0, yp::new)
   );
   public static final xh.a<yp> b = new xh.a<>(a, "selector");

   @Override
   public xh.a<?> a() {
      return b;
   }

   @Override
   public xu a(@Nullable ek $$0, @Nullable bxe $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xg.i();
      } else {
         Optional<? extends xg> $$3 = xj.a($$0, this.d, $$1, $$2);
         return xj.a(this.c.b().b($$0), $$3, bxe::P_);
      }
   }

   @Override
   public <T> Optional<T> a(xl.b<T> $$0, yd $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xl.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hc b() {
      return this.c;
   }

   public Optional<xg> c() {
      return this.d;
   }
}
