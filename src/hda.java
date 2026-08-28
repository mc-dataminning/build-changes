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

public class hda implements JsonDeserializer<hcz> {
   private static final brn a = brl.a(1.0F);

   public hcz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = azc.m($$0, "entry");
      boolean $$4 = azc.a($$3, "replace", false);
      String $$5 = azc.a($$3, "subtitle", null);
      List<hcy> $$6 = this.a($$3);
      return new hcz($$6, $$4, $$5);
   }

   private List<hcy> a(JsonObject $$0) {
      List<hcy> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = azc.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (azc.a($$4)) {
               alj $$5 = alj.a(azc.a($$4, "sound"));
               $$1.add(new hcy($$5, a, a, 1, hcy.a.a, false, false, 16));
            } else {
               $$1.add(this.b(azc.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hcy b(JsonObject $$0) {
      alj $$1 = alj.a(azc.i($$0, "name"));
      hcy.a $$2 = this.a($$0, hcy.a.a);
      float $$3 = azc.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = azc.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = azc.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = azc.a($$0, "preload", false);
      boolean $$7 = azc.a($$0, "stream", false);
      int $$8 = azc.a($$0, "attenuation_distance", 16);
      return new hcy($$1, brl.a($$3), brl.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hcy.a a(JsonObject $$0, hcy.a $$1) {
      hcy.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hcy.a.a(azc.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
