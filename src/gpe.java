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

public class gpe implements JsonDeserializer<gpd> {
   private static final bni a = bng.a(1.0F);

   public gpd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = axc.m($$0, "entry");
      boolean $$4 = axc.a($$3, "replace", false);
      String $$5 = axc.a($$3, "subtitle", null);
      List<gpc> $$6 = this.a($$3);
      return new gpd($$6, $$4, $$5);
   }

   private List<gpc> a(JsonObject $$0) {
      List<gpc> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = axc.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (axc.a($$4)) {
               String $$5 = axc.a($$4, "sound");
               $$1.add(new gpc($$5, a, a, 1, gpc.a.a, false, false, 16));
            } else {
               $$1.add(this.b(axc.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private gpc b(JsonObject $$0) {
      String $$1 = axc.i($$0, "name");
      gpc.a $$2 = this.a($$0, gpc.a.a);
      float $$3 = axc.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = axc.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = axc.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = axc.a($$0, "preload", false);
      boolean $$7 = axc.a($$0, "stream", false);
      int $$8 = axc.a($$0, "attenuation_distance", 16);
      return new gpc($$1, bng.a($$3), bng.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private gpc.a a(JsonObject $$0, gpc.a $$1) {
      gpc.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = gpc.a.a(axc.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
