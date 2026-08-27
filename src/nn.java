import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class nn implements nl {
   private final dfc a;
   private final List<nn.b> b = Lists.newArrayList();

   private nn(dfc $$0) {
      this.a = $$0;
   }

   @Override
   public dfc a() {
      return this.a;
   }

   public static nn a(dfc $$0) {
      return new nn($$0);
   }

   public nn a(List<nr> $$0) {
      this.b.add(new nn.b($$0));
      return this;
   }

   public nn a(nr $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public nn a(nm $$0, List<nr> $$1) {
      this.b.add(new nn.a($$0, $$1));
      return this;
   }

   public nn a(nm $$0, nr... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public nn a(nm $$0, nr $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dtd<dfc, dtc> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(nn.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends nn.b {
      private final nm a;

      a(nm $$0, List<nr> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dtd<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<nr> a;

      b(List<nr> $$0) {
         this.a = $$0;
      }

      public void a(dtd<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", nr.a(this.a));
         return $$0;
      }
   }
}
