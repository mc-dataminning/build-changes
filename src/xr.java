import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xr implements wj {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<xr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(xr::b), awu.a(wk.a, "separator").forGetter(xr::d)).apply($$0, xr::new)
   );
   public static final wj.a<xr> b = new wj.a<>(a, "selector");
   private final String e;
   @Nullable
   private final gk f;
   protected final Optional<wi> c;

   public xr(String $$0, Optional<wi> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static gk a(String $$0) {
      gk $$1 = null;

      try {
         gl $$2 = new gl(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public wj.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public gk c() {
      return this.f;
   }

   public Optional<wi> d() {
      return this.c;
   }

   @Override
   public ww a(@Nullable dv $$0, @Nullable bqa $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends wi> $$3 = wl.a($$0, this.c, $$1, $$2);
         return wl.a(this.f.b($$0), $$3, bqa::O_);
      } else {
         return wi.i();
      }
   }

   @Override
   public <T> Optional<T> a(wn.b<T> $$0, xf $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(wn.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xr $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
