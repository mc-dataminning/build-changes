import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ut implements to {
   private static final Logger c = LogUtils.getLogger();
   private final boolean d;
   private final Optional<tn> e;
   private final String f;
   private final uo g;
   @Nullable
   protected final ej.g b;

   public ut(String $$0, boolean $$1, Optional<tn> $$2, uo $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private ut(String $$0, @Nullable ej.g $$1, boolean $$2, Optional<tn> $$3, uo $$4) {
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

   public Optional<tn> c() {
      return this.e;
   }

   public uo d() {
      return this.g;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ut $$1 && this.g.equals($$1.g) && this.e.equals($$1.e) && this.d == $$1.d && this.f.equals($$1.f)) {
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
   public ua a(@Nullable dt $$0, @Nullable bis $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.b != null) {
         Stream<String> $$3 = this.g.getData($$0).flatMap($$0x -> {
            try {
               return this.b.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(rs::r_);
         if (this.d) {
            tn $$4 = (tn)DataFixUtils.orElse(tp.a($$0, this.e, $$1, $$2), tp.c);
            return $$3.flatMap($$3x -> {
               try {
                  ua $$4x = tn.a.a($$3x);
                  return Stream.of(tp.a($$0, $$4x, $$1, $$2));
               } catch (Exception var5x) {
                  c.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$4).b($$2x)).orElseGet(tn::h);
         } else {
            return tp.a($$0, this.e, $$1, $$2)
               .map($$1x -> $$3.map(tn::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(tn::h))
               .orElseGet(() -> tn.b($$3.collect(Collectors.joining(", "))));
         }
      } else {
         return tn.h();
      }
   }
}
