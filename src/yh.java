import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yh implements wz {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(yh::b), xa.a.optionalFieldOf("separator").forGetter(yh::d)).apply($$0, yh::new)
   );
   public static final wz.a<yh> b = new wz.a<>(a, "selector");
   private final String e;
   @Nullable
   private final hi f;
   protected final Optional<wy> c;

   public yh(String $$0, Optional<wy> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static hi a(String $$0) {
      hi $$1 = null;

      try {
         hj $$2 = new hj(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public wz.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public hi c() {
      return this.f;
   }

   public Optional<wy> d() {
      return this.c;
   }

   @Override
   public xm a(@Nullable et $$0, @Nullable bsq $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends wy> $$3 = xb.a($$0, this.c, $$1, $$2);
         return xb.a(this.f.b($$0), $$3, bsq::O_);
      } else {
         return wy.i();
      }
   }

   @Override
   public <T> Optional<T> a(xd.b<T> $$0, xv $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(xd.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yh $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
