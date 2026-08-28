import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record yf(ha c, Optional<ww> d) implements wx {
   public static final MapCodec<yf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ha.a.fieldOf("selector").forGetter(yf::b), wy.a.optionalFieldOf("separator").forGetter(yf::c)).apply($$0, yf::new)
   );
   public static final wx.a<yf> b = new wx.a<>(a, "selector");

   @Override
   public wx.a<?> a() {
      return b;
   }

   @Override
   public xk a(@Nullable ei $$0, @Nullable bwa $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return ww.i();
      } else {
         Optional<? extends ww> $$3 = wz.a($$0, this.d, $$1, $$2);
         return wz.a(this.c.b().b($$0), $$3, bwa::m_);
      }
   }

   @Override
   public <T> Optional<T> a(xb.b<T> $$0, xt $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xb.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public ha b() {
      return this.c;
   }

   public Optional<ww> c() {
      return this.d;
   }
}
