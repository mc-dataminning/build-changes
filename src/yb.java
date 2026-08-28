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

public class yb implements ww {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(yb::b),
               Codec.BOOL.lenientOptionalFieldOf("interpret", false).forGetter(yb::c),
               wx.a.lenientOptionalFieldOf("separator").forGetter(yb::d),
               xx.c.forGetter(yb::e)
            )
            .apply($$0, yb::new)
   );
   public static final ww.a<yb> b = new ww.a<>(a, "nbt");
   private final boolean e;
   private final Optional<wv> f;
   private final String g;
   private final xx h;
   @Nullable
   protected final fp.g c;

   public yb(String $$0, boolean $$1, Optional<wv> $$2, xx $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private yb(String $$0, @Nullable fp.g $$1, boolean $$2, Optional<wv> $$3, xx $$4) {
      this.g = $$0;
      this.c = $$1;
      this.e = $$2;
      this.f = $$3;
      this.h = $$4;
   }

   @Nullable
   private static fp.g a(String $$0) {
      try {
         return new fp().a(new StringReader($$0));
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

   public Optional<wv> d() {
      return this.f;
   }

   public xx e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yb $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
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
   public xj a(@Nullable ex $$0, @Nullable bvs $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<ut> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         });
         if (this.e) {
            alb<ut> $$4 = $$0.u().a(uk.a);
            wv $$5 = (wv)DataFixUtils.orElse(wy.a($$0, this.f, $$1, $$2), wy.c);
            return $$3.flatMap($$4x -> {
               try {
                  wv $$5x = (wv)wx.a.parse($$4, $$4x).getOrThrow();
                  return Stream.of(wy.a($$0, $$5x, $$1, $$2));
               } catch (Exception var6x) {
                  d.warn("Failed to parse component: {}", $$4x, var6x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$5).b($$2x)).orElseGet(wv::i);
         } else {
            Stream<String> $$6 = $$3.map(ut::p_);
            return wy.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$6.map(wv::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(wv::i))
               .orElseGet(() -> wv.b($$6.collect(Collectors.joining(", "))));
         }
      } else {
         return wv.i();
      }
   }

   @Override
   public ww.a<?> a() {
      return b;
   }
}
