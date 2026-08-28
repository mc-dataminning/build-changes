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

public class hlv implements JsonDeserializer<hlu> {
   private static final btb a = bsz.a(1.0F);

   public hlu a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = aza.m($$0, "entry");
      boolean $$4 = aza.a($$3, "replace", false);
      String $$5 = aza.a($$3, "subtitle", null);
      List<hlt> $$6 = this.a($$3);
      return new hlu($$6, $$4, $$5);
   }

   private List<hlt> a(JsonObject $$0) {
      List<hlt> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = aza.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (aza.a($$4)) {
               ale $$5 = ale.a(aza.a($$4, "sound"));
               $$1.add(new hlt($$5, a, a, 1, hlt.a.a, false, false, 16));
            } else {
               $$1.add(this.b(aza.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hlt b(JsonObject $$0) {
      ale $$1 = ale.a(aza.i($$0, "name"));
      hlt.a $$2 = this.a($$0, hlt.a.a);
      float $$3 = aza.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = aza.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = aza.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = aza.a($$0, "preload", false);
      boolean $$7 = aza.a($$0, "stream", false);
      int $$8 = aza.a($$0, "attenuation_distance", 16);
      return new hlt($$1, bsz.a($$3), bsz.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hlt.a a(JsonObject $$0, hlt.a $$1) {
      hlt.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hlt.a.a(aza.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
