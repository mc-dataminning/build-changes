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

public interface vd extends Message, vi {
   wa a();

   ve b();

   @Override
   default String getString() {
      return vi.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((vi.a)($$2 -> {
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

   List<vd> c();

   @Nullable
   default String d() {
      if (this.b() instanceof wk $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default vr e() {
      return vr.a(this.b());
   }

   default vr f() {
      return new vr(this.b(), new ArrayList<>(this.c()), this.a());
   }

   atu g();

   @Override
   default <T> Optional<T> a(vi.b<T> $$0, wa $$1) {
      wa $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (vd $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(vi.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (vd $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<vd> h() {
      return this.a(wa.a);
   }

   default List<vd> a(wa $$0) {
      List<vd> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(vd $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<vd> $$1 = this.h();
         List<vd> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static vd a(@Nullable String $$0) {
      return (vd)($$0 != null ? b($$0) : vc.a);
   }

   static vr b(String $$0) {
      return vr.a(wk.a($$0));
   }

   static vr c(String $$0) {
      return vr.a(new wo($$0, null, wo.a));
   }

   static vr a(String $$0, Object... $$1) {
      return vr.a(new wo($$0, null, $$1));
   }

   static vr b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!wo.a($$3) && !($$3 instanceof vd)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static vr a(String $$0, @Nullable String $$1) {
      return vr.a(new wo($$0, $$1, wo.a));
   }

   static vr a(String $$0, @Nullable String $$1, Object... $$2) {
      return vr.a(new wo($$0, $$1, $$2));
   }

   static vr i() {
      return vr.a(wk.c);
   }

   static vr d(String $$0) {
      return vr.a(new wh($$0));
   }

   static vr a(String $$0, boolean $$1, Optional<vd> $$2, wf $$3) {
      return vr.a(new wj($$0, $$1, $$2, $$3));
   }

   static vr b(String $$0, String $$1) {
      return vr.a(new wl($$0, $$1));
   }

   static vr a(String $$0, Optional<vd> $$1) {
      return vr.a(new wm($$0, $$1));
   }

   static vd a(Date $$0) {
      return b($$0.toString());
   }

   static vd a(Message $$0) {
      return (vd)($$0 instanceof vd $$1 ? $$1 : b($$0.getString()));
   }

   static vd a(UUID $$0) {
      return b($$0.toString());
   }

   static vd a(ahd $$0) {
      return b($$0.toString());
   }

   static vd a(csp $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static vr b(JsonElement $$0) {
         return ac.a(vf.a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      static JsonElement c(vd $$0) {
         return ac.a(vf.a.encodeStart(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      public static String a(vd $$0) {
         return a.toJson(c($$0));
      }

      public static JsonElement b(vd $$0) {
         return c($$0);
      }

      @Nullable
      public static vr a(String $$0) {
         JsonElement $$1 = JsonParser.parseString($$0);
         return $$1 == null ? null : b($$1);
      }

      @Nullable
      public static vr a(@Nullable JsonElement $$0) {
         return $$0 == null ? null : b($$0);
      }

      @Nullable
      public static vr b(String $$0) {
         JsonReader $$1 = new JsonReader(new StringReader($$0));
         $$1.setLenient(true);
         JsonElement $$2 = JsonParser.parseReader($$1);
         return $$2 == null ? null : b($$2);
      }
   }

   public static class b implements JsonDeserializer<vr>, JsonSerializer<vd> {
      public vr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return vd.a.b($$0);
      }

      public JsonElement a(vd $$0, Type $$1, JsonSerializationContext $$2) {
         return vd.a.c($$0);
      }
   }
}
