import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record yl(hc c, Optional<xc> d) implements xd {
   public static final MapCodec<yl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hc.a.fieldOf("selector").forGetter(yl::b), xe.a.optionalFieldOf("separator").forGetter(yl::c)).apply($$0, yl::new)
   );
   public static final xd.a<yl> b = new xd.a<>(a, "selector");

   @Override
   public xd.a<?> a() {
      return b;
   }

   @Override
   public xq a(@Nullable ek $$0, @Nullable bwv $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xc.i();
      } else {
         Optional<? extends xc> $$3 = xf.a($$0, this.d, $$1, $$2);
         return xf.a(this.c.b().b($$0), $$3, bwv::m_);
      }
   }

   @Override
   public <T> Optional<T> a(xh.b<T> $$0, xz $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xh.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hc b() {
      return this.c;
   }

   public Optional<xc> c() {
      return this.d;
   }
}
