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

public class gtx implements JsonDeserializer<gtw> {
   private static final bpu a = bps.a(1.0F);

   public gtw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = aye.m($$0, "entry");
      boolean $$4 = aye.a($$3, "replace", false);
      String $$5 = aye.a($$3, "subtitle", null);
      List<gtv> $$6 = this.a($$3);
      return new gtw($$6, $$4, $$5);
   }

   private List<gtv> a(JsonObject $$0) {
      List<gtv> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = aye.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (aye.a($$4)) {
               akr $$5 = akr.a(aye.a($$4, "sound"));
               $$1.add(new gtv($$5, a, a, 1, gtv.a.a, false, false, 16));
            } else {
               $$1.add(this.b(aye.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private gtv b(JsonObject $$0) {
      akr $$1 = akr.a(aye.i($$0, "name"));
      gtv.a $$2 = this.a($$0, gtv.a.a);
      float $$3 = aye.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = aye.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = aye.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = aye.a($$0, "preload", false);
      boolean $$7 = aye.a($$0, "stream", false);
      int $$8 = aye.a($$0, "attenuation_distance", 16);
      return new gtv($$1, bps.a($$3), bps.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private gtv.a a(JsonObject $$0, gtv.a $$1) {
      gtv.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = gtv.a.a(aye.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
