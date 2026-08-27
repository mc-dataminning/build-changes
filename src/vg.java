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

public interface vg extends Message, vl {
   wd a();

   vh b();

   @Override
   default String getString() {
      return vl.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((vl.a)($$2 -> {
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

   List<vg> c();

   @Nullable
   default String d() {
      if (this.b() instanceof wn $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default vu e() {
      return vu.a(this.b());
   }

   default vu f() {
      return new vu(this.b(), new ArrayList<>(this.c()), this.a());
   }

   aub g();

   @Override
   default <T> Optional<T> a(vl.b<T> $$0, wd $$1) {
      wd $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (vg $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(vl.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (vg $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<vg> h() {
      return this.a(wd.a);
   }

   default List<vg> a(wd $$0) {
      List<vg> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(vg $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<vg> $$1 = this.h();
         List<vg> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static vg a(@Nullable String $$0) {
      return (vg)($$0 != null ? b($$0) : vf.a);
   }

   static vu b(String $$0) {
      return vu.a(wn.a($$0));
   }

   static vu c(String $$0) {
      return vu.a(new wr($$0, null, wr.a));
   }

   static vu a(String $$0, Object... $$1) {
      return vu.a(new wr($$0, null, $$1));
   }

   static vu b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!wr.a($$3) && !($$3 instanceof vg)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static vu a(String $$0, @Nullable String $$1) {
      return vu.a(new wr($$0, $$1, wr.a));
   }

   static vu a(String $$0, @Nullable String $$1, Object... $$2) {
      return vu.a(new wr($$0, $$1, $$2));
   }

   static vu i() {
      return vu.a(wn.c);
   }

   static vu d(String $$0) {
      return vu.a(new wk($$0));
   }

   static vu a(String $$0, boolean $$1, Optional<vg> $$2, wi $$3) {
      return vu.a(new wm($$0, $$1, $$2, $$3));
   }

   static vu b(String $$0, String $$1) {
      return vu.a(new wo($$0, $$1));
   }

   static vu a(String $$0, Optional<vg> $$1) {
      return vu.a(new wp($$0, $$1));
   }

   static vg a(Date $$0) {
      return b($$0.toString());
   }

   static vg a(Message $$0) {
      return (vg)($$0 instanceof vg $$1 ? $$1 : b($$0.getString()));
   }

   static vg a(UUID $$0) {
      return b($$0.toString());
   }

   static vg a(ahh $$0) {
      return b($$0.toString());
   }

   static vg a(cte $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static vu b(JsonElement $$0) {
         return ac.a(vi.a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      static JsonElement c(vg $$0) {
         return ac.a(vi.a.encodeStart(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      public static String a(vg $$0) {
         return a.toJson(c($$0));
      }

      public static JsonElement b(vg $$0) {
         return c($$0);
      }

      @Nullable
      public static vu a(String $$0) {
         JsonElement $$1 = JsonParser.parseString($$0);
         return $$1 == null ? null : b($$1);
      }

      @Nullable
      public static vu a(@Nullable JsonElement $$0) {
         return $$0 == null ? null : b($$0);
      }

      @Nullable
      public static vu b(String $$0) {
         JsonReader $$1 = new JsonReader(new StringReader($$0));
         $$1.setLenient(true);
         JsonElement $$2 = JsonParser.parseReader($$1);
         return $$2 == null ? null : b($$2);
      }
   }

   public static class b implements JsonDeserializer<vu>, JsonSerializer<vg> {
      public vu a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return vg.a.b($$0);
      }

      public JsonElement a(vg $$0, Type $$1, JsonSerializationContext $$2) {
         return vg.a.c($$0);
      }
   }
}
