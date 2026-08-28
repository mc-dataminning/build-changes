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

public class gsn implements JsonDeserializer<gsm> {
   private static final bpy a = bpw.a(1.0F);

   public gsm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = ayp.m($$0, "entry");
      boolean $$4 = ayp.a($$3, "replace", false);
      String $$5 = ayp.a($$3, "subtitle", null);
      List<gsl> $$6 = this.a($$3);
      return new gsm($$6, $$4, $$5);
   }

   private List<gsl> a(JsonObject $$0) {
      List<gsl> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = ayp.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (ayp.a($$4)) {
               String $$5 = ayp.a($$4, "sound");
               $$1.add(new gsl($$5, a, a, 1, gsl.a.a, false, false, 16));
            } else {
               $$1.add(this.b(ayp.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private gsl b(JsonObject $$0) {
      String $$1 = ayp.i($$0, "name");
      gsl.a $$2 = this.a($$0, gsl.a.a);
      float $$3 = ayp.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = ayp.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = ayp.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = ayp.a($$0, "preload", false);
      boolean $$7 = ayp.a($$0, "stream", false);
      int $$8 = ayp.a($$0, "attenuation_distance", 16);
      return new gsl($$1, bpw.a($$3), bpw.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private gsl.a a(JsonObject $$0, gsl.a $$1) {
      gsl.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = gsl.a.a(ayp.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
