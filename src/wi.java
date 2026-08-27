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

public interface wi extends Message, wn {
   xf a();

   wj b();

   @Override
   default String getString() {
      return wn.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((wn.a)($$2 -> {
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

   List<wi> c();

   @Nullable
   default String d() {
      if (this.b() instanceof xp $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default ww e() {
      return ww.a(this.b());
   }

   default ww f() {
      return new ww(this.b(), new ArrayList<>(this.c()), this.a());
   }

   awy g();

   @Override
   default <T> Optional<T> a(wn.b<T> $$0, xf $$1) {
      xf $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (wi $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(wn.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (wi $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<wi> h() {
      return this.a(xf.a);
   }

   default List<wi> a(xf $$0) {
      List<wi> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(wi $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<wi> $$1 = this.h();
         List<wi> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static wi a(@Nullable String $$0) {
      return (wi)($$0 != null ? b($$0) : wh.a);
   }

   static ww b(String $$0) {
      return ww.a(xp.a($$0));
   }

   static ww c(String $$0) {
      return ww.a(new xt($$0, null, xt.a));
   }

   static ww a(String $$0, Object... $$1) {
      return ww.a(new xt($$0, null, $$1));
   }

   static ww b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!xt.a($$3) && !($$3 instanceof wi)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static ww a(String $$0, @Nullable String $$1) {
      return ww.a(new xt($$0, $$1, xt.a));
   }

   static ww a(String $$0, @Nullable String $$1, Object... $$2) {
      return ww.a(new xt($$0, $$1, $$2));
   }

   static ww i() {
      return ww.a(xp.c);
   }

   static ww d(String $$0) {
      return ww.a(new xm($$0));
   }

   static ww a(String $$0, boolean $$1, Optional<wi> $$2, xk $$3) {
      return ww.a(new xo($$0, $$1, $$2, $$3));
   }

   static ww b(String $$0, String $$1) {
      return ww.a(new xq($$0, $$1));
   }

   static ww a(String $$0, Optional<wi> $$1) {
      return ww.a(new xr($$0, $$1));
   }

   static wi a(Date $$0) {
      return b($$0.toString());
   }

   static wi a(Message $$0) {
      return (wi)($$0 instanceof wi $$1 ? $$1 : b($$0.getString()));
   }

   static wi a(UUID $$0) {
      return b($$0.toString());
   }

   static wi a(ajv $$0) {
      return b($$0.toString());
   }

   static wi a(cyn $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static ww b(JsonElement $$0, ip.a $$1) {
         return ac.a(wk.a.parse($$1.a(JsonOps.INSTANCE), $$0), JsonParseException::new);
      }

      static JsonElement b(wi $$0, ip.a $$1) {
         return ac.a(wk.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0), JsonParseException::new);
      }

      public static String a(wi $$0, ip.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static ww a(String $$0, ip.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static ww a(@Nullable JsonElement $$0, ip.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static ww b(String $$0, ip.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<ww>, JsonSerializer<wi> {
      private final ip.a a;

      public b(ip.a $$0) {
         this.a = $$0;
      }

      public ww a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return wi.a.b($$0, this.a);
      }

      public JsonElement a(wi $$0, Type $$1, JsonSerializationContext $$2) {
         return wi.a.b($$0, this.a);
      }
   }
}
