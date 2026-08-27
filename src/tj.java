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

public class tj {
   static final Logger a = LogUtils.getLogger();
   private final tj.a<?> b;
   private final Object c;

   public <T> tj(tj.a<T> $$0, T $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public tj.a<?> a() {
      return this.b;
   }

   @Nullable
   public <T> T a(tj.a<T> $$0) {
      return this.b == $$0 ? $$0.b(this.c) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         tj $$1 = (tj)$$0;
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
   public static tj a(JsonObject $$0) {
      String $$1 = arf.a($$0, "action", null);
      if ($$1 == null) {
         return null;
      } else {
         tj.a<?> $$2 = tj.a.a($$1);
         if ($$2 == null) {
            return null;
         } else {
            JsonElement $$3 = $$0.get("contents");
            if ($$3 != null) {
               return $$2.a($$3);
            } else {
               te $$4 = te.a.a($$0.get("value"));
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
      public static final tj.a<te> a = new tj.a<>("show_text", true, te.a::a, te.a::c, Function.identity());
      public static final tj.a<tj.c> b = new tj.a<>("show_item", true, tj.c::a, tj.c::b, tj.c::a);
      public static final tj.a<tj.b> c = new tj.a<>("show_entity", true, tj.b::a, tj.b::a, tj.b::a);
      private static final Map<String, tj.a<?>> d = Stream.of(a, b, c).collect(ImmutableMap.toImmutableMap(tj.a::b, $$0 -> $$0));
      private final String e;
      private final boolean f;
      private final Function<JsonElement, T> g;
      private final Function<T, JsonElement> h;
      private final Function<te, T> i;

      public a(String $$0, boolean $$1, Function<JsonElement, T> $$2, Function<T, JsonElement> $$3, Function<te, T> $$4) {
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
      public static tj.a<?> a(String $$0) {
         return d.get($$0);
      }

      T b(Object $$0) {
         return (T)$$0;
      }

      @Nullable
      public tj a(JsonElement $$0) {
         T $$1 = this.g.apply($$0);
         return $$1 == null ? null : new tj(this, $$1);
      }

      @Nullable
      public tj a(te $$0) {
         T $$1 = this.i.apply($$0);
         return $$1 == null ? null : new tj(this, $$1);
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
      public final bik<?> a;
      public final UUID b;
      @Nullable
      public final te c;
      @Nullable
      private List<te> d;

      public b(bik<?> $$0, UUID $$1, @Nullable te $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      public static tj.b a(JsonElement $$0) {
         if (!$$0.isJsonObject()) {
            return null;
         } else {
            JsonObject $$1 = $$0.getAsJsonObject();
            bik<?> $$2 = jc.h.a(new aep(arf.i($$1, "type")));
            UUID $$3 = UUID.fromString(arf.i($$1, "id"));
            te $$4 = te.a.a($$1.get("name"));
            return new tj.b($$2, $$3, $$4);
         }
      }

      @Nullable
      public static tj.b a(te $$0) {
         try {
            qs $$1 = rm.a($$0.getString());
            te $$2 = te.a.a($$1.l("name"));
            bik<?> $$3 = jc.h.a(new aep($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return new tj.b($$3, $$4, $$2);
         } catch (Exception var5) {
            return null;
         }
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("type", jc.h.b(this.a).toString());
         $$0.addProperty("id", this.b.toString());
         if (this.c != null) {
            $$0.add("name", te.a.c(this.c));
         }

         return $$0;
      }

      public List<te> b() {
         if (this.d == null) {
            this.d = Lists.newArrayList();
            if (this.c != null) {
               this.d.add(this.c);
            }

            this.d.add(te.a("gui.entity_tooltip.type", this.a.h()));
            this.d.add(te.b(this.b.toString()));
         }

         return this.d;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            tj.b $$1 = (tj.b)$$0;
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
      private final cir a;
      private final int b;
      @Nullable
      private final qs c;
      @Nullable
      private ciw d;

      c(cir $$0, int $$1, @Nullable qs $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public c(ciw $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? $$0.v().h() : null);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            tj.c $$1 = (tj.c)$$0;
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

      public ciw a() {
         if (this.d == null) {
            this.d = new ciw(this.a, this.b);
            if (this.c != null) {
               this.d.c(this.c);
            }
         }

         return this.d;
      }

      private static tj.c a(JsonElement $$0) {
         if ($$0.isJsonPrimitive()) {
            return new tj.c(jc.i.a(new aep($$0.getAsString())), 1, null);
         } else {
            JsonObject $$1 = arf.m($$0, "item");
            cir $$2 = jc.i.a(new aep(arf.i($$1, "id")));
            int $$3 = arf.a($$1, "count", 1);
            if ($$1.has("tag")) {
               String $$4 = arf.i($$1, "tag");

               try {
                  qs $$5 = rm.a($$4);
                  return new tj.c($$2, $$3, $$5);
               } catch (CommandSyntaxException var6) {
                  tj.a.warn("Failed to parse tag: {}", $$4, var6);
               }
            }

            return new tj.c($$2, $$3, null);
         }
      }

      @Nullable
      private static tj.c a(te $$0) {
         try {
            qs $$1 = rm.a($$0.getString());
            return new tj.c(ciw.a($$1));
         } catch (CommandSyntaxException var2) {
            tj.a.warn("Failed to parse item tag: {}", $$0, var2);
            return null;
         }
      }

      private JsonElement b() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("id", jc.i.b(this.a).toString());
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
