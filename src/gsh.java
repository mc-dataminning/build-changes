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

public class gsh implements JsonDeserializer<gsg> {
   private static final bps a = bpq.a(1.0F);

   public gsg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = ayk.m($$0, "entry");
      boolean $$4 = ayk.a($$3, "replace", false);
      String $$5 = ayk.a($$3, "subtitle", null);
      List<gsf> $$6 = this.a($$3);
      return new gsg($$6, $$4, $$5);
   }

   private List<gsf> a(JsonObject $$0) {
      List<gsf> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = ayk.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (ayk.a($$4)) {
               String $$5 = ayk.a($$4, "sound");
               $$1.add(new gsf($$5, a, a, 1, gsf.a.a, false, false, 16));
            } else {
               $$1.add(this.b(ayk.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private gsf b(JsonObject $$0) {
      String $$1 = ayk.i($$0, "name");
      gsf.a $$2 = this.a($$0, gsf.a.a);
      float $$3 = ayk.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = ayk.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = ayk.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = ayk.a($$0, "preload", false);
      boolean $$7 = ayk.a($$0, "stream", false);
      int $$8 = ayk.a($$0, "attenuation_distance", 16);
      return new gsf($$1, bpq.a($$3), bpq.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private gsf.a a(JsonObject $$0, gsf.a $$1) {
      gsf.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = gsf.a.a(ayk.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
