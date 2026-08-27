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

public class gll implements JsonDeserializer<glk> {
   private static final blo a = blm.a(1.0F);

   public glk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = awc.m($$0, "entry");
      boolean $$4 = awc.a($$3, "replace", false);
      String $$5 = awc.a($$3, "subtitle", null);
      List<glj> $$6 = this.a($$3);
      return new glk($$6, $$4, $$5);
   }

   private List<glj> a(JsonObject $$0) {
      List<glj> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = awc.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (awc.a($$4)) {
               String $$5 = awc.a($$4, "sound");
               $$1.add(new glj($$5, a, a, 1, glj.a.a, false, false, 16));
            } else {
               $$1.add(this.b(awc.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private glj b(JsonObject $$0) {
      String $$1 = awc.i($$0, "name");
      glj.a $$2 = this.a($$0, glj.a.a);
      float $$3 = awc.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = awc.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = awc.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = awc.a($$0, "preload", false);
      boolean $$7 = awc.a($$0, "stream", false);
      int $$8 = awc.a($$0, "attenuation_distance", 16);
      return new glj($$1, blm.a($$3), blm.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private glj.a a(JsonObject $$0, glj.a $$1) {
      glj.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = glj.a.a(awc.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
