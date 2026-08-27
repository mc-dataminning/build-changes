import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class mk implements mi {
   private final dac a;
   private final List<mk.b> b = Lists.newArrayList();

   private mk(dac $$0) {
      this.a = $$0;
   }

   @Override
   public dac a() {
      return this.a;
   }

   public static mk a(dac $$0) {
      return new mk($$0);
   }

   public mk a(List<mo> $$0) {
      this.b.add(new mk.b($$0));
      return this;
   }

   public mk a(mo $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public mk a(mj $$0, List<mo> $$1) {
      this.b.add(new mk.a($$0, $$1));
      return this;
   }

   public mk a(mj $$0, mo... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public mk a(mj $$0, mo $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dnc<dac, dnb> $$0 = this.a.n();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(mk.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends mk.b {
      private final mj a;

      a(mj $$0, List<mo> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dnc<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<mo> a;

      b(List<mo> $$0) {
         this.a = $$0;
      }

      public void a(dnc<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", mo.a(this.a));
         return $$0;
      }
   }
}
