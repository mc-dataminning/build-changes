import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record yq(hm c, Optional<xh> d) implements xi {
   public static final MapCodec<yq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hm.a.fieldOf("selector").forGetter(yq::b), xj.a.optionalFieldOf("separator").forGetter(yq::c)).apply($$0, yq::new)
   );
   public static final xi.a<yq> b = new xi.a<>(a, "selector");

   @Override
   public xi.a<?> a() {
      return b;
   }

   @Override
   public xv a(@Nullable ev $$0, @Nullable btz $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xh.i();
      } else {
         Optional<? extends xh> $$3 = xk.a($$0, this.d, $$1, $$2);
         return xk.a(this.c.b().b($$0), $$3, btz::S_);
      }
   }

   @Override
   public <T> Optional<T> a(xm.b<T> $$0, ye $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xm.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hm b() {
      return this.c;
   }

   public Optional<xh> c() {
      return this.d;
   }
}
