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

public class haz implements JsonDeserializer<hay> {
   private static final bqv a = bqt.a(1.0F);

   public hay a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = ayv.m($$0, "entry");
      boolean $$4 = ayv.a($$3, "replace", false);
      String $$5 = ayv.a($$3, "subtitle", null);
      List<hax> $$6 = this.a($$3);
      return new hay($$6, $$4, $$5);
   }

   private List<hax> a(JsonObject $$0) {
      List<hax> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = ayv.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (ayv.a($$4)) {
               ale $$5 = ale.a(ayv.a($$4, "sound"));
               $$1.add(new hax($$5, a, a, 1, hax.a.a, false, false, 16));
            } else {
               $$1.add(this.b(ayv.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hax b(JsonObject $$0) {
      ale $$1 = ale.a(ayv.i($$0, "name"));
      hax.a $$2 = this.a($$0, hax.a.a);
      float $$3 = ayv.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = ayv.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = ayv.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = ayv.a($$0, "preload", false);
      boolean $$7 = ayv.a($$0, "stream", false);
      int $$8 = ayv.a($$0, "attenuation_distance", 16);
      return new hax($$1, bqt.a($$3), bqt.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hax.a a(JsonObject $$0, hax.a $$1) {
      hax.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hax.a.a(ayv.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
