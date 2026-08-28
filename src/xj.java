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

public interface xj extends Message, xo {
   yg a();

   xk b();

   @Override
   default String getString() {
      return xo.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xo.a)($$2 -> {
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

   List<xj> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yq $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default xx e() {
      return xx.a(this.b());
   }

   default xx f() {
      return new xx(this.b(), new ArrayList<>(this.c()), this.a());
   }

   ayy g();

   @Override
   default <T> Optional<T> a(xo.b<T> $$0, yg $$1) {
      yg $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xj $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xo.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xj $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xj> h() {
      return this.a(yg.a);
   }

   default List<xj> a(yg $$0) {
      List<xj> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xj $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xj> $$1 = this.h();
         List<xj> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xj a(@Nullable String $$0) {
      return (xj)($$0 != null ? b($$0) : xi.a);
   }

   static xx b(String $$0) {
      return xx.a(yq.a($$0));
   }

   static xx c(String $$0) {
      return xx.a(new yu($$0, null, yu.a));
   }

   static xx a(String $$0, Object... $$1) {
      return xx.a(new yu($$0, null, $$1));
   }

   static xx b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yu.a($$3) && !($$3 instanceof xj)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xx a(String $$0, @Nullable String $$1) {
      return xx.a(new yu($$0, $$1, yu.a));
   }

   static xx a(String $$0, @Nullable String $$1, Object... $$2) {
      return xx.a(new yu($$0, $$1, $$2));
   }

   static xx i() {
      return xx.a(yq.c);
   }

   static xx d(String $$0) {
      return xx.a(new yn($$0));
   }

   static xx a(String $$0, boolean $$1, Optional<xj> $$2, yl $$3) {
      return xx.a(new yp($$0, $$1, $$2, $$3));
   }

   static xx a(hn $$0, String $$1) {
      return xx.a(new yr(Either.left($$0), $$1));
   }

   static xx b(String $$0, String $$1) {
      return xx.a(new yr(Either.right($$0), $$1));
   }

   static xx a(hn $$0, Optional<xj> $$1) {
      return xx.a(new ys($$0, $$1));
   }

   static xj a(Date $$0) {
      return b($$0.toString());
   }

   static xj a(Message $$0) {
      return (xj)($$0 instanceof xj $$1 ? $$1 : b($$0.getString()));
   }

   static xj a(UUID $$0) {
      return b($$0.toString());
   }

   static xj a(alj $$0) {
      return b($$0.toString());
   }

   static xj a(des $$0) {
      return b($$0.toString());
   }

   static xj a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xx b(JsonElement $$0, js.a $$1) {
         return (xx)xl.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(xj $$0, js.a $$1) {
         return (JsonElement)xl.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(xj $$0, js.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xx a(String $$0, js.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xx a(@Nullable JsonElement $$0, js.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xx b(String $$0, js.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xx>, JsonSerializer<xj> {
      private final js.a a;

      public b(js.a $$0) {
         this.a = $$0;
      }

      public xx a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return xj.a.b($$0, this.a);
      }

      public JsonElement a(xj $$0, Type $$1, JsonSerializationContext $$2) {
         return xj.a.b($$0, this.a);
      }
   }
}
