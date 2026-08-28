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
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface wz extends Message, xe {
   xw a();

   xa b();

   @Override
   default String getString() {
      return xe.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xe.a)($$2 -> {
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

   List<wz> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yg $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default xn e() {
      return xn.a(this.b());
   }

   default xn f() {
      return new xn(this.b(), new ArrayList<>(this.c()), this.a());
   }

   aya g();

   @Override
   default <T> Optional<T> a(xe.b<T> $$0, xw $$1) {
      xw $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (wz $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xe.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (wz $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<wz> h() {
      return this.a(xw.a);
   }

   default List<wz> a(xw $$0) {
      List<wz> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(wz $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<wz> $$1 = this.h();
         List<wz> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static wz a(@Nullable String $$0) {
      return (wz)($$0 != null ? b($$0) : wy.a);
   }

   static xn b(String $$0) {
      return xn.a(yg.a($$0));
   }

   static xn c(String $$0) {
      return xn.a(new yk($$0, null, yk.a));
   }

   static xn a(String $$0, Object... $$1) {
      return xn.a(new yk($$0, null, $$1));
   }

   static xn b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yk.a($$3) && !($$3 instanceof wz)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xn a(String $$0, @Nullable String $$1) {
      return xn.a(new yk($$0, $$1, yk.a));
   }

   static xn a(String $$0, @Nullable String $$1, Object... $$2) {
      return xn.a(new yk($$0, $$1, $$2));
   }

   static xn i() {
      return xn.a(yg.c);
   }

   static xn d(String $$0) {
      return xn.a(new yd($$0));
   }

   static xn a(String $$0, boolean $$1, Optional<wz> $$2, yb $$3) {
      return xn.a(new yf($$0, $$1, $$2, $$3));
   }

   static xn b(String $$0, String $$1) {
      return xn.a(new yh($$0, $$1));
   }

   static xn a(String $$0, Optional<wz> $$1) {
      return xn.a(new yi($$0, $$1));
   }

   static wz a(Date $$0) {
      return b($$0.toString());
   }

   static wz a(Message $$0) {
      return (wz)($$0 instanceof wz $$1 ? $$1 : b($$0.getString()));
   }

   static wz a(UUID $$0) {
      return b($$0.toString());
   }

   static wz a(akr $$0) {
      return b($$0.toString());
   }

   static wz a(dcd $$0) {
      return b($$0.toString());
   }

   static wz a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xn b(JsonElement $$0, jo.a $$1) {
         return (xn)xb.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(wz $$0, jo.a $$1) {
         return (JsonElement)xb.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(wz $$0, jo.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xn a(String $$0, jo.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xn a(@Nullable JsonElement $$0, jo.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xn b(String $$0, jo.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xn>, JsonSerializer<wz> {
      private final jo.a a;

      public b(jo.a $$0) {
         this.a = $$0;
      }

      public xn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return wz.a.b($$0, this.a);
      }

      public JsonElement a(wz $$0, Type $$1, JsonSerializationContext $$2) {
         return wz.a.b($$0, this.a);
      }
   }
}
