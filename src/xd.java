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

public interface xd extends Message, xi {
   ya a();

   xe b();

   @Override
   default String getString() {
      return xi.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xi.a)($$2 -> {
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

   List<xd> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yk $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default xr e() {
      return xr.a(this.b());
   }

   default xr f() {
      return new xr(this.b(), new ArrayList<>(this.c()), this.a());
   }

   ayo g();

   @Override
   default <T> Optional<T> a(xi.b<T> $$0, ya $$1) {
      ya $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xd $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xi.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xd $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xd> h() {
      return this.a(ya.a);
   }

   default List<xd> a(ya $$0) {
      List<xd> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xd $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xd> $$1 = this.h();
         List<xd> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xd a(@Nullable String $$0) {
      return (xd)($$0 != null ? b($$0) : xc.a);
   }

   static xr b(String $$0) {
      return xr.a(yk.a($$0));
   }

   static xr c(String $$0) {
      return xr.a(new yo($$0, null, yo.a));
   }

   static xr a(String $$0, Object... $$1) {
      return xr.a(new yo($$0, null, $$1));
   }

   static xr b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yo.a($$3) && !($$3 instanceof xd)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xr a(String $$0, @Nullable String $$1) {
      return xr.a(new yo($$0, $$1, yo.a));
   }

   static xr a(String $$0, @Nullable String $$1, Object... $$2) {
      return xr.a(new yo($$0, $$1, $$2));
   }

   static xr i() {
      return xr.a(yk.c);
   }

   static xr d(String $$0) {
      return xr.a(new yh($$0));
   }

   static xr a(String $$0, boolean $$1, Optional<xd> $$2, yf $$3) {
      return xr.a(new yj($$0, $$1, $$2, $$3));
   }

   static xr a(hk $$0, String $$1) {
      return xr.a(new yl(Either.left($$0), $$1));
   }

   static xr b(String $$0, String $$1) {
      return xr.a(new yl(Either.right($$0), $$1));
   }

   static xr a(hk $$0, Optional<xd> $$1) {
      return xr.a(new ym($$0, $$1));
   }

   static xd a(Date $$0) {
      return b($$0.toString());
   }

   static xd a(Message $$0) {
      return (xd)($$0 instanceof xd $$1 ? $$1 : b($$0.getString()));
   }

   static xd a(UUID $$0) {
      return b($$0.toString());
   }

   static xd a(alb $$0) {
      return b($$0.toString());
   }

   static xd a(dcy $$0) {
      return b($$0.toString());
   }

   static xd a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xr b(JsonElement $$0, jp.a $$1) {
         return (xr)xf.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(xd $$0, jp.a $$1) {
         return (JsonElement)xf.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(xd $$0, jp.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xr a(String $$0, jp.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xr a(@Nullable JsonElement $$0, jp.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xr b(String $$0, jp.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xr>, JsonSerializer<xd> {
      private final jp.a a;

      public b(jp.a $$0) {
         this.a = $$0;
      }

      public xr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return xd.a.b($$0, this.a);
      }

      public JsonElement a(xd $$0, Type $$1, JsonSerializationContext $$2) {
         return xd.a.b($$0, this.a);
      }
   }
}
