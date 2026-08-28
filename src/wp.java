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
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.JsonOps;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface wp extends Message, wu {
   xm a();

   wq b();

   @Override
   default String getString() {
      return wu.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((wu.a)($$2 -> {
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

   List<wp> c();

   @Nullable
   default String d() {
      if (this.b() instanceof xw $$0 && this.c().isEmpty() && this.a().h()) {
         return $$0.b();
      }

      return null;
   }

   default xd e() {
      return xd.a(this.b());
   }

   default xd f() {
      return new xd(this.b(), new ArrayList<>(this.c()), this.a());
   }

   ayl g();

   @Override
   default <T> Optional<T> a(wu.b<T> $$0, xm $$1) {
      xm $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (wp $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(wu.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (wp $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<wp> h() {
      return this.a(xm.a);
   }

   default List<wp> a(xm $$0) {
      List<wp> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(wp $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<wp> $$1 = this.h();
         List<wp> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static wp a(@Nullable String $$0) {
      return (wp)($$0 != null ? b($$0) : wo.a);
   }

   static xd b(String $$0) {
      return xd.a(xw.a($$0));
   }

   static xd c(String $$0) {
      return xd.a(new ya($$0, null, ya.a));
   }

   static xd a(String $$0, Object... $$1) {
      return xd.a(new ya($$0, null, $$1));
   }

   static xd b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!ya.a($$3) && !($$3 instanceof wp)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xd a(String $$0, @Nullable String $$1) {
      return xd.a(new ya($$0, $$1, ya.a));
   }

   static xd a(String $$0, @Nullable String $$1, Object... $$2) {
      return xd.a(new ya($$0, $$1, $$2));
   }

   static xd i() {
      return xd.a(xw.c);
   }

   static xd d(String $$0) {
      return xd.a(new xt($$0));
   }

   static xd a(String $$0, boolean $$1, Optional<wp> $$2, xr $$3) {
      return xd.a(new xv($$0, $$1, $$2, $$3));
   }

   static xd a(ho $$0, String $$1) {
      return xd.a(new xx(Either.left($$0), $$1));
   }

   static xd b(String $$0, String $$1) {
      return xd.a(new xx(Either.right($$0), $$1));
   }

   static xd a(ho $$0, Optional<wp> $$1) {
      return xd.a(new xy($$0, $$1));
   }

   static wp a(Date $$0) {
      return b($$0.toString());
   }

   static wp a(Message $$0) {
      return (wp)($$0 instanceof wp $$1 ? $$1 : b($$0.getString()));
   }

   static wp a(UUID $$0) {
      return b($$0.toString());
   }

   static wp a(akv $$0) {
      return b($$0.toString());
   }

   static wp a(dfo $$0) {
      return b($$0.toString());
   }

   static wp a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xd b(JsonElement $$0, jt.a $$1) {
         return (xd)wr.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(wp $$0, jt.a $$1) {
         return (JsonElement)wr.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(wp $$0, jt.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xd a(String $$0, jt.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xd a(@Nullable JsonElement $$0, jt.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xd b(String $$0, jt.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xd>, JsonSerializer<wp> {
      private final jt.a a;

      public b(jt.a $$0) {
         this.a = $$0;
      }

      public xd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return wp.a.b($$0, this.a);
      }

      public JsonElement a(wp $$0, Type $$1, JsonSerializationContext $$2) {
         return wp.a.b($$0, this.a);
      }
   }
}
