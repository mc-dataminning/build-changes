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

public class gts implements JsonDeserializer<gtr> {
   private static final bpt a = bpr.a(1.0F);

   public gtr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = ayd.m($$0, "entry");
      boolean $$4 = ayd.a($$3, "replace", false);
      String $$5 = ayd.a($$3, "subtitle", null);
      List<gtq> $$6 = this.a($$3);
      return new gtr($$6, $$4, $$5);
   }

   private List<gtq> a(JsonObject $$0) {
      List<gtq> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = ayd.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (ayd.a($$4)) {
               akq $$5 = akq.a(ayd.a($$4, "sound"));
               $$1.add(new gtq($$5, a, a, 1, gtq.a.a, false, false, 16));
            } else {
               $$1.add(this.b(ayd.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private gtq b(JsonObject $$0) {
      akq $$1 = akq.a(ayd.i($$0, "name"));
      gtq.a $$2 = this.a($$0, gtq.a.a);
      float $$3 = ayd.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = ayd.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = ayd.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = ayd.a($$0, "preload", false);
      boolean $$7 = ayd.a($$0, "stream", false);
      int $$8 = ayd.a($$0, "attenuation_distance", 16);
      return new gtq($$1, bpr.a($$3), bpr.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private gtq.a a(JsonObject $$0, gtq.a $$1) {
      gtq.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = gtq.a.a(ayd.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
