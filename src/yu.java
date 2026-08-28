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

public class yu implements xp {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(yu::b),
               Codec.BOOL.lenientOptionalFieldOf("interpret", false).forGetter(yu::c),
               xq.a.lenientOptionalFieldOf("separator").forGetter(yu::d),
               yq.c.forGetter(yu::e)
            )
            .apply($$0, yu::new)
   );
   public static final xp.a<yu> b = new xp.a<>(a, "nbt");
   private final boolean e;
   private final Optional<xo> f;
   private final String g;
   private final yq h;
   @Nullable
   protected final fh.g c;

   public yu(String $$0, boolean $$1, Optional<xo> $$2, yq $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private yu(String $$0, @Nullable fh.g $$1, boolean $$2, Optional<xo> $$3, yq $$4) {
      this.g = $$0;
      this.c = $$1;
      this.e = $$2;
      this.f = $$3;
      this.h = $$4;
   }

   @Nullable
   private static fh.g a(String $$0) {
      try {
         return new fh().a(new StringReader($$0));
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

   public Optional<xo> d() {
      return this.f;
   }

   public yq e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yu $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
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
   public yc a(@Nullable ep $$0, @Nullable bss $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<String> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(vo::s_);
         if (this.e) {
            xo $$4 = (xo)DataFixUtils.orElse(xr.a($$0, this.f, $$1, $$2), xr.c);
            return $$3.flatMap($$3x -> {
               try {
                  yc $$4x = xo.a.a($$3x, $$0.v());
                  return Stream.of(xr.a($$0, $$4x, $$1, $$2));
               } catch (Exception var5x) {
                  d.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$4).b($$2x)).orElseGet(xo::i);
         } else {
            return xr.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$3.map(xo::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(xo::i))
               .orElseGet(() -> xo.b($$3.collect(Collectors.joining(", "))));
         }
      } else {
         return xo.i();
      }
   }

   @Override
   public xp.a<?> a() {
      return b;
   }
}
