import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ye(hp c, Optional<wv> d) implements ww {
   public static final MapCodec<ye> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hp.a.fieldOf("selector").forGetter(ye::b), wx.a.optionalFieldOf("separator").forGetter(ye::c)).apply($$0, ye::new)
   );
   public static final ww.a<ye> b = new ww.a<>(a, "selector");

   @Override
   public ww.a<?> a() {
      return b;
   }

   @Override
   public xj a(@Nullable ex $$0, @Nullable bvs $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wv.i();
      } else {
         Optional<? extends wv> $$3 = wy.a($$0, this.d, $$1, $$2);
         return wy.a(this.c.b().b($$0), $$3, bvs::m_);
      }
   }

   @Override
   public <T> Optional<T> a(xa.b<T> $$0, xs $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xa.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hp b() {
      return this.c;
   }

   public Optional<wv> c() {
      return this.d;
   }
}
