import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yx implements xp {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(yx::b), xq.a.optionalFieldOf("separator").forGetter(yx::d)).apply($$0, yx::new)
   );
   public static final xp.a<yx> b = new xp.a<>(a, "selector");
   private final String e;
   @Nullable
   private final he f;
   protected final Optional<xo> c;

   public yx(String $$0, Optional<xo> $$1) {
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
   public xp.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public he c() {
      return this.f;
   }

   public Optional<xo> d() {
      return this.c;
   }

   @Override
   public yc a(@Nullable ep $$0, @Nullable bss $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends xo> $$3 = xr.a($$0, this.c, $$1, $$2);
         return xr.a(this.f.b($$0), $$3, bss::O_);
      } else {
         return xo.i();
      }
   }

   @Override
   public <T> Optional<T> a(xt.b<T> $$0, yl $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(xt.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yx $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
