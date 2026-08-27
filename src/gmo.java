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

public class gmo implements JsonDeserializer<gmn> {
   private static final bmg a = bme.a(1.0F);

   public gmn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = awm.m($$0, "entry");
      boolean $$4 = awm.a($$3, "replace", false);
      String $$5 = awm.a($$3, "subtitle", null);
      List<gmm> $$6 = this.a($$3);
      return new gmn($$6, $$4, $$5);
   }

   private List<gmm> a(JsonObject $$0) {
      List<gmm> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = awm.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (awm.a($$4)) {
               String $$5 = awm.a($$4, "sound");
               $$1.add(new gmm($$5, a, a, 1, gmm.a.a, false, false, 16));
            } else {
               $$1.add(this.b(awm.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private gmm b(JsonObject $$0) {
      String $$1 = awm.i($$0, "name");
      gmm.a $$2 = this.a($$0, gmm.a.a);
      float $$3 = awm.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = awm.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = awm.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = awm.a($$0, "preload", false);
      boolean $$7 = awm.a($$0, "stream", false);
      int $$8 = awm.a($$0, "attenuation_distance", 16);
      return new gmm($$1, bme.a($$3), bme.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private gmm.a a(JsonObject $$0, gmm.a $$1) {
      gmm.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = gmm.a.a(awm.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
