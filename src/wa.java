import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class wa implements us {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<wa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(wa::b), asu.a(ut.a, "separator").forGetter(wa::d)).apply($$0, wa::new)
   );
   public static final us.a<wa> b = new us.a<>(a, "selector");
   private final String e;
   @Nullable
   private final ge f;
   protected final Optional<ur> c;

   public wa(String $$0, Optional<ur> $$1) {
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
   public us.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public ge c() {
      return this.f;
   }

   public Optional<ur> d() {
      return this.c;
   }

   @Override
   public vf a(@Nullable du $$0, @Nullable bkq $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends ur> $$3 = uu.a($$0, this.c, $$1, $$2);
         return uu.a(this.f.b($$0), $$3, bkq::P_);
      } else {
         return ur.i();
      }
   }

   @Override
   public <T> Optional<T> a(uw.b<T> $$0, vo $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(uw.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof wa $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
