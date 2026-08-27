import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ur implements tm {
   private static final Logger c = LogUtils.getLogger();
   private final boolean d;
   private final Optional<tl> e;
   private final String f;
   private final um g;
   @Nullable
   protected final ej.g b;

   public ur(String $$0, boolean $$1, Optional<tl> $$2, um $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private ur(String $$0, @Nullable ej.g $$1, boolean $$2, Optional<tl> $$3, um $$4) {
      this.f = $$0;
      this.b = $$1;
      this.d = $$2;
      this.e = $$3;
      this.g = $$4;
   }

   @Nullable
   private static ej.g a(String $$0) {
      try {
         return new ej().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public String a() {
      return this.f;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<tl> c() {
      return this.e;
   }

   public um d() {
      return this.g;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ur $$1 && this.g.equals($$1.g) && this.e.equals($$1.e) && this.d == $$1.d && this.f.equals($$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.d ? 1 : 0;
      $$0 = 31 * $$0 + this.e.hashCode();
      $$0 = 31 * $$0 + this.f.hashCode();
      return 31 * $$0 + this.g.hashCode();
   }

   @Override
   public String toString() {
      return "nbt{" + this.g + ", interpreting=" + this.d + ", separator=" + this.e + "}";
   }

   @Override
   public ty a(@Nullable dt $$0, @Nullable biq $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.b != null) {
         Stream<String> $$3 = this.g.getData($$0).flatMap($$0x -> {
            try {
               return this.b.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(rq::r_);
         if (this.d) {
            tl $$4 = (tl)DataFixUtils.orElse(tn.a($$0, this.e, $$1, $$2), tn.c);
            return $$3.flatMap($$3x -> {
               try {
                  ty $$4x = tl.a.a($$3x);
                  return Stream.of(tn.a($$0, $$4x, $$1, $$2));
               } catch (Exception var5x) {
                  c.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$4).b($$2x)).orElseGet(tl::h);
         } else {
            return tn.a($$0, this.e, $$1, $$2)
               .map($$1x -> $$3.map(tl::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(tl::h))
               .orElseGet(() -> tl.b($$3.collect(Collectors.joining(", "))));
         }
      } else {
         return tl.h();
      }
   }
}
