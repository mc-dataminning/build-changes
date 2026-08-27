import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class we implements uw {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<we> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(we::b), asy.a(ux.a, "separator").forGetter(we::d)).apply($$0, we::new)
   );
   public static final uw.a<we> b = new uw.a<>(a, "selector");
   private final String e;
   @Nullable
   private final ge f;
   protected final Optional<uv> c;

   public we(String $$0, Optional<uv> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static ge a(String $$0) {
      ge $$1 = null;

      try {
         gf $$2 = new gf(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public uw.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public ge c() {
      return this.f;
   }

   public Optional<uv> d() {
      return this.c;
   }

   @Override
   public vj a(@Nullable du $$0, @Nullable bkv $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends uv> $$3 = uy.a($$0, this.c, $$1, $$2);
         return uy.a(this.f.b($$0), $$3, bkv::Q_);
      } else {
         return uv.i();
      }
   }

   @Override
   public <T> Optional<T> a(va.b<T> $$0, vs $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(va.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof we $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
