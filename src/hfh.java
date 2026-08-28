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

public class hfh implements JsonDeserializer<hfg> {
   private static final bsm a = bsk.a(1.0F);

   public hfg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = azu.m($$0, "entry");
      boolean $$4 = azu.a($$3, "replace", false);
      String $$5 = azu.a($$3, "subtitle", null);
      List<hff> $$6 = this.a($$3);
      return new hfg($$6, $$4, $$5);
   }

   private List<hff> a(JsonObject $$0) {
      List<hff> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = azu.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (azu.a($$4)) {
               alz $$5 = alz.a(azu.a($$4, "sound"));
               $$1.add(new hff($$5, a, a, 1, hff.a.a, false, false, 16));
            } else {
               $$1.add(this.b(azu.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hff b(JsonObject $$0) {
      alz $$1 = alz.a(azu.i($$0, "name"));
      hff.a $$2 = this.a($$0, hff.a.a);
      float $$3 = azu.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = azu.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = azu.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = azu.a($$0, "preload", false);
      boolean $$7 = azu.a($$0, "stream", false);
      int $$8 = azu.a($$0, "attenuation_distance", 16);
      return new hff($$1, bsk.a($$3), bsk.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hff.a a(JsonObject $$0, hff.a $$1) {
      hff.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hff.a.a(azu.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
