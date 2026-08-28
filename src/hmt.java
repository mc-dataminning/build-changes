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

public class hmt implements JsonDeserializer<hms> {
   private static final btg a = bte.a(1.0F);

   public hms a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = azc.m($$0, "entry");
      boolean $$4 = azc.a($$3, "replace", false);
      String $$5 = azc.a($$3, "subtitle", null);
      List<hmr> $$6 = this.a($$3);
      return new hms($$6, $$4, $$5);
   }

   private List<hmr> a(JsonObject $$0) {
      List<hmr> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = azc.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (azc.a($$4)) {
               alg $$5 = alg.a(azc.a($$4, "sound"));
               $$1.add(new hmr($$5, a, a, 1, hmr.a.a, false, false, 16));
            } else {
               $$1.add(this.b(azc.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hmr b(JsonObject $$0) {
      alg $$1 = alg.a(azc.i($$0, "name"));
      hmr.a $$2 = this.a($$0, hmr.a.a);
      float $$3 = azc.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = azc.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = azc.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = azc.a($$0, "preload", false);
      boolean $$7 = azc.a($$0, "stream", false);
      int $$8 = azc.a($$0, "attenuation_distance", 16);
      return new hmr($$1, bte.a($$3), bte.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hmr.a a(JsonObject $$0, hmr.a $$1) {
      hmr.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hmr.a.a(azc.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
