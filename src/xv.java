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

public interface xv extends Message, ya {
   ys a();

   xw b();

   @Override
   default String getString() {
      return ya.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((ya.a)($$2 -> {
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

   List<xv> c();

   @Nullable
   default String d() {
      if (this.b() instanceof zc $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default yj e() {
      return yj.a(this.b());
   }

   default yj f() {
      return new yj(this.b(), new ArrayList<>(this.c()), this.a());
   }

   azq g();

   @Override
   default <T> Optional<T> a(ya.b<T> $$0, ys $$1) {
      ys $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xv $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(ya.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xv $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xv> h() {
      return this.a(ys.a);
   }

   default List<xv> a(ys $$0) {
      List<xv> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xv $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xv> $$1 = this.h();
         List<xv> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xv a(@Nullable String $$0) {
      return (xv)($$0 != null ? b($$0) : xu.a);
   }

   static yj b(String $$0) {
      return yj.a(zc.a($$0));
   }

   static yj c(String $$0) {
      return yj.a(new zg($$0, null, zg.a));
   }

   static yj a(String $$0, Object... $$1) {
      return yj.a(new zg($$0, null, $$1));
   }

   static yj b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!zg.a($$3) && !($$3 instanceof xv)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static yj a(String $$0, @Nullable String $$1) {
      return yj.a(new zg($$0, $$1, zg.a));
   }

   static yj a(String $$0, @Nullable String $$1, Object... $$2) {
      return yj.a(new zg($$0, $$1, $$2));
   }

   static yj i() {
      return yj.a(zc.c);
   }

   static yj d(String $$0) {
      return yj.a(new yz($$0));
   }

   static yj a(String $$0, boolean $$1, Optional<xv> $$2, yx $$3) {
      return yj.a(new zb($$0, $$1, $$2, $$3));
   }

   static yj a(hn $$0, String $$1) {
      return yj.a(new zd(Either.left($$0), $$1));
   }

   static yj b(String $$0, String $$1) {
      return yj.a(new zd(Either.right($$0), $$1));
   }

   static yj a(hn $$0, Optional<xv> $$1) {
      return yj.a(new ze($$0, $$1));
   }

   static xv a(Date $$0) {
      return b($$0.toString());
   }

   static xv a(Message $$0) {
      return (xv)($$0 instanceof xv $$1 ? $$1 : b($$0.getString()));
   }

   static xv a(UUID $$0) {
      return b($$0.toString());
   }

   static xv a(alz $$0) {
      return b($$0.toString());
   }

   static xv a(dgg $$0) {
      return b($$0.toString());
   }

   static xv a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static yj b(JsonElement $$0, js.a $$1) {
         return (yj)xx.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(xv $$0, js.a $$1) {
         return (JsonElement)xx.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(xv $$0, js.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static yj a(String $$0, js.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static yj a(@Nullable JsonElement $$0, js.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static yj b(String $$0, js.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<yj>, JsonSerializer<xv> {
      private final js.a a;

      public b(js.a $$0) {
         this.a = $$0;
      }

      public yj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return xv.a.b($$0, this.a);
      }

      public JsonElement a(xv $$0, Type $$1, JsonSerializationContext $$2) {
         return xv.a.b($$0, this.a);
      }
   }
}
