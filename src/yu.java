import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yu implements xm {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(yu::b), xn.a.optionalFieldOf("separator").forGetter(yu::d)).apply($$0, yu::new)
   );
   public static final xm.a<yu> b = new xm.a<>(a, "selector");
   private final String e;
   @Nullable
   private final he f;
   protected final Optional<xl> c;

   public yu(String $$0, Optional<xl> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static he a(String $$0) {
      he $$1 = null;

      try {
         hf $$2 = new hf(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public xm.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public he c() {
      return this.f;
   }

   public Optional<xl> d() {
      return this.c;
   }

   @Override
   public xz a(@Nullable ep $$0, @Nullable bsp $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends xl> $$3 = xo.a($$0, this.c, $$1, $$2);
         return xo.a(this.f.b($$0), $$3, bsp::O_);
      } else {
         return xl.i();
      }
   }

   @Override
   public <T> Optional<T> a(xq.b<T> $$0, yi $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(xq.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yu $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.e.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }

   @Override
   public String toString() {
      return "pattern{" + this.e + "}";
   }
}
