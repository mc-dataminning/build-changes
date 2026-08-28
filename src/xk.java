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

public interface xk extends Message, xp {
   yh a();

   xl b();

   @Override
   default String getString() {
      return xp.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xp.a)($$2 -> {
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

   List<xk> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yr $$0 && this.c().isEmpty() && this.a().h()) {
         return $$0.b();
      }

      return null;
   }

   default xy e() {
      return xy.a(this.b());
   }

   default xy f() {
      return new xy(this.b(), new ArrayList<>(this.c()), this.a());
   }

   azg g();

   @Override
   default <T> Optional<T> a(xp.b<T> $$0, yh $$1) {
      yh $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xk $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xp.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xk $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xk> h() {
      return this.a(yh.a);
   }

   default List<xk> a(yh $$0) {
      List<xk> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xk $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xk> $$1 = this.h();
         List<xk> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xk a(@Nullable String $$0) {
      return (xk)($$0 != null ? b($$0) : xj.a);
   }

   static xy b(String $$0) {
      return xy.a(yr.a($$0));
   }

   static xy c(String $$0) {
      return xy.a(new yv($$0, null, yv.a));
   }

   static xy a(String $$0, Object... $$1) {
      return xy.a(new yv($$0, null, $$1));
   }

   static xy b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yv.a($$3) && !($$3 instanceof xk)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xy a(String $$0, @Nullable String $$1) {
      return xy.a(new yv($$0, $$1, yv.a));
   }

   static xy a(String $$0, @Nullable String $$1, Object... $$2) {
      return xy.a(new yv($$0, $$1, $$2));
   }

   static xy i() {
      return xy.a(yr.c);
   }

   static xy d(String $$0) {
      return xy.a(new yo($$0));
   }

   static xy a(String $$0, boolean $$1, Optional<xk> $$2, ym $$3) {
      return xy.a(new yq($$0, $$1, $$2, $$3));
   }

   static xy a(hn $$0, String $$1) {
      return xy.a(new ys(Either.left($$0), $$1));
   }

   static xy b(String $$0, String $$1) {
      return xy.a(new ys(Either.right($$0), $$1));
   }

   static xy a(hn $$0, Optional<xk> $$1) {
      return xy.a(new yt($$0, $$1));
   }

   static xk a(Date $$0) {
      return b($$0.toString());
   }

   static xk a(Message $$0) {
      return (xk)($$0 instanceof xk $$1 ? $$1 : b($$0.getString()));
   }

   static xk a(UUID $$0) {
      return b($$0.toString());
   }

   static xk a(alp $$0) {
      return b($$0.toString());
   }

   static xk a(dgf $$0) {
      return b($$0.toString());
   }

   static xk a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xy b(JsonElement $$0, js.a $$1) {
         return (xy)xm.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(xk $$0, js.a $$1) {
         return (JsonElement)xm.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(xk $$0, js.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xy a(String $$0, js.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xy a(@Nullable JsonElement $$0, js.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xy b(String $$0, js.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xy>, JsonSerializer<xk> {
      private final js.a a;

      public b(js.a $$0) {
         this.a = $$0;
      }

      public xy a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return xk.a.b($$0, this.a);
      }

      public JsonElement a(xk $$0, Type $$1, JsonSerializationContext $$2) {
         return xk.a.b($$0, this.a);
      }
   }
}
