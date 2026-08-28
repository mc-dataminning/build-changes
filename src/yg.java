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

public class yg implements xb {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(yg::b),
               Codec.BOOL.lenientOptionalFieldOf("interpret", false).forGetter(yg::c),
               xc.a.lenientOptionalFieldOf("separator").forGetter(yg::d),
               yc.c.forGetter(yg::e)
            )
            .apply($$0, yg::new)
   );
   public static final xb.a<yg> b = new xb.a<>(a, "nbt");
   private final boolean e;
   private final Optional<xa> f;
   private final String g;
   private final yc h;
   @Nullable
   protected final fb.g c;

   public yg(String $$0, boolean $$1, Optional<xa> $$2, yc $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private yg(String $$0, @Nullable fb.g $$1, boolean $$2, Optional<xa> $$3, yc $$4) {
      this.g = $$0;
      this.c = $$1;
      this.e = $$2;
      this.f = $$3;
      this.h = $$4;
   }

   @Nullable
   private static fb.g a(String $$0) {
      try {
         return new fb().a(new StringReader($$0));
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

   public Optional<xa> d() {
      return this.f;
   }

   public yc e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yg $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
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
   public xo a(@Nullable ej $$0, @Nullable bwt $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<uy> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         });
         if (this.e) {
            alg<uy> $$4 = $$0.u().a(un.a);
            xa $$5 = (xa)DataFixUtils.orElse(xd.a($$0, this.f, $$1, $$2), xd.c);
            return $$3.flatMap($$4x -> {
               try {
                  xa $$5x = (xa)xc.a.parse($$4, $$4x).getOrThrow();
                  return Stream.of(xd.a($$0, $$5x, $$1, $$2));
               } catch (Exception var6x) {
                  d.warn("Failed to parse component: {}", $$4x, var6x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$5).b($$2x)).orElseGet(xa::i);
         } else {
            Stream<String> $$6 = $$3.map(yg::a);
            return xd.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$6.map(xa::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(xa::i))
               .orElseGet(() -> xa.b($$6.collect(Collectors.joining(", "))));
         }
      } else {
         return xa.i();
      }
   }

   private static String a(uy $$0) {
      if ($$0 instanceof uw var1) {
         uw var10000 = var1;

         try {
            var5 = var10000.k();
         } catch (Throwable var4) {
            throw new MatchException(var4.toString(), var4);
         }

         return var5;
      } else {
         return $$0.toString();
      }
   }

   @Override
   public xb.a<?> a() {
      return b;
   }
}
