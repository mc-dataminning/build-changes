import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class kz implements kx {
   private final csx a;
   private final List<kz.b> b = Lists.newArrayList();

   private kz(csx $$0) {
      this.a = $$0;
   }

   @Override
   public csx a() {
      return this.a;
   }

   public static kz a(csx $$0) {
      return new kz($$0);
   }

   public kz a(List<ld> $$0) {
      this.b.add(new kz.b($$0));
      return this;
   }

   public kz a(ld $$0) {
      return this.a(ImmutableList.of($$0));
   }

   public kz a(ky $$0, List<ld> $$1) {
      this.b.add(new kz.a($$0, $$1));
      return this;
   }

   public kz a(ky $$0, ld... $$1) {
      return this.a($$0, ImmutableList.copyOf($$1));
   }

   public kz a(ky $$0, ld $$1) {
      return this.a($$0, ImmutableList.of($$1));
   }

   public JsonElement b() {
      dfm<csx, dfl> $$0 = this.a.l();
      this.b.forEach($$1x -> $$1x.a($$0));
      JsonArray $$1 = new JsonArray();
      this.b.stream().map(kz.b::a).forEach($$1::add);
      JsonObject $$2 = new JsonObject();
      $$2.add("multipart", $$1);
      return $$2;
   }

   static class a extends kz.b {
      private final ky a;

      a(ky $$0, List<ld> $$1) {
         super($$1);
         this.a = $$0;
      }

      @Override
      public void a(dfm<?, ?> $$0) {
         this.a.a($$0);
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("when", this.a.get());
      }
   }

   static class b implements Supplier<JsonElement> {
      private final List<ld> a;

      b(List<ld> $$0) {
         this.a = $$0;
      }

      public void a(dfm<?, ?> $$0) {
      }

      public void a(JsonObject $$0) {
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a($$0);
         $$0.add("apply", ld.a(this.a));
         return $$0;
      }
   }
}
