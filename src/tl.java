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

public interface tl extends Message, tq {
   ui a();

   tm b();

   @Override
   default String getString() {
      return tq.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((tq.a)($$2 -> {
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

   List<tl> c();

   @Nullable
   default String d() {
      if (this.b() instanceof us $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default tz e() {
      return tz.a(this.b());
   }

   default tz f() {
      return new tz(this.b(), new ArrayList<>(this.c()), this.a());
   }

   arn g();

   @Override
   default <T> Optional<T> a(tq.b<T> $$0, ui $$1) {
      ui $$2 = this.a().a($$1);
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
   default <T> Optional<T> a(tq.a<T> $$0) {
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

   default List<tl> h() {
      return this.a(ui.a);
   }

   default List<tl> a(ui $$0) {
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
         List<tl> $$1 = this.h();
         List<tl> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static tl a(@Nullable String $$0) {
      return (tl)($$0 != null ? b($$0) : tk.a);
   }

   static tz b(String $$0) {
      return tz.a(us.a($$0));
   }

   static tz c(String $$0) {
      return tz.a(new uw($$0, null, uw.a));
   }

   static tz a(String $$0, Object... $$1) {
      return tz.a(new uw($$0, null, $$1));
   }

   static tz b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!uw.a($$3) && !($$3 instanceof tl)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static tz a(String $$0, @Nullable String $$1) {
      return tz.a(new uw($$0, $$1, uw.a));
   }

   static tz a(String $$0, @Nullable String $$1, Object... $$2) {
      return tz.a(new uw($$0, $$1, $$2));
   }

   static tz i() {
      return tz.a(us.c);
   }

   static tz d(String $$0) {
      return tz.a(new up($$0));
   }

   static tz a(String $$0, boolean $$1, Optional<tl> $$2, un $$3) {
      return tz.a(new ur($$0, $$1, $$2, $$3));
   }

   static tz b(String $$0, String $$1) {
      return tz.a(new ut($$0, $$1));
   }

   static tz a(String $$0, Optional<tl> $$1) {
      return tz.a(new uu($$0, $$1));
   }

   static tl a(Date $$0) {
      return b($$0.toString());
   }

   static tl a(Message $$0) {
      return (tl)($$0 instanceof tl $$1 ? $$1 : b($$0.getString()));
   }

   static tl a(UUID $$0) {
      return b($$0.toString());
   }

   static tl a(aez $$0) {
      return b($$0.toString());
   }

   static tl a(cpi $$0) {
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

      static tz b(JsonElement $$0) {
         return ac.a(tn.a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      static JsonElement c(tl $$0) {
         return ac.a(tn.a.encodeStart(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      public static String a(tl $$0) {
         return a.toJson(c($$0));
      }

      public static JsonElement b(tl $$0) {
         return c($$0);
      }

      @Nullable
      public static tz a(String $$0) {
         JsonElement $$1 = JsonParser.parseString($$0);
         return $$1 == null ? null : b($$1);
      }

      @Nullable
      public static tz a(@Nullable JsonElement $$0) {
         return $$0 == null ? null : b($$0);
      }

      @Nullable
      public static tz b(String $$0) {
         JsonReader $$1 = new JsonReader(new StringReader($$0));
         $$1.setLenient(true);
         JsonElement $$2 = JsonParser.parseReader($$1);
         return $$2 == null ? null : b($$2);
      }

      public static tz a(com.mojang.brigadier.StringReader $$0) {
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

   public static class b implements JsonDeserializer<tz>, JsonSerializer<tl> {
      public tz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return tl.a.b($$0);
      }

      public JsonElement a(tl $$0, Type $$1, JsonSerializationContext $$2) {
         return tl.a.c($$0);
      }
   }
}
