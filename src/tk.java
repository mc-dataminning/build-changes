import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class tk {
   static final Logger a = LogUtils.getLogger();
   private final tk.a<?> b;
   private final Object c;

   public <T> tk(tk.a<T> $$0, T $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public tk.a<?> a() {
      return this.b;
   }

   @Nullable
   public <T> T a(tk.a<T> $$0) {
      return this.b == $$0 ? $$0.b(this.c) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         tk $$1 = (tk)$$0;
         return this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "HoverEvent{action=" + this.b + ", value='" + this.c + "'}";
   }

   @Override
   public int hashCode() {
      int $$0 = this.b.hashCode();
      return 31 * $$0 + (this.c != null ? this.c.hashCode() : 0);
   }

   @Nullable
   public static tk a(JsonObject $$0) {
      String $$1 = arg.a($$0, "action", null);
      if ($$1 == null) {
         return null;
      } else {
         tk.a<?> $$2 = tk.a.a($$1);
         if ($$2 == null) {
            return null;
         } else {
            JsonElement $$3 = $$0.get("contents");
            if ($$3 != null) {
               return $$2.a($$3);
            } else {
               tf $$4 = tf.a.a($$0.get("value"));
               return $$4 != null ? $$2.a($$4) : null;
            }
         }
      }
   }

   public JsonObject b() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("action", this.b.b());
      $$0.add("contents", this.b.a(this.c));
      return $$0;
   }

   public static class a<T> {
      public static final tk.a<tf> a = new tk.a<>("show_text", true, tf.a::a, tf.a::c, Function.identity());
      public static final tk.a<tk.c> b = new tk.a<>("show_item", true, tk.c::a, tk.c::b, tk.c::a);
      public static final tk.a<tk.b> c = new tk.a<>("show_entity", true, tk.b::a, tk.b::a, tk.b::a);
      private static final Map<String, tk.a<?>> d = Stream.of(a, b, c).collect(ImmutableMap.toImmutableMap(tk.a::b, $$0 -> $$0));
      private final String e;
      private final boolean f;
      private final Function<JsonElement, T> g;
      private final Function<T, JsonElement> h;
      private final Function<tf, T> i;

      public a(String $$0, boolean $$1, Function<JsonElement, T> $$2, Function<T, JsonElement> $$3, Function<tf, T> $$4) {
         this.e = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
         this.i = $$4;
      }

      public boolean a() {
         return this.f;
      }

      public String b() {
         return this.e;
      }

      @Nullable
      public static tk.a<?> a(String $$0) {
         return d.get($$0);
      }

      T b(Object $$0) {
         return (T)$$0;
      }

      @Nullable
      public tk a(JsonElement $$0) {
         T $$1 = this.g.apply($$0);
         return $$1 == null ? null : new tk(this, $$1);
      }

      @Nullable
      public tk a(tf $$0) {
         T $$1 = this.i.apply($$0);
         return $$1 == null ? null : new tk(this, $$1);
      }

      public JsonElement a(Object $$0) {
         return this.h.apply(this.b($$0));
      }

      @Override
      public String toString() {
         return "<action " + this.e + ">";
      }
   }

   public static class b {
      public final bim<?> a;
      public final UUID b;
      @Nullable
      public final tf c;
      @Nullable
      private List<tf> d;

      public b(bim<?> $$0, UUID $$1, @Nullable tf $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      public static tk.b a(JsonElement $$0) {
         if (!$$0.isJsonObject()) {
            return null;
         } else {
            JsonObject $$1 = $$0.getAsJsonObject();
            bim<?> $$2 = jb.h.a(new aer(arg.i($$1, "type")));
            UUID $$3 = UUID.fromString(arg.i($$1, "id"));
            tf $$4 = tf.a.a($$1.get("name"));
            return new tk.b($$2, $$3, $$4);
         }
      }

      @Nullable
      public static tk.b a(tf $$0) {
         try {
            qr $$1 = rl.a($$0.getString());
            tf $$2 = tf.a.a($$1.l("name"));
            bim<?> $$3 = jb.h.a(new aer($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return new tk.b($$3, $$4, $$2);
         } catch (Exception var5) {
            return null;
         }
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("type", jb.h.b(this.a).toString());
         $$0.addProperty("id", this.b.toString());
         if (this.c != null) {
            $$0.add("name", tf.a.c(this.c));
         }

         return $$0;
      }

      public List<tf> b() {
         if (this.d == null) {
            this.d = Lists.newArrayList();
            if (this.c != null) {
               this.d.add(this.c);
            }

            this.d.add(tf.a("gui.entity_tooltip.type", this.a.h()));
            this.d.add(tf.b(this.b.toString()));
         }

         return this.d;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            tk.b $$1 = (tk.b)$$0;
            return this.a.equals($$1.a) && this.b.equals($$1.b) && Objects.equals(this.c, $$1.c);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.a.hashCode();
         $$0 = 31 * $$0 + this.b.hashCode();
         return 31 * $$0 + (this.c != null ? this.c.hashCode() : 0);
      }
   }

   public static class c {
      private final cit a;
      private final int b;
      @Nullable
      private final qr c;
      @Nullable
      private ciy d;

      c(cit $$0, int $$1, @Nullable qr $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public c(ciy $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? $$0.v().h() : null);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            tk.c $$1 = (tk.c)$$0;
            return this.b == $$1.b && this.a.equals($$1.a) && Objects.equals(this.c, $$1.c);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.a.hashCode();
         $$0 = 31 * $$0 + this.b;
         return 31 * $$0 + (this.c != null ? this.c.hashCode() : 0);
      }

      public ciy a() {
         if (this.d == null) {
            this.d = new ciy(this.a, this.b);
            if (this.c != null) {
               this.d.c(this.c);
            }
         }

         return this.d;
      }

      private static tk.c a(JsonElement $$0) {
         if ($$0.isJsonPrimitive()) {
            return new tk.c(jb.i.a(new aer($$0.getAsString())), 1, null);
         } else {
            JsonObject $$1 = arg.m($$0, "item");
            cit $$2 = jb.i.a(new aer(arg.i($$1, "id")));
            int $$3 = arg.a($$1, "count", 1);
            if ($$1.has("tag")) {
               String $$4 = arg.i($$1, "tag");

               try {
                  qr $$5 = rl.a($$4);
                  return new tk.c($$2, $$3, $$5);
               } catch (CommandSyntaxException var6) {
                  tk.a.warn("Failed to parse tag: {}", $$4, var6);
               }
            }

            return new tk.c($$2, $$3, null);
         }
      }

      @Nullable
      private static tk.c a(tf $$0) {
         try {
            qr $$1 = rl.a($$0.getString());
            return new tk.c(ciy.a($$1));
         } catch (CommandSyntaxException var2) {
            tk.a.warn("Failed to parse item tag: {}", $$0, var2);
            return null;
         }
      }

      private JsonElement b() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("id", jb.i.b(this.a).toString());
         if (this.b != 1) {
            $$0.addProperty("count", this.b);
         }

         if (this.c != null) {
            $$0.addProperty("tag", this.c.toString());
         }

         return $$0;
      }
   }
}
