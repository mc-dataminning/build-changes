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
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.mojang.brigadier.Message;
import com.mojang.serialization.JsonOps;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface vb extends Message, vg {
   vy a();

   vc b();

   @Override
   default String getString() {
      return vg.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((vg.a)($$2 -> {
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

   List<vb> c();

   @Nullable
   default String d() {
      if (this.b() instanceof wi $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default vp e() {
      return vp.a(this.b());
   }

   default vp f() {
      return new vp(this.b(), new ArrayList<>(this.c()), this.a());
   }

   atk g();

   @Override
   default <T> Optional<T> a(vg.b<T> $$0, vy $$1) {
      vy $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (vb $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(vg.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (vb $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<vb> h() {
      return this.a(vy.a);
   }

   default List<vb> a(vy $$0) {
      List<vb> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(vb $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<vb> $$1 = this.h();
         List<vb> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static vb a(@Nullable String $$0) {
      return (vb)($$0 != null ? b($$0) : va.a);
   }

   static vp b(String $$0) {
      return vp.a(wi.a($$0));
   }

   static vp c(String $$0) {
      return vp.a(new wm($$0, null, wm.a));
   }

   static vp a(String $$0, Object... $$1) {
      return vp.a(new wm($$0, null, $$1));
   }

   static vp b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!wm.a($$3) && !($$3 instanceof vb)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static vp a(String $$0, @Nullable String $$1) {
      return vp.a(new wm($$0, $$1, wm.a));
   }

   static vp a(String $$0, @Nullable String $$1, Object... $$2) {
      return vp.a(new wm($$0, $$1, $$2));
   }

   static vp i() {
      return vp.a(wi.c);
   }

   static vp d(String $$0) {
      return vp.a(new wf($$0));
   }

   static vp a(String $$0, boolean $$1, Optional<vb> $$2, wd $$3) {
      return vp.a(new wh($$0, $$1, $$2, $$3));
   }

   static vp b(String $$0, String $$1) {
      return vp.a(new wj($$0, $$1));
   }

   static vp a(String $$0, Optional<vb> $$1) {
      return vp.a(new wk($$0, $$1));
   }

   static vb a(Date $$0) {
      return b($$0.toString());
   }

   static vb a(Message $$0) {
      return (vb)($$0 instanceof vb $$1 ? $$1 : b($$0.getString()));
   }

   static vb a(UUID $$0) {
      return b($$0.toString());
   }

   static vb a(agt $$0) {
      return b($$0.toString());
   }

   static vb a(csf $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();
      private static final Field b = ac.a(() -> {
         try {
            new JsonReader(new StringReader(""));
            Field $$0 = JsonReader.class.getDeclaredField("pos");
            $$0.setAccessible(true);
            return $$0;
         } catch (NoSuchFieldException var1) {
            throw new IllegalStateException("Couldn't get field 'pos' for JsonReader", var1);
         }
      });
      private static final Field c = ac.a(() -> {
         try {
            new JsonReader(new StringReader(""));
            Field $$0 = JsonReader.class.getDeclaredField("lineStart");
            $$0.setAccessible(true);
            return $$0;
         } catch (NoSuchFieldException var1) {
            throw new IllegalStateException("Couldn't get field 'lineStart' for JsonReader", var1);
         }
      });

      private a() {
      }

      static vp b(JsonElement $$0) {
         return ac.a(vd.a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      static JsonElement c(vb $$0) {
         return ac.a(vd.a.encodeStart(JsonOps.INSTANCE, $$0), JsonParseException::new);
      }

      public static String a(vb $$0) {
         return a.toJson(c($$0));
      }

      public static JsonElement b(vb $$0) {
         return c($$0);
      }

      @Nullable
      public static vp a(String $$0) {
         JsonElement $$1 = JsonParser.parseString($$0);
         return $$1 == null ? null : b($$1);
      }

      @Nullable
      public static vp a(@Nullable JsonElement $$0) {
         return $$0 == null ? null : b($$0);
      }

      @Nullable
      public static vp b(String $$0) {
         JsonReader $$1 = new JsonReader(new StringReader($$0));
         $$1.setLenient(true);
         JsonElement $$2 = JsonParser.parseReader($$1);
         return $$2 == null ? null : b($$2);
      }

      @Nullable
      public static vp a(com.mojang.brigadier.StringReader $$0) {
         JsonReader $$1 = new JsonReader(new StringReader($$0.getRemaining()));
         $$1.setLenient(false);

         vp var3;
         try {
            JsonElement $$2 = Streams.parse($$1);
            var3 = $$2 != null ? b($$2) : null;
         } catch (StackOverflowError var7) {
            throw new JsonParseException(var7);
         } finally {
            $$0.setCursor($$0.getCursor() + a($$1));
         }

         return var3;
      }

      private static int a(JsonReader $$0) {
         try {
            return b.getInt($$0) - c.getInt($$0);
         } catch (IllegalAccessException var2) {
            throw new IllegalStateException("Couldn't read position of JsonReader", var2);
         }
      }
   }

   public static class b implements JsonDeserializer<vp>, JsonSerializer<vb> {
      public vp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return vb.a.b($$0);
      }

      public JsonElement a(vb $$0, Type $$1, JsonSerializationContext $$2) {
         return vb.a.c($$0);
      }
   }
}
