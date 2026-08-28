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

public interface ww extends Message, xb {
   xt a();

   wx b();

   @Override
   default String getString() {
      return xb.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xb.a)($$2 -> {
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

   List<ww> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yd $$0 && this.c().isEmpty() && this.a().h()) {
         return $$0.b();
      }

      return null;
   }

   default xk e() {
      return xk.a(this.b());
   }

   default xk f() {
      return new xk(this.b(), new ArrayList<>(this.c()), this.a());
   }

   ayw g();

   @Override
   default <T> Optional<T> a(xb.b<T> $$0, xt $$1) {
      xt $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (ww $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xb.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (ww $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<ww> h() {
      return this.a(xt.a);
   }

   default List<ww> a(xt $$0) {
      List<ww> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(ww $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<ww> $$1 = this.h();
         List<ww> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static ww a(@Nullable String $$0) {
      return (ww)($$0 != null ? b($$0) : wv.a);
   }

   static xk b(String $$0) {
      return xk.a(yd.a($$0));
   }

   static xk c(String $$0) {
      return xk.a(new yh($$0, null, yh.a));
   }

   static xk a(String $$0, Object... $$1) {
      return xk.a(new yh($$0, null, $$1));
   }

   static xk b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yh.a($$3) && !($$3 instanceof ww)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xk a(String $$0, @Nullable String $$1) {
      return xk.a(new yh($$0, $$1, yh.a));
   }

   static xk a(String $$0, @Nullable String $$1, Object... $$2) {
      return xk.a(new yh($$0, $$1, $$2));
   }

   static xk i() {
      return xk.a(yd.c);
   }

   static xk d(String $$0) {
      return xk.a(new ya($$0));
   }

   static xk a(String $$0, boolean $$1, Optional<ww> $$2, xy $$3) {
      return xk.a(new yc($$0, $$1, $$2, $$3));
   }

   static xk a(ha $$0, String $$1) {
      return xk.a(new ye(Either.left($$0), $$1));
   }

   static xk b(String $$0, String $$1) {
      return xk.a(new ye(Either.right($$0), $$1));
   }

   static xk a(ha $$0, Optional<ww> $$1) {
      return xk.a(new yf($$0, $$1));
   }

   static ww a(Date $$0) {
      return b($$0.toString());
   }

   static ww a(Message $$0) {
      return (ww)($$0 instanceof ww $$1 ? $$1 : b($$0.getString()));
   }

   static ww a(UUID $$0) {
      return b($$0.toString());
   }

   static ww a(ale $$0) {
      return b($$0.toString());
   }

   static ww a(dhw $$0) {
      return b($$0.toString());
   }

   static ww a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xk b(JsonElement $$0, jg.a $$1) {
         return (xk)wy.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(ww $$0, jg.a $$1) {
         return (JsonElement)wy.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(ww $$0, jg.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xk a(String $$0, jg.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xk a(@Nullable JsonElement $$0, jg.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xk b(String $$0, jg.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xk>, JsonSerializer<ww> {
      private final jg.a a;

      public b(jg.a $$0) {
         this.a = $$0;
      }

      public xk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return ww.a.b($$0, this.a);
      }

      public JsonElement a(ww $$0, Type $$1, JsonSerializationContext $$2) {
         return ww.a.b($$0, this.a);
      }
   }
}
