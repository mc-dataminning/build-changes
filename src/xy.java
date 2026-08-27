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

public class xy implements wt {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<xy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(xy::b),
               Codec.BOOL.optionalFieldOf("interpret", false).forGetter(xy::c),
               wu.a.optionalFieldOf("separator").forGetter(xy::d),
               xu.c.forGetter(xy::e)
            )
            .apply($$0, xy::new)
   );
   public static final wt.a<xy> b = new wt.a<>(a, "nbt");
   private final boolean e;
   private final Optional<ws> f;
   private final String g;
   private final xu h;
   @Nullable
   protected final eu.g c;

   public xy(String $$0, boolean $$1, Optional<ws> $$2, xu $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private xy(String $$0, @Nullable eu.g $$1, boolean $$2, Optional<ws> $$3, xu $$4) {
      this.g = $$0;
      this.c = $$1;
      this.e = $$2;
      this.f = $$3;
      this.h = $$4;
   }

   @Nullable
   private static eu.g a(String $$0) {
      try {
         return new eu().a(new StringReader($$0));
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

   public Optional<ws> d() {
      return this.f;
   }

   public xu e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xy $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
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
   public xg a(@Nullable ec $$0, @Nullable bql $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<String> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(uv::s_);
         if (this.e) {
            ws $$4 = (ws)DataFixUtils.orElse(wv.a($$0, this.f, $$1, $$2), wv.c);
            return $$3.flatMap($$3x -> {
               try {
                  xg $$4x = ws.a.a($$3x, $$0.v());
                  return Stream.of(wv.a($$0, $$4x, $$1, $$2));
               } catch (Exception var5x) {
                  d.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$4).b($$2x)).orElseGet(ws::i);
         } else {
            return wv.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$3.map(ws::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(ws::i))
               .orElseGet(() -> ws.b($$3.collect(Collectors.joining(", "))));
         }
      } else {
         return ws.i();
      }
   }

   @Override
   public wt.a<?> a() {
      return b;
   }
}
