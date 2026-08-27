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

public class tn {
   static final Logger a = LogUtils.getLogger();
   private final tn.a<?> b;
   private final Object c;

   public <T> tn(tn.a<T> $$0, T $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public tn.a<?> a() {
      return this.b;
   }

   @Nullable
   public <T> T a(tn.a<T> $$0) {
      return this.b == $$0 ? $$0.b(this.c) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         tn $$1 = (tn)$$0;
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
   public static tn a(JsonObject $$0) {
      String $$1 = arj.a($$0, "action", null);
      if ($$1 == null) {
         return null;
      } else {
         tn.a<?> $$2 = tn.a.a($$1);
         if ($$2 == null) {
            return null;
         } else {
            JsonElement $$3 = $$0.get("contents");
            if ($$3 != null) {
               return $$2.a($$3);
            } else {
               ti $$4 = ti.a.a($$0.get("value"));
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
      public static final tn.a<ti> a = new tn.a<>("show_text", true, ti.a::a, ti.a::c, Function.identity());
      public static final tn.a<tn.c> b = new tn.a<>("show_item", true, tn.c::a, tn.c::b, tn.c::a);
      public static final tn.a<tn.b> c = new tn.a<>("show_entity", true, tn.b::a, tn.b::a, tn.b::a);
      private static final Map<String, tn.a<?>> d = Stream.of(a, b, c).collect(ImmutableMap.toImmutableMap(tn.a::b, $$0 -> $$0));
      private final String e;
      private final boolean f;
      private final Function<JsonElement, T> g;
      private final Function<T, JsonElement> h;
      private final Function<ti, T> i;

      public a(String $$0, boolean $$1, Function<JsonElement, T> $$2, Function<T, JsonElement> $$3, Function<ti, T> $$4) {
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
      public static tn.a<?> a(String $$0) {
         return d.get($$0);
      }

      T b(Object $$0) {
         return (T)$$0;
      }

      @Nullable
      public tn a(JsonElement $$0) {
         T $$1 = this.g.apply($$0);
         return $$1 == null ? null : new tn(this, $$1);
      }

      @Nullable
      public tn a(ti $$0) {
         T $$1 = this.i.apply($$0);
         return $$1 == null ? null : new tn(this, $$1);
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
      public final bip<?> a;
      public final UUID b;
      @Nullable
      public final ti c;
      @Nullable
      private List<ti> d;

      public b(bip<?> $$0, UUID $$1, @Nullable ti $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      public static tn.b a(JsonElement $$0) {
         if (!$$0.isJsonObject()) {
            return null;
         } else {
            JsonObject $$1 = $$0.getAsJsonObject();
            bip<?> $$2 = jd.h.a(new aeu(arj.i($$1, "type")));
            UUID $$3 = UUID.fromString(arj.i($$1, "id"));
            ti $$4 = ti.a.a($$1.get("name"));
            return new tn.b($$2, $$3, $$4);
         }
      }

      @Nullable
      public static tn.b a(ti $$0) {
         try {
            qu $$1 = ro.a($$0.getString());
            ti $$2 = ti.a.a($$1.l("name"));
            bip<?> $$3 = jd.h.a(new aeu($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return new tn.b($$3, $$4, $$2);
         } catch (Exception var5) {
            return null;
         }
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("type", jd.h.b(this.a).toString());
         $$0.addProperty("id", this.b.toString());
         if (this.c != null) {
            $$0.add("name", ti.a.c(this.c));
         }

         return $$0;
      }

      public List<ti> b() {
         if (this.d == null) {
            this.d = Lists.newArrayList();
            if (this.c != null) {
               this.d.add(this.c);
            }

            this.d.add(ti.a("gui.entity_tooltip.type", this.a.h()));
            this.d.add(ti.b(this.b.toString()));
         }

         return this.d;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            tn.b $$1 = (tn.b)$$0;
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
      private final civ a;
      private final int b;
      @Nullable
      private final qu c;
      @Nullable
      private cja d;

      c(civ $$0, int $$1, @Nullable qu $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public c(cja $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? $$0.v().h() : null);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            tn.c $$1 = (tn.c)$$0;
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

      public cja a() {
         if (this.d == null) {
            this.d = new cja(this.a, this.b);
            if (this.c != null) {
               this.d.c(this.c);
            }
         }

         return this.d;
      }

      private static tn.c a(JsonElement $$0) {
         if ($$0.isJsonPrimitive()) {
            return new tn.c(jd.i.a(new aeu($$0.getAsString())), 1, null);
         } else {
            JsonObject $$1 = arj.m($$0, "item");
            civ $$2 = jd.i.a(new aeu(arj.i($$1, "id")));
            int $$3 = arj.a($$1, "count", 1);
            if ($$1.has("tag")) {
               String $$4 = arj.i($$1, "tag");

               try {
                  qu $$5 = ro.a($$4);
                  return new tn.c($$2, $$3, $$5);
               } catch (CommandSyntaxException var6) {
                  tn.a.warn("Failed to parse tag: {}", $$4, var6);
               }
            }

            return new tn.c($$2, $$3, null);
         }
      }

      @Nullable
      private static tn.c a(ti $$0) {
         try {
            qu $$1 = ro.a($$0.getString());
            return new tn.c(cja.a($$1));
         } catch (CommandSyntaxException var2) {
            tn.a.warn("Failed to parse item tag: {}", $$0, var2);
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
