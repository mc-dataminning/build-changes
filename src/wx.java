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

public interface wx extends Message, xc {
   xu a();

   wy b();

   @Override
   default String getString() {
      return xc.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xc.a)($$2 -> {
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

   List<wx> c();

   @Nullable
   default String d() {
      if (this.b() instanceof ye $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default xl e() {
      return xl.a(this.b());
   }

   default xl f() {
      return new xl(this.b(), new ArrayList<>(this.c()), this.a());
   }

   axr g();

   @Override
   default <T> Optional<T> a(xc.b<T> $$0, xu $$1) {
      xu $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (wx $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xc.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (wx $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<wx> h() {
      return this.a(xu.a);
   }

   default List<wx> a(xu $$0) {
      List<wx> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(wx $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<wx> $$1 = this.h();
         List<wx> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static wx a(@Nullable String $$0) {
      return (wx)($$0 != null ? b($$0) : ww.a);
   }

   static xl b(String $$0) {
      return xl.a(ye.a($$0));
   }

   static xl c(String $$0) {
      return xl.a(new yi($$0, null, yi.a));
   }

   static xl a(String $$0, Object... $$1) {
      return xl.a(new yi($$0, null, $$1));
   }

   static xl b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yi.a($$3) && !($$3 instanceof wx)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xl a(String $$0, @Nullable String $$1) {
      return xl.a(new yi($$0, $$1, yi.a));
   }

   static xl a(String $$0, @Nullable String $$1, Object... $$2) {
      return xl.a(new yi($$0, $$1, $$2));
   }

   static xl i() {
      return xl.a(ye.c);
   }

   static xl d(String $$0) {
      return xl.a(new yb($$0));
   }

   static xl a(String $$0, boolean $$1, Optional<wx> $$2, xz $$3) {
      return xl.a(new yd($$0, $$1, $$2, $$3));
   }

   static xl b(String $$0, String $$1) {
      return xl.a(new yf($$0, $$1));
   }

   static xl a(String $$0, Optional<wx> $$1) {
      return xl.a(new yg($$0, $$1));
   }

   static wx a(Date $$0) {
      return b($$0.toString());
   }

   static wx a(Message $$0) {
      return (wx)($$0 instanceof wx $$1 ? $$1 : b($$0.getString()));
   }

   static wx a(UUID $$0) {
      return b($$0.toString());
   }

   static wx a(akn $$0) {
      return b($$0.toString());
   }

   static wx a(dag $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xl b(JsonElement $$0, iz.a $$1) {
         return (xl)wz.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(wx $$0, iz.a $$1) {
         return (JsonElement)wz.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(wx $$0, iz.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xl a(String $$0, iz.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xl a(@Nullable JsonElement $$0, iz.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xl b(String $$0, iz.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xl>, JsonSerializer<wx> {
      private final iz.a a;

      public b(iz.a $$0) {
         this.a = $$0;
      }

      public xl a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return wx.a.b($$0, this.a);
      }

      public JsonElement a(wx $$0, Type $$1, JsonSerializationContext $$2) {
         return wx.a.b($$0, this.a);
      }
   }
}
