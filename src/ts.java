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

public class ts {
   static final Logger a = LogUtils.getLogger();
   private final ts.a<?> b;
   private final Object c;

   public <T> ts(ts.a<T> $$0, T $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ts.a<?> a() {
      return this.b;
   }

   @Nullable
   public <T> T a(ts.a<T> $$0) {
      return this.b == $$0 ? $$0.b(this.c) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ts $$1 = (ts)$$0;
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
   public static ts a(JsonObject $$0) {
      String $$1 = arp.a($$0, "action", null);
      if ($$1 == null) {
         return null;
      } else {
         ts.a<?> $$2 = ts.a.a($$1);
         if ($$2 == null) {
            return null;
         } else {
            JsonElement $$3 = $$0.get("contents");
            if ($$3 != null) {
               return $$2.a($$3);
            } else {
               tn $$4 = tn.a.a($$0.get("value"));
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
      public static final ts.a<tn> a = new ts.a<>("show_text", true, tn.a::a, tn.a::c, Function.identity());
      public static final ts.a<ts.c> b = new ts.a<>("show_item", true, ts.c::a, ts.c::b, ts.c::a);
      public static final ts.a<ts.b> c = new ts.a<>("show_entity", true, ts.b::a, ts.b::a, ts.b::a);
      private static final Map<String, ts.a<?>> d = Stream.of(a, b, c).collect(ImmutableMap.toImmutableMap(ts.a::b, $$0 -> $$0));
      private final String e;
      private final boolean f;
      private final Function<JsonElement, T> g;
      private final Function<T, JsonElement> h;
      private final Function<tn, T> i;

      public a(String $$0, boolean $$1, Function<JsonElement, T> $$2, Function<T, JsonElement> $$3, Function<tn, T> $$4) {
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
      public static ts.a<?> a(String $$0) {
         return d.get($$0);
      }

      T b(Object $$0) {
         return (T)$$0;
      }

      @Nullable
      public ts a(JsonElement $$0) {
         T $$1 = this.g.apply($$0);
         return $$1 == null ? null : new ts(this, $$1);
      }

      @Nullable
      public ts a(tn $$0) {
         T $$1 = this.i.apply($$0);
         return $$1 == null ? null : new ts(this, $$1);
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
      public final biw<?> a;
      public final UUID b;
      @Nullable
      public final tn c;
      @Nullable
      private List<tn> d;

      public b(biw<?> $$0, UUID $$1, @Nullable tn $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      public static ts.b a(JsonElement $$0) {
         if (!$$0.isJsonObject()) {
            return null;
         } else {
            JsonObject $$1 = $$0.getAsJsonObject();
            biw<?> $$2 = jd.h.a(new aey(arp.i($$1, "type")));
            UUID $$3 = UUID.fromString(arp.i($$1, "id"));
            tn $$4 = tn.a.a($$1.get("name"));
            return new ts.b($$2, $$3, $$4);
         }
      }

      @Nullable
      public static ts.b a(tn $$0) {
         try {
            qy $$1 = rt.a($$0.getString());
            tn $$2 = tn.a.a($$1.l("name"));
            biw<?> $$3 = jd.h.a(new aey($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return new ts.b($$3, $$4, $$2);
         } catch (Exception var5) {
            return null;
         }
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("type", jd.h.b(this.a).toString());
         $$0.addProperty("id", this.b.toString());
         if (this.c != null) {
            $$0.add("name", tn.a.c(this.c));
         }

         return $$0;
      }

      public List<tn> b() {
         if (this.d == null) {
            this.d = Lists.newArrayList();
            if (this.c != null) {
               this.d.add(this.c);
            }

            this.d.add(tn.a("gui.entity_tooltip.type", this.a.h()));
            this.d.add(tn.b(this.b.toString()));
         }

         return this.d;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            ts.b $$1 = (ts.b)$$0;
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
      private final cjc a;
      private final int b;
      @Nullable
      private final qy c;
      @Nullable
      private cjh d;

      c(cjc $$0, int $$1, @Nullable qy $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public c(cjh $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? $$0.v().h() : null);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            ts.c $$1 = (ts.c)$$0;
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

      public cjh a() {
         if (this.d == null) {
            this.d = new cjh(this.a, this.b);
            if (this.c != null) {
               this.d.c(this.c);
            }
         }

         return this.d;
      }

      private static ts.c a(JsonElement $$0) {
         if ($$0.isJsonPrimitive()) {
            return new ts.c(jd.i.a(new aey($$0.getAsString())), 1, null);
         } else {
            JsonObject $$1 = arp.m($$0, "item");
            cjc $$2 = jd.i.a(new aey(arp.i($$1, "id")));
            int $$3 = arp.a($$1, "count", 1);
            if ($$1.has("tag")) {
               String $$4 = arp.i($$1, "tag");

               try {
                  qy $$5 = rt.a($$4);
                  return new ts.c($$2, $$3, $$5);
               } catch (CommandSyntaxException var6) {
                  ts.a.warn("Failed to parse tag: {}", $$4, var6);
               }
            }

            return new ts.c($$2, $$3, null);
         }
      }

      @Nullable
      private static ts.c a(tn $$0) {
         try {
            qy $$1 = rt.a($$0.getString());
            return new ts.c(cjh.a($$1));
         } catch (CommandSyntaxException var2) {
            ts.a.warn("Failed to parse item tag: {}", $$0, var2);
            return null;
         }
      }

      private JsonElement b() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("id", jd.i.b(this.a).toString());
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
