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

public class xm implements wh {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<xm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(xm::b),
               Codec.BOOL.optionalFieldOf("interpret", false).forGetter(xm::c),
               wi.a.optionalFieldOf("separator").forGetter(xm::d),
               xi.c.forGetter(xm::e)
            )
            .apply($$0, xm::new)
   );
   public static final wh.a<xm> b = new wh.a<>(a, "nbt");
   private final boolean e;
   private final Optional<wg> f;
   private final String g;
   private final xi h;
   @Nullable
   protected final em.g c;

   public xm(String $$0, boolean $$1, Optional<wg> $$2, xi $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private xm(String $$0, @Nullable em.g $$1, boolean $$2, Optional<wg> $$3, xi $$4) {
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

   public Optional<wg> d() {
      return this.f;
   }

   public xi e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xm $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
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
   public wu a(@Nullable du $$0, @Nullable bpv $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<String> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(uj::s_);
         if (this.e) {
            wg $$4 = (wg)DataFixUtils.orElse(wj.a($$0, this.f, $$1, $$2), wj.c);
            return $$3.flatMap($$3x -> {
               try {
                  wu $$4x = wg.a.a($$3x, $$0.v());
                  return Stream.of(wj.a($$0, $$4x, $$1, $$2));
               } catch (Exception var5x) {
                  d.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$4).b($$2x)).orElseGet(wg::i);
         } else {
            return wj.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$3.map(wg::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(wg::i))
               .orElseGet(() -> wg.b($$3.collect(Collectors.joining(", "))));
         }
      } else {
         return wg.i();
      }
   }

   @Override
   public wh.a<?> a() {
      return b;
   }
}
