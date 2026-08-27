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

public class yk implements xf {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(yk::b),
               Codec.BOOL.optionalFieldOf("interpret", false).forGetter(yk::c),
               xg.a.optionalFieldOf("separator").forGetter(yk::d),
               yg.c.forGetter(yk::e)
            )
            .apply($$0, yk::new)
   );
   public static final xf.a<yk> b = new xf.a<>(a, "nbt");
   private final boolean e;
   private final Optional<xe> f;
   private final String g;
   private final yg h;
   @Nullable
   protected final ez.g c;

   public yk(String $$0, boolean $$1, Optional<xe> $$2, yg $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private yk(String $$0, @Nullable ez.g $$1, boolean $$2, Optional<xe> $$3, yg $$4) {
      this.g = $$0;
      this.c = $$1;
      this.e = $$2;
      this.f = $$3;
      this.h = $$4;
   }

   @Nullable
   private static ez.g a(String $$0) {
      try {
         return new ez().a(new StringReader($$0));
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

   public Optional<xe> d() {
      return this.f;
   }

   public yg e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yk $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
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
   public xs a(@Nullable eh $$0, @Nullable brv $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<String> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(vh::s_);
         if (this.e) {
            xe $$4 = (xe)DataFixUtils.orElse(xh.a($$0, this.f, $$1, $$2), xh.c);
            return $$3.flatMap($$3x -> {
               try {
                  xs $$4x = xe.a.a($$3x, $$0.v());
                  return Stream.of(xh.a($$0, $$4x, $$1, $$2));
               } catch (Exception var5x) {
                  d.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.a($$4).a($$2x)).orElseGet(xe::i);
         } else {
            return xh.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$3.map(xe::b).reduce(($$1xx, $$2x) -> $$1xx.a($$1x).a($$2x)).orElseGet(xe::i))
               .orElseGet(() -> xe.b($$3.collect(Collectors.joining(", "))));
         }
      } else {
         return xe.i();
      }
   }

   @Override
   public xf.a<?> a() {
      return b;
   }
}
