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
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface xe extends Message, xj {
   yb a();

   xf b();

   @Override
   default String getString() {
      return xj.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xj.a)($$2 -> {
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

   List<xe> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yl $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default xs e() {
      return xs.a(this.b());
   }

   default xs f() {
      return new xs(this.b(), new ArrayList<>(this.c()), this.a());
   }

   axy g();

   @Override
   default <T> Optional<T> a(xj.b<T> $$0, yb $$1) {
      yb $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xe $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xj.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xe $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xe> h() {
      return this.a(yb.a);
   }

   default List<xe> a(yb $$0) {
      List<xe> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xe $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xe> $$1 = this.h();
         List<xe> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xe a(@Nullable String $$0) {
      return (xe)($$0 != null ? b($$0) : xd.a);
   }

   static xs b(String $$0) {
      return xs.a(yl.a($$0));
   }

   static xs c(String $$0) {
      return xs.a(new yp($$0, null, yp.a));
   }

   static xs a(String $$0, Object... $$1) {
      return xs.a(new yp($$0, null, $$1));
   }

   static xs b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yp.a($$3) && !($$3 instanceof xe)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xs a(String $$0, @Nullable String $$1) {
      return xs.a(new yp($$0, $$1, yp.a));
   }

   static xs a(String $$0, @Nullable String $$1, Object... $$2) {
      return xs.a(new yp($$0, $$1, $$2));
   }

   static xs i() {
      return xs.a(yl.c);
   }

   static xs d(String $$0) {
      return xs.a(new yi($$0));
   }

   static xs a(String $$0, boolean $$1, Optional<xe> $$2, yg $$3) {
      return xs.a(new yk($$0, $$1, $$2, $$3));
   }

   static xs b(String $$0, String $$1) {
      return xs.a(new ym($$0, $$1));
   }

   static xs a(String $$0, Optional<xe> $$1) {
      return xs.a(new yn($$0, $$1));
   }

   static xe a(Date $$0) {
      return b($$0.toString());
   }

   static xe a(Message $$0) {
      return (xe)($$0 instanceof xe $$1 ? $$1 : b($$0.getString()));
   }

   static xe a(UUID $$0) {
      return b($$0.toString());
   }

   static xe a(akt $$0) {
      return b($$0.toString());
   }

   static xe a(dbh $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xs b(JsonElement $$0, jc.a $$1) {
         return ad.a(xg.a.parse($$1.a(JsonOps.INSTANCE), $$0), JsonParseException::new);
      }

      static JsonElement b(xe $$0, jc.a $$1) {
         return ad.a(xg.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0), JsonParseException::new);
      }

      public static String a(xe $$0, jc.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xs a(String $$0, jc.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xs a(@Nullable JsonElement $$0, jc.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xs b(String $$0, jc.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xs>, JsonSerializer<xe> {
      private final jc.a a;

      public b(jc.a $$0) {
         this.a = $$0;
      }

      public xs a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return xe.a.b($$0, this.a);
      }

      public JsonElement a(xe $$0, Type $$1, JsonSerializationContext $$2) {
         return xe.a.b($$0, this.a);
      }
   }
}
