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

public class xv implements wq {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<xv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(xv::b),
               Codec.BOOL.lenientOptionalFieldOf("interpret", false).forGetter(xv::c),
               wr.a.lenientOptionalFieldOf("separator").forGetter(xv::d),
               xr.c.forGetter(xv::e)
            )
            .apply($$0, xv::new)
   );
   public static final wq.a<xv> b = new wq.a<>(a, "nbt");
   private final boolean e;
   private final Optional<wp> f;
   private final String g;
   private final xr h;
   @Nullable
   protected final fp.g c;

   public xv(String $$0, boolean $$1, Optional<wp> $$2, xr $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private xv(String $$0, @Nullable fp.g $$1, boolean $$2, Optional<wp> $$3, xr $$4) {
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

   public Optional<wp> d() {
      return this.f;
   }

   public xr e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xv $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
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
   public xd a(@Nullable ex $$0, @Nullable bul $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<String> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(un::u_);
         if (this.e) {
            wp $$4 = (wp)DataFixUtils.orElse(ws.a($$0, this.f, $$1, $$2), ws.c);
            return $$3.flatMap($$3x -> {
               try {
                  xd $$4x = wp.a.a($$3x, $$0.u());
                  return Stream.of(ws.a($$0, $$4x, $$1, $$2));
               } catch (Exception var5x) {
                  d.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$4).b($$2x)).orElseGet(wp::i);
         } else {
            return ws.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$3.map(wp::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(wp::i))
               .orElseGet(() -> wp.b($$3.collect(Collectors.joining(", "))));
         }
      } else {
         return wp.i();
      }
   }

   @Override
   public wq.a<?> a() {
      return b;
   }
}
