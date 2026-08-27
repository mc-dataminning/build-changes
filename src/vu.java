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

public interface vu extends Message, vz {
   wr a();

   vv b();

   @Override
   default String getString() {
      return vz.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((vz.a)($$2 -> {
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

   List<vu> c();

   @Nullable
   default String d() {
      if (this.b() instanceof xb $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default wi e() {
      return wi.a(this.b());
   }

   default wi f() {
      return new wi(this.b(), new ArrayList<>(this.c()), this.a());
   }

   awi g();

   @Override
   default <T> Optional<T> a(vz.b<T> $$0, wr $$1) {
      wr $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (vu $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(vz.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (vu $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<vu> h() {
      return this.a(wr.a);
   }

   default List<vu> a(wr $$0) {
      List<vu> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(vu $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<vu> $$1 = this.h();
         List<vu> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static vu a(@Nullable String $$0) {
      return (vu)($$0 != null ? b($$0) : vt.a);
   }

   static wi b(String $$0) {
      return wi.a(xb.a($$0));
   }

   static wi c(String $$0) {
      return wi.a(new xf($$0, null, xf.a));
   }

   static wi a(String $$0, Object... $$1) {
      return wi.a(new xf($$0, null, $$1));
   }

   static wi b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!xf.a($$3) && !($$3 instanceof vu)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static wi a(String $$0, @Nullable String $$1) {
      return wi.a(new xf($$0, $$1, xf.a));
   }

   static wi a(String $$0, @Nullable String $$1, Object... $$2) {
      return wi.a(new xf($$0, $$1, $$2));
   }

   static wi i() {
      return wi.a(xb.c);
   }

   static wi d(String $$0) {
      return wi.a(new wy($$0));
   }

   static wi a(String $$0, boolean $$1, Optional<vu> $$2, ww $$3) {
      return wi.a(new xa($$0, $$1, $$2, $$3));
   }

   static wi b(String $$0, String $$1) {
      return wi.a(new xc($$0, $$1));
   }

   static wi a(String $$0, Optional<vu> $$1) {
      return wi.a(new xd($$0, $$1));
   }

   static vu a(Date $$0) {
      return b($$0.toString());
   }

   static vu a(Message $$0) {
      return (vu)($$0 instanceof vu $$1 ? $$1 : b($$0.getString()));
   }

   static vu a(UUID $$0) {
      return b($$0.toString());
   }

   static vu a(ajh $$0) {
      return b($$0.toString());
   }

   static vu a(cwg $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static wi b(JsonElement $$0) {
         return ac.a(vw.a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      static JsonElement c(vu $$0) {
         return ac.a(vw.a.encodeStart(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      public static String a(vu $$0) {
         return a.toJson(c($$0));
      }

      public static JsonElement b(vu $$0) {
         return c($$0);
      }

      @Nullable
      public static wi a(String $$0) {
         JsonElement $$1 = JsonParser.parseString($$0);
         return $$1 == null ? null : b($$1);
      }

      @Nullable
      public static wi a(@Nullable JsonElement $$0) {
         return $$0 == null ? null : b($$0);
      }

      @Nullable
      public static wi b(String $$0) {
         JsonReader $$1 = new JsonReader(new StringReader($$0));
         $$1.setLenient(true);
         JsonElement $$2 = JsonParser.parseReader($$1);
         return $$2 == null ? null : b($$2);
      }
   }

   public static class b implements JsonDeserializer<wi>, JsonSerializer<vu> {
      public wi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return vu.a.b($$0);
      }

      public JsonElement a(vu $$0, Type $$1, JsonSerializationContext $$2) {
         return vu.a.c($$0);
      }
   }
}
