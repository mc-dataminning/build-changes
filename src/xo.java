import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xo implements wj {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<xo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(xo::b),
               Codec.BOOL.optionalFieldOf("interpret", false).forGetter(xo::c),
               wk.a.optionalFieldOf("separator").forGetter(xo::d),
               xk.c.forGetter(xo::e)
            )
            .apply($$0, xo::new)
   );
   public static final wj.a<xo> b = new wj.a<>(a, "nbt");
   private final boolean e;
   private final Optional<wi> f;
   private final String g;
   private final xk h;
   @Nullable
   protected final en.g c;

   public xo(String $$0, boolean $$1, Optional<wi> $$2, xk $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private xo(String $$0, @Nullable en.g $$1, boolean $$2, Optional<wi> $$3, xk $$4) {
      this.g = $$0;
      this.c = $$1;
      this.e = $$2;
      this.f = $$3;
      this.h = $$4;
   }

   @Nullable
   private static en.g a(String $$0) {
      try {
         return new en().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public String b() {
      return this.g;
   }

   public boolean c() {
      return this.e;
   }

   public Optional<wi> d() {
      return this.f;
   }

   public xk e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xo $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.e ? 1 : 0;
      $$0 = 31 * $$0 + this.f.hashCode();
      $$0 = 31 * $$0 + this.g.hashCode();
      return 31 * $$0 + this.h.hashCode();
   }

   @Override
   public String toString() {
      return "nbt{" + this.h + ", interpreting=" + this.e + ", separator=" + this.f + "}";
   }

   @Override
   public ww a(@Nullable dv $$0, @Nullable bqa $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<String> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(ul::s_);
         if (this.e) {
            wi $$4 = (wi)DataFixUtils.orElse(wl.a($$0, this.f, $$1, $$2), wl.c);
            return $$3.flatMap($$3x -> {
               try {
                  ww $$4x = wi.a.a($$3x, $$0.v());
                  return Stream.of(wl.a($$0, $$4x, $$1, $$2));
               } catch (Exception var5x) {
                  d.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$4).b($$2x)).orElseGet(wi::i);
         } else {
            return wl.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$3.map(wi::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(wi::i))
               .orElseGet(() -> wi.b($$3.collect(Collectors.joining(", "))));
         }
      } else {
         return wi.i();
      }
   }

   @Override
   public wj.a<?> a() {
      return b;
   }
}
