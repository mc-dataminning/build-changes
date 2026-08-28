import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yi implements xa {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(yi::b), xb.a.optionalFieldOf("separator").forGetter(yi::d)).apply($$0, yi::new)
   );
   public static final xa.a<yi> b = new xa.a<>(a, "selector");
   private final String e;
   @Nullable
   private final hi f;
   protected final Optional<wz> c;

   public yi(String $$0, Optional<wz> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static hi a(String $$0) {
      hi $$1 = null;

      try {
         hj $$2 = new hj(new StringReader($$0), true);
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public xa.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public hi c() {
      return this.f;
   }

   public Optional<wz> d() {
      return this.c;
   }

   @Override
   public xn a(@Nullable et $$0, @Nullable bsr $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends wz> $$3 = xc.a($$0, this.c, $$1, $$2);
         return xc.a(this.f.b($$0), $$3, bsr::S_);
      } else {
         return wz.i();
      }
   }

   @Override
   public <T> Optional<T> a(xe.b<T> $$0, xw $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(xe.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yi $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
