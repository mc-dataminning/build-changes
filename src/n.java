import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public enum n implements auk {
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

   public static final Codec<n> w = auk.a(n::values);
   public static final char x = '§';
   private static final Map<String, n> y = Arrays.stream(values()).collect(Collectors.toMap($$0 -> c($$0.A), $$0 -> (n)$$0));
   private static final Pattern z = Pattern.compile("(?i)§[0-9A-FK-OR]");
   private final String A;
   private final char B;
   private final boolean C;
   private final String D;
   private final int E;
   @Nullable
   private final Integer F;

   private static String c(String $$0) {
      return $$0.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
   }

   private n(String $$0, char $$1, int $$2, @Nullable Integer $$3) {
      this($$0, $$1, false, $$2, $$3);
   }

   private n(String $$0, char $$1, boolean $$2) {
      this($$0, $$1, $$2, -1, null);
   }

   private n(String $$0, char $$1, boolean $$2, int $$3, @Nullable Integer $$4) {
      this.A = $$0;
      this.B = $$1;
      this.C = $$2;
      this.E = $$3;
      this.F = $$4;
      this.D = "§" + $$1;
   }

   public char a() {
      return this.B;
   }

   public int b() {
      return this.E;
   }

   public boolean d() {
      return this.C;
   }

   public boolean e() {
      return !this.C && this != v;
   }

   @Nullable
   public Integer f() {
      return this.F;
   }

   public String g() {
      return this.name().toLowerCase(Locale.ROOT);
   }

   @Override
   public String toString() {
      return this.D;
   }

   @Nullable
   public static String a(@Nullable String $$0) {
      return $$0 == null ? null : z.matcher($$0).replaceAll("");
   }

   @Nullable
   public static n b(@Nullable String $$0) {
      return $$0 == null ? null : y.get(c($$0));
   }

   @Nullable
   public static n a(int $$0) {
      if ($$0 < 0) {
         return v;
      } else {
         for (n $$1 : values()) {
            if ($$1.b() == $$0) {
               return $$1;
            }
         }

         return null;
      }
   }

   @Nullable
   public static n a(char $$0) {
      char $$1 = Character.toLowerCase($$0);

      for (n $$2 : values()) {
         if ($$2.B == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public static Collection<String> a(boolean $$0, boolean $$1) {
      List<String> $$2 = Lists.newArrayList();

      for (n $$3 : values()) {
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
