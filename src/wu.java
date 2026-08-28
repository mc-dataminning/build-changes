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

public interface wu extends Message, wz {
   xr a();

   wv b();

   @Override
   default String getString() {
      return wz.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((wz.a)($$2 -> {
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

   List<wu> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yb $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default xi e() {
      return xi.a(this.b());
   }

   default xi f() {
      return new xi(this.b(), new ArrayList<>(this.c()), this.a());
   }

   axs g();

   @Override
   default <T> Optional<T> a(wz.b<T> $$0, xr $$1) {
      xr $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (wu $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(wz.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (wu $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<wu> h() {
      return this.a(xr.a);
   }

   default List<wu> a(xr $$0) {
      List<wu> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(wu $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<wu> $$1 = this.h();
         List<wu> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static wu a(@Nullable String $$0) {
      return (wu)($$0 != null ? b($$0) : wt.a);
   }

   static xi b(String $$0) {
      return xi.a(yb.a($$0));
   }

   static xi c(String $$0) {
      return xi.a(new yf($$0, null, yf.a));
   }

   static xi a(String $$0, Object... $$1) {
      return xi.a(new yf($$0, null, $$1));
   }

   static xi b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yf.a($$3) && !($$3 instanceof wu)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xi a(String $$0, @Nullable String $$1) {
      return xi.a(new yf($$0, $$1, yf.a));
   }

   static xi a(String $$0, @Nullable String $$1, Object... $$2) {
      return xi.a(new yf($$0, $$1, $$2));
   }

   static xi i() {
      return xi.a(yb.c);
   }

   static xi d(String $$0) {
      return xi.a(new xy($$0));
   }

   static xi a(String $$0, boolean $$1, Optional<wu> $$2, xw $$3) {
      return xi.a(new ya($$0, $$1, $$2, $$3));
   }

   static xi b(String $$0, String $$1) {
      return xi.a(new yc($$0, $$1));
   }

   static xi a(String $$0, Optional<wu> $$1) {
      return xi.a(new yd($$0, $$1));
   }

   static wu a(Date $$0) {
      return b($$0.toString());
   }

   static wu a(Message $$0) {
      return (wu)($$0 instanceof wu $$1 ? $$1 : b($$0.getString()));
   }

   static wu a(UUID $$0) {
      return b($$0.toString());
   }

   static wu a(akk $$0) {
      return b($$0.toString());
   }

   static wu a(dbm $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xi b(JsonElement $$0, jl.a $$1) {
         return (xi)ww.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(wu $$0, jl.a $$1) {
         return (JsonElement)ww.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(wu $$0, jl.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xi a(String $$0, jl.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xi a(@Nullable JsonElement $$0, jl.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xi b(String $$0, jl.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xi>, JsonSerializer<wu> {
      private final jl.a a;

      public b(jl.a $$0) {
         this.a = $$0;
      }

      public xi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return wu.a.b($$0, this.a);
      }

      public JsonElement a(wu $$0, Type $$1, JsonSerializationContext $$2) {
         return wu.a.b($$0, this.a);
      }
   }
}
