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

public interface xp extends Message, xu {
   ym a();

   xq b();

   @Override
   default String getString() {
      return xu.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xu.a)($$2 -> {
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

   List<xp> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yw $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default yd e() {
      return yd.a(this.b());
   }

   default yd f() {
      return new yd(this.b(), new ArrayList<>(this.c()), this.a());
   }

   ayl g();

   @Override
   default <T> Optional<T> a(xu.b<T> $$0, ym $$1) {
      ym $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xp $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xu.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xp $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xp> h() {
      return this.a(ym.a);
   }

   default List<xp> a(ym $$0) {
      List<xp> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xp $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xp> $$1 = this.h();
         List<xp> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xp a(@Nullable String $$0) {
      return (xp)($$0 != null ? b($$0) : xo.a);
   }

   static yd b(String $$0) {
      return yd.a(yw.a($$0));
   }

   static yd c(String $$0) {
      return yd.a(new za($$0, null, za.a));
   }

   static yd a(String $$0, Object... $$1) {
      return yd.a(new za($$0, null, $$1));
   }

   static yd b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!za.a($$3) && !($$3 instanceof xp)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static yd a(String $$0, @Nullable String $$1) {
      return yd.a(new za($$0, $$1, za.a));
   }

   static yd a(String $$0, @Nullable String $$1, Object... $$2) {
      return yd.a(new za($$0, $$1, $$2));
   }

   static yd i() {
      return yd.a(yw.c);
   }

   static yd d(String $$0) {
      return yd.a(new yt($$0));
   }

   static yd a(String $$0, boolean $$1, Optional<xp> $$2, yr $$3) {
      return yd.a(new yv($$0, $$1, $$2, $$3));
   }

   static yd b(String $$0, String $$1) {
      return yd.a(new yx($$0, $$1));
   }

   static yd a(String $$0, Optional<xp> $$1) {
      return yd.a(new yy($$0, $$1));
   }

   static xp a(Date $$0) {
      return b($$0.toString());
   }

   static xp a(Message $$0) {
      return (xp)($$0 instanceof xp $$1 ? $$1 : b($$0.getString()));
   }

   static xp a(UUID $$0) {
      return b($$0.toString());
   }

   static xp a(alf $$0) {
      return b($$0.toString());
   }

   static xp a(dbg $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static yd b(JsonElement $$0, jk.a $$1) {
         return (yd)xr.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(xp $$0, jk.a $$1) {
         return (JsonElement)xr.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(xp $$0, jk.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static yd a(String $$0, jk.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static yd a(@Nullable JsonElement $$0, jk.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static yd b(String $$0, jk.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<yd>, JsonSerializer<xp> {
      private final jk.a a;

      public b(jk.a $$0) {
         this.a = $$0;
      }

      public yd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return xp.a.b($$0, this.a);
      }

      public JsonElement a(xp $$0, Type $$1, JsonSerializationContext $$2) {
         return xp.a.b($$0, this.a);
      }
   }
}
