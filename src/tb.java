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

public class tb {
   static final Logger a = LogUtils.getLogger();
   private final tb.a<?> b;
   private final Object c;

   public <T> tb(tb.a<T> $$0, T $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public tb.a<?> a() {
      return this.b;
   }

   @Nullable
   public <T> T a(tb.a<T> $$0) {
      return this.b == $$0 ? $$0.b(this.c) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         tb $$1 = (tb)$$0;
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
   public static tb a(JsonObject $$0) {
      String $$1 = aor.a($$0, "action", null);
      if ($$1 == null) {
         return null;
      } else {
         tb.a<?> $$2 = tb.a.a($$1);
         if ($$2 == null) {
            return null;
         } else {
            JsonElement $$3 = $$0.get("contents");
            if ($$3 != null) {
               return $$2.a($$3);
            } else {
               sw $$4 = sw.a.a($$0.get("value"));
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
      public static final tb.a<sw> a = new tb.a<>("show_text", true, sw.a::a, sw.a::c, Function.identity());
      public static final tb.a<tb.c> b = new tb.a<>("show_item", true, tb.c::a, tb.c::b, tb.c::a);
      public static final tb.a<tb.b> c = new tb.a<>("show_entity", true, tb.b::a, tb.b::a, tb.b::a);
      private static final Map<String, tb.a<?>> d = Stream.of(a, b, c).collect(ImmutableMap.toImmutableMap(tb.a::b, $$0 -> $$0));
      private final String e;
      private final boolean f;
      private final Function<JsonElement, T> g;
      private final Function<T, JsonElement> h;
      private final Function<sw, T> i;

      public a(String $$0, boolean $$1, Function<JsonElement, T> $$2, Function<T, JsonElement> $$3, Function<sw, T> $$4) {
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
      public static tb.a<?> a(String $$0) {
         return d.get($$0);
      }

      T b(Object $$0) {
         return (T)$$0;
      }

      @Nullable
      public tb a(JsonElement $$0) {
         T $$1 = this.g.apply($$0);
         return $$1 == null ? null : new tb(this, $$1);
      }

      @Nullable
      public tb a(sw $$0) {
         T $$1 = this.i.apply($$0);
         return $$1 == null ? null : new tb(this, $$1);
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
      public final bfn<?> a;
      public final UUID b;
      @Nullable
      public final sw c;
      @Nullable
      private List<sw> d;

      public b(bfn<?> $$0, UUID $$1, @Nullable sw $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      public static tb.b a(JsonElement $$0) {
         if (!$$0.isJsonObject()) {
            return null;
         } else {
            JsonObject $$1 = $$0.getAsJsonObject();
            bfn<?> $$2 = jb.h.a(new acq(aor.i($$1, "type")));
            UUID $$3 = UUID.fromString(aor.i($$1, "id"));
            sw $$4 = sw.a.a($$1.get("name"));
            return new tb.b($$2, $$3, $$4);
         }
      }

      @Nullable
      public static tb.b a(sw $$0) {
         try {
            qr $$1 = rl.a($$0.getString());
            sw $$2 = sw.a.a($$1.l("name"));
            bfn<?> $$3 = jb.h.a(new acq($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return new tb.b($$3, $$4, $$2);
         } catch (Exception var5) {
            return null;
         }
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("type", jb.h.b(this.a).toString());
         $$0.addProperty("id", this.b.toString());
         if (this.c != null) {
            $$0.add("name", sw.a.c(this.c));
         }

         return $$0;
      }

      public List<sw> b() {
         if (this.d == null) {
            this.d = Lists.newArrayList();
            if (this.c != null) {
               this.d.add(this.c);
            }

            this.d.add(sw.a("gui.entity_tooltip.type", this.a.h()));
            this.d.add(sw.b(this.b.toString()));
         }

         return this.d;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            tb.b $$1 = (tb.b)$$0;
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
      private final cfu a;
      private final int b;
      @Nullable
      private final qr c;
      @Nullable
      private cfz d;

      c(cfu $$0, int $$1, @Nullable qr $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public c(cfz $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? $$0.v().h() : null);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            tb.c $$1 = (tb.c)$$0;
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

      public cfz a() {
         if (this.d == null) {
            this.d = new cfz(this.a, this.b);
            if (this.c != null) {
               this.d.c(this.c);
            }
         }

         return this.d;
      }

      private static tb.c a(JsonElement $$0) {
         if ($$0.isJsonPrimitive()) {
            return new tb.c(jb.i.a(new acq($$0.getAsString())), 1, null);
         } else {
            JsonObject $$1 = aor.m($$0, "item");
            cfu $$2 = jb.i.a(new acq(aor.i($$1, "id")));
            int $$3 = aor.a($$1, "count", 1);
            if ($$1.has("tag")) {
               String $$4 = aor.i($$1, "tag");

               try {
                  qr $$5 = rl.a($$4);
                  return new tb.c($$2, $$3, $$5);
               } catch (CommandSyntaxException var6) {
                  tb.a.warn("Failed to parse tag: {}", $$4, var6);
               }
            }

            return new tb.c($$2, $$3, null);
         }
      }

      @Nullable
      private static tb.c a(sw $$0) {
         try {
            qr $$1 = rl.a($$0.getString());
            return new tb.c(cfz.a($$1));
         } catch (CommandSyntaxException var2) {
            tb.a.warn("Failed to parse item tag: {}", $$0, var2);
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
