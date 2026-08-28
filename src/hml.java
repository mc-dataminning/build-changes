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

public class hml implements JsonDeserializer<hmk> {
   private static final bte a = btc.a(1.0F);

   public hmk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = azc.m($$0, "entry");
      boolean $$4 = azc.a($$3, "replace", false);
      String $$5 = azc.a($$3, "subtitle", null);
      List<hmj> $$6 = this.a($$3);
      return new hmk($$6, $$4, $$5);
   }

   private List<hmj> a(JsonObject $$0) {
      List<hmj> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = azc.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (azc.a($$4)) {
               alg $$5 = alg.a(azc.a($$4, "sound"));
               $$1.add(new hmj($$5, a, a, 1, hmj.a.a, false, false, 16));
            } else {
               $$1.add(this.b(azc.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hmj b(JsonObject $$0) {
      alg $$1 = alg.a(azc.i($$0, "name"));
      hmj.a $$2 = this.a($$0, hmj.a.a);
      float $$3 = azc.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = azc.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = azc.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = azc.a($$0, "preload", false);
      boolean $$7 = azc.a($$0, "stream", false);
      int $$8 = azc.a($$0, "attenuation_distance", 16);
      return new hmj($$1, btc.a($$3), btc.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hmj.a a(JsonObject $$0, hmj.a $$1) {
      hmj.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hmj.a.a(azc.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
