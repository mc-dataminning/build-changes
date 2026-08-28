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

public interface xo extends Message, xt {
   yl a();

   xp b();

   @Override
   default String getString() {
      return xt.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xt.a)($$2 -> {
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

   List<xo> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yv $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default yc e() {
      return yc.a(this.b());
   }

   default yc f() {
      return new yc(this.b(), new ArrayList<>(this.c()), this.a());
   }

   ayk g();

   @Override
   default <T> Optional<T> a(xt.b<T> $$0, yl $$1) {
      yl $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xo $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xt.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xo $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xo> h() {
      return this.a(yl.a);
   }

   default List<xo> a(yl $$0) {
      List<xo> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xo $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xo> $$1 = this.h();
         List<xo> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xo a(@Nullable String $$0) {
      return (xo)($$0 != null ? b($$0) : xn.a);
   }

   static yc b(String $$0) {
      return yc.a(yv.a($$0));
   }

   static yc c(String $$0) {
      return yc.a(new yz($$0, null, yz.a));
   }

   static yc a(String $$0, Object... $$1) {
      return yc.a(new yz($$0, null, $$1));
   }

   static yc b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yz.a($$3) && !($$3 instanceof xo)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static yc a(String $$0, @Nullable String $$1) {
      return yc.a(new yz($$0, $$1, yz.a));
   }

   static yc a(String $$0, @Nullable String $$1, Object... $$2) {
      return yc.a(new yz($$0, $$1, $$2));
   }

   static yc i() {
      return yc.a(yv.c);
   }

   static yc d(String $$0) {
      return yc.a(new ys($$0));
   }

   static yc a(String $$0, boolean $$1, Optional<xo> $$2, yq $$3) {
      return yc.a(new yu($$0, $$1, $$2, $$3));
   }

   static yc b(String $$0, String $$1) {
      return yc.a(new yw($$0, $$1));
   }

   static yc a(String $$0, Optional<xo> $$1) {
      return yc.a(new yx($$0, $$1));
   }

   static xo a(Date $$0) {
      return b($$0.toString());
   }

   static xo a(Message $$0) {
      return (xo)($$0 instanceof xo $$1 ? $$1 : b($$0.getString()));
   }

   static xo a(UUID $$0) {
      return b($$0.toString());
   }

   static xo a(ale $$0) {
      return b($$0.toString());
   }

   static xo a(dbe $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static yc b(JsonElement $$0, jk.a $$1) {
         return (yc)xq.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(xo $$0, jk.a $$1) {
         return (JsonElement)xq.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(xo $$0, jk.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static yc a(String $$0, jk.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static yc a(@Nullable JsonElement $$0, jk.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static yc b(String $$0, jk.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<yc>, JsonSerializer<xo> {
      private final jk.a a;

      public b(jk.a $$0) {
         this.a = $$0;
      }

      public yc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return xo.a.b($$0, this.a);
      }

      public JsonElement a(xo $$0, Type $$1, JsonSerializationContext $$2) {
         return xo.a.b($$0, this.a);
      }
   }
}
