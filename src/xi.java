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

public interface xi extends Message, xn {
   yf a();

   xj b();

   @Override
   default String getString() {
      return xn.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xn.a)($$2 -> {
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

   List<xi> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yp $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default xw e() {
      return xw.a(this.b());
   }

   default xw f() {
      return new xw(this.b(), new ArrayList<>(this.c()), this.a());
   }

   ayw g();

   @Override
   default <T> Optional<T> a(xn.b<T> $$0, yf $$1) {
      yf $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xi $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xn.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xi $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xi> h() {
      return this.a(yf.a);
   }

   default List<xi> a(yf $$0) {
      List<xi> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xi $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xi> $$1 = this.h();
         List<xi> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xi a(@Nullable String $$0) {
      return (xi)($$0 != null ? b($$0) : xh.a);
   }

   static xw b(String $$0) {
      return xw.a(yp.a($$0));
   }

   static xw c(String $$0) {
      return xw.a(new yt($$0, null, yt.a));
   }

   static xw a(String $$0, Object... $$1) {
      return xw.a(new yt($$0, null, $$1));
   }

   static xw b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yt.a($$3) && !($$3 instanceof xi)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xw a(String $$0, @Nullable String $$1) {
      return xw.a(new yt($$0, $$1, yt.a));
   }

   static xw a(String $$0, @Nullable String $$1, Object... $$2) {
      return xw.a(new yt($$0, $$1, $$2));
   }

   static xw i() {
      return xw.a(yp.c);
   }

   static xw d(String $$0) {
      return xw.a(new ym($$0));
   }

   static xw a(String $$0, boolean $$1, Optional<xi> $$2, yk $$3) {
      return xw.a(new yo($$0, $$1, $$2, $$3));
   }

   static xw a(hn $$0, String $$1) {
      return xw.a(new yq(Either.left($$0), $$1));
   }

   static xw b(String $$0, String $$1) {
      return xw.a(new yq(Either.right($$0), $$1));
   }

   static xw a(hn $$0, Optional<xi> $$1) {
      return xw.a(new yr($$0, $$1));
   }

   static xi a(Date $$0) {
      return b($$0.toString());
   }

   static xi a(Message $$0) {
      return (xi)($$0 instanceof xi $$1 ? $$1 : b($$0.getString()));
   }

   static xi a(UUID $$0) {
      return b($$0.toString());
   }

   static xi a(ali $$0) {
      return b($$0.toString());
   }

   static xi a(deh $$0) {
      return b($$0.toString());
   }

   static xi a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xw b(JsonElement $$0, js.a $$1) {
         return (xw)xk.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(xi $$0, js.a $$1) {
         return (JsonElement)xk.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(xi $$0, js.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xw a(String $$0, js.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xw a(@Nullable JsonElement $$0, js.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xw b(String $$0, js.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xw>, JsonSerializer<xi> {
      private final js.a a;

      public b(js.a $$0) {
         this.a = $$0;
      }

      public xw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return xi.a.b($$0, this.a);
      }

      public JsonElement a(xi $$0, Type $$1, JsonSerializationContext $$2) {
         return xi.a.b($$0, this.a);
      }
   }
}
