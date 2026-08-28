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

public class yv implements xq {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(yv::b),
               Codec.BOOL.lenientOptionalFieldOf("interpret", false).forGetter(yv::c),
               xr.a.lenientOptionalFieldOf("separator").forGetter(yv::d),
               yr.c.forGetter(yv::e)
            )
            .apply($$0, yv::new)
   );
   public static final xq.a<yv> b = new xq.a<>(a, "nbt");
   private final boolean e;
   private final Optional<xp> f;
   private final String g;
   private final yr h;
   @Nullable
   protected final fh.g c;

   public yv(String $$0, boolean $$1, Optional<xp> $$2, yr $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private yv(String $$0, @Nullable fh.g $$1, boolean $$2, Optional<xp> $$3, yr $$4) {
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

   public Optional<xp> d() {
      return this.f;
   }

   public yr e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yv $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
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
   public yd a(@Nullable ep $$0, @Nullable bsw $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<String> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(vp::s_);
         if (this.e) {
            xp $$4 = (xp)DataFixUtils.orElse(xs.a($$0, this.f, $$1, $$2), xs.c);
            return $$3.flatMap($$3x -> {
               try {
                  yd $$4x = xp.a.a($$3x, $$0.v());
                  return Stream.of(xs.a($$0, $$4x, $$1, $$2));
               } catch (Exception var5x) {
                  d.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$4).b($$2x)).orElseGet(xp::i);
         } else {
            return xs.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$3.map(xp::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(xp::i))
               .orElseGet(() -> xp.b($$3.collect(Collectors.joining(", "))));
         }
      } else {
         return xp.i();
      }
   }

   @Override
   public xq.a<?> a() {
      return b;
   }
}
