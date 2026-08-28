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

public interface xa extends Message, xf {
   xx a();

   xb b();

   @Override
   default String getString() {
      return xf.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xf.a)($$2 -> {
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

   List<xa> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yh $$0 && this.c().isEmpty() && this.a().h()) {
         return $$0.b();
      }

      return null;
   }

   default xo e() {
      return xo.a(this.b());
   }

   default xo f() {
      return new xo(this.b(), new ArrayList<>(this.c()), this.a());
   }

   aza g();

   @Override
   default <T> Optional<T> a(xf.b<T> $$0, xx $$1) {
      xx $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xa $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xf.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xa $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xa> h() {
      return this.a(xx.a);
   }

   default List<xa> a(xx $$0) {
      List<xa> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xa $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xa> $$1 = this.h();
         List<xa> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xa a(@Nullable String $$0) {
      return (xa)($$0 != null ? b($$0) : wz.a);
   }

   static xo b(String $$0) {
      return xo.a(yh.a($$0));
   }

   static xo c(String $$0) {
      return xo.a(new yl($$0, null, yl.a));
   }

   static xo a(String $$0, Object... $$1) {
      return xo.a(new yl($$0, null, $$1));
   }

   static xo b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yl.a($$3) && !($$3 instanceof xa)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xo a(String $$0, @Nullable String $$1) {
      return xo.a(new yl($$0, $$1, yl.a));
   }

   static xo a(String $$0, @Nullable String $$1, Object... $$2) {
      return xo.a(new yl($$0, $$1, $$2));
   }

   static xo i() {
      return xo.a(yh.c);
   }

   static xo d(String $$0) {
      return xo.a(new ye($$0));
   }

   static xo a(String $$0, boolean $$1, Optional<xa> $$2, yc $$3) {
      return xo.a(new yg($$0, $$1, $$2, $$3));
   }

   static xo a(hb $$0, String $$1) {
      return xo.a(new yi(Either.left($$0), $$1));
   }

   static xo b(String $$0, String $$1) {
      return xo.a(new yi(Either.right($$0), $$1));
   }

   static xo a(hb $$0, Optional<xa> $$1) {
      return xo.a(new yj($$0, $$1));
   }

   static xa a(Date $$0) {
      return b($$0.toString());
   }

   static xa a(Message $$0) {
      return (xa)($$0 instanceof xa $$1 ? $$1 : b($$0.getString()));
   }

   static xa a(UUID $$0) {
      return b($$0.toString());
   }

   static xa a(ali $$0) {
      return b($$0.toString());
   }

   static xa a(djc $$0) {
      return b($$0.toString());
   }

   static xa a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xo b(JsonElement $$0, jh.a $$1) {
         return (xo)xc.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(xa $$0, jh.a $$1) {
         return (JsonElement)xc.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(xa $$0, jh.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xo a(String $$0, jh.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xo a(@Nullable JsonElement $$0, jh.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xo b(String $$0, jh.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xo>, JsonSerializer<xa> {
      private final jh.a a;

      public b(jh.a $$0) {
         this.a = $$0;
      }

      public xo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return xa.a.b($$0, this.a);
      }

      public JsonElement a(xa $$0, Type $$1, JsonSerializationContext $$2) {
         return xa.a.b($$0, this.a);
      }
   }
}
