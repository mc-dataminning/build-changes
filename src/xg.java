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

public interface xg extends Message, xl {
   yd a();

   xh b();

   @Override
   default String getString() {
      return xl.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xl.a)($$2 -> {
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

   List<xg> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yn $$0 && this.c().isEmpty() && this.a().h()) {
         return $$0.b();
      }

      return null;
   }

   default xu e() {
      return xu.a(this.b());
   }

   default xu f() {
      return new xu(this.b(), new ArrayList<>(this.c()), this.a());
   }

   azk g();

   @Override
   default <T> Optional<T> a(xl.b<T> $$0, yd $$1) {
      yd $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xg $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xl.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xg $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xg> h() {
      return this.a(yd.a);
   }

   default List<xg> a(yd $$0) {
      List<xg> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xg $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xg> $$1 = this.h();
         List<xg> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xg a(@Nullable String $$0) {
      return (xg)($$0 != null ? b($$0) : xf.a);
   }

   static xu b(String $$0) {
      return xu.a(yn.a($$0));
   }

   static xu c(String $$0) {
      return xu.a(new yr($$0, null, yr.a));
   }

   static xu a(String $$0, Object... $$1) {
      return xu.a(new yr($$0, null, $$1));
   }

   static xu b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yr.a($$3) && !($$3 instanceof xg)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xu a(String $$0, @Nullable String $$1) {
      return xu.a(new yr($$0, $$1, yr.a));
   }

   static xu a(String $$0, @Nullable String $$1, Object... $$2) {
      return xu.a(new yr($$0, $$1, $$2));
   }

   static xu i() {
      return xu.a(yn.c);
   }

   static xu d(String $$0) {
      return xu.a(new yk($$0));
   }

   static xu a(String $$0, boolean $$1, Optional<xg> $$2, yi $$3) {
      return xu.a(new ym($$0, $$1, $$2, $$3));
   }

   static xu a(hc $$0, String $$1) {
      return xu.a(new yo(Either.left($$0), $$1));
   }

   static xu b(String $$0, String $$1) {
      return xu.a(new yo(Either.right($$0), $$1));
   }

   static xu a(hc $$0, Optional<xg> $$1) {
      return xu.a(new yp($$0, $$1));
   }

   static xg a(Date $$0) {
      return b($$0.toString());
   }

   static xg a(Message $$0) {
      return (xg)($$0 instanceof xg $$1 ? $$1 : b($$0.getString()));
   }

   static xg a(UUID $$0) {
      return b($$0.toString());
   }

   static xg a(alr $$0) {
      return b($$0.toString());
   }

   static xg a(djo $$0) {
      return b($$0.toString());
   }

   static xg a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xu b(JsonElement $$0, ji.a $$1) {
         return (xu)xi.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(xg $$0, ji.a $$1) {
         return (JsonElement)xi.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(xg $$0, ji.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xu a(String $$0, ji.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xu a(@Nullable JsonElement $$0, ji.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xu b(String $$0, ji.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xu>, JsonSerializer<xg> {
      private final ji.a a;

      public b(ji.a $$0) {
         this.a = $$0;
      }

      public xu a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return xg.a.b($$0, this.a);
      }

      public JsonElement a(xg $$0, Type $$1, JsonSerializationContext $$2) {
         return xg.a.b($$0, this.a);
      }
   }
}
