import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class ghm implements JsonDeserializer<ghl> {
   private static final biy a = biw.a(1.0F);

   public ghl a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = aty.m($$0, "entry");
      boolean $$4 = aty.a($$3, "replace", false);
      String $$5 = aty.a($$3, "subtitle", null);
      List<ghk> $$6 = this.a($$3);
      return new ghl($$6, $$4, $$5);
   }

   private List<ghk> a(JsonObject $$0) {
      List<ghk> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = aty.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (aty.a($$4)) {
               String $$5 = aty.a($$4, "sound");
               $$1.add(new ghk($$5, a, a, 1, ghk.a.a, false, false, 16));
            } else {
               $$1.add(this.b(aty.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private ghk b(JsonObject $$0) {
      String $$1 = aty.i($$0, "name");
      ghk.a $$2 = this.a($$0, ghk.a.a);
      float $$3 = aty.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = aty.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = aty.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = aty.a($$0, "preload", false);
      boolean $$7 = aty.a($$0, "stream", false);
      int $$8 = aty.a($$0, "attenuation_distance", 16);
      return new ghk($$1, biw.a($$3), biw.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private ghk.a a(JsonObject $$0, ghk.a $$1) {
      ghk.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = ghk.a.a(aty.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
