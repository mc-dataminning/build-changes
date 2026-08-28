import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class np implements nn {
   private final dfi a;
   private final List<np.b> b = Lists.newArrayList();

   private np(dfi $$0) {
      this.a = $$0;
   }

   @Override
   public dfi a() {
      return this.a;
   }

   public static np a(dfi $$0) {
      return new np($$0);
   }

   public np a(List<nt> $$0) {
      this.b.add(new np.b($$0));
      return this;
   }

   public np a(nt $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public np a(no $$0, List<nt> $$1) {
      this.b.add(new np.a($$0, $$1));
      return this;
   }

   public np a(no $$0, nt... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public np a(no $$0, nt $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dsm<dfi, dsl> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(np.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends np.b {
      private final no a;

      a(no $$0, List<nt> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dsm<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<nt> a;

      b(List<nt> $$0) {
         this.a = $$0;
      }

      public void a(dsm<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", nt.a(this.a));
         return $$0;
      }
   }
}
