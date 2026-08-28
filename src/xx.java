import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record xx(ho c, Optional<wo> d) implements wp {
   public static final MapCodec<xx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ho.a.fieldOf("selector").forGetter(xx::b), wq.a.optionalFieldOf("separator").forGetter(xx::c)).apply($$0, xx::new)
   );
   public static final wp.a<xx> b = new wp.a<>(a, "selector");

   @Override
   public wp.a<?> a() {
      return b;
   }

   @Override
   public xc a(@Nullable ex $$0, @Nullable buk $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wo.i();
      } else {
         Optional<? extends wo> $$3 = wr.a($$0, this.d, $$1, $$2);
         return wr.a(this.c.b().b($$0), $$3, buk::p_);
      }
   }

   @Override
   public <T> Optional<T> a(wt.b<T> $$0, xl $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(wt.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public ho b() {
      return this.c;
   }

   public Optional<wo> c() {
      return this.d;
   }
}
