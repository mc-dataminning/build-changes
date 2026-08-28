import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yd implements wv {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(yd::b), ww.a.optionalFieldOf("separator").forGetter(yd::d)).apply($$0, yd::new)
   );
   public static final wv.a<yd> b = new wv.a<>(a, "selector");
   private final String e;
   @Nullable
   private final hf f;
   protected final Optional<wu> c;

   public yd(String $$0, Optional<wu> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static hf a(String $$0) {
      hf $$1 = null;

      try {
         hg $$2 = new hg(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public wv.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public hf c() {
      return this.f;
   }

   public Optional<wu> d() {
      return this.c;
   }

   @Override
   public xi a(@Nullable eq $$0, @Nullable bsg $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends wu> $$3 = wx.a($$0, this.c, $$1, $$2);
         return wx.a(this.f.b($$0), $$3, bsg::O_);
      } else {
         return wu.i();
      }
   }

   @Override
   public <T> Optional<T> a(wz.b<T> $$0, xr $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(wz.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yd $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
