import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class od implements ob {
   private final dkd a;
   private final List<od.b> b = Lists.newArrayList();

   private od(dkd $$0) {
      this.a = $$0;
   }

   @Override
   public dkd a() {
      return this.a;
   }

   public static od a(dkd $$0) {
      return new od($$0);
   }

   public od a(List<oh> $$0) {
      this.b.add(new od.b($$0));
      return this;
   }

   public od a(oh $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public od a(oc $$0, List<oh> $$1) {
      this.b.add(new od.a($$0, $$1));
      return this;
   }

   public od a(oc $$0, oh... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public od a(oc $$0, oh $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dxp<dkd, dxo> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(od.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends od.b {
      private final oc a;

      a(oc $$0, List<oh> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dxp<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<oh> a;

      b(List<oh> $$0) {
         this.a = $$0;
      }

      public void a(dxp<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", oh.a(this.a));
         return $$0;
      }
   }
}
