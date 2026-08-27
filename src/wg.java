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

public interface wg extends Message, wl {
   xd a();

   wh b();

   @Override
   default String getString() {
      return wl.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((wl.a)($$2 -> {
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

   List<wg> c();

   @Nullable
   default String d() {
      if (this.b() instanceof xn $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default wu e() {
      return wu.a(this.b());
   }

   default wu f() {
      return new wu(this.b(), new ArrayList<>(this.c()), this.a());
   }

   aww g();

   @Override
   default <T> Optional<T> a(wl.b<T> $$0, xd $$1) {
      xd $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (wg $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(wl.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (wg $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<wg> h() {
      return this.a(xd.a);
   }

   default List<wg> a(xd $$0) {
      List<wg> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(wg $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<wg> $$1 = this.h();
         List<wg> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static wg a(@Nullable String $$0) {
      return (wg)($$0 != null ? b($$0) : wf.a);
   }

   static wu b(String $$0) {
      return wu.a(xn.a($$0));
   }

   static wu c(String $$0) {
      return wu.a(new xr($$0, null, xr.a));
   }

   static wu a(String $$0, Object... $$1) {
      return wu.a(new xr($$0, null, $$1));
   }

   static wu b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!xr.a($$3) && !($$3 instanceof wg)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static wu a(String $$0, @Nullable String $$1) {
      return wu.a(new xr($$0, $$1, xr.a));
   }

   static wu a(String $$0, @Nullable String $$1, Object... $$2) {
      return wu.a(new xr($$0, $$1, $$2));
   }

   static wu i() {
      return wu.a(xn.c);
   }

   static wu d(String $$0) {
      return wu.a(new xk($$0));
   }

   static wu a(String $$0, boolean $$1, Optional<wg> $$2, xi $$3) {
      return wu.a(new xm($$0, $$1, $$2, $$3));
   }

   static wu b(String $$0, String $$1) {
      return wu.a(new xo($$0, $$1));
   }

   static wu a(String $$0, Optional<wg> $$1) {
      return wu.a(new xp($$0, $$1));
   }

   static wg a(Date $$0) {
      return b($$0.toString());
   }

   static wg a(Message $$0) {
      return (wg)($$0 instanceof wg $$1 ? $$1 : b($$0.getString()));
   }

   static wg a(UUID $$0) {
      return b($$0.toString());
   }

   static wg a(ajt $$0) {
      return b($$0.toString());
   }

   static wg a(cye $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static wu b(JsonElement $$0, in.a $$1) {
         return ac.a(wi.a.parse($$1.a(JsonOps.INSTANCE), $$0), JsonParseException::new);
      }

      static JsonElement b(wg $$0, in.a $$1) {
         return ac.a(wi.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0), JsonParseException::new);
      }

      public static String a(wg $$0, in.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static wu a(String $$0, in.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static wu a(@Nullable JsonElement $$0, in.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static wu b(String $$0, in.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<wu>, JsonSerializer<wg> {
      private final in.a a;

      public b(in.a $$0) {
         this.a = $$0;
      }

      public wu a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return wg.a.b($$0, this.a);
      }

      public JsonElement a(wg $$0, Type $$1, JsonSerializationContext $$2) {
         return wg.a.b($$0, this.a);
      }
   }
}
