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

public interface xh extends Message, xm {
   ye a();

   xi b();

   @Override
   default String getString() {
      return xm.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xm.a)($$2 -> {
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

   List<xh> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yo $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default xv e() {
      return xv.a(this.b());
   }

   default xv f() {
      return new xv(this.b(), new ArrayList<>(this.c()), this.a());
   }

   ayv g();

   @Override
   default <T> Optional<T> a(xm.b<T> $$0, ye $$1) {
      ye $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xh $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xm.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xh $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xh> h() {
      return this.a(ye.a);
   }

   default List<xh> a(ye $$0) {
      List<xh> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xh $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xh> $$1 = this.h();
         List<xh> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xh a(@Nullable String $$0) {
      return (xh)($$0 != null ? b($$0) : xg.a);
   }

   static xv b(String $$0) {
      return xv.a(yo.a($$0));
   }

   static xv c(String $$0) {
      return xv.a(new ys($$0, null, ys.a));
   }

   static xv a(String $$0, Object... $$1) {
      return xv.a(new ys($$0, null, $$1));
   }

   static xv b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!ys.a($$3) && !($$3 instanceof xh)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xv a(String $$0, @Nullable String $$1) {
      return xv.a(new ys($$0, $$1, ys.a));
   }

   static xv a(String $$0, @Nullable String $$1, Object... $$2) {
      return xv.a(new ys($$0, $$1, $$2));
   }

   static xv i() {
      return xv.a(yo.c);
   }

   static xv d(String $$0) {
      return xv.a(new yl($$0));
   }

   static xv a(String $$0, boolean $$1, Optional<xh> $$2, yj $$3) {
      return xv.a(new yn($$0, $$1, $$2, $$3));
   }

   static xv a(hm $$0, String $$1) {
      return xv.a(new yp(Either.left($$0), $$1));
   }

   static xv b(String $$0, String $$1) {
      return xv.a(new yp(Either.right($$0), $$1));
   }

   static xv a(hm $$0, Optional<xh> $$1) {
      return xv.a(new yq($$0, $$1));
   }

   static xh a(Date $$0) {
      return b($$0.toString());
   }

   static xh a(Message $$0) {
      return (xh)($$0 instanceof xh $$1 ? $$1 : b($$0.getString()));
   }

   static xh a(UUID $$0) {
      return b($$0.toString());
   }

   static xh a(alh $$0) {
      return b($$0.toString());
   }

   static xh a(deb $$0) {
      return b($$0.toString());
   }

   static xh a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xv b(JsonElement $$0, jr.a $$1) {
         return (xv)xj.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(xh $$0, jr.a $$1) {
         return (JsonElement)xj.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(xh $$0, jr.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xv a(String $$0, jr.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xv a(@Nullable JsonElement $$0, jr.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xv b(String $$0, jr.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xv>, JsonSerializer<xh> {
      private final jr.a a;

      public b(jr.a $$0) {
         this.a = $$0;
      }

      public xv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return xh.a.b($$0, this.a);
      }

      public JsonElement a(xh $$0, Type $$1, JsonSerializationContext $$2) {
         return xh.a.b($$0, this.a);
      }
   }
}
