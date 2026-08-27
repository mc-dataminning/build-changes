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

public interface ws extends Message, wx {
   xp a();

   wt b();

   @Override
   default String getString() {
      return wx.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((wx.a)($$2 -> {
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

   List<ws> c();

   @Nullable
   default String d() {
      if (this.b() instanceof xz $$0 && this.c().isEmpty() && this.a().g()) {
         return $$0.b();
      }

      return null;
   }

   default xg e() {
      return xg.a(this.b());
   }

   default xg f() {
      return new xg(this.b(), new ArrayList<>(this.c()), this.a());
   }

   axi g();

   @Override
   default <T> Optional<T> a(wx.b<T> $$0, xp $$1) {
      xp $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (ws $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(wx.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (ws $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<ws> h() {
      return this.a(xp.a);
   }

   default List<ws> a(xp $$0) {
      List<ws> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(ws $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<ws> $$1 = this.h();
         List<ws> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static ws a(@Nullable String $$0) {
      return (ws)($$0 != null ? b($$0) : wr.a);
   }

   static xg b(String $$0) {
      return xg.a(xz.a($$0));
   }

   static xg c(String $$0) {
      return xg.a(new yd($$0, null, yd.a));
   }

   static xg a(String $$0, Object... $$1) {
      return xg.a(new yd($$0, null, $$1));
   }

   static xg b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yd.a($$3) && !($$3 instanceof ws)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static xg a(String $$0, @Nullable String $$1) {
      return xg.a(new yd($$0, $$1, yd.a));
   }

   static xg a(String $$0, @Nullable String $$1, Object... $$2) {
      return xg.a(new yd($$0, $$1, $$2));
   }

   static xg i() {
      return xg.a(xz.c);
   }

   static xg d(String $$0) {
      return xg.a(new xw($$0));
   }

   static xg a(String $$0, boolean $$1, Optional<ws> $$2, xu $$3) {
      return xg.a(new xy($$0, $$1, $$2, $$3));
   }

   static xg b(String $$0, String $$1) {
      return xg.a(new ya($$0, $$1));
   }

   static xg a(String $$0, Optional<ws> $$1) {
      return xg.a(new yb($$0, $$1));
   }

   static ws a(Date $$0) {
      return b($$0.toString());
   }

   static ws a(Message $$0) {
      return (ws)($$0 instanceof ws $$1 ? $$1 : b($$0.getString()));
   }

   static ws a(UUID $$0) {
      return b($$0.toString());
   }

   static ws a(akf $$0) {
      return b($$0.toString());
   }

   static ws a(czb $$0) {
      return b($$0.toString());
   }

   public static class a {
      private static final Gson a = new GsonBuilder().disableHtmlEscaping().create();

      private a() {
      }

      static xg b(JsonElement $$0, ix.a $$1) {
         return ac.a(wu.a.parse($$1.a(JsonOps.INSTANCE), $$0), JsonParseException::new);
      }

      static JsonElement b(ws $$0, ix.a $$1) {
         return ac.a(wu.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0), JsonParseException::new);
      }

      public static String a(ws $$0, ix.a $$1) {
         return a.toJson(b($$0, $$1));
      }

      @Nullable
      public static xg a(String $$0, ix.a $$1) {
         JsonElement $$2 = JsonParser.parseString($$0);
         return $$2 == null ? null : b($$2, $$1);
      }

      @Nullable
      public static xg a(@Nullable JsonElement $$0, ix.a $$1) {
         return $$0 == null ? null : b($$0, $$1);
      }

      @Nullable
      public static xg b(String $$0, ix.a $$1) {
         JsonReader $$2 = new JsonReader(new StringReader($$0));
         $$2.setLenient(true);
         JsonElement $$3 = JsonParser.parseReader($$2);
         return $$3 == null ? null : b($$3, $$1);
      }
   }

   public static class b implements JsonDeserializer<xg>, JsonSerializer<ws> {
      private final ix.a a;

      public b(ix.a $$0) {
         this.a = $$0;
      }

      public xg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return ws.a.b($$0, this.a);
      }

      public JsonElement a(ws $$0, Type $$1, JsonSerializationContext $$2) {
         return ws.a.b($$0, this.a);
      }
   }
}
