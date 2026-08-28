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

public interface xc extends Message, xh {
   xz a();

   xd b();

   @Override
   default String getString() {
      return xh.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xh.a)($$2 -> {
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

   List<xc> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yj $$0 && this.c().isEmpty() && this.a().h()) {
         return $$0.b();
      }

      return null;
   }

   default xq e() {
      return xq.a(this.b());
   }

   default xq f() {
      return new xq(this.b(), new ArrayList<>(this.c()), this.a());
   }

   azc g();

   @Override
   default <T> Optional<T> a(xh.b<T> $$0, xz $$1) {
      xz $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xc $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xh.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xc $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xc> h() {
      return this.a(xz.a);
   }

   default List<xc> a(xz $$0) {
      List<xc> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xc $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xc> $$1 = this.h();
         List<xc> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xc a(@Nullable String $$0) {
      return (xc)($$0 != null ? b($$0) : xb.a);
   }

   static xq b(String $$0) {
      return xq.a(yj.a($$0));
   }

   static xq c(String $$0) {
      return xq.a(new yn($$0, null, yn.a));
   }

   static xq a(String $$0, Object... $$1) {
      return xq.a(new yn($$0, null, $$1));
   }

   static xq b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yn.a($$3) && !($$3 instanceof xc)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xq a(String $$0, @Nullable String $$1) {
      return xq.a(new yn($$0, $$1, yn.a));
   }

   static xq a(String $$0, @Nullable String $$1, Object... $$2) {
      return xq.a(new yn($$0, $$1, $$2));
   }

   static xq i() {
      return xq.a(yj.c);
   }

   static xq d(String $$0) {
      return xq.a(new yg($$0));
   }

   static xq a(String $$0, boolean $$1, Optional<xc> $$2, ye $$3) {
      return xq.a(new yi($$0, $$1, $$2, $$3));
   }

   static xq a(hc $$0, String $$1) {
      return xq.a(new yk(Either.left($$0), $$1));
   }

   static xq b(String $$0, String $$1) {
      return xq.a(new yk(Either.right($$0), $$1));
   }

   static xq a(hc $$0, Optional<xc> $$1) {
      return xq.a(new yl($$0, $$1));
   }

   static xc a(Date $$0) {
      return b($$0.toString());
   }

   static xc a(Message $$0) {
      return (xc)($$0 instanceof xc $$1 ? $$1 : b($$0.getString()));
   }

   static xc a(UUID $$0) {
      return b($$0.toString());
   }

   static xc a(alk $$0) {
      return b($$0.toString());
   }

   static xc a(dje $$0) {
      return b($$0.toString());
   }

   static xc a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xq b(JsonElement $$0, ji.a $$1) {
         return (xq)xe.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(xc $$0, ji.a $$1) {
         return (JsonElement)xe.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(xc $$0, ji.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xq a(String $$0, ji.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xq a(@Nullable JsonElement $$0, ji.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xq b(String $$0, ji.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xq>, JsonSerializer<xc> {
      private final ji.a a;

      public b(ji.a $$0) {
         this.a = $$0;
      }

      public xq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return xc.a.b($$0, this.a);
      }

      public JsonElement a(xc $$0, Type $$1, JsonSerializationContext $$2) {
         return xc.a.b($$0, this.a);
      }
   }
}
