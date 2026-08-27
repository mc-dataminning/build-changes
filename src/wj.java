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

public class wj implements ve {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<wj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("nbt").forGetter(wj::b),
               Codec.BOOL.optionalFieldOf("interpret", false).forGetter(wj::c),
               vf.a.optionalFieldOf("separator").forGetter(wj::d),
               wf.c.forGetter(wj::e)
            )
            .apply($$0, wj::new)
   );
   public static final ve.a<wj> b = new ve.a<>(a, "nbt");
   private final boolean e;
   private final Optional<vd> f;
   private final String g;
   private final wf h;
   @Nullable
   protected final ek.g c;

   public wj(String $$0, boolean $$1, Optional<vd> $$2, wf $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private wj(String $$0, @Nullable ek.g $$1, boolean $$2, Optional<vd> $$3, wf $$4) {
      this.g = $$0;
      this.c = $$1;
      this.e = $$2;
      this.f = $$3;
      this.h = $$4;
   }

   @Nullable
   private static ek.g a(String $$0) {
      try {
         return new ek().a(new StringReader($$0));
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

   public Optional<vd> d() {
      return this.f;
   }

   public wf e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof wj $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g)) {
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
   public vr a(@Nullable ds $$0, @Nullable blp $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<String> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(ti::t_);
         if (this.e) {
            vd $$4 = (vd)DataFixUtils.orElse(vg.a($$0, this.f, $$1, $$2), vg.c);
            return $$3.flatMap($$3x -> {
               try {
                  vr $$4x = vd.a.a($$3x);
                  return Stream.of(vg.a($$0, $$4x, $$1, $$2));
               } catch (Exception var5x) {
                  d.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$4).b($$2x)).orElseGet(vd::i);
         } else {
            return vg.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$3.map(vd::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(vd::i))
               .orElseGet(() -> vd.b($$3.collect(Collectors.joining(", "))));
         }
      } else {
         return vd.i();
      }
   }

   @Override
   public ve.a<?> a() {
      return b;
   }
}
