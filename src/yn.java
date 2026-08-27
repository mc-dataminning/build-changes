import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yn implements xf {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(yn::b), axu.a(xg.a, "separator").forGetter(yn::d)).apply($$0, yn::new)
   );
   public static final xf.a<yn> b = new xf.a<>(a, "selector");
   private final String e;
   @Nullable
   private final gw f;
   protected final Optional<xe> c;

   public yn(String $$0, Optional<xe> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static gw a(String $$0) {
      gw $$1 = null;

      try {
         gx $$2 = new gx(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public xf.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public gw c() {
      return this.f;
   }

   public Optional<xe> d() {
      return this.c;
   }

   @Override
   public xs a(@Nullable eh $$0, @Nullable brv $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends xe> $$3 = xh.a($$0, this.c, $$1, $$2);
         return xh.a(this.f.b($$0), $$3, brv::P_);
      } else {
         return xe.i();
      }
   }

   @Override
   public <T> Optional<T> a(xj.b<T> $$0, yb $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(xj.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yn $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
