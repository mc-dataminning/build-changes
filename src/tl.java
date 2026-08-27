import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.stream.JsonReader;
import com.mojang.brigadier.Message;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public interface tl extends Message, tp {
   uh a();

   tm b();

   @Override
   default String getString() {
      return tp.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a($$2 -> {
         int $$3 = $$0 - $$1.length();
         if ($$3 <= 0) {
            return a;
         } else {
            $$1.append($$2.length() <= $$3 ? $$2 : $$2.substring(0, $$3));
            return Optional.empty();
         }
      });
      return $$1.toString();
   }

   List<tl> c();

   default ty d() {
      return ty.a(this.b());
   }

   default ty e() {
      return new ty(this.b(), new ArrayList<>(this.c()), this.a());
   }

   arj f();

   @Override
   default <T> Optional<T> a(tp.b<T> $$0, uh $$1) {
      uh $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (tl $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(tp.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (tl $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<tl> g() {
      return this.a(uh.a);
   }

   default List<tl> a(uh $$0) {
      List<tl> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(tl $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<tl> $$1 = this.g();
         List<tl> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static tl a(@Nullable String $$0) {
      return (tl)($$0 != null ? b($$0) : tk.a);
   }

   static ty b(String $$0) {
      return ty.a(new uq($$0));
   }

   static ty c(String $$0) {
      return ty.a(new uv($$0, null, uv.b));
   }

   static ty a(String $$0, Object... $$1) {
      return ty.a(new uv($$0, null, $$1));
   }

   static ty a(String $$0, @Nullable String $$1) {
      return ty.a(new uv($$0, $$1, uv.b));
   }

   static ty a(String $$0, @Nullable String $$1, Object... $$2) {
      return ty.a(new uv($$0, $$1, $$2));
   }

   static ty h() {
      return ty.a(tm.a);
   }

   static ty d(String $$0) {
      return ty.a(new uo($$0));
   }

   static ty a(String $$0, boolean $$1, Optional<tl> $$2, um $$3) {
      return ty.a(new ur($$0, $$1, $$2, $$3));
   }

   static ty b(String $$0, String $$1) {
      return ty.a(new us($$0, $$1));
   }

   static ty a(String $$0, Optional<tl> $$1) {
      return ty.a(new ut($$0, $$1));
   }

   public static class a implements JsonDeserializer<ty>, JsonSerializer<tl> {
      private static final Gson a = ac.a(() -> {
         GsonBuilder $$0 = new GsonBuilder();
         $$0.disableHtmlEscaping();
         $$0.registerTypeHierarchyAdapter(tl.class, new tl.a());
         $$0.registerTypeHierarchyAdapter(uh.class, new uh.b());
         $$0.registerTypeAdapterFactory(new art());
         return $$0.create();
      });
      private static final Field b = ac.a(() -> {
         try {
            new JsonReader(new StringReader(""));
            Field $$0 = JsonReader.class.getDeclaredField("pos");
            $$0.setAccessible(true);
            return $$0;
         } catch (NoSuchFieldException var1) {
            throw new IllegalStateException("Couldn't get field 'pos' for JsonReader", var1);
         }
      });
      private static final Field c = ac.a(() -> {
         try {
            new JsonReader(new StringReader(""));
            Field $$0 = JsonReader.class.getDeclaredField("lineStart");
            $$0.setAccessible(true);
            return $$0;
         } catch (NoSuchFieldException var1) {
            throw new IllegalStateException("Couldn't get field 'lineStart' for JsonReader", var1);
         }
      });

      public ty a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         if ($$0.isJsonPrimitive()) {
            return tl.b($$0.getAsString());
         } else if (!$$0.isJsonObject()) {
            if ($$0.isJsonArray()) {
               JsonArray $$30 = $$0.getAsJsonArray();
               ty $$31 = null;

               for (JsonElement $$32 : $$30) {
                  ty $$33 = this.a($$32, $$32.getClass(), $$2);
                  if ($$31 == null) {
                     $$31 = $$33;
                  } else {
                     $$31.b($$33);
                  }
               }

               return $$31;
            } else {
               throw new JsonParseException("Don't know how to turn " + $$0 + " into a Component");
            }
         } else {
            JsonObject $$3 = $$0.getAsJsonObject();
            ty $$5;
            if ($$3.has("text")) {
               String $$4 = arn.i($$3, "text");
               $$5 = $$4.isEmpty() ? tl.h() : tl.b($$4);
            } else if ($$3.has("translate")) {
               String $$6 = arn.i($$3, "translate");
               String $$7 = arn.a($$3, "fallback", null);
               if ($$3.has("with")) {
                  JsonArray $$8 = arn.v($$3, "with");
                  Object[] $$9 = new Object[$$8.size()];

                  for (int $$10 = 0; $$10 < $$9.length; $$10++) {
                     $$9[$$10] = a(this.a($$8.get($$10), $$1, $$2));
                  }

                  $$5 = tl.a($$6, $$7, $$9);
               } else {
                  $$5 = tl.a($$6, $$7);
               }
            } else if ($$3.has("score")) {
               JsonObject $$13 = arn.u($$3, "score");
               if (!$$13.has("name") || !$$13.has("objective")) {
                  throw new JsonParseException("A score component needs a least a name and an objective");
               }

               $$5 = tl.b(arn.i($$13, "name"), arn.i($$13, "objective"));
            } else if ($$3.has("selector")) {
               Optional<tl> $$16 = this.a($$1, $$2, $$3);
               $$5 = tl.a(arn.i($$3, "selector"), $$16);
            } else if ($$3.has("keybind")) {
               $$5 = tl.d(arn.i($$3, "keybind"));
            } else {
               if (!$$3.has("nbt")) {
                  throw new JsonParseException("Don't know how to turn " + $$0 + " into a Component");
               }

               String $$19 = arn.i($$3, "nbt");
               Optional<tl> $$20 = this.a($$1, $$2, $$3);
               boolean $$21 = arn.a($$3, "interpret", false);
               um $$22;
               if ($$3.has("block")) {
                  $$22 = new ul(arn.i($$3, "block"));
               } else if ($$3.has("entity")) {
                  $$22 = new un(arn.i($$3, "entity"));
               } else {
                  if (!$$3.has("storage")) {
                     throw new JsonParseException("Don't know how to turn " + $$0 + " into a Component");
                  }

                  $$22 = new uu(new aew(arn.i($$3, "storage")));
               }

               $$5 = tl.a($$19, $$21, $$20, $$22);
            }

            if ($$3.has("extra")) {
               JsonArray $$28 = arn.v($$3, "extra");
               if ($$28.size() <= 0) {
                  throw new JsonParseException("Unexpected empty array of components");
               }

               for (int $$29 = 0; $$29 < $$28.size(); $$29++) {
                  $$5.b(this.a($$28.get($$29), $$1, $$2));
               }
            }

            $$5.b((uh)$$2.deserialize($$0, uh.class));
            return $$5;
         }
      }

      private static Object a(Object $$0) {
         if ($$0 instanceof tl $$1 && $$1.a().g() && $$1.c().isEmpty() && $$1.b() instanceof uq $$3) {
            return $$3.a();
         }

         return $$0;
      }

      private Optional<tl> a(Type $$0, JsonDeserializationContext $$1, JsonObject $$2) {
         return $$2.has("separator") ? Optional.of(this.a($$2.get("separator"), $$0, $$1)) : Optional.empty();
      }

      private void a(uh $$0, JsonObject $$1, JsonSerializationContext $$2) {
         JsonElement $$3 = $$2.serialize($$0);
         if ($$3.isJsonObject()) {
            JsonObject $$4 = (JsonObject)$$3;

            for (Entry<String, JsonElement> $$5 : $$4.entrySet()) {
               $$1.add($$5.getKey(), $$5.getValue());
            }
         }
      }

      public JsonElement a(tl $$0, Type $$1, JsonSerializationContext $$2) {
         JsonObject $$3 = new JsonObject();
         if (!$$0.a().g()) {
            this.a($$0.a(), $$3, $$2);
         }

         if (!$$0.c().isEmpty()) {
            JsonArray $$4 = new JsonArray();

            for (tl $$5 : $$0.c()) {
               $$4.add(this.a($$5, tl.class, $$2));
            }

            $$3.add("extra", $$4);
         }

         tm $$6 = $$0.b();
         if ($$6 == tm.a) {
            $$3.addProperty("text", "");
         } else if ($$6 instanceof uq $$7) {
            $$3.addProperty("text", $$7.a());
         } else if ($$6 instanceof uv $$8) {
            $$3.addProperty("translate", $$8.a());
            String $$9 = $$8.b();
            if ($$9 != null) {
               $$3.addProperty("fallback", $$9);
            }

            if ($$8.c().length > 0) {
               JsonArray $$10 = new JsonArray();

               for (Object $$11 : $$8.c()) {
                  if ($$11 instanceof tl) {
                     $$10.add(this.a((tl)$$11, $$11.getClass(), $$2));
                  } else {
                     $$10.add(new JsonPrimitive(String.valueOf($$11)));
                  }
               }

               $$3.add("with", $$10);
            }
         } else if ($$6 instanceof us $$12) {
            JsonObject $$13 = new JsonObject();
            $$13.addProperty("name", $$12.a());
            $$13.addProperty("objective", $$12.c());
            $$3.add("score", $$13);
         } else if ($$6 instanceof ut $$14) {
            $$3.addProperty("selector", $$14.a());
            this.a($$2, $$3, $$14.c());
         } else if ($$6 instanceof uo $$15) {
            $$3.addProperty("keybind", $$15.a());
         } else {
            if (!($$6 instanceof ur $$16)) {
               throw new IllegalArgumentException("Don't know how to serialize " + $$6 + " as a Component");
            }

            $$3.addProperty("nbt", $$16.a());
            $$3.addProperty("interpret", $$16.b());
            this.a($$2, $$3, $$16.c());
            um $$17 = $$16.d();
            if ($$17 instanceof ul $$18) {
               $$3.addProperty("block", $$18.a());
            } else if ($$17 instanceof un $$19) {
               $$3.addProperty("entity", $$19.a());
            } else {
               if (!($$17 instanceof uu $$20)) {
                  throw new IllegalArgumentException("Don't know how to serialize " + $$6 + " as a Component");
               }

               $$3.addProperty("storage", $$20.a().toString());
            }
         }

         return $$3;
      }

      private void a(JsonSerializationContext $$0, JsonObject $$1, Optional<tl> $$2) {
         $$2.ifPresent($$2x -> $$1.add("separator", this.a($$2x, $$2x.getClass(), $$0)));
      }

      public static String a(tl $$0) {
         return a.toJson($$0);
      }

      public static String b(tl $$0) {
         return arn.e(c($$0));
      }

      public static JsonElement c(tl $$0) {
         return a.toJsonTree($$0);
      }

      @Nullable
      public static ty a(String $$0) {
         return arn.b(a, $$0, ty.class, false);
      }

      @Nullable
      public static ty a(JsonElement $$0) {
         return (ty)a.fromJson($$0, ty.class);
      }

      @Nullable
      public static ty b(String $$0) {
         return arn.b(a, $$0, ty.class, true);
      }

      public static ty a(com.mojang.brigadier.StringReader $$0) {
         try {
            JsonReader $$1 = new JsonReader(new StringReader($$0.getRemaining()));
            $$1.setLenient(false);
            ty $$2 = (ty)a.getAdapter(ty.class).read($$1);
            $$0.setCursor($$0.getCursor() + a($$1));
            return $$2;
         } catch (StackOverflowError | IOException var3) {
            throw new JsonParseException(var3);
         }
      }

      private static int a(JsonReader $$0) {
         try {
            return b.getInt($$0) - c.getInt($$0) + 1;
         } catch (IllegalAccessException var2) {
            throw new IllegalStateException("Couldn't read position of JsonReader", var2);
         }
      }
   }
}
