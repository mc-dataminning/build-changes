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

public interface vf extends Message, vk {
   wc a();

   vg b();

   @Override
   default String getString() {
      return vk.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((vk.a)($$2 -> {
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

   List<vf> c();

   @Nullable
   default String d() {
      if (this.b() instanceof wm $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default vt e() {
      return vt.a(this.b());
   }

   default vt f() {
      return new vt(this.b(), new ArrayList<>(this.c()), this.a());
   }

   aua g();

   @Override
   default <T> Optional<T> a(vk.b<T> $$0, wc $$1) {
      wc $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (vf $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(vk.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (vf $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<vf> h() {
      return this.a(wc.a);
   }

   default List<vf> a(wc $$0) {
      List<vf> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(vf $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<vf> $$1 = this.h();
         List<vf> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static vf a(@Nullable String $$0) {
      return (vf)($$0 != null ? b($$0) : ve.a);
   }

   static vt b(String $$0) {
      return vt.a(wm.a($$0));
   }

   static vt c(String $$0) {
      return vt.a(new wq($$0, null, wq.a));
   }

   static vt a(String $$0, Object... $$1) {
      return vt.a(new wq($$0, null, $$1));
   }

   static vt b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!wq.a($$3) && !($$3 instanceof vf)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static vt a(String $$0, @Nullable String $$1) {
      return vt.a(new wq($$0, $$1, wq.a));
   }

   static vt a(String $$0, @Nullable String $$1, Object... $$2) {
      return vt.a(new wq($$0, $$1, $$2));
   }

   static vt i() {
      return vt.a(wm.c);
   }

   static vt d(String $$0) {
      return vt.a(new wj($$0));
   }

   static vt a(String $$0, boolean $$1, Optional<vf> $$2, wh $$3) {
      return vt.a(new wl($$0, $$1, $$2, $$3));
   }

   static vt b(String $$0, String $$1) {
      return vt.a(new wn($$0, $$1));
   }

   static vt a(String $$0, Optional<vf> $$1) {
      return vt.a(new wo($$0, $$1));
   }

   static vf a(Date $$0) {
      return b($$0.toString());
   }

   static vf a(Message $$0) {
      return (vf)($$0 instanceof vf $$1 ? $$1 : b($$0.getString()));
   }

   static vf a(UUID $$0) {
      return b($$0.toString());
   }

   static vf a(ahg $$0) {
      return b($$0.toString());
   }

   static vf a(csw $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static vt b(JsonElement $$0) {
         return ac.a(vh.a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      static JsonElement c(vf $$0) {
         return ac.a(vh.a.encodeStart(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      public static String a(vf $$0) {
         return a.toJson(c($$0));
      }

      public static JsonElement b(vf $$0) {
         return c($$0);
      }

      @Nullable
      public static vt a(String $$0) {
         JsonElement $$1 = JsonParser.parseString($$0);
         return $$1 == null ? null : b($$1);
      }

      @Nullable
      public static vt a(@Nullable JsonElement $$0) {
         return $$0 == null ? null : b($$0);
      }

      @Nullable
      public static vt b(String $$0) {
         JsonReader $$1 = new JsonReader(new StringReader($$0));
         $$1.setLenient(true);
         JsonElement $$2 = JsonParser.parseReader($$1);
         return $$2 == null ? null : b($$2);
      }
   }

   public static class b implements JsonDeserializer<vt>, JsonSerializer<vf> {
      public vt a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return vf.a.b($$0);
      }

      public JsonElement a(vf $$0, Type $$1, JsonSerializationContext $$2) {
         return vf.a.c($$0);
      }
   }
}
