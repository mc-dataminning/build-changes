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

public class gsm implements JsonDeserializer<gsl> {
   private static final bpx a = bpv.a(1.0F);

   public gsl a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = ayp.m($$0, "entry");
      boolean $$4 = ayp.a($$3, "replace", false);
      String $$5 = ayp.a($$3, "subtitle", null);
      List<gsk> $$6 = this.a($$3);
      return new gsl($$6, $$4, $$5);
   }

   private List<gsk> a(JsonObject $$0) {
      List<gsk> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = ayp.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (ayp.a($$4)) {
               String $$5 = ayp.a($$4, "sound");
               $$1.add(new gsk($$5, a, a, 1, gsk.a.a, false, false, 16));
            } else {
               $$1.add(this.b(ayp.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private gsk b(JsonObject $$0) {
      String $$1 = ayp.i($$0, "name");
      gsk.a $$2 = this.a($$0, gsk.a.a);
      float $$3 = ayp.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = ayp.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = ayp.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = ayp.a($$0, "preload", false);
      boolean $$7 = ayp.a($$0, "stream", false);
      int $$8 = ayp.a($$0, "attenuation_distance", 16);
      return new gsk($$1, bpv.a($$3), bpv.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private gsk.a a(JsonObject $$0, gsk.a $$1) {
      gsk.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = gsk.a.a(ayp.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
