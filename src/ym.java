import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ym(hk c, Optional<xd> d) implements xe {
   public static final MapCodec<ym> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hk.a.fieldOf("selector").forGetter(ym::b), xf.a.optionalFieldOf("separator").forGetter(ym::c)).apply($$0, ym::new)
   );
   public static final xe.a<ym> b = new xe.a<>(a, "selector");

   @Override
   public xe.a<?> a() {
      return b;
   }

   @Override
   public xr a(@Nullable et $$0, @Nullable btj $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xd.i();
      } else {
         Optional<? extends xd> $$3 = xg.a($$0, this.d, $$1, $$2);
         return xg.a(this.c.b().b($$0), $$3, btj::Q_);
      }
   }

   @Override
   public <T> Optional<T> a(xi.b<T> $$0, ya $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xi.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hk b() {
      return this.c;
   }

   public Optional<xd> c() {
      return this.d;
   }
}
