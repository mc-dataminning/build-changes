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

public class yd implements wy {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(yd::b),
               Codec.BOOL.lenientOptionalFieldOf("interpret", false).forGetter(yd::c),
               wz.a.lenientOptionalFieldOf("separator").forGetter(yd::d),
               xz.c.forGetter(yd::e)
            )
            .apply($$0, yd::new)
   );
   public static final wy.a<yd> b = new wy.a<>(a, "nbt");
   private final boolean e;
   private final Optional<wx> f;
   private final String g;
   private final xz h;
   @Nullable
   protected final ew.g c;

   public yd(String $$0, boolean $$1, Optional<wx> $$2, xz $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private yd(String $$0, @Nullable ew.g $$1, boolean $$2, Optional<wx> $$3, xz $$4) {
      this.g = $$0;
      this.c = $$1;
      this.e = $$2;
      this.f = $$3;
      this.h = $$4;
   }

   @Nullable
   private static ew.g a(String $$0) {
      try {
         return new ew().a(new StringReader($$0));
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

   public Optional<wx> d() {
      return this.f;
   }

   public xz e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yd $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
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
   public xl a(@Nullable ee $$0, @Nullable brw $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<String> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(va::s_);
         if (this.e) {
            wx $$4 = (wx)DataFixUtils.orElse(xa.a($$0, this.f, $$1, $$2), xa.c);
            return $$3.flatMap($$3x -> {
               try {
                  xl $$4x = wx.a.a($$3x, $$0.v());
                  return Stream.of(xa.a($$0, $$4x, $$1, $$2));
               } catch (Exception var5x) {
                  d.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$4).b($$2x)).orElseGet(wx::i);
         } else {
            return xa.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$3.map(wx::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(wx::i))
               .orElseGet(() -> wx.b($$3.collect(Collectors.joining(", "))));
         }
      } else {
         return wx.i();
      }
   }

   @Override
   public wy.a<?> a() {
      return b;
   }
}
