import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum o implements bak {
   a("BLACK", '0', 0, 0),
   b("DARK_BLUE", '1', 1, 170),
   c("DARK_GREEN", '2', 2, 43520),
   d("DARK_AQUA", '3', 3, 43690),
   e("DARK_RED", '4', 4, 11141120),
   f("DARK_PURPLE", '5', 5, 11141290),
   g("GOLD", '6', 6, 16755200),
   h("GRAY", '7', 7, 11184810),
   i("DARK_GRAY", '8', 8, 5592405),
   j("BLUE", '9', 9, 5592575),
   k("GREEN", 'a', 10, 5635925),
   l("AQUA", 'b', 11, 5636095),
   m("RED", 'c', 12, 16733525),
   n("LIGHT_PURPLE", 'd', 13, 16733695),
   o("YELLOW", 'e', 14, 16777045),
   p("WHITE", 'f', 15, 16777215),
   q("OBFUSCATED", 'k', true),
   r("BOLD", 'l', true),
   s("STRIKETHROUGH", 'm', true),
   t("UNDERLINE", 'n', true),
   u("ITALIC", 'o', true),
   v("RESET", 'r', -1, null);

   public static final Codec<o> w = bak.a(o::values);
   public static final Codec<o> x = w.validate($$0 -> $$0.d() ? DataResult.error(() -> "Formatting was not a valid color: " + $$0) : DataResult.success($$0));
   public static final char y = '§';
   private static final Map<String, o> z = Arrays.stream(values()).collect(Collectors.toMap($$0 -> c($$0.B), $$0 -> (o)$$0));
   private static final Pattern A = Pattern.compile("(?i)§[0-9A-FK-OR]");
   private final String B;
   private final char C;
   private final boolean D;
   private final String E;
   private final int F;
   @Nullable
   private final Integer G;

   private static String c(String $$0) {
      return $$0.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
   }

   private o(final String $$0, final char $$1, final int $$2, @Nullable final Integer $$3) {
      this($$0, $$1, false, $$2, $$3);
   }

   private o(final String $$0, final char $$1, final boolean $$2) {
      this($$0, $$1, $$2, -1, null);
   }

   private o(final String $$0, final char $$1, final boolean $$2, final int $$3, @Nullable final Integer $$4) {
      this.B = $$0;
      this.C = $$1;
      this.D = $$2;
      this.F = $$3;
      this.G = $$4;
      this.E = "§" + $$1;
   }

   public char a() {
      return this.C;
   }

   public int b() {
      return this.F;
   }

   public boolean d() {
      return this.D;
   }

   public boolean e() {
      return !this.D && this != v;
   }

   @Nullable
   public Integer f() {
      return this.G;
   }

   public String g() {
      return this.name().toLowerCase(Locale.ROOT);
   }

   @Override
   public String toString() {
      return this.E;
   }

   @Nullable
   @Contract("!null->!null;_->_")
   public static String a(@Nullable String $$0) {
      return $$0 == null ? null : A.matcher($$0).replaceAll("");
   }

   @Nullable
   public static o b(@Nullable String $$0) {
      return $$0 == null ? null : z.get(c($$0));
   }

   @Nullable
   public static o a(int $$0) {
      if ($$0 < 0) {
         return v;
      } else {
         for (o $$1 : values()) {
            if ($$1.b() == $$0) {
               return $$1;
            }
         }

         return null;
      }
   }

   @Nullable
   public static o a(char $$0) {
      char $$1 = Character.toLowerCase($$0);

      for (o $$2 : values()) {
         if ($$2.C == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public static Collection<String> a(boolean $$0, boolean $$1) {
      List<String> $$2 = Lists.newArrayList();

      for (o $$3 : values()) {
         if ((!$$3.e() || $$0) && (!$$3.d() || $$1)) {
            $$2.add($$3.g());
         }
      }

      return $$2;
   }

   @Override
   public String c() {
      return this.g();
   }
}
