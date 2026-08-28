import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record xy(ho c, Optional<wp> d) implements wq {
   public static final MapCodec<xy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ho.a.fieldOf("selector").forGetter(xy::b), wr.a.optionalFieldOf("separator").forGetter(xy::c)).apply($$0, xy::new)
   );
   public static final wq.a<xy> b = new wq.a<>(a, "selector");

   @Override
   public wq.a<?> a() {
      return b;
   }

   @Override
   public xd a(@Nullable ex $$0, @Nullable bum $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wp.i();
      } else {
         Optional<? extends wp> $$3 = ws.a($$0, this.d, $$1, $$2);
         return ws.a(this.c.b().b($$0), $$3, bum::p_);
      }
   }

   @Override
   public <T> Optional<T> a(wu.b<T> $$0, xm $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(wu.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public ho b() {
      return this.c;
   }

   public Optional<wp> c() {
      return this.d;
   }
}
