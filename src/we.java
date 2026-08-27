import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class we {
   private static final String b = "#";
   public static final Codec<we> a = Codec.STRING.comapFlatMap(we::a, we::b);
   private static final Map<n, we> c = Stream.of(n.values())
      .filter(n::e)
      .collect(ImmutableMap.toImmutableMap(Function.identity(), $$0 -> new we($$0.f(), $$0.g())));
   private static final Map<String, we> d = c.values().stream().collect(ImmutableMap.toImmutableMap($$0 -> $$0.f, Function.identity()));
   private final int e;
   @Nullable
   private final String f;

   private we(int $$0, String $$1) {
      this.e = $$0 & 16777215;
      this.f = $$1;
   }

   private we(int $$0) {
      this.e = $$0 & 16777215;
      this.f = null;
   }

   public int a() {
      return this.e;
   }

   public String b() {
      return this.f != null ? this.f : this.c();
   }

   private String c() {
      return String.format(Locale.ROOT, "#%06X", this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         we $$1 = (we)$$0;
         return this.e == $$1.e;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.e, this.f);
   }

   @Override
   public String toString() {
      return this.b();
   }

   @Nullable
   public static we a(n $$0) {
      return c.get($$0);
   }

   public static we a(int $$0) {
      return new we($$0);
   }

   public static DataResult<we> a(String $$0) {
      if ($$0.startsWith("#")) {
         try {
            int $$1 = Integer.parseInt($$0.substring(1), 16);
            return $$1 >= 0 && $$1 <= 16777215 ? DataResult.success(a($$1), Lifecycle.stable()) : DataResult.error(() -> "Color value out of range: " + $$0);
         } catch (NumberFormatException var2) {
            return DataResult.error(() -> "Invalid color value: " + $$0);
         }
      } else {
         we $$3 = d.get($$0);
         return $$3 == null ? DataResult.error(() -> "Invalid color name: " + $$0) : DataResult.success($$3, Lifecycle.stable());
      }
   }
}
