import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.stream.JsonReader;
import com.mojang.brigadier.Message;
import com.mojang.serialization.JsonOps;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface ui extends Message, un {
   vf a();

   uj b();

   @Override
   default String getString() {
      return un.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((un.a)($$2 -> {
         int $$3 = $$0 - $$1.length();
         if ($$3 <= 0) {
            return a;
         } else {
            $$1.append($$2.length() <= $$3 ? $$2 : $$2.substring(0, $$3));
            return Optional.empty();
         }
      }));
      return $$1.toString();
   }

   List<ui> c();

   @Nullable
   default String d() {
      if (this.b() instanceof vp $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default uw e() {
      return uw.a(this.b());
   }

   default uw f() {
      return new uw(this.b(), new ArrayList<>(this.c()), this.a());
   }

   ask g();

   @Override
   default <T> Optional<T> a(un.b<T> $$0, vf $$1) {
      vf $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (ui $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(un.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (ui $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<ui> h() {
      return this.a(vf.a);
   }

   default List<ui> a(vf $$0) {
      List<ui> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(ui $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<ui> $$1 = this.h();
         List<ui> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static ui a(@Nullable String $$0) {
      return (ui)($$0 != null ? b($$0) : uh.a);
   }

   static uw b(String $$0) {
      return uw.a(vp.a($$0));
   }

   static uw c(String $$0) {
      return uw.a(new vt($$0, null, vt.a));
   }

   static uw a(String $$0, Object... $$1) {
      return uw.a(new vt($$0, null, $$1));
   }

   static uw b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!vt.a($$3) && !($$3 instanceof ui)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static uw a(String $$0, @Nullable String $$1) {
      return uw.a(new vt($$0, $$1, vt.a));
   }

   static uw a(String $$0, @Nullable String $$1, Object... $$2) {
      return uw.a(new vt($$0, $$1, $$2));
   }

   static uw i() {
      return uw.a(vp.c);
   }

   static uw d(String $$0) {
      return uw.a(new vm($$0));
   }

   static uw a(String $$0, boolean $$1, Optional<ui> $$2, vk $$3) {
      return uw.a(new vo($$0, $$1, $$2, $$3));
   }

   static uw b(String $$0, String $$1) {
      return uw.a(new vq($$0, $$1));
   }

   static uw a(String $$0, Optional<ui> $$1) {
      return uw.a(new vr($$0, $$1));
   }

   static ui a(Date $$0) {
      return b($$0.toString());
   }

   static ui a(Message $$0) {
      return (ui)($$0 instanceof ui $$1 ? $$1 : b($$0.getString()));
   }

   static ui a(UUID $$0) {
      return b($$0.toString());
   }

   static ui a(afw $$0) {
      return b($$0.toString());
   }

   static ui a(cqg $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();
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

      private a() {
      }

      static uw b(JsonElement $$0) {
         return ac.a(uk.a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      static JsonElement c(ui $$0) {
         return ac.a(uk.a.encodeStart(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      public static String a(ui $$0) {
         return a.toJson(c($$0));
      }

      public static JsonElement b(ui $$0) {
         return c($$0);
      }

      @Nullable
      public static uw a(String $$0) {
         JsonElement $$1 = JsonParser.parseString($$0);
         return $$1 == null ? null : b($$1);
      }

      @Nullable
      public static uw a(@Nullable JsonElement $$0) {
         return $$0 == null ? null : b($$0);
      }

      @Nullable
      public static uw b(String $$0) {
         JsonReader $$1 = new JsonReader(new StringReader($$0));
         $$1.setLenient(true);
         JsonElement $$2 = JsonParser.parseReader($$1);
         return $$2 == null ? null : b($$2);
      }

      public static uw a(com.mojang.brigadier.StringReader $$0) {
         try {
            JsonReader $$1 = new JsonReader(new StringReader($$0.getRemaining()));
            $$1.setLenient(false);
            JsonElement $$2 = JsonParser.parseReader($$1);
            $$0.setCursor($$0.getCursor() + a($$1));
            return b($$2);
         } catch (StackOverflowError var3) {
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

   public static class b implements JsonDeserializer<uw>, JsonSerializer<ui> {
      public uw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return ui.a.b($$0);
      }

      public JsonElement a(ui $$0, Type $$1, JsonSerializationContext $$2) {
         return ui.a.c($$0);
      }
   }
}
