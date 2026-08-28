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

public class hih implements JsonDeserializer<hig> {
   private static final brm a = brk.a(1.0F);

   public hig a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = ayp.m($$0, "entry");
      boolean $$4 = ayp.a($$3, "replace", false);
      String $$5 = ayp.a($$3, "subtitle", null);
      List<hif> $$6 = this.a($$3);
      return new hig($$6, $$4, $$5);
   }

   private List<hif> a(JsonObject $$0) {
      List<hif> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = ayp.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (ayp.a($$4)) {
               aku $$5 = aku.a(ayp.a($$4, "sound"));
               $$1.add(new hif($$5, a, a, 1, hif.a.a, false, false, 16));
            } else {
               $$1.add(this.b(ayp.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hif b(JsonObject $$0) {
      aku $$1 = aku.a(ayp.i($$0, "name"));
      hif.a $$2 = this.a($$0, hif.a.a);
      float $$3 = ayp.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = ayp.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = ayp.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = ayp.a($$0, "preload", false);
      boolean $$7 = ayp.a($$0, "stream", false);
      int $$8 = ayp.a($$0, "attenuation_distance", 16);
      return new hif($$1, brk.a($$3), brk.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hif.a a(JsonObject $$0, hif.a $$1) {
      hif.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hif.a.a(ayp.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
