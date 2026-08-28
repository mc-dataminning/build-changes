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

public interface wv extends Message, xa {
   xs a();

   ww b();

   @Override
   default String getString() {
      return xa.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xa.a)($$2 -> {
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

   List<wv> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yc $$0 && this.c().isEmpty() && this.a().h()) {
         return $$0.b();
      }

      return null;
   }

   default xj e() {
      return xj.a(this.b());
   }

   default xj f() {
      return new xj(this.b(), new ArrayList<>(this.c()), this.a());
   }

   ayw g();

   @Override
   default <T> Optional<T> a(xa.b<T> $$0, xs $$1) {
      xs $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (wv $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xa.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (wv $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<wv> h() {
      return this.a(xs.a);
   }

   default List<wv> a(xs $$0) {
      List<wv> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(wv $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<wv> $$1 = this.h();
         List<wv> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static wv a(@Nullable String $$0) {
      return (wv)($$0 != null ? b($$0) : wu.a);
   }

   static xj b(String $$0) {
      return xj.a(yc.a($$0));
   }

   static xj c(String $$0) {
      return xj.a(new yg($$0, null, yg.a));
   }

   static xj a(String $$0, Object... $$1) {
      return xj.a(new yg($$0, null, $$1));
   }

   static xj b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yg.a($$3) && !($$3 instanceof wv)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xj a(String $$0, @Nullable String $$1) {
      return xj.a(new yg($$0, $$1, yg.a));
   }

   static xj a(String $$0, @Nullable String $$1, Object... $$2) {
      return xj.a(new yg($$0, $$1, $$2));
   }

   static xj i() {
      return xj.a(yc.c);
   }

   static xj d(String $$0) {
      return xj.a(new xz($$0));
   }

   static xj a(String $$0, boolean $$1, Optional<wv> $$2, xx $$3) {
      return xj.a(new yb($$0, $$1, $$2, $$3));
   }

   static xj a(hp $$0, String $$1) {
      return xj.a(new yd(Either.left($$0), $$1));
   }

   static xj b(String $$0, String $$1) {
      return xj.a(new yd(Either.right($$0), $$1));
   }

   static xj a(hp $$0, Optional<wv> $$1) {
      return xj.a(new ye($$0, $$1));
   }

   static wv a(Date $$0) {
      return b($$0.toString());
   }

   static wv a(Message $$0) {
      return (wv)($$0 instanceof wv $$1 ? $$1 : b($$0.getString()));
   }

   static wv a(UUID $$0) {
      return b($$0.toString());
   }

   static wv a(ald $$0) {
      return b($$0.toString());
   }

   static wv a(dgw $$0) {
      return b($$0.toString());
   }

   static wv a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xj b(JsonElement $$0, ju.a $$1) {
         return (xj)wx.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(wv $$0, ju.a $$1) {
         return (JsonElement)wx.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(wv $$0, ju.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xj a(String $$0, ju.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xj a(@Nullable JsonElement $$0, ju.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xj b(String $$0, ju.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xj>, JsonSerializer<wv> {
      private final ju.a a;

      public b(ju.a $$0) {
         this.a = $$0;
      }

      public xj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return wv.a.b($$0, this.a);
      }

      public JsonElement a(wv $$0, Type $$1, JsonSerializationContext $$2) {
         return wv.a.b($$0, this.a);
      }
   }
}
