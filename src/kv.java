import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class kv implements kt {
   private final cpn a;
   private final List<kv.b> b = Lists.newArrayList();

   private kv(cpn $$0) {
      this.a = $$0;
   }

   @Override
   public cpn a() {
      return this.a;
   }

   public static kv a(cpn $$0) {
      return new kv($$0);
   }

   public kv a(List<kz> $$0) {
      this.b.add(new kv.b($$0));
      return this;
   }

   public kv a(kz $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public kv a(ku $$0, List<kz> $$1) {
      this.b.add(new kv.a($$0, $$1));
      return this;
   }

   public kv a(ku $$0, kz... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public kv a(ku $$0, kz $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dcc<cpn, dcb> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(kv.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends kv.b {
      private final ku a;

      a(ku $$0, List<kz> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dcc<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<kz> a;

      b(List<kz> $$0) {
         this.a = $$0;
      }

      public void a(dcc<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", kz.a(this.a));
         return $$0;
      }
   }
}
