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

public interface vs extends Message, vx {
   wp a();

   vt b();

   @Override
   default String getString() {
      return vx.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((vx.a)($$2 -> {
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

   List<vs> c();

   @Nullable
   default String d() {
      if (this.b() instanceof wz $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default wg e() {
      return wg.a(this.b());
   }

   default wg f() {
      return new wg(this.b(), new ArrayList<>(this.c()), this.a());
   }

   avy g();

   @Override
   default <T> Optional<T> a(vx.b<T> $$0, wp $$1) {
      wp $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (vs $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(vx.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (vs $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<vs> h() {
      return this.a(wp.a);
   }

   default List<vs> a(wp $$0) {
      List<vs> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(vs $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<vs> $$1 = this.h();
         List<vs> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static vs a(@Nullable String $$0) {
      return (vs)($$0 != null ? b($$0) : vr.a);
   }

   static wg b(String $$0) {
      return wg.a(wz.a($$0));
   }

   static wg c(String $$0) {
      return wg.a(new xd($$0, null, xd.a));
   }

   static wg a(String $$0, Object... $$1) {
      return wg.a(new xd($$0, null, $$1));
   }

   static wg b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!xd.a($$3) && !($$3 instanceof vs)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static wg a(String $$0, @Nullable String $$1) {
      return wg.a(new xd($$0, $$1, xd.a));
   }

   static wg a(String $$0, @Nullable String $$1, Object... $$2) {
      return wg.a(new xd($$0, $$1, $$2));
   }

   static wg i() {
      return wg.a(wz.c);
   }

   static wg d(String $$0) {
      return wg.a(new ww($$0));
   }

   static wg a(String $$0, boolean $$1, Optional<vs> $$2, wu $$3) {
      return wg.a(new wy($$0, $$1, $$2, $$3));
   }

   static wg b(String $$0, String $$1) {
      return wg.a(new xa($$0, $$1));
   }

   static wg a(String $$0, Optional<vs> $$1) {
      return wg.a(new xb($$0, $$1));
   }

   static vs a(Date $$0) {
      return b($$0.toString());
   }

   static vs a(Message $$0) {
      return (vs)($$0 instanceof vs $$1 ? $$1 : b($$0.getString()));
   }

   static vs a(UUID $$0) {
      return b($$0.toString());
   }

   static vs a(ajc $$0) {
      return b($$0.toString());
   }

   static vs a(cvl $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static wg b(JsonElement $$0) {
         return ac.a(vu.a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      static JsonElement c(vs $$0) {
         return ac.a(vu.a.encodeStart(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      public static String a(vs $$0) {
         return a.toJson(c($$0));
      }

      public static JsonElement b(vs $$0) {
         return c($$0);
      }

      @Nullable
      public static wg a(String $$0) {
         JsonElement $$1 = JsonParser.parseString($$0);
         return $$1 == null ? null : b($$1);
      }

      @Nullable
      public static wg a(@Nullable JsonElement $$0) {
         return $$0 == null ? null : b($$0);
      }

      @Nullable
      public static wg b(String $$0) {
         JsonReader $$1 = new JsonReader(new StringReader($$0));
         $$1.setLenient(true);
         JsonElement $$2 = JsonParser.parseReader($$1);
         return $$2 == null ? null : b($$2);
      }
   }

   public static class b implements JsonDeserializer<wg>, JsonSerializer<vs> {
      public wg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return vs.a.b($$0);
      }

      public JsonElement a(vs $$0, Type $$1, JsonSerializationContext $$2) {
         return vs.a.c($$0);
      }
   }
}
