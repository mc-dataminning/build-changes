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

public class hoy implements JsonDeserializer<hox> {
   private static final btw a = btu.a(1.0F);

   public hox a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = azg.m($$0, "entry");
      boolean $$4 = azg.a($$3, "replace", false);
      String $$5 = azg.a($$3, "subtitle", null);
      List<how> $$6 = this.a($$3);
      return new hox($$6, $$4, $$5);
   }

   private List<how> a(JsonObject $$0) {
      List<how> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = azg.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (azg.a($$4)) {
               alk $$5 = alk.a(azg.a($$4, "sound"));
               $$1.add(new how($$5, a, a, 1, how.a.a, false, false, 16));
            } else {
               $$1.add(this.b(azg.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private how b(JsonObject $$0) {
      alk $$1 = alk.a(azg.i($$0, "name"));
      how.a $$2 = this.a($$0, how.a.a);
      float $$3 = azg.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = azg.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = azg.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = azg.a($$0, "preload", false);
      boolean $$7 = azg.a($$0, "stream", false);
      int $$8 = azg.a($$0, "attenuation_distance", 16);
      return new how($$1, btu.a($$3), btu.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private how.a a(JsonObject $$0, how.a $$1) {
      how.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = how.a.a(azg.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
