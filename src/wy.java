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

public interface wy extends Message, xd {
   xv a();

   wz b();

   @Override
   default String getString() {
      return xd.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xd.a)($$2 -> {
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

   List<wy> c();

   @Nullable
   default String d() {
      if (this.b() instanceof yf $$0 && this.c().isEmpty() && this.a().h()) {
         return $$0.b();
      }

      return null;
   }

   default xm e() {
      return xm.a(this.b());
   }

   default xm f() {
      return new xm(this.b(), new ArrayList<>(this.c()), this.a());
   }

   ayy g();

   @Override
   default <T> Optional<T> a(xd.b<T> $$0, xv $$1) {
      xv $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (wy $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xd.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (wy $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<wy> h() {
      return this.a(xv.a);
   }

   default List<wy> a(xv $$0) {
      List<wy> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(wy $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<wy> $$1 = this.h();
         List<wy> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static wy a(@Nullable String $$0) {
      return (wy)($$0 != null ? b($$0) : wx.a);
   }

   static xm b(String $$0) {
      return xm.a(yf.a($$0));
   }

   static xm c(String $$0) {
      return xm.a(new yj($$0, null, yj.a));
   }

   static xm a(String $$0, Object... $$1) {
      return xm.a(new yj($$0, null, $$1));
   }

   static xm b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yj.a($$3) && !($$3 instanceof wy)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xm a(String $$0, @Nullable String $$1) {
      return xm.a(new yj($$0, $$1, yj.a));
   }

   static xm a(String $$0, @Nullable String $$1, Object... $$2) {
      return xm.a(new yj($$0, $$1, $$2));
   }

   static xm i() {
      return xm.a(yf.c);
   }

   static xm d(String $$0) {
      return xm.a(new yc($$0));
   }

   static xm a(String $$0, boolean $$1, Optional<wy> $$2, ya $$3) {
      return xm.a(new ye($$0, $$1, $$2, $$3));
   }

   static xm a(ha $$0, String $$1) {
      return xm.a(new yg(Either.left($$0), $$1));
   }

   static xm b(String $$0, String $$1) {
      return xm.a(new yg(Either.right($$0), $$1));
   }

   static xm a(ha $$0, Optional<wy> $$1) {
      return xm.a(new yh($$0, $$1));
   }

   static wy a(Date $$0) {
      return b($$0.toString());
   }

   static wy a(Message $$0) {
      return (wy)($$0 instanceof wy $$1 ? $$1 : b($$0.getString()));
   }

   static wy a(UUID $$0) {
      return b($$0.toString());
   }

   static wy a(alg $$0) {
      return b($$0.toString());
   }

   static wy a(dic $$0) {
      return b($$0.toString());
   }

   static wy a(URI $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xm b(JsonElement $$0, jg.a $$1) {
         return (xm)xa.a.parse($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      static JsonElement b(wy $$0, jg.a $$1) {
         return (JsonElement)xa.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0).getOrThrow(JsonParseException::new);
      }

      public static String a(wy $$0, jg.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xm a(String $$0, jg.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xm a(@Nullable JsonElement $$0, jg.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xm b(String $$0, jg.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xm>, JsonSerializer<wy> {
      private final jg.a a;

      public b(jg.a $$0) {
         this.a = $$0;
      }

      public xm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return wy.a.b($$0, this.a);
      }

      public JsonElement a(wy $$0, Type $$1, JsonSerializationContext $$2) {
         return wy.a.b($$0, this.a);
      }
   }
}
