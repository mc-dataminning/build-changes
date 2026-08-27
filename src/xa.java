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

public class xa implements vv {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<xa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(xa::b),
               Codec.BOOL.optionalFieldOf("interpret", false).forGetter(xa::c),
               vw.a.optionalFieldOf("separator").forGetter(xa::d),
               ww.c.forGetter(xa::e)
            )
            .apply($$0, xa::new)
   );
   public static final vv.a<xa> b = new vv.a<>(a, "nbt");
   private final boolean e;
   private final Optional<vu> f;
   private final String g;
   private final ww h;
   @Nullable
   protected final em.g c;

   public xa(String $$0, boolean $$1, Optional<vu> $$2, ww $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private xa(String $$0, @Nullable em.g $$1, boolean $$2, Optional<vu> $$3, ww $$4) {
      this.g = $$0;
      this.c = $$1;
      this.e = $$2;
      this.f = $$3;
      this.h = $$4;
   }

   @Nullable
   private static em.g a(String $$0) {
      try {
         return new em().a(new StringReader($$0));
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

   public Optional<vu> d() {
      return this.f;
   }

   public ww e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xa $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
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
   public wi a(@Nullable du $$0, @Nullable box $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<String> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(tx::s_);
         if (this.e) {
            vu $$4 = (vu)DataFixUtils.orElse(vx.a($$0, this.f, $$1, $$2), vx.c);
            return $$3.flatMap($$3x -> {
               try {
                  wi $$4x = vu.a.a($$3x);
                  return Stream.of(vx.a($$0, $$4x, $$1, $$2));
               } catch (Exception var5x) {
                  d.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$4).b($$2x)).orElseGet(vu::i);
         } else {
            return vx.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$3.map(vu::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(vu::i))
               .orElseGet(() -> vu.b($$3.collect(Collectors.joining(", "))));
         }
      } else {
         return vu.i();
      }
   }

   @Override
   public vv.a<?> a() {
      return b;
   }
}
