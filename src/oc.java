import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class oc implements oa {
   private final diq a;
   private final List<oc.b> b = Lists.newArrayList();

   private oc(diq $$0) {
      this.a = $$0;
   }

   @Override
   public diq a() {
      return this.a;
   }

   public static oc a(diq $$0) {
      return new oc($$0);
   }

   public oc a(List<og> $$0) {
      this.b.add(new oc.b($$0));
      return this;
   }

   public oc a(og $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public oc a(ob $$0, List<og> $$1) {
      this.b.add(new oc.a($$0, $$1));
      return this;
   }

   public oc a(ob $$0, og... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public oc a(ob $$0, og $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dvw<diq, dvv> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(oc.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends oc.b {
      private final ob a;

      a(ob $$0, List<og> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dvw<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<og> a;

      b(List<og> $$0) {
         this.a = $$0;
      }

      public void a(dvw<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", og.a(this.a));
         return $$0;
      }
   }
}
