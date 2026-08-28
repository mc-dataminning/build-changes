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

public class yc implements wx {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(yc::b),
               Codec.BOOL.lenientOptionalFieldOf("interpret", false).forGetter(yc::c),
               wy.a.lenientOptionalFieldOf("separator").forGetter(yc::d),
               xy.c.forGetter(yc::e)
            )
            .apply($$0, yc::new)
   );
   public static final wx.a<yc> b = new wx.a<>(a, "nbt");
   private final boolean e;
   private final Optional<ww> f;
   private final String g;
   private final xy h;
   @Nullable
   protected final fa.g c;

   public yc(String $$0, boolean $$1, Optional<ww> $$2, xy $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private yc(String $$0, @Nullable fa.g $$1, boolean $$2, Optional<ww> $$3, xy $$4) {
      this.g = $$0;
      this.c = $$1;
      this.e = $$2;
      this.f = $$3;
      this.h = $$4;
   }

   @Nullable
   private static fa.g a(String $$0) {
      try {
         return new fa().a(new StringReader($$0));
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

   public Optional<ww> d() {
      return this.f;
   }

   public xy e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yc $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
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
   public xk a(@Nullable ei $$0, @Nullable bwa $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<uu> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         });
         if (this.e) {
            alc<uu> $$4 = $$0.u().a(ul.a);
            ww $$5 = (ww)DataFixUtils.orElse(wz.a($$0, this.f, $$1, $$2), wz.c);
            return $$3.flatMap($$4x -> {
               try {
                  ww $$5x = (ww)wy.a.parse($$4, $$4x).getOrThrow();
                  return Stream.of(wz.a($$0, $$5x, $$1, $$2));
               } catch (Exception var6x) {
                  d.warn("Failed to parse component: {}", $$4x, var6x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$5).b($$2x)).orElseGet(ww::i);
         } else {
            Stream<String> $$6 = $$3.map(uu::p_);
            return wz.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$6.map(ww::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(ww::i))
               .orElseGet(() -> ww.b($$6.collect(Collectors.joining(", "))));
         }
      } else {
         return ww.i();
      }
   }

   @Override
   public wx.a<?> a() {
      return b;
   }
}
